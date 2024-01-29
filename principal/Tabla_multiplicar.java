
package principal;


public class Tabla_multiplicar extends javax.swing.JFrame {

    
    public Tabla_multiplicar() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_titulo = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        jp_datos = new javax.swing.JPanel();
        etq_tabla = new javax.swing.JLabel();
        campo_tabla = new javax.swing.JTextField();
        etq_multiplos = new javax.swing.JLabel();
        campo_multiplos = new javax.swing.JTextField();
        btn_crear = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        etq_resultado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp_titulo.setBackground(new java.awt.Color(51, 153, 255));

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setText("TABLA DE MULTIPLICAR");

        javax.swing.GroupLayout jp_tituloLayout = new javax.swing.GroupLayout(jp_titulo);
        jp_titulo.setLayout(jp_tituloLayout);
        jp_tituloLayout.setHorizontalGroup(
            jp_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_tituloLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(etq_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_tituloLayout.setVerticalGroup(
            jp_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_tituloLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(etq_titulo)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jp_datos.setBackground(new java.awt.Color(0, 153, 153));

        etq_tabla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_tabla.setText("Tabla:");

        campo_tabla.setBackground(new java.awt.Color(204, 204, 204));

        etq_multiplos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_multiplos.setText("Multiplos: ");

        campo_multiplos.setBackground(new java.awt.Color(204, 204, 204));

        btn_crear.setBackground(new java.awt.Color(153, 0, 255));
        btn_crear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_crear.setForeground(new java.awt.Color(255, 255, 255));
        btn_crear.setText("CREAR");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_datosLayout = new javax.swing.GroupLayout(jp_datos);
        jp_datos.setLayout(jp_datosLayout);
        jp_datosLayout.setHorizontalGroup(
            jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_datosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(etq_tabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(etq_multiplos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_multiplos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btn_crear)
                .addGap(29, 29, 29))
        );
        jp_datosLayout.setVerticalGroup(
            jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_datosLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_tabla)
                    .addComponent(campo_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_multiplos)
                    .addComponent(campo_multiplos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crear))
                .addGap(22, 22, 22))
        );

        etq_resultado.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        etq_resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scroll.setViewportView(etq_resultado);

        jButton1.setBackground(new java.awt.Color(153, 0, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scroll))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
        int multiplicador = Integer.valueOf(campo_tabla.getText());
        int multiplos = Integer.valueOf(campo_multiplos.getText());
        
        String html = "<html>";
        for(int i = 1; i <= multiplos; i++){
            html += (multiplicador+ " X "+i+" = "+(multiplicador*i))+"<br>";
        }
        
        etq_resultado.setText(html);
    }//GEN-LAST:event_btn_crearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        campo_tabla.setText(" ");
        campo_multiplos.setText(" ");
        etq_resultado.setText(" ");
    }//GEN-LAST:event_jButton1ActionPerformed

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear;
    private javax.swing.JTextField campo_multiplos;
    private javax.swing.JTextField campo_tabla;
    private javax.swing.JLabel etq_multiplos;
    private javax.swing.JLabel etq_resultado;
    private javax.swing.JLabel etq_tabla;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jp_datos;
    private javax.swing.JPanel jp_titulo;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
