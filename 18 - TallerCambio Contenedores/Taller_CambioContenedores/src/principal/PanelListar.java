
package principal;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatos;
import utils.Persona;


public class PanelListar extends javax.swing.JPanel {

    
    DefaultTableModel modelo; 
    BaseDatos datos;
    Persona listaPersonas[];
    
    public PanelListar(BaseDatos datos) {
        this.datos=datos;
        initComponents();
        initAlternComponents();
        impresion();
    }
    
     public void initAlternComponents(){
       
       setVisible(true);
      
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

        contenedor = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();

        contenedor.setBackground(new java.awt.Color(102, 102, 255));

        etq_titulo.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(0, 0, 0));
        etq_titulo.setText("Listado de Personas");

        tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Documento", "Nombres", "Apellidos", "Direccion", "Teléfono", "Correo"
            }
        ));
        jScrollPane1.setViewportView(tabla_datos);

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(etq_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(etq_titulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    public void impresion(){
        modelo.setRowCount(0);

        listaPersonas = datos.extraerPersonas();
        
        
        if(listaPersonas != null && listaPersonas.length > 0){
            for(int i = 0; i < listaPersonas.length; i++){
                if(listaPersonas[i] != null){
                    String documento   = listaPersonas[i].getDocumento();
                    String nombres   = listaPersonas[i].getNombres();
               
                    String apellidos  = listaPersonas[i].getApellidos();
                    String direccion   = listaPersonas[i].getDireccion();
                    String telefono   = listaPersonas[i].getTelefono();
                    String correo   = listaPersonas[i].getCorreo();
                
                
                    Object objeto[] = new Object[]{ documento, nombres, apellidos, telefono, direccion, correo };
                    modelo.addRow(objeto);
                }
                
               
               
          
                
            }
        }
     
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_datos;
    // End of variables declaration//GEN-END:variables
}
