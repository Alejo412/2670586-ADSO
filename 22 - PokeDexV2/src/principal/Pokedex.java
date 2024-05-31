package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import utils.ConsumoAPI;

public class Pokedex extends javax.swing.JFrame {

    ConsumoAPI consumo;
    int pagina;
    int numPokemones;
    int listaNumerosPagniador [];
    String posicion;
  
            
           
    
    public Pokedex() {
        this.consumo = new ConsumoAPI();
        this.pagina = 1;
        
        initComponents();
        initAlternComponents();
        cargarPokemones();
        cargarPaginador();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelBotones = new javax.swing.JPanel();
        panelDetalle = new javax.swing.JPanel();
        panelPaginador = new javax.swing.JPanel();
        etq_numPag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(204, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("POKEMON");

        panelBotones.setLayout(new javax.swing.BoxLayout(panelBotones, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(panelBotones);

        javax.swing.GroupLayout panelDetalleLayout = new javax.swing.GroupLayout(panelDetalle);
        panelDetalle.setLayout(panelDetalleLayout);
        panelDetalleLayout.setHorizontalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        panelDetalleLayout.setVerticalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelPaginador.setLayout(new javax.swing.BoxLayout(panelPaginador, javax.swing.BoxLayout.X_AXIS));

        etq_numPag.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_numPag.setForeground(new java.awt.Color(0, 0, 0));
        etq_numPag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_numPag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelPaginador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .addComponent(panelDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_numPag, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void initAlternComponents(){
        setTitle("POKEDEX");
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/pokeball.png")) );
        setLocationRelativeTo(null);
        setVisible(true);  
        
    }
    
    public void cargarPokemones(){
        int offset = (this.pagina*20)-20;
        String endpoint = "https://pokeapi.co/api/v2/pokemon?offset="+offset+"&limit=20";
        String data = this.consumo.consumoGET(endpoint);
        
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        JsonArray results = dataJson.getAsJsonArray("results");
        for (int i=0; i<results.size(); i++) {
              JsonObject temp = results.get(i).getAsJsonObject();
            
            JButton btn = new JButton( temp.get("name").getAsString() );
           
           
            panelBotones.add(btn);
            
            
            
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Nombre: "+ temp.get("name").getAsString());
                    System.out.println("Url: "+temp.get("url").getAsString());
                    
                    panelDetalle.removeAll();
                    DetallePokemon detalle = new DetallePokemon( temp );
                    detalle.setSize( panelDetalle.getSize() );
                    detalle.setPreferredSize( panelDetalle.getPreferredSize() );
                    panelDetalle.add(detalle);
                    
                    revalidate();
                    repaint();
                }
            });
        }
        
        panelDetalle.removeAll();
        DetallePokemon detalle = new DetallePokemon( results.get(0).getAsJsonObject() );
        detalle.setSize( panelDetalle.getSize() );
        detalle.setPreferredSize( panelDetalle.getPreferredSize() );
        panelDetalle.add(detalle);
        
        revalidate();
        repaint();
    }
    
    
    public void cargarPaginador(){
        String endpoint = "https://pokeapi.co/api/v2/pokemon";
        String data = this.consumo.consumoGET(endpoint);
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        numPokemones = dataJson.get("count").getAsInt();
        
       JButton btnUltimaPagina = new JButton( );
       JButton btnSiguiente = new JButton( );
        JButton btnatras = new JButton( );
       JButton btnPrimerpag = new JButton( );
        
        panelPaginador.removeAll();
        panelPaginador.add(Box.createHorizontalGlue());
        
        
         listaNumerosPagniador = new int[] {1,2,3,4,5,6,7};
         JButton[] btnNums = new JButton[listaNumerosPagniador.length];

         
                
         //Imprimir Botón primer pagina
          
          btnPrimerpag.setText("<<");
          if (pagina==1) {
               btnPrimerpag.setEnabled(false);
            }else{
               btnPrimerpag.setEnabled(true);
          }
          panelPaginador.add(btnPrimerpag);
          
           btnPrimerpag.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(pagina > 1){
                        pagina = 1;
                        panelBotones.removeAll();
                        cargarPokemones();
                        etq_numPag.setText(pagina+"/"+((numPokemones/20)+1));
                        btnUltimaPagina.setEnabled(true);
                        btnSiguiente.setEnabled(true);
                        btnPrimerpag.setEnabled(false);
                        btnatras.setEnabled(false);
                        for(int j = 0; j < listaNumerosPagniador.length; j++){
                                
                          btnNums[j] = new JButton();
                        
                            posicion = Integer.toString(listaNumerosPagniador[j]+1);
                            btnNums[j].setText(posicion); 
                      
                            
                          
                            System.out.println(listaNumerosPagniador[j]);
                        }
                        
                       
                    }
               }
            });

                    
          
          
         //Imrimir Botón atras
        
          btnatras.setText("<");
          if (pagina==1) {
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
                        panelBotones.removeAll();
                        cargarPokemones();
                        btnUltimaPagina.setEnabled(true);
                        btnSiguiente.setEnabled(true);
                        etq_numPag.setText(pagina+"/"+((numPokemones/20)+1));
                         System.out.println("El numero de la pag "+pagina);
                       
                    }
               }
            });
           
          
         //ImprimirBotones de paginador
         
            for(int i = 0; i < listaNumerosPagniador.length; i++){
                posicion = Integer.toString(i+1);
                
                btnNums[i] = new JButton();
                btnNums[i].setText(posicion);
             
                panelPaginador.add(btnNums[i]);
                final int posicionPag = i+1;
                btnNums[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if(posicionPag > 4){
                        System.out.println("Esta adelante");
                        pagina = posicionPag;
                        panelBotones.removeAll();
                        cargarPokemones();
                        btnatras.setEnabled(true);
                        btnPrimerpag.setEnabled(true);
                        for(int j = 0; j < listaNumerosPagniador.length; j++){
                                
                            listaNumerosPagniador[j] =  listaNumerosPagniador[j]+(posicionPag-4);
                        
                            posicion = Integer.toString(listaNumerosPagniador[j]);
                            btnNums[j].setText(posicion); 
                          
                            System.out.println(listaNumerosPagniador[j]);
                        }
                        
                         
                       
                    }else{
                         System.out.println("Esta atras");
                          pagina = posicionPag ;
                        panelBotones.removeAll(); 
                        cargarPokemones();
                    }
                    
                        
                   
                    
                   
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
                    panelBotones.removeAll();
                    cargarPokemones();
                    btnatras.setEnabled(true);
                    btnPrimerpag.setEnabled(true);
                    etq_numPag.setText(pagina+"/"+((numPokemones/20)+1));


                    
                    System.out.println("El numero de la pag "+pagina);
                    
                }
            });
          
         //Imprimir Boton ultima pagina
           
          btnUltimaPagina.setText(">>");
          panelPaginador.add(btnUltimaPagina);
       
          btnUltimaPagina.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
               
                   
                    pagina = (1 +(numPokemones/20) );
                    panelBotones.removeAll();
                    cargarPokemones();
                    btnPrimerpag.setEnabled(true);
                    btnatras.setEnabled(true);
                    btnUltimaPagina.setEnabled(false);
                    btnSiguiente.setEnabled(false);
                    etq_numPag.setText(pagina+"/"+((numPokemones/20)+1));

                    
                    System.out.println("El numero de la pag "+pagina);
                    
                }
            });
         
         panelPaginador.add(Box.createHorizontalGlue());
         repaint();
         revalidate();
         
       
         
        
        
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etq_numPag;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDetalle;
    private javax.swing.JPanel panelPaginador;
    // End of variables declaration//GEN-END:variables
}
