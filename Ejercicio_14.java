import java.util.Scanner;

public class Ejercicio_14{

    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese la nota 1: ");
        double nota1 = entrada.nextDouble();
        System.out.print("Ingrese el credito de la nota 1: ");
        double credito1 = entrada.nextDouble();

        System.out.print("Ingrese la nota 2: ");
        double nota2 = entrada.nextDouble();
        System.out.print("Ingrese el credito de la nota 2: ");
        double credito2 = entrada.nextDouble();

        System.out.print("Ingrese la nota 3: ");
        double nota3 = entrada.nextDouble();
        System.out.print("Ingrese el credito de la nota 3: ");
        double credito3 = entrada.nextDouble();



        double prom_ponderado = ((nota1*credito1)+(nota2*credito2)+(nota3*credito3))/(nota1+nota2+nota3);
        System.out.println("EL promerdio ponderado de las tres notas es: "+prom_ponderado);






    }
}