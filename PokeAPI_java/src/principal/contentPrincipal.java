
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    String respuestaGlobal = consumo.consumoGET("https://pokeapi.co/api/v2/pokemon");
    JsonObject registros = JsonParser.parseString( respuestaGlobal ).getAsJsonObject();
    JsonArray arregloResults = registros.getAsJsonArray("results");
    Pokemon listaBotones []; 
   
    
    
    
       
    public contentPrincipal() {
        initComponents();
        modelo = (DefaultTableModel) tabla_botonesPoknes.getModel();
        initAlternComponents();
        imprimirBotonesPokmnes();
        
    }
    
    public void initAlternComponents(){
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("img/pokebola.png") ) );
   
        listaBotones = new Pokemon[arregloResults.size()] ;
       
        
        for(int i = 0; i<arregloResults.size(); i++){
            JsonObject temp = arregloResults.get(i).getAsJsonObject();
            String nombres = temp.get("name").getAsString();
            String url = temp.get("url").getAsString();
            
            listaBotones[i] = new Pokemon(nombres, url);
            
     
        }
        

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
         modelo.setRowCount(0);
        for(int i = 0; i<arregloResults.size(); i++){
            JButton btnPokemon = new JButton();
            btnPokemon.setBackground(Color.white);
            btnPokemon.setText(listaBotones[i].getNombre());
               //System.out.println(listaBotones[i]);
               
               
               
            Object dato[] = new Object[]{  btnPokemon };
            modelo.addRow(dato);
            
            
            contentPrincipal ventanaActual = this;
                final int posicion = i;
                btnPokemon.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JP_infoPokemnes ventana = new JP_infoPokemnes( ventanaActual, posicion );
                        System.out.println("se presiono en boton de pokemon: "+listaBotones[posicion].getNombre());
                        System.out.println(listaBotones[posicion].getUrl());
        
                            ventana.setPreferredSize(contentAuxiliar.getPreferredSize());
                            ventana.setSize(contentAuxiliar.getSize());
        
                            contentAuxiliar.removeAll();
       
                            contentAuxiliar.add(ventana);
        

                            repaint();
                            revalidate();
                        
                    }
                });
            
        }
    }
    
    public Pokemon[] obtnerPokemon(){
        return listaBotones;
    }
    
//    public String [] obtnerHabilidades(){
//      String respuestaUrl = consumo.consumoGET("url");
//            JsonObject habilidaes = JsonParser.parseString( respuestaUrl ).getAsJsonObject();
//            JsonArray arregloHabilidades = habilidaes.getAsJsonArray("abilities");
//            listaHabilidades = new String[arregloHabilidades.size()] ;
//           
//            
//            for(int i = 0; i < arregloHabilidades.size(); i++){
//                
//                 //System.out.println(arregloHabilidades[j]);
//                JsonObject tempHabilidades = arregloHabilidades.get(i).getAsJsonObject();
//                String urls = tempHabilidades.get("url").getAsString();
//                listaHabilidades[i] = urls;
//            }
//            
//             for(int j = 0; j < arregloHabilidades.size(); j++){
//                
//                 System.out.println(listaHabilidades[j]);
//                
//            }
//         return listaHabilidades;      
//    }
    
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentBotones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_botonesPoknes = new javax.swing.JTable();
        contentAuxiliar = new javax.swing.JPanel();
        contentHead = new javax.swing.JPanel();
        etq_tituloprincipal = new javax.swing.JLabel();
        contentPaginador = new javax.swing.JPanel();

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
            .addGap(0, 0, Short.MAX_VALUE)
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

        contentPaginador.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout contentPaginadorLayout = new javax.swing.GroupLayout(contentPaginador);
        contentPaginador.setLayout(contentPaginadorLayout);
        contentPaginadorLayout.setHorizontalGroup(
            contentPaginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 783, Short.MAX_VALUE)
        );
        contentPaginadorLayout.setVerticalGroup(
            contentPaginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(contentPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentAuxiliar;
    private javax.swing.JPanel contentBotones;
    private javax.swing.JPanel contentHead;
    private javax.swing.JPanel contentPaginador;
    private javax.swing.JLabel etq_tituloprincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_botonesPoknes;
    // End of variables declaration//GEN-END:variables
}
