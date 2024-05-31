
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import utils.ConsumoAPI;
import utils.Digimon;



public class ContentPrincipal extends javax.swing.JFrame {

    ConsumoAPI consumo;
    int pagina;
    Digimon listadigimon[];
    
    
    public ContentPrincipal() {
        initComponents();
        initAlternComponents();
        cargarDigimon();
    }
    
    public void initAlternComponents(){
        this.pagina = 0;
        this.consumo = new ConsumoAPI();
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("DIJIMON");
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("img/icono_digimon.png") ) );
        Image titulo = getToolkit().createImage( ClassLoader.getSystemResource("img/icono_digimon.png") );
        titulo = titulo.getScaledInstance(160, 60, Image.SCALE_SMOOTH);
        etq_titulo.setIcon(new ImageIcon(titulo));

   
    }
    
    public void cargarDigimon(){
      
        int numPgina = (this.pagina);
        String endpoint = "https://digi-api.com/api/v1/digimon?page="+numPgina;
        String data = this.consumo.consumoGET(endpoint);
         
        
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        JsonArray Arreglocontent = dataJson.getAsJsonArray("content");
        listadigimon = new Digimon[Arreglocontent.size()] ;
        
         for (int i=0; i<Arreglocontent.size(); i++) {
            
              JsonObject temp = Arreglocontent.get(i).getAsJsonObject();
              String id = temp.get("id").getAsString() ;
              String nombre = temp.get("name").getAsString() ;
              String href = temp.get("href").getAsString() ;
              String urlImg = temp.get("image").getAsString() ;
              System.out.println(nombre + href);
              listadigimon[i] = new Digimon(id, nombre, href, urlImg);

               
               
               tarjetaDigimon tarjetaInformacion = new tarjetaDigimon( listadigimon[i]);
               contentDetalle.add(tarjetaInformacion);
               
            final int posicion = i;
            tarjetaInformacion.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    System.out.println(nombre);
                    detalleDigimon ventanainfoPokemon = new detalleDigimon(listadigimon[posicion]);    
                }
            });
               
              
            
                repaint();
                revalidate();

    }
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentHead = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        contentDetalle = new javax.swing.JPanel();
        contentPaginador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout contentHeadLayout = new javax.swing.GroupLayout(contentHead);
        contentHead.setLayout(contentHeadLayout);
        contentHeadLayout.setHorizontalGroup(
            contentHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentHeadLayout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentHeadLayout.setVerticalGroup(
            contentHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentHeadLayout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        contentDetalle.setBackground(new java.awt.Color(153, 153, 153));
        contentDetalle.setLayout(new java.awt.GridLayout(2, 3));

        javax.swing.GroupLayout contentPaginadorLayout = new javax.swing.GroupLayout(contentPaginador);
        contentPaginador.setLayout(contentPaginadorLayout);
        contentPaginadorLayout.setHorizontalGroup(
            contentPaginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 769, Short.MAX_VALUE)
        );
        contentPaginadorLayout.setVerticalGroup(
            contentPaginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentPaginador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(contentDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentDetalle;
    private javax.swing.JPanel contentHead;
    private javax.swing.JPanel contentPaginador;
    private javax.swing.JLabel etq_titulo;
    // End of variables declaration//GEN-END:variables
}
