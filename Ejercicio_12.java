import java.util.Scanner;

public class Ejercicio_12{

    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);


        System.out.print("Ingrese el ancho de un rectángulo: ");
        int ancho = entrada.nextInt();

        System.out.print("Ingrese la altura  de un rectángulo: ");
        int altura = entrada.nextInt();


        int area_rectangulo = (ancho*altura);
        System.out.println("El área del rectángulo es: "+area_rectangulo);



        
        

        







    }
}