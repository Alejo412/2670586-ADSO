
package principal;

import utils.BaseDatos;

public class PanelEditar extends javax.swing.JFrame {
    
    BaseDatos datos;
    

    public PanelEditar(BaseDatos datos) {
        initComponents();
        initAlternComponents();
    }
    
     public void initAlternComponents(){
        setTitle("Editar_Persona");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_editar.png")));
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor_eliminar = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        etq_documento = new javax.swing.JLabel();
        campo_documento = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        etq_nombres = new javax.swing.JLabel();
        campo_nombres = new javax.swing.JTextField();
        etq_apellidos = new javax.swing.JLabel();
        campo_apellidos = new javax.swing.JTextField();
        etq_direccion = new javax.swing.JLabel();
        campo_direccion = new javax.swing.JTextField();
        etq_telefono = new javax.swing.JLabel();
        campo_telefono = new javax.swing.JTextField();
        etq_correo = new javax.swing.JLabel();
        campo_correo = new javax.swing.JTextField();
        btn_editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor_eliminar.setBackground(new java.awt.Color(0, 0, 255));

        etq_titulo.setBackground(new java.awt.Color(255, 51, 51));
        etq_titulo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        etq_titulo.setText("Panel Editar");

        etq_documento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etq_documento.setText("Cédula: ");

        btn_buscar.setBackground(new java.awt.Color(255, 255, 51));
        btn_buscar.setForeground(new java.awt.Color(0, 0, 0));
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        etq_nombres.setText("Nombres: ");

        etq_apellidos.setText("Apellidos: ");

        etq_direccion.setText("Dirección: ");

        etq_telefono.setText("Teléfono: ");

        etq_correo.setText("Correo:");

        btn_editar.setBackground(new java.awt.Color(255, 255, 0));
        btn_editar.setForeground(new java.awt.Color(0, 0, 0));
        btn_editar.setText("Editar");

        javax.swing.GroupLayout contenedor_eliminarLayout = new javax.swing.GroupLayout(contenedor_eliminar);
        contenedor_eliminar.setLayout(contenedor_eliminarLayout);
        contenedor_eliminarLayout.setHorizontalGroup(
            contenedor_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_eliminarLayout.createSequentialGroup()
                .addGroup(contenedor_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor_eliminarLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(etq_titulo))
                    .addGroup(contenedor_eliminarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contenedor_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(contenedor_eliminarLayout.createSequentialGroup()
                                .addComponent(etq_correo)
                                .addGap(28, 28, 28)
                                .addComponent(campo_correo))
                            .addGroup(contenedor_eliminarLayout.createSequentialGroup()
                                .addComponent(etq_direccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_direccion))
                            .addGroup(contenedor_eliminarLayout.createSequentialGroup()
                                .addComponent(etq_nombres)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(contenedor_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedor_eliminarLayout.createSequentialGroup()
                                .addComponent(etq_apellidos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenedor_eliminarLayout.createSequentialGroup()
                                .addComponent(etq_telefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_eliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(contenedor_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_eliminarLayout.createSequentialGroup()
                        .addComponent(etq_documento)
                        .addGap(18, 18, 18)
                        .addComponent(campo_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_eliminarLayout.createSequentialGroup()
                        .addComponent(btn_editar)
                        .addGap(205, 205, 205))))
        );
        contenedor_eliminarLayout.setVerticalGroup(
            contenedor_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_eliminarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(etq_titulo)
                .addGap(35, 35, 35)
                .addGroup(contenedor_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_documento)
                    .addComponent(campo_documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(25, 25, 25)
                .addGroup(contenedor_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_nombres)
                    .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_apellidos)
                    .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(contenedor_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_direccion)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_telefono)
                    .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(contenedor_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_correo)
                    .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btn_editar)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        
        
        String cedulaEditar = campo_documento.getText();
        datos.buscarPersona(cedulaEditar);
        
        
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JTextField campo_apellidos;
    private javax.swing.JTextField campo_correo;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_documento;
    private javax.swing.JTextField campo_nombres;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JPanel contenedor_eliminar;
    private javax.swing.JLabel etq_apellidos;
    private javax.swing.JLabel etq_correo;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_documento;
    private javax.swing.JLabel etq_nombres;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel etq_titulo;
    // End of variables declaration//GEN-END:variables
}
