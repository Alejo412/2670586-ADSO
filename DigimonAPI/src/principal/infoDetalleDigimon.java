
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Component;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import utils.ConsumoAPI;
import utils.Digimon;

public class infoDetalleDigimon extends javax.swing.JFrame {

   Digimon digimon;
   String listaLevels [];
   String listaTypes [];
   String listaAtributos [];
   ConsumoAPI consumo = new ConsumoAPI();
   
   
   
   
   
    public infoDetalleDigimon(Digimon digimon) {
        
        
        this.digimon = digimon;
        initComponents();
        cargarImagenPokemon();
        initAlternComponents();
        cargarLevel();
        cargarAtributos();
        cargarType();
        cargarField();
    }
    
    
    
     public void initAlternComponents(){
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle(digimon.getName());
        etq_num.setText(digimon.getId());
        etq_nombre.setText(digimon.getName());
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        
        
    }
     
     
    
    
      
    public void cargarImagenPokemon(){
        try {
            String url = digimon.getUrlImg();
            URL imgUrl = new URL(url);
            Image imagen = getToolkit().createImage(imgUrl);
            imagen = imagen.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
            etq_img.setIcon(new ImageIcon(imagen));
        } catch (MalformedURLException ex) {
            Logger.getLogger(tarjetaDigimon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
    
    public void cargarLevel(){
        
        panel_level.removeAll();  
        panel_level.add(Box.createVerticalGlue());
         
         String data = this.consumo.consumoGET(digimon.getHref());
         JsonObject href = JsonParser.parseString( data ).getAsJsonObject();
         JsonArray arregloLevels = href.getAsJsonArray("levels");
         listaLevels = new String[arregloLevels.size()] ;
         
         for(int i = 0; i < arregloLevels.size(); i++){
             
             
            JsonObject temp = arregloLevels.get(i).getAsJsonObject();
            String nombreLevel = temp.get("level").getAsString();

            listaLevels[i] = new String(nombreLevel);
            
             JLabel level = new JLabel(nombreLevel);
             level.setAlignmentX(Component.CENTER_ALIGNMENT);
             
             panel_level.add(level);
             System.out.println(nombreLevel);
         }
         
         panel_level.add(Box.createVerticalGlue());
         repaint();
         revalidate();
    }
    
    public void cargarAtributos(){
         panel_attribute.removeAll();  
         panel_attribute.add(Box.createVerticalGlue());
         String data = this.consumo.consumoGET(digimon.getHref());
         JsonObject href = JsonParser.parseString( data ).getAsJsonObject();
         
         JsonArray arregloAtibutos = href.getAsJsonArray("attributes");
         listaAtributos = new String[arregloAtibutos.size()] ;
         
         for(int i = 0; i < arregloAtibutos.size(); i++){
             
             
            JsonObject temp = arregloAtibutos.get(i).getAsJsonObject();
            String nombreAtributo = temp.get("attribute").getAsString();

            listaAtributos[i] = new String(nombreAtributo);
            
             JLabel atributo = new JLabel(nombreAtributo);
             atributo.setAlignmentX(Component.CENTER_ALIGNMENT);
             
             
             panel_attribute.add(atributo);
             System.out.println(nombreAtributo);
         }
         
         panel_attribute.add(Box.createVerticalGlue());
         repaint();
         revalidate();
    }
    
    public void cargarType(){
         panel_type.removeAll();  
         panel_type.add(Box.createVerticalGlue());
         
         String data = this.consumo.consumoGET(digimon.getHref());
         JsonObject href = JsonParser.parseString( data ).getAsJsonObject();
         JsonArray arregloTypes = href.getAsJsonArray("types");
         listaTypes = new String[arregloTypes.size()] ;
         
         for(int i = 0; i < arregloTypes.size(); i++){
             
             
            JsonObject temp = arregloTypes.get(i).getAsJsonObject();
            String nombreType = temp.get("type").getAsString();

            listaTypes[i] = new String(nombreType);
            
             JLabel type = new JLabel(nombreType);
             type.setAlignmentX(Component.CENTER_ALIGNMENT);
             
             panel_type.add(type);
             System.out.println(nombreType);
         }
         
         panel_type.add(Box.createVerticalGlue());
         repaint();
         revalidate();
    }
    
    public void cargarField(){
         panel_fields.removeAll();  
         panel_fields.add(Box.createHorizontalGlue());
         
         String data = this.consumo.consumoGET(digimon.getHref());
         JsonObject href = JsonParser.parseString( data ).getAsJsonObject();
         JsonArray arregloFields = href.getAsJsonArray("fields");
         
         if(arregloFields.size() == 0){
             etq_field.setText(" ");
         }else{
             for(int i = 0; i < arregloFields.size(); i++){

            JsonObject temp = arregloFields.get(i).getAsJsonObject();
            String urlField = temp.get("image").getAsString();
            
          
            JLabel etq_img = new JLabel();
            
            try {
                String url = urlField;
                URL imgUrl = new URL(url);
                Image imagen = getToolkit().createImage(imgUrl);
                imagen = imagen.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                etq_img.setIcon(new ImageIcon(imagen));
                panel_fields.add(etq_img);
            } catch (MalformedURLException ex) {
                Logger.getLogger(tarjetaDigimon.class.getName()).log(Level.SEVERE, null, ex);
            }
             
            
            System.out.println(urlField);
         }
         
         panel_fields.add(Box.createHorizontalGlue());
         repaint();
         revalidate();
         }
        
         
    }
    


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        content_head = new javax.swing.JPanel();
        etq_num = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();
        content_img = new javax.swing.JPanel();
        etq_img = new javax.swing.JLabel();
        content_atributos = new javax.swing.JPanel();
        etq_type = new javax.swing.JLabel();
        etq_attribute = new javax.swing.JLabel();
        etq_level = new javax.swing.JLabel();
        panel_level = new javax.swing.JPanel();
        panel_attribute = new javax.swing.JPanel();
        panel_type = new javax.swing.JPanel();
        etq_field = new javax.swing.JLabel();
        panel_fields = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setBackground(new java.awt.Color(255, 255, 255));

        content_head.setBackground(new java.awt.Color(255, 255, 255));

        etq_num.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        etq_num.setForeground(new java.awt.Color(0, 0, 0));
        etq_num.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_num.setText("sds");

        etq_nombre.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(0, 0, 0));
        etq_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_nombre.setText("jLabel2");

        javax.swing.GroupLayout content_headLayout = new javax.swing.GroupLayout(content_head);
        content_head.setLayout(content_headLayout);
        content_headLayout.setHorizontalGroup(
            content_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_num, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(etq_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        content_headLayout.setVerticalGroup(
            content_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_headLayout.createSequentialGroup()
                .addComponent(etq_num, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        content_img.setBackground(new java.awt.Color(255, 255, 255));

        etq_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout content_imgLayout = new javax.swing.GroupLayout(content_img);
        content_img.setLayout(content_imgLayout);
        content_imgLayout.setHorizontalGroup(
            content_imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        content_imgLayout.setVerticalGroup(
            content_imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_imgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_img, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
        );

        content_atributos.setBackground(new java.awt.Color(255, 255, 255));

        etq_type.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        etq_type.setForeground(new java.awt.Color(0, 0, 0));
        etq_type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_type.setText("Type");

        etq_attribute.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        etq_attribute.setForeground(new java.awt.Color(0, 0, 0));
        etq_attribute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_attribute.setText("Attribute");

        etq_level.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        etq_level.setForeground(new java.awt.Color(0, 0, 0));
        etq_level.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_level.setText("Level");

        panel_level.setBackground(new java.awt.Color(255, 255, 255));
        panel_level.setForeground(new java.awt.Color(0, 0, 0));
        panel_level.setLayout(new javax.swing.BoxLayout(panel_level, javax.swing.BoxLayout.Y_AXIS));

        panel_attribute.setBackground(new java.awt.Color(255, 255, 255));
        panel_attribute.setForeground(new java.awt.Color(0, 0, 0));
        panel_attribute.setLayout(new javax.swing.BoxLayout(panel_attribute, javax.swing.BoxLayout.Y_AXIS));

        panel_type.setBackground(new java.awt.Color(255, 255, 255));
        panel_type.setForeground(new java.awt.Color(0, 0, 0));
        panel_type.setLayout(new javax.swing.BoxLayout(panel_type, javax.swing.BoxLayout.Y_AXIS));

        etq_field.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        etq_field.setForeground(new java.awt.Color(0, 0, 0));
        etq_field.setText("Fields");

        panel_fields.setBackground(new java.awt.Color(255, 255, 255));
        panel_fields.setLayout(new javax.swing.BoxLayout(panel_fields, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout content_atributosLayout = new javax.swing.GroupLayout(content_atributos);
        content_atributos.setLayout(content_atributosLayout);
        content_atributosLayout.setHorizontalGroup(
            content_atributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_atributosLayout.createSequentialGroup()
                .addGroup(content_atributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(content_atributosLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(etq_level, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(content_atributosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(content_atributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(content_atributosLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(etq_attribute, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addGap(50, 50, 50)
                        .addComponent(etq_type, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(content_atributosLayout.createSequentialGroup()
                        .addComponent(panel_attribute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(content_atributosLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(etq_field)
                .addContainerGap(189, Short.MAX_VALUE))
            .addGroup(content_atributosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_fields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        content_atributosLayout.setVerticalGroup(
            content_atributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_atributosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(content_atributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_level, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_attribute, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_type, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(content_atributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_level, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_attribute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(etq_field)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_fields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content_head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content_atributos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(content_head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content_img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content_atributos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content_atributos;
    private javax.swing.JPanel content_head;
    private javax.swing.JPanel content_img;
    private javax.swing.JLabel etq_attribute;
    private javax.swing.JLabel etq_field;
    private javax.swing.JLabel etq_img;
    private javax.swing.JLabel etq_level;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_num;
    private javax.swing.JLabel etq_type;
    private javax.swing.JPanel main;
    private javax.swing.JPanel panel_attribute;
    private javax.swing.JPanel panel_fields;
    private javax.swing.JPanel panel_level;
    private javax.swing.JPanel panel_type;
    // End of variables declaration//GEN-END:variables
}
