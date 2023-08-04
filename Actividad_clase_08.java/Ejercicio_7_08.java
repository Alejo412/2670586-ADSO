import java.util.Scanner;

public class Ejercicio_7_08{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = entrada.nextInt();

        int arreglo [] = new int[numero];
        int aleatorio = 0;

        System.out.print("Normal { ");
        for(int i = 0; i < numero; i++){
            aleatorio = (int)(Math.random()*10);
            arreglo[i] = aleatorio;
            System.out.print(aleatorio+" ");

        }
        System.out.println("}");

         
        int inverso [] = new int [numero];
        for(int i = 0; i < numero; i++){
            inverso[i] = arreglo[numero-1-i];
            
        }

        System.out.print("Inverso { ");
        for (int i = 0; i < numero; i++) {
            System.out.print(inverso[i] + " ");
        }
        System.out.println("}");

       

        

        


    }
}