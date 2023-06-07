import java.util.Scanner;

public class Ejercicio_16{

    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese la inversión inicial: ");
        double inversion_inicial = entrada.nextDouble();

        System.out.println("Ingrese la tasa de interes: ");
        double tasa_interes = entrada.nextDouble();

        System.out.println("Ingrese un número de periodos: ");
        double numero_periodos = entrada.nextDouble();


        double monto_final = (inversion_inicial*(1+tasa_interes/100));
        double monto_ultimo = Math.pow(monto_final,numero_periodos);

        System.out.print("El monto final es: "+monto_ultimo);


        
        

        


    }
}