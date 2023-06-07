import java.util.Scanner;
public class Ejercicio_5{

    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese la base del triangulo: ");
        float base = entrada.nextFloat();

        System.out.println("Ingrese la altura del triangulo: ");
        float altura = entrada.nextFloat();

        float area = (base * altura)/2;
        System.out.println("El area del triangulo es: "+area);





    }
}

