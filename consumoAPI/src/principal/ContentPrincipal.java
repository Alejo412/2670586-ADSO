
package principal;


public class ContentPrincipal extends javax.swing.JFrame {

 
    public ContentPrincipal() {
        initComponents();
        initAlternComponents();
    }
    
     public void initAlternComponents(){
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenerdor_head = new javax.swing.JPanel();
        etq_listar = new javax.swing.JLabel();
        etq_insertar = new javax.swing.JLabel();
        contenedor_variable = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        contenerdor_head.setBackground(new java.awt.Color(0, 0, 0));

        etq_listar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        etq_listar.setForeground(new java.awt.Color(255, 255, 255));
        etq_listar.setText("Listar");
        etq_listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etq_listarMouseClicked(evt);
            }
        });

        etq_insertar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        etq_insertar.setForeground(new java.awt.Color(255, 255, 255));
        etq_insertar.setText("Insertar");
        etq_insertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etq_insertarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout contenerdor_headLayout = new javax.swing.GroupLayout(contenerdor_head);
        contenerdor_head.setLayout(contenerdor_headLayout);
        contenerdor_headLayout.setHorizontalGroup(
            contenerdor_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenerdor_headLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(etq_listar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                .addComponent(etq_insertar)
                .addGap(134, 134, 134))
        );
        contenerdor_headLayout.setVerticalGroup(
            contenerdor_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenerdor_headLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(contenerdor_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_listar)
                    .addComponent(etq_insertar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        contenedor_variable.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenedor_variableLayout = new javax.swing.GroupLayout(contenedor_variable);
        contenedor_variable.setLayout(contenedor_variableLayout);
        contenedor_variableLayout.setHorizontalGroup(
            contenedor_variableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenedor_variableLayout.setVerticalGroup(
            contenedor_variableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenerdor_head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedor_variable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenerdor_head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor_variable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void etq_listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_listarMouseClicked
       
        JP_ListaPersona nuevo = new JP_ListaPersona();
        
        nuevo.setPreferredSize(contenedor_variable.getPreferredSize());
        nuevo.setSize(contenedor_variable.getSize());
        
        contenedor_variable.removeAll();
       
        contenedor_variable.add(nuevo);
        

        repaint();
        revalidate();
        
    }//GEN-LAST:event_etq_listarMouseClicked

    private void etq_insertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_insertarMouseClicked
        JP_InsertarPersona nuevo = new JP_InsertarPersona();
        
        nuevo.setPreferredSize(contenedor_variable.getPreferredSize());
        nuevo.setSize(contenedor_variable.getSize());
        
        contenedor_variable.removeAll();
       
        contenedor_variable.add(nuevo);
        

        repaint();
        revalidate();
    }//GEN-LAST:event_etq_insertarMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor_variable;
    private javax.swing.JPanel contenerdor_head;
    private javax.swing.JLabel etq_insertar;
    private javax.swing.JLabel etq_listar;
    // End of variables declaration//GEN-END:variables
}
