import java.util.Scanner;

public class Ejercicio_10_08{
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

         
        int sin_repetir [] = new int [numero];
        int otro = 0;

        for(int i = 0; i < numero-1; i++){
            if(arreglo[i] != arreglo[i+1]){
                sin_repetir[otro]= arreglo[i];
                otro++;
                
            }
        }
        sin_repetir[otro] = arreglo[numero-1];
         
        System.out.print("Sin repetir { ");
        for(int i = 0; i < numero; i++){
            System.out.print(sin_repetir[i]+" ");
        }
         System.out.println("}");
        


    }
}