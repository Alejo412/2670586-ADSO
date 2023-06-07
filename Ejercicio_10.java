import java.util.Scanner;

public class Ejercicio_10{

    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese el dividendo: ");
        int numero_1 = entrada.nextInt();

        System.out.print("Ingrese el divisor: ");
        int numero_2 = entrada.nextInt();

        int division = (numero_1/numero_2);
        System.out.print("El resultado de la divsión de los dos numeros es: "+division);





    }
}