import java.util.Scanner;

public class Ejercicio_1{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

     System.out.print("Ingrese cantidad de notas: ");
     int numero_notas= entrada.nextInt();

     


        double sumanotas = 0; 
        int contador = 1;
        while ( contador <= numero_notas){
           
           System.out.print("Nota" +contador+ ": ");
            double nota = entrada.nextDouble();

            sumanotas = sumanotas + nota;
           contador = contador + 1;
           
        }

            double prom = sumanotas / numero_notas;
            System.out.print("El promedio de las notas es: "+prom);

     











    }  
}