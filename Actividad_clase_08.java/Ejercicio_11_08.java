import java.util.Scanner;

public class Ejercicio_11_08{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero_n = entrada.nextInt();


        System.out.println("Ingrese otro número: ");
        int numero_m = entrada.nextInt();


        int arreglo1 [] = new int[numero_n];
        int aleatorio1 = 0;

        System.out.print("Arreglo 1 { ");
        for(int i = 0; i < numero_n; i++){
            aleatorio1 = (int)(Math.random()*10);
            arreglo1[i] = aleatorio1;
            System.out.print(aleatorio1+" ");

        }
        System.out.println("}");

        int arreglo2 [] = new int[numero_m];

        int aleatorio2 = 0;
        System.out.print("Arreglo 2 { ");
        for(int i = 0; i < numero_m; i++){
            aleatorio2 = (int)(Math.random()*10);
            arreglo2[i] = aleatorio2;
            System.out.print(aleatorio2+" ");

        }
        System.out.println("}");

        int suma_de_arreglos = numero_n + numero_m;


        int arreglo3 [] = new int [suma_de_arreglos];
        for(int i = 0; i < suma_de_arreglos; i++){
            arreglo3[i] = arreglo1[i] + arreglo2[i];
            
        }


        
        
        


    }
}