import java.util.Scanner;

public class Ejercicio_9_08{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero_n = entrada.nextInt();


        System.out.println("Ingrese otro número: ");
        int numero_m = entrada.nextInt();


        int arreglo [] = new int[numero_n];
        int aleatorio = 0;

        System.out.print("{ ");
        for(int i = 0; i < numero_n; i++){
            aleatorio = (int)(Math.random()*10);
            arreglo[i] = aleatorio;
            System.out.print(aleatorio+" ");

        }
        System.out.println("}");

        int num_igual = 0;
        int menosuno = -1;
       
        for(int g = 0; g < arreglo.length; g++){
            if(arreglo[g] == numero_m){
               System.out.println("El número "+numero_m+" esta en la posición: "+g);
            }else{
                System.out.println(menosuno);
            }

        }


        
        
        


    }
}