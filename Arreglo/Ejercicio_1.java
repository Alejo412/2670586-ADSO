import java.util.Scanner;

public class Ejercicio_1{
    public static void main(String[] arg){
        Scanner entrada = new Scanner(System.in);

        //CREAR UN ARREGLO

        System.out.println("Ingrse un número: ");
        int n = entrada.nextInt();
        int numeros [] = new int[n];
        int pares = 1;
       
        for(int i = 0; i <= n; i++){
            pares = pares+2;
    
           System.out.println("posición "+i+" = "+pares);


        }

        

        












    }
}