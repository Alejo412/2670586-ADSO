import java.util.Scanner;

public class Ejercicio_12_08{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero_n = entrada.nextInt();

        int arreglo [] = new int[numero_n];
        int aleatorio = 0;

        System.out.print("{ ");
        for(int i = 0; i < numero_n; i++){
            aleatorio = (int)(Math.random()*10);
            arreglo[i] = aleatorio;
            System.out.print(aleatorio+" ");

        }
        System.out.println("}");

      
        int contador1 = 0;
        int contador2 = 0;

        
        for(int a = 0; a < numero_n; a++){
            for(int i = 1; i < arreglo.length-1; i++){
               if(arreglo[a] % i == 0){
                contador1++;
              }
            }
            if(contador1 <= 2){
                contador2++;

            }
        }
            

        

        
        

        System.out.println("El números primos: "+contador2);





    }
}