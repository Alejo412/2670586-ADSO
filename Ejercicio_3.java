import java.util.Scanner;
public class Ejercicio_3 {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
    
        System.out.println("Ingrse el primer numero: ");
        int numero_1 = entrada.nextInt(); 

        System.out.println ("Ingrse el segundo numero: ");
        int numero_2 = entrada.nextInt();

        int auxi = numero_1;
        numero_1=numero_2;
        numero_2=auxi;

        System.out.println("El primer numero ahora tiene un valor de : "+numero_1);
        System.out.println("El segundo numero ahora tiene un valor de: "+numero_2);


    }
    
}
