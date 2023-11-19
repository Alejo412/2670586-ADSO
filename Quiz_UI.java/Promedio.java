import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.awt.event.*;

public class Promedio extends JFrame{

    JLabel titulo;
    JLabel etq_materia;
    JTextField campo_materia;
    JLabel etq_creditos;
    JTextField campo_credito;
    JLabel etq_nota;
    JTextField campo_nota;
    JButton btn_registrar;
    JLabel etq_resumen;
    JLabel etq_total;
    JTextField campo_total;
    JButton btn_limpiar;
    JPanel contenedorItems;
    JLabel listaJLabels [];
    Informacion arreglo [];
    int contador = 0;
    int contador2 = 0; 
    double acumuladorNotaCredito = 0;
    double acumTemporalNota = 0;
    double acumCreditos = 0;
    double acumTemporalCredito = 0;
    double totalPonderado;



    public Promedio(){
        initComponent();

    }

    public void initComponent(){
        this.listaJLabels = new JLabel [50];
        arreglo = new Informacion[50];
       

        setTitle("Promedio_Producto");
        setSize(546,691);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("img/icono_promedio.png") ) );


        JPanel contenedor = new JPanel();
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBorder( BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints restriccion = new GridBagConstraints();

        titulo = new JLabel("PROMEDIO PONDERADO");
        titulo.setFont( new Font("Arial", Font.BOLD, 40));
        titulo.setHorizontalAlignment(JLabel.CENTER);
        restriccion.gridx = 0;
        restriccion.gridy = 0;
        restriccion.gridwidth = 4;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 1;
        restriccion.insets = new Insets(10,0,50,0);
        restriccion.fill = GridBagConstraints.BOTH;
		contenedor.add( titulo , restriccion );
        restriccion.insets = new Insets(0,0,0,0);



        etq_materia = new JLabel("Materia: ");
        etq_materia.setFont( new Font("Arial", Font.BOLD, 20));
        restriccion.gridx = 0;
        restriccion.gridy = 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 22;
        restriccion.weighty = 1;
        restriccion.insets = new Insets(5,5,5,0);
        restriccion.fill = GridBagConstraints.NONE;
        contenedor.add(etq_materia,restriccion);
        restriccion.insets = new Insets(0,0,0,0);

        campo_materia = new JTextField();
        etq_materia.setFont( new Font("Arial", Font.BOLD, 20));
        restriccion.gridx = 1;
        restriccion.gridy = 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 1;
        restriccion.insets = new Insets(5,0,5,0);
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_materia,restriccion);
        restriccion.insets = new Insets(0,0,0,0);

        etq_creditos = new JLabel("Creditos: ");
        etq_creditos.setFont( new Font("Arial", Font.BOLD, 20));
        restriccion.gridx = 2;
        restriccion.gridy = 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 22;
        restriccion.weighty = 1;
        restriccion.insets = new Insets(5,5,5,0);
        restriccion.fill = GridBagConstraints.NONE;
        contenedor.add(etq_creditos,restriccion);
        restriccion.insets = new Insets(0,0,0,0);

        
        campo_credito = new JTextField();
        campo_credito.setFont( new Font("Arial", Font.BOLD, 20));
        restriccion.gridx = 3;
        restriccion.gridy = 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 1;
        restriccion.insets = new Insets(5,0,5,5);
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_credito,restriccion);
        restriccion.insets = new Insets(0,0,0,0);


        etq_nota = new JLabel("Nota: ");
        etq_nota.setFont( new Font("Arial", Font.BOLD, 20));
        restriccion.gridx = 0;
        restriccion.gridy = 2;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 22;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.NONE;
        contenedor.add(etq_nota,restriccion);
        restriccion.insets = new Insets(0,0,0,0);
        

        campo_nota = new JTextField();
        campo_nota.setFont( new Font("Arial", Font.BOLD, 20));
        restriccion.gridx = 1;
        restriccion.gridy = 2;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_nota,restriccion);
        restriccion.insets = new Insets(0,0,0,0);

        btn_registrar = new JButton("REGISTRAR");
        btn_registrar.setBackground(Color.YELLOW);
        //btn_registrar.setForeground(Color.WHITE);
        restriccion.gridx = 2;
        restriccion.gridy = 2;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 66;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.NONE;
        contenedor.add(btn_registrar,restriccion);
        restriccion.insets = new Insets(0,0,0,0);

        etq_resumen = new JLabel("RESUMEN");
        etq_resumen.setFont( new Font("Arial", Font.BOLD, 30));
        restriccion.gridx = 1;
        restriccion.gridy = 3;
        restriccion.gridwidth = 2;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 1;
        restriccion.insets = new Insets(10,0,10,0);
        restriccion.fill = GridBagConstraints.NONE;
        contenedor.add(etq_resumen,restriccion);
        restriccion.insets = new Insets(0,0,0,0);

        contenedorItems = new JPanel();
        contenedorItems.setLayout( new GridBagLayout() );
        contenedorItems.setBackground(Color.WHITE);
        JScrollPane scrollPane = new JScrollPane(contenedorItems);
        scrollPane.setBorder(null);
        restriccion.gridy = 4;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 89;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(10, 0, 0, 10);
        contenedor.add( scrollPane, restriccion );

        GridBagConstraints constItems = new GridBagConstraints();

        Border borderColor = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#D5D5D5"));
        Border borderPadding = new EmptyBorder(3,10,3,10);
        Border borderGris = new CompoundBorder(borderColor, borderPadding);

        for (int i=0; i<this.listaJLabels.length; i++) {
            JLabel etq_temporal = new JLabel(" ");
            etq_temporal.setHorizontalAlignment( JLabel.RIGHT );
            etq_temporal.setFont( new Font("Arial", Font.PLAIN, 18) );
            etq_temporal.setOpaque(true);
            etq_temporal.setBackground( Color.white );
            etq_temporal.setBorder( borderGris );
            this.listaJLabels[i] = etq_temporal;
            constItems.gridy = i;
            constItems.gridx = 0;
            constItems.gridheight = 1;
            constItems.gridwidth = 1;
            constItems.weighty = 1;
            constItems.weightx = 1;
            constItems.fill = GridBagConstraints.HORIZONTAL;
            constItems.anchor = GridBagConstraints.NORTH;
            constItems.insets = new Insets(0, 0, 0, 0);
            contenedorItems.add(this.listaJLabels[i], constItems);
        }

       

        etq_total = new JLabel("Total: ");
        etq_total.setFont( new Font("Arial",Font.BOLD,30));
        restriccion.gridx = 1;
        restriccion.gridy = 5;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 20;
        restriccion.weighty = 1;
         restriccion.insets = new Insets(10,0,5,0);
        restriccion.fill = GridBagConstraints.NONE;
        contenedor.add(etq_total,restriccion);
        restriccion.insets = new Insets(0,0,0,0);
        

        campo_total = new JTextField();
        campo_total.setFont( new Font("Arial",Font.BOLD,40));
        campo_total.setForeground(Color.BLUE);
        restriccion.gridx = 2;
        restriccion.gridy = 5;
        restriccion.gridwidth = 2;
        restriccion.gridheight = 1;
        restriccion.weightx = 80;
        restriccion.weighty = 1;
        restriccion.insets = new Insets(10,0,5,0);
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_total,restriccion);
        restriccion.insets = new Insets(0,0,0,0);
        desHabilitarInput(campo_total);


        btn_limpiar = new JButton("LIMPIAR");
        btn_limpiar.setBackground(Color.YELLOW);
       // btn_limpiar.setForeground(Color.WHITE);
        restriccion.gridx = 1;
        restriccion.gridy = 6;
        restriccion.gridwidth = 2;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.NONE;
        contenedor.add(btn_limpiar,restriccion);
        restriccion.insets = new Insets(0,0,0,0);

      
        
        add(contenedor);
		setResizable(false);
		setVisible(true);
		revalidate();
       
        
        
        ActionListener evento_registrar = new ActionListener(){
           
            
            public void actionPerformed(ActionEvent event){

                String materia = campo_materia.getText();
                double creditos = Double.parseDouble(campo_credito.getText());
                double nota = Double.parseDouble(campo_nota.getText());
                Informacion informacion = new Informacion(materia, creditos, nota);

                for(int i = 0; i < arreglo.length; i++){
                    arreglo[i] = informacion;
                }
                if(contador < arreglo.length){
                    arreglo[contador] = informacion;
                    System.out.println(contador+" "+arreglo[contador].imprimir());
                    
                       String texto = "<html>";
                       if(contador < listaJLabels.length && listaJLabels[contador] != null){
                             texto = arreglo[contador].imprimir();
                             listaJLabels[contador].setText(texto);
           
                    
                        }
                         texto += "</html>";
                         contador++;

                }
                    
                for(int i = 0; i < contador; i++){
                    acumTemporalNota = (arreglo[contador2].getNota()*arreglo[contador2].getCreditos());
                    acumTemporalCredito = arreglo[contador2].getCreditos();
                    contador2++;
                    
                }
                acumuladorNotaCredito = acumuladorNotaCredito + acumTemporalNota;
                acumCreditos = acumCreditos + acumTemporalCredito; 
                System.out.println(acumuladorNotaCredito);
                System.out.println(acumCreditos);

                double totalPonderado = (acumuladorNotaCredito / acumCreditos);
                String totalFinal = String.valueOf(totalPonderado);
                System.out.println(totalPonderado);
                

               campo_total.setText(totalFinal);
               campo_materia.setText(" ");
               campo_credito.setText(" ");
               campo_nota.setText(" ");

            }
        };
        btn_registrar.addActionListener(evento_registrar);


        ActionListener evento_limpiar = new ActionListener(){
            public void actionPerformed(ActionEvent event){
            
                for(int i = 0; i < listaJLabels.length; i++){
                    contador = 0;
                    acumuladorNotaCredito = 0;
                    acumCreditos = 0;
                    String limpiado = " ";
                    listaJLabels[i].setText(limpiado);
                    campo_total.setText(" ");
                    
                }
            }
        };
        btn_limpiar.addActionListener(evento_limpiar);


        



        

       
		
      
    }

    public void desHabilitarInput(JTextField campo){
		campo.setEditable(false);
		campo.setBackground(new Color(238, 238, 238));
	}

  


}