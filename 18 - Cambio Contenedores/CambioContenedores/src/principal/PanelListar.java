
package principal;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatos;
import utils.Persona;


public class PanelListar extends javax.swing.JFrame {

    
    DefaultTableModel modelo; 
    BaseDatos datos;
    Persona listaPersonas[];
    
    public PanelListar(BaseDatos datos) {
        initComponents();
        initAlternComponents();
        impresion();
    }
    
    
    public void initAlternComponents(){
       setTitle("Tabla_datos");
       setLocationRelativeTo(null);
       setVisible(true);
       setResizable(false);
       setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/buscar_usuario.png") ) );
       
        modelo = (DefaultTableModel) tabla_datos.getModel();
        
        tabla_datos.getColumnModel().getColumn(0).setPreferredWidth(150);
        tabla_datos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabla_datos.getColumnModel().getColumn(2).setPreferredWidth(150);
        tabla_datos.getColumnModel().getColumn(3).setPreferredWidth(150);
        tabla_datos.getColumnModel().getColumn(4).setPreferredWidth(150);
        tabla_datos.getColumnModel().getColumn(5).setPreferredWidth(200);
        
        
        tabla_datos.getTableHeader().setReorderingAllowed(false);
        tabla_datos.getTableHeader().setResizingAllowed(false);
        
        
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_datos.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tabla_datos.getColumnModel().getColumn(4).setCellRenderer(centerRender);
        
        
        tabla_datos.setRowHeight(20);  
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container_listar = new javax.swing.JPanel();
        etq_listar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        container_listar.setBackground(new java.awt.Color(153, 0, 153));

        etq_listar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        etq_listar.setText("Panel Listar");

        tabla_datos.setForeground(new java.awt.Color(0, 0, 0));
        tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Documento", "Nombres", "Apellidos", "Dirección", "Teléfono", "Correo"
            }
        ));
        jScrollPane1.setViewportView(tabla_datos);

        javax.swing.GroupLayout container_listarLayout = new javax.swing.GroupLayout(container_listar);
        container_listar.setLayout(container_listarLayout);
        container_listarLayout.setHorizontalGroup(
            container_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_listarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_listar)
                .addGap(165, 165, 165))
        );
        container_listarLayout.setVerticalGroup(
            container_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container_listarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_listar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container_listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container_listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   public void impresion(){
        modelo.setRowCount(0);

        listaPersonas = datos.extraerPersonas();
        
        if(listaPersonas != null && listaPersonas.length > 0){
            for(int i = 0; i < listaPersonas.length; i++){
                Persona persona = listaPersonas[i];
                modelo.addRow(new Object[]{
                persona.getDocumento(),
                persona.getNombres(),
                persona.getApellidos(),
                persona.getDireccion(),
                persona.getTelefono(),
                persona.getCorreo(),
            });
                
            }
        }
     
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container_listar;
    private javax.swing.JLabel etq_listar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_datos;
    // End of variables declaration//GEN-END:variables
}
