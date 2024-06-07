
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
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;
import utils.ConsumoAPI;
import utils.Digimon;



public class ContentPrincipal extends javax.swing.JFrame {

    ConsumoAPI consumo;
    int pagina;
    Digimon listadigimon[];
    int listaNumerosPagniador [];
    int numDigimones;
    String posicion;
    
    
    public ContentPrincipal() {
        initComponents();
        initAlternComponents();
        cargarDigimon();
        cargarPaginador();
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
      
        
        String endpoint = "https://digi-api.com/api/v1/digimon?page="+this.pagina;
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
                    infoDetalleDigimon ventanainfoPokemon = new infoDetalleDigimon(listadigimon[posicion]);    
                }
            });
               
              
            
                repaint();
                revalidate();

        }

    }
    
    
    
     public void cargarPaginador(){
         
    
        String endpoint = "https://digi-api.com/api/v1/digimon";
        String data = this.consumo.consumoGET(endpoint);
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        JsonObject pageable = dataJson.getAsJsonObject("pageable");
        numDigimones = pageable.get("totalElements").getAsInt();
        int ultimaPag = ((numDigimones/5) - 1 );
        
       JButton btnUltimaPagina = new JButton( );
       JButton btnSiguiente = new JButton( );
        JButton btnatras = new JButton( );
       JButton btnPrimerpag = new JButton( );
       

        
        panelPaginador.removeAll();
        panelPaginador.add(Box.createHorizontalGlue());
        
        
         listaNumerosPagniador = new int[] {0,1,2,3,4,5,6};
         JButton[] btnNums = new JButton[listaNumerosPagniador.length];
         

         
                
         //Imprimir Botón primer pagina
          
          btnPrimerpag.setText("<<");
          if (pagina==0) {
               btnPrimerpag.setEnabled(false);
            }else{
               btnPrimerpag.setEnabled(true);
          }
          panelPaginador.add(btnPrimerpag);
          
           btnPrimerpag.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(pagina > 1){
                        pagina = 0;
                        contentDetalle.removeAll();
                        cargarDigimon();
                        btnUltimaPagina.setEnabled(true);
                        btnSiguiente.setEnabled(true);
                        btnPrimerpag.setEnabled(false);
                        btnatras.setEnabled(false);
                        for(int j = 0; j < listaNumerosPagniador.length; j++){

                            listaNumerosPagniador[j] = j;
                            posicion = Integer.toString(listaNumerosPagniador[j]);
                            btnNums[j].setText(posicion); 
                            //System.out.println(listaNumerosPagniador[j]);
                        }
                        
                       
                    }
               }
            });

                    
          
          
         //Imrimir Botón atras
        
          btnatras.setText("<");
          if (pagina==0) {
               btnatras.setEnabled(false);
            }else{
               btnatras.setEnabled(true);
          }
          panelPaginador.add(btnatras);
          
           btnatras.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    
                    if(pagina > 1){
                       pagina = pagina - 1;
                       
                        for(int j = 0; j < listaNumerosPagniador.length; j++){
                            int numeroPagina = (pagina + j);
                            listaNumerosPagniador[j] = (numeroPagina -3);
                        
                            posicion = Integer.toString(listaNumerosPagniador[j]);
                            //pagina = listaNumerosPagniador[3];
                
                            btnNums[j].setText(posicion); 
                            if(listaNumerosPagniador[3] == 3){
                                btnatras.setEnabled(false);
                                btnPrimerpag.setEnabled(false);
                            }
                        }
                        contentDetalle.removeAll();
                        cargarDigimon();
                        btnUltimaPagina.setEnabled(true);
                        btnSiguiente.setEnabled(true);
     
                         System.out.println("El numero de la pag "+pagina);
                       
                    }
               }
            });
           
          
         //ImprimirBotones de paginador
         
            for(int i = 0; i < listaNumerosPagniador.length; i++){
                posicion = Integer.toString(i);
                
                btnNums[i] = new JButton();
                btnNums[i].setText(posicion);
             
                panelPaginador.add(btnNums[i]);
                //final int posicionPag = i;
                btnNums[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                     JButton sourceButton = (JButton) e.getSource();
                    int posicionPag = Integer.parseInt(sourceButton.getText());

                    if(posicionPag > 3){
                        System.out.println("Esta adelante");
                        
                       
                        btnatras.setEnabled(true);
                        btnPrimerpag.setEnabled(true);
                        for(int j = 0; j < listaNumerosPagniador.length; j++){
                                
                            listaNumerosPagniador[j] = j+(posicionPag-3);
                        
                            posicion = Integer.toString(listaNumerosPagniador[j]);
                            //pagina = listaNumerosPagniador[3];
                             
                            btnNums[j].setText(posicion); 
                        }
   
                    }
                    
                    pagina = posicionPag;
                    contentDetalle.removeAll();
                    cargarDigimon();
                    System.out.println(pagina);

                }
            });
                
                
          }
         //Imprimir Boton pagina siguiente
         
         
          btnSiguiente.setText(">");
          panelPaginador.add(btnSiguiente);
           btnSiguiente.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pagina = pagina + 1;
                    
                    for(int j = 0; j < listaNumerosPagniador.length; j++){
                            int numeroPagina = (pagina + j);
                            listaNumerosPagniador[j] = (numeroPagina -3);
                        
                            posicion = Integer.toString(listaNumerosPagniador[j]);
                            //pagina = listaNumerosPagniador[3];
                             
                            btnNums[j].setText(posicion);
                            if(listaNumerosPagniador[3] == ultimaPag){
                                btnSiguiente.setEnabled(false);
                                btnUltimaPagina.setEnabled(false);
                            }
                    }
                    
                    
                    contentDetalle.removeAll();
                    cargarDigimon();
                    btnatras.setEnabled(true);
                    btnPrimerpag.setEnabled(true);
                   


                    
                    System.out.println("El numero de la pag "+pagina);
                    
                }
            });
          
         //Imprimir Boton ultima pagina
           
          btnUltimaPagina.setText(">>");
          panelPaginador.add(btnUltimaPagina);
       
          btnUltimaPagina.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
               
                   
                    pagina = ultimaPag;
                    contentDetalle.removeAll();
                    cargarDigimon();
                    btnPrimerpag.setEnabled(true);
                    btnatras.setEnabled(true);
                    btnUltimaPagina.setEnabled(false);
                    btnSiguiente.setEnabled(false);
                    int numTemporal = (ultimaPag-6);
                    for(int j = 0; j < listaNumerosPagniador.length; j++){

                            listaNumerosPagniador[j] = numTemporal;
                            numTemporal++;
                            posicion = Integer.toString(listaNumerosPagniador[j]);
                            btnNums[j].setText(posicion); 
                            //System.out.println(listaNumerosPagniador[j]);
                        }
                        
                    
                    
                    System.out.println("El numero de la pag "+pagina);
                    
                }
            });
         
         panelPaginador.add(Box.createHorizontalGlue());
         repaint();
         revalidate();
         
       
         
        
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentHead = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        contentDetalle = new javax.swing.JPanel();
        panelPaginador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout contentHeadLayout = new javax.swing.GroupLayout(contentHead);
        contentHead.setLayout(contentHeadLayout);
        contentHeadLayout.setHorizontalGroup(
            contentHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentHeadLayout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        contentHeadLayout.setVerticalGroup(
            contentHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentHeadLayout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        contentDetalle.setBackground(new java.awt.Color(255, 255, 255));
        contentDetalle.setLayout(new java.awt.GridLayout(2, 3));

        panelPaginador.setLayout(new javax.swing.BoxLayout(panelPaginador, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPaginador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contentDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentDetalle;
    private javax.swing.JPanel contentHead;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel panelPaginador;
    // End of variables declaration//GEN-END:variables
}
