import java.util.Scanner;

public class Ejercicio_3_09{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);
         Scanner entrada2 =new Scanner(System.in);

         
        int registro = 100;
        int cantidad_personas = 0;
        String arreglo [] = new String[registro];

        for(int i = 0; i >= 0; i++){
            System.out.println("                                       Memoria disponible: "+registro+".");

        System.out.println("1: Registrar cliente. ");
        System.out.println("2: Ver lista de clientes. ");
        System.out.println("3: Editar cliente. ");
        System.out.println("4: Eliminar cliente. ");
        System.out.println("5: Salir");

             
            System.out.print("Ingrese una opción: ");
            int posicion_menu = entrada.nextInt();
            if(posicion_menu == 1){
                System.out.println(("Ingrese nombre completo: "));
                String nombre_completo = entrada2.nextLine();
                arreglo[cantidad_personas] = nombre_completo;
                cantidad_personas++;
                registro--;
            }else if(posicion_menu == 2){
                System.out.println("-----------------------------------------------------------------");
                System.out.println("                      Lista de clientes");
                for(int a = 0; a < cantidad_personas; a++){
                    System.out.println(a+". "+arreglo[a]+" ");
                }
                System.out.println("----------------------------------------------------------------");
                
            }else if(posicion_menu == 3){
                System.out.print("Ingrese nombre que quiere editar: ");{
                    String nombre_a_editar = entrada2.nextLine();
                    for( int e = 0; e < cantidad_personas; e++){
                        if(arreglo[e].equals(nombre_a_editar)){
                        System.out.println("Ingrese nuevo nombre: ");
                        String nuevo_nombre = entrada2.nextLine();
                         arreglo[e] = nuevo_nombre;
                        }else{
                        System.out.println("No hay cuenta con ese nombre");
                        }

                    }
                    
                }
            }else if(posicion_menu == 4){
                System.out.println("Ingrese el usuario que desea eliminar");
                String nombre_eliminar = entrada2.nextLine();
               
                for(int b = 0; b < cantidad_personas; b++){
                    if(arreglo[b].equals(nombre_eliminar)){
                        arreglo[b] = null;
                        
                       
                    }
                }
                for(int c = 0; c < cantidad_personas; c++){
                    System.out.println(c+". "+arreglo[c]);
                }


            }else if(posicion_menu == 5){
                i = -10;
            }
        }



        

        


       



    }  
}