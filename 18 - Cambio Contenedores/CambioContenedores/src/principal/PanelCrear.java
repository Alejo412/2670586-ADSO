
package principal;

import utils.BaseDatos;


public class PanelCrear extends javax.swing.JFrame {

   
    
    BaseDatos datos;
    
    public PanelCrear(BaseDatos datos) {
        initComponents();
        initAlternComponent();
        
    }
    
    public void initAlternComponent(){
        setVisible(true);
        setTitle("CREAR USUARIO");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor_crear = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        etq_documento = new javax.swing.JLabel();
        campo_documento = new javax.swing.JTextField();
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
        btn_crear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor_crear.setBackground(new java.awt.Color(255, 102, 51));

        etq_titulo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        etq_titulo.setText("Panel  Crear");

        etq_documento.setText("Cédula: ");

        campo_documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_documentoActionPerformed(evt);
            }
        });

        etq_nombres.setText("Nombres: ");

        etq_apellidos.setText("Apellidos: ");

        etq_direccion.setText("Direccción: ");

        etq_telefono.setText("Teléfono: ");

        etq_correo.setText("Correro");

        btn_crear.setBackground(new java.awt.Color(0, 204, 204));
        btn_crear.setForeground(new java.awt.Color(0, 0, 0));
        btn_crear.setText("Crear");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedor_crearLayout = new javax.swing.GroupLayout(contenedor_crear);
        contenedor_crear.setLayout(contenedor_crearLayout);
        contenedor_crearLayout.setHorizontalGroup(
            contenedor_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_crearLayout.createSequentialGroup()
                .addGroup(contenedor_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedor_crearLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(etq_documento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_documento, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                    .addGroup(contenedor_crearLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etq_titulo)))
                .addGap(122, 122, 122))
            .addGroup(contenedor_crearLayout.createSequentialGroup()
                .addGroup(contenedor_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor_crearLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(contenedor_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(contenedor_crearLayout.createSequentialGroup()
                                .addComponent(etq_direccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_direccion))
                            .addGroup(contenedor_crearLayout.createSequentialGroup()
                                .addComponent(etq_apellidos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_apellidos))
                            .addGroup(contenedor_crearLayout.createSequentialGroup()
                                .addComponent(etq_nombres)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenedor_crearLayout.createSequentialGroup()
                                .addGroup(contenedor_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etq_telefono)
                                    .addComponent(etq_correo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contenedor_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_telefono)
                                    .addComponent(campo_correo)))))
                    .addGroup(contenedor_crearLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btn_crear)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedor_crearLayout.setVerticalGroup(
            contenedor_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_crearLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contenedor_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_documento)
                    .addComponent(campo_documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedor_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_nombres)
                    .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedor_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_apellidos)
                    .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedor_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_direccion)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedor_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_telefono)
                    .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedor_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_correo)
                    .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_crear)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor_crear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor_crear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_documentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_documentoActionPerformed

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
        
        String documento = campo_documento.getText();
        String nombres = campo_nombres.getText();
        String apellidos = campo_apellidos.getText();
        String direccion = campo_direccion.getText();
        String telefono = campo_telefono.getText();
        String correo = campo_correo.getText();
        
        if(documento.equals("")||nombres.equals("")||apellidos.equals("")||direccion.equals("")||telefono.equals("")||correo.equals("")){
            //Crear la alerta
        }else{
            
           Boolean agregar = datos.insertarPersona(documento, nombres, apellidos, direccion, telefono, correo);
           
           if(agregar == true){
               System.out.println("Se agrego persona exitosasmente");
           }else{
               System.out.println("No se agrego persona");
           }
        }
        dispose();
    }//GEN-LAST:event_btn_crearActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear;
    private javax.swing.JTextField campo_apellidos;
    private javax.swing.JTextField campo_correo;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_documento;
    private javax.swing.JTextField campo_nombres;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JPanel contenedor_crear;
    private javax.swing.JLabel etq_apellidos;
    private javax.swing.JLabel etq_correo;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_documento;
    private javax.swing.JLabel etq_nombres;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel etq_titulo;
    // End of variables declaration//GEN-END:variables
}
