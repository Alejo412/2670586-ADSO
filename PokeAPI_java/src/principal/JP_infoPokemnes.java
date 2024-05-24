
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.ButtonEditor;
import utils.ButtonRenderer;
import utils.ConsumoAPI;
import utils.Pokemon;


public class JP_infoPokemnes extends javax.swing.JPanel {
    
    ConsumoAPI consumo = new ConsumoAPI();
    contentPrincipal ventana;
    DefaultTableModel modelo; 
    int posicion;
    Pokemon listaBotones [];
    //Pokemon pokemonActual;
 
    
      
    
    
    public JP_infoPokemnes(contentPrincipal ventana, int posicion) {
        this.ventana = ventana;
        this.posicion = posicion;
        initComponents();
        modelo = (DefaultTableModel) tabla_infoPokmon.getModel();
        initAlternComponents();
        llenarCampoNombre();
        imprimirTablaInfoPokemon();
        imprimirImgPokemon();
        
        
        //listaBotones = ventana.obtnerPokemon();
        //pokemonActual = ventana.listaBotones[posicion];
        
    }
    
      public void initAlternComponents(){
        setVisible(true);
        
        tabla_infoPokmon.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabla_infoPokmon.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabla_infoPokmon.getColumnModel().getColumn(2).setPreferredWidth(200);
        
        tabla_infoPokmon.getTableHeader().setReorderingAllowed(false);
        tabla_infoPokmon.getTableHeader().setResizingAllowed(false);
        
      
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        
        
       
        tabla_infoPokmon.setRowHeight(25);
        
        Image felcha_atras = getToolkit().createImage( ClassLoader.getSystemResource("img/flecha-izquierda.png") );
        felcha_atras = felcha_atras.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        etq_btonAtras.setIcon(new ImageIcon(felcha_atras));
        Image felcha_adelante = getToolkit().createImage( ClassLoader.getSystemResource("img/flecha-correcta.png") );
        felcha_adelante = felcha_adelante.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        etq_btonAdelante.setIcon(new ImageIcon(felcha_adelante));
        
        
      }
      
       public void llenarCampoNombre(){
        
        
        listaBotones = ventana.obtnerPokemon();
        etq_tituloNombre.setText(ventana.listaBotones[posicion].getNombre());
        System.out.println(ventana.listaBotones[posicion].getNombre());
       
  
    }
       
    public void imprimirTablaInfoPokemon(){
        String respuestaUrl = consumo.consumoGET(ventana.listaBotones[posicion].getUrl());
        JsonObject informacion = JsonParser.parseString( respuestaUrl ).getAsJsonObject();
        JsonArray arregloHabilidades = informacion.getAsJsonArray("abilities");
         modelo.setRowCount(0);
        
        
        for(int i = 0; i < arregloHabilidades.size(); i++){
            JsonObject tempHabilidades = arregloHabilidades.get(i).getAsJsonObject();
            JsonObject ability = tempHabilidades.getAsJsonObject("ability");
            String nombreHabilidada = ability.get("name").getAsString();
            String urlHabilidad = ability.get("url").getAsString();
            System.out.println(nombreHabilidada);
           
            
            Object dato[] = new Object[]{i+1, nombreHabilidada, urlHabilidad};
            modelo.addRow(dato);
            
        }
              
    }
    
    public void imprimirImgPokemon(){
        String respuestaUrl = consumo.consumoGET(ventana.listaBotones[posicion].getUrl());
        JsonObject informacion = JsonParser.parseString( respuestaUrl ).getAsJsonObject();
       
        JsonObject objetoSprites = informacion.getAsJsonObject("sprites");
        
        JsonObject objetoOther = objetoSprites.getAsJsonObject("other");
        
        JsonObject objetoHome = objetoOther.getAsJsonObject("home");
     
        String urlImg = objetoHome.get("front_default").getAsString();
        System.out.println(urlImg);
        
        try {
        // Descargar la imagen desde la URL
        URL url = new URL(urlImg);
        Image fotoPokemon = ImageIO.read(url);

        // Escalar la imagen
            if (fotoPokemon != null) {
                   fotoPokemon = fotoPokemon.getScaledInstance(300, 250, Image.SCALE_SMOOTH);
                    ImageIcon icono = new ImageIcon(fotoPokemon);

            // Establecer la imagen en el JLabel
                etq_imagen.setIcon(icono);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al descargar la imagen: " + e.getMessage());
            imprimirImgPokemon();
        }

       
         
    }
       
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_tituloNombre = new javax.swing.JLabel();
        etq_imagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_infoPokmon = new javax.swing.JTable();
        etq_btonAtras = new javax.swing.JLabel();
        etq_btonAdelante = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        etq_tituloNombre.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        etq_tituloNombre.setForeground(new java.awt.Color(0, 0, 0));
        etq_tituloNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_imagen.setBackground(new java.awt.Color(255, 255, 255));

        tabla_infoPokmon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N°", "Habilidad", "URL"
            }
        ));
        jScrollPane1.setViewportView(tabla_infoPokmon);

        etq_btonAdelante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etq_btonAdelanteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_tituloNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_btonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etq_btonAdelante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(etq_tituloNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(etq_btonAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(etq_btonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void etq_btonAdelanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_btonAdelanteMouseClicked
        listaBotones = ventana.obtnerPokemon();
    if (posicion + 1 < ventana.listaBotones.length) {
        Pokemon pokemonSiguiente = ventana.listaBotones[posicion+1];
        //pokemonActual = pokemonSiguiente;
        System.out.println(pokemonSiguiente.getNombre());
        imprimirImgPokemon();
    } else {
        System.out.println("No hay un Pokémon siguiente.");
    }
        
        
        

        
    }//GEN-LAST:event_etq_btonAdelanteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etq_btonAdelante;
    private javax.swing.JLabel etq_btonAtras;
    private javax.swing.JLabel etq_imagen;
    private javax.swing.JLabel etq_tituloNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_infoPokmon;
    // End of variables declaration//GEN-END:variables
}
