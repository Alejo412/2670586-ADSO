import java.util.Scanner;

public class Ejercicio_4{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

        System.out.println("Nota 1: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Nota 2: ");
        double nota2 = entrada.nextDouble();

        System.out.println("Nota 3: ");
        double nota3 = entrada.nextDouble();

        double prom = (nota1+nota2+nota3)/3;
        System.out.println("El promedio de las tres notas es: "+prom);

        if(prom >= 7.0){
            System.out.println("Aprobado");

        }else{
            System.out.println("Reprobado");
        }



    }  
}