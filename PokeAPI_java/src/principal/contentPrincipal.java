 
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
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


public class contentPrincipal extends javax.swing.JFrame {
    
    DefaultTableModel modelo; 
    ConsumoAPI consumo = new ConsumoAPI();
    int pagina;
    //String respuestaGlobal = consumo.consumoGET("https://pokeapi.co/api/v2/pokemon");
    //JsonObject registros = JsonParser.parseString( respuestaGlobal ).getAsJsonObject();
    //JsonArray arregloResults = registros.getAsJsonArray("results");
    Pokemon listaBotones []; 
    int numPokemones;
    int listaNumerosPagniador [];
    String posicion;
   
    
    
    
       
    public contentPrincipal() {
        this.pagina = 1;
        
       
        initComponents();
        modelo = (DefaultTableModel) tabla_botonesPoknes.getModel();

        initAlternComponents();
        imprimirBotonesPokmnes();
        cargarPaginador();
        this.add(panelPaginador, BorderLayout.SOUTH);
        this.revalidate();
        this.repaint();
        
        
    }
    
     
    
    public void initAlternComponents(){
        
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("POKEDEX");
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("img/pokebola.png") ) );
   
        
        

        tabla_botonesPoknes.getColumnModel().getColumn(0).setCellEditor(new ButtonEditor(new JCheckBox()));
        tabla_botonesPoknes.getColumnModel().getColumn(0).setCellRenderer(new ButtonRenderer());
        
        tabla_botonesPoknes.getColumnModel().getColumn(0).setPreferredWidth(200);
   
        tabla_botonesPoknes.getTableHeader().setReorderingAllowed(false);
        tabla_botonesPoknes.getTableHeader().setResizingAllowed(false);
  
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        
         tabla_botonesPoknes.setRowHeight(30);
         
  
            

    }
    
    public void imprimirBotonesPokmnes(){
        
        int offset = (this.pagina*20)-20;
         String endpoint = "https://pokeapi.co/api/v2/pokemon?offset="+offset+"&limit=20";
         String data = this.consumo.consumoGET(endpoint);
         JsonObject registros = JsonParser.parseString( data ).getAsJsonObject();
         JsonArray arregloResults = registros.getAsJsonArray("results");
         listaBotones = new Pokemon[arregloResults.size()] ;
       
        
        for(int i = 0; i<arregloResults.size(); i++){
            JsonObject temp = arregloResults.get(i).getAsJsonObject();
            String nombres = temp.get("name").getAsString();
            String url = temp.get("url").getAsString();
            
            listaBotones[i] = new Pokemon(nombres, url);
            
     
        }
        
         modelo.setRowCount(0);
         contentPrincipal ventanaActual = this;
        for(int i = 0; i<arregloResults.size(); i++){
            JButton btnPokemon = new JButton();
            btnPokemon.setBackground(Color.white);
            btnPokemon.setText(listaBotones[i].getNombre());
               //System.out.println(listaBotones[i]);
               
               
               
            Object dato[] = new Object[]{  btnPokemon };
            modelo.addRow(dato);
            
            
            
                final int posicion = i;
                btnPokemon.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                       // btnPokemon.setBackground(Color.blue);
                        JP_infoPokemnes ventanainfoPokemon = new JP_infoPokemnes( ventanaActual, posicion );
                        System.out.println("se presiono en boton de pokemon: "+listaBotones[posicion].getNombre());
                        System.out.println(listaBotones[posicion].getUrl());
        
                            ventanainfoPokemon.setPreferredSize(contentAuxiliar.getPreferredSize());
                            ventanainfoPokemon.setSize(contentAuxiliar.getSize());
        
                            contentAuxiliar.removeAll();
       
                            contentAuxiliar.add(ventanainfoPokemon);
        

                            repaint();
                            revalidate();
                            
                       
                    }
                });
            
        }
        contentAuxiliar.removeAll();
        JP_infoPokemnes detalle = new JP_infoPokemnes( ventanaActual, 0 );
        detalle.setSize( contentAuxiliar.getSize() );
        detalle.setPreferredSize( contentAuxiliar.getPreferredSize() );
        contentAuxiliar.add(detalle);
        
        revalidate();
        repaint();
    }
    
   
    public void cargarPaginador(){
        panelPaginador.setVisible(true);
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
                        ((DefaultTableModel) tabla_botonesPoknes.getModel()).setRowCount(0); 
                        imprimirBotonesPokmnes();
                        //etq_numPag.setText(pagina+"/"+((numPokemones/20)+1));
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
                        ((DefaultTableModel) tabla_botonesPoknes.getModel()).setRowCount(0); 
                        imprimirBotonesPokmnes();
                        btnUltimaPagina.setEnabled(true);
                        btnSiguiente.setEnabled(true);
                        //etq_numPag.setText(pagina+"/"+((numPokemones/20)+1));
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
                       ((DefaultTableModel) tabla_botonesPoknes.getModel()).setRowCount(0); 
                        imprimirBotonesPokmnes();
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
                        tabla_botonesPoknes.removeAll(); 
                        imprimirBotonesPokmnes();
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
                    ((DefaultTableModel) tabla_botonesPoknes.getModel()).setRowCount(0); 
                    imprimirBotonesPokmnes();
                    btnatras.setEnabled(true);
                    btnPrimerpag.setEnabled(true);
                    //etq_numPag.setText(pagina+"/"+((numPokemones/20)+1));


                    
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
                   ((DefaultTableModel) tabla_botonesPoknes.getModel()).setRowCount(0); 
                    imprimirBotonesPokmnes();
                    btnPrimerpag.setEnabled(true);
                    btnatras.setEnabled(true);
                    btnUltimaPagina.setEnabled(false);
                    btnSiguiente.setEnabled(false);
                    //etq_numPag.setText(pagina+"/"+((numPokemones/20)+1));

                    
                    System.out.println("El numero de la pag "+pagina);
                    
                }
            });
         
         panelPaginador.add(Box.createHorizontalGlue());
         repaint();
         revalidate();


    }
    
     public Pokemon[] obtnerPokemon(){
        return listaBotones;
    }
    


    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentBotones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_botonesPoknes = new javax.swing.JTable();
        contentAuxiliar = new javax.swing.JPanel();
        contentHead = new javax.swing.JPanel();
        etq_tituloprincipal = new javax.swing.JLabel();
        panelPaginador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentBotones.setBackground(new java.awt.Color(255, 255, 255));

        tabla_botonesPoknes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "POKEMONES"
            }
        ));
        jScrollPane1.setViewportView(tabla_botonesPoknes);

        javax.swing.GroupLayout contentBotonesLayout = new javax.swing.GroupLayout(contentBotones);
        contentBotones.setLayout(contentBotonesLayout);
        contentBotonesLayout.setHorizontalGroup(
            contentBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentBotonesLayout.setVerticalGroup(
            contentBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
        );

        contentAuxiliar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentAuxiliarLayout = new javax.swing.GroupLayout(contentAuxiliar);
        contentAuxiliar.setLayout(contentAuxiliarLayout);
        contentAuxiliarLayout.setHorizontalGroup(
            contentAuxiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
        contentAuxiliarLayout.setVerticalGroup(
            contentAuxiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        contentHead.setBackground(new java.awt.Color(255, 255, 255));

        etq_tituloprincipal.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        etq_tituloprincipal.setForeground(new java.awt.Color(255, 0, 0));
        etq_tituloprincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_tituloprincipal.setText("POKEDEX");

        javax.swing.GroupLayout contentHeadLayout = new javax.swing.GroupLayout(contentHead);
        contentHead.setLayout(contentHeadLayout);
        contentHeadLayout.setHorizontalGroup(
            contentHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_tituloprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentHeadLayout.setVerticalGroup(
            contentHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentHeadLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(etq_tituloprincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPaginador.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelPaginadorLayout = new javax.swing.GroupLayout(panelPaginador);
        panelPaginador.setLayout(panelPaginadorLayout);
        panelPaginadorLayout.setHorizontalGroup(
            panelPaginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPaginadorLayout.setVerticalGroup(
            panelPaginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentAuxiliar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(contentHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPaginador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(contentHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contentBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentAuxiliar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentAuxiliar;
    private javax.swing.JPanel contentBotones;
    private javax.swing.JPanel contentHead;
    private javax.swing.JLabel etq_tituloprincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPaginador;
    private javax.swing.JTable tabla_botonesPoknes;
    // End of variables declaration//GEN-END:variables
}
