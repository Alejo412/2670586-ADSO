import java.util.Scanner;

public class Ejercicio_8_08{
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

        int pares [] = new int [numero];
        int impares [] = new int [numero];

        for(int i = 0; i < numero; i++){
            if(arreglo[i] % 2 == 0){
                pares[i] = arreglo[i];
            }else{
                impares[i] = arreglo[i];
            }

        }

        System.out.print("Pares { ");
        for (int i = 0; i < numero; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println("}");

        System.out.print("Impares { ");
        for (int i = 0; i < numero; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println("}");


         
        

        

        


    }
}