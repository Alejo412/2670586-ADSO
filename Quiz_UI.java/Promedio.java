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
    JButton btn_limpiar;
    JPanel contenedorItems;
    JLabel listaJLabels [];
    Informacion arreglo [];
 



    public Promedio(){
        initComponent();
    }

    public void initComponent(){
        this.listaJLabels = new JLabel [50];
        arreglo = new Informacion[50];

        setTitle("Promedio_Producto");
        setSize(746,691);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("img/icono_promedio.png") ) );


        JPanel contenedor = new JPanel();
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBorder( BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints restriccion = new GridBagConstraints();

        titulo = new JLabel("CALCULAR PROMEDIO");
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
        restriccion.gridwidth = 2;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 1;
         restriccion.insets = new Insets(10,0,5,0);
        restriccion.fill = GridBagConstraints.NONE;
        contenedor.add(etq_total,restriccion);
        restriccion.insets = new Insets(0,0,0,0);
        

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

      

       
        

        ActionListener evento_registrar = new ActionListener(){
            public void actionPerformed(ActionEvent event){

                String materia = campo_materia.getText();
                double creditos = Double.parseDouble(campo_credito.getText());
                double nota = Double.parseDouble(campo_nota.getText());
                Informacion informacion = new Informacion(materia, creditos, nota);
                String texto = "<html>";
               
                for(int i = 0; i < listaJLabels.length ; i++){
                    //if(listaJLabels[i] != null){
                        informacion.imprimir(); 
                        
                    //}
                    //texto = informacion.imprimir();
                    //listaJLabels[i].setText(texto);
                    
                }
                texto += "</html>";
               
               
            }

        
        };
        btn_registrar.addActionListener(evento_registrar);
        

        add(contenedor);
		setResizable(false);
		setVisible(true);
		revalidate();
		
      
    }
}