import java.util.Scanner;

public class Ejercicio_2{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

     System.out.print("Ingrese cantidad de notas: ");
     int numero_notas= entrada.nextInt();

     
       int contador = 1;
       double sumanotas = 0;
       int sumacreditos = 0;

       while (contador <= numero_notas){
            System.out.print("Ingrese nota materia "+contador+ ": ");
            double nota = entrada.nextDouble();

            System.out.print("Creditos materia: ");
            int creditos = entrada.nextInt();

            sumanotas = sumanotas + (nota*creditos);
            sumacreditos = sumacreditos + creditos;
           contador = contador + 1;
       
           
           
       }


         double promponderado = (sumanotas / sumacreditos);
         System.out.println("Total creditos: "+sumacreditos);
        System.out.print("El promedio del semestre es: "+promponderado);

        




    }  
}