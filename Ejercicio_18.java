import java.util.Scanner;

public class Ejercicio_18{

    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

       System.out.println("Ingrese su peso: ");
       int peso = entrada.nextInt();

       System.out.println("Ingrese su altura: ");
       double altura = entrada.nextDouble();

       double imc = (peso/(altura*altura));
       System.out.println("El Indice de Masa Corporal es: "+imc);



        
    

        


    }
}