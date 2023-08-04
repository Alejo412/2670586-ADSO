import java.util.Scanner;

public class Ejercicio_1_08{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

        System.out.println("Ingresar un número: ");
        int numero = entrada.nextInt();

        int arreglo [] = new int [numero];

        int num =0;
        System.out.print("{ ");
        int suma = 0;

        for(int i = 0; i<numero; i++){
            int aleatorio = (int)(Math.random()*10);
            System.out.print(aleatorio+" ");
            suma = suma + aleatorio;
        }
         System.out.println(" }");

         System.out.println("La suma de los numero anteriores es: "+suma);

         

         
         
        

        

     



    }  
}