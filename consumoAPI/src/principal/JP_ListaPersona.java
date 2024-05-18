
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
import utils.Persona;


public class JP_ListaPersona extends javax.swing.JPanel {
    
    
    DefaultTableModel modelo; 
    ConsumoAPI consumo = new ConsumoAPI();
    String respuesta = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
    JsonArray registros = JsonParser.parseString( respuesta ).getAsJsonArray();
    Persona listaPersonas [];
    

  
    public JP_ListaPersona() {
        initComponents();
        modelo = (DefaultTableModel) tablaDatos.getModel();
        initAlternComponents();
        imprimirPersonas();
    }
    
    public void initAlternComponents(){
        
        tablaDatos.getColumnModel().getColumn(6).setCellEditor(new ButtonEditor(new JCheckBox()));
        tablaDatos.getColumnModel().getColumn(6).setCellRenderer(new ButtonRenderer());
        
        tablaDatos.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(new JCheckBox()));
        tablaDatos.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
        
        // Tamaño de Columnas
        tablaDatos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablaDatos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tablaDatos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tablaDatos.getColumnModel().getColumn(3).setPreferredWidth(100);
        tablaDatos.getColumnModel().getColumn(4).setPreferredWidth(100);
        tablaDatos.getColumnModel().getColumn(5).setPreferredWidth(100);
        tablaDatos.getColumnModel().getColumn(6).setPreferredWidth(50);
        tablaDatos.getColumnModel().getColumn(7).setPreferredWidth(50);
        
        // Ajuste del Orden y Ancho de Columnas
        tablaDatos.getTableHeader().setReorderingAllowed(false);
        tablaDatos.getTableHeader().setResizingAllowed(false);
        
        // Centrar contenido de columnas
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tablaDatos.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tablaDatos.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        
        // Alto de las filas
        tablaDatos.setRowHeight(25);
    }
    
     public void imprimirPersonas(){
            modelo.setRowCount(0);
            listaPersonas = new Persona[registros.size()];
           
            for (int i=0;i<registros.size() && registros.get(i)!=null; i++) {
                
                JsonObject temp = registros.get(i).getAsJsonObject();
               
                String cedula = temp.get("cedula").getAsString();
                String nombres = temp.get("nombres").getAsString();
                String apellidos = temp.get("apellidos").getAsString();
                String telefono = temp.get("telefono").getAsString();
                String direccion = temp.get("direccion").getAsString();
                String email = temp.get("email").getAsString();

                listaPersonas[i] = new Persona(cedula, nombres, apellidos, telefono, direccion, email);
                
                JButton btnEditar = new JButton();
                btnEditar.setBackground(Color.white);
                Image icono_editar = getToolkit().createImage( ClassLoader.getSystemResource("img/icono_editar.png") );
                icono_editar = icono_editar.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                btnEditar.setIcon( new ImageIcon(icono_editar) );

                JButton btnEliminar = new JButton();
                btnEliminar.setBackground(Color.white);
                Image icono_eliminar = getToolkit().createImage( ClassLoader.getSystemResource("img/icono_eliminar.png") );
                icono_eliminar = icono_eliminar.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                btnEliminar.setIcon( new ImageIcon(icono_eliminar) );

                Object dato[] = new Object[]{ cedula, nombres, apellidos, telefono,direccion, email, btnEditar, btnEliminar };
                modelo.addRow(dato);

                JP_ListaPersona ventanaActual = this;
                final int posicion = i;
                btnEditar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        EditarPersona ventana = new EditarPersona( ventanaActual, posicion );
                        System.out.println("se presiono editar");
                    }
                });

                btnEliminar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        EliminarPersona ventana = new EliminarPersona( ventanaActual, posicion );
                        System.out.println("se presiono eliminar");
                    }
                });
            }
        }
     
     public Persona[] obtenerPersona(){
         return listaPersonas;
     }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombres", "Apellidos", "Teléfono", "Dirección", "Email", "EDITAR", "ELIMINAR"
            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
