import java.util.Scanner;

public class Ejercicio_7{

    public static void main (String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.println("Por favor ingrese precio del producto: ");
        double precio_producto = entrada.nextDouble();

        System.out.println("Ingrese el porcentaje del descuento %:");
        double valor_descuento = entrada.nextDouble();

        double descuento = (precio_producto*valor_descuento)/100;

        double precio_final = (precio_producto - descuento);
        System.out.println ("El precio del producto con el +descuento+ es de: "+precio_final);

        
    }
}