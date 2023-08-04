import java.util.Scanner;

public class Ejercicio_2_09{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);
         Scanner entrada2 =new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = entrada.nextInt();


        String arreglo [] = new String[numero];

        for(int i = 0; i < numero; i++){
            System.out.print("Ingrese medios de transporte: ");
            String medio_transporte = entrada2.nextLine();
            arreglo[i] = medio_transporte;
        }



        System.out.print("Medios de transporte {");
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i]+", ");
            
        }
        System.out.println("}");


        System.out.print("Ingresre nombre de M.T que desea ver posición: ");
        String posicion = entrada2.nextLine();
        for(int i = 0; i < arreglo.length; i++){
            if ( arreglo[i].equals(posicion)){
                System.out.println("posición: "+i);

            }            
            
        }

        

        


       



    }  
}