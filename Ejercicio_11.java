import java.util.Scanner;

public class Ejercicio_11{

    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese el radio de un circulo: ");
        int radio_circulo = entrada.nextInt();

        double perimetro_circulo = (2*3.14159*radio_circulo);
        System.out.println("El perimetro del circulo es: "+perimetro_circulo);

        double area_circulo = (3.14159*radio_circulo*radio_circulo);
        System.out.println("El área del circulo es: "+area_circulo);








    }
}