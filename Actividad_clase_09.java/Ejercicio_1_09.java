import java.util.Scanner;

public class Ejercicio_1_09{
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


       



    }  
}