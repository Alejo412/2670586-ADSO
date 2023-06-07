import java.util.Scanner;

public class Ejercicio_17{

    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

       System.out.println("Ingrese un valor en COP: ");
       double cop = entrada.nextDouble();

       double usd = (cop*0.00023);
       System.out.println("El valor en Dólares es: "+usd);
       
       double eur = (cop*0.00021);
       System.out.println("El valor en Euros es: "+eur);

       double jpy = (cop*0.032);
       System.out.println("El valor en Yen japonés es: "+jpy);

       double gbp = (cop*0.00019);
       System.out.println("El valor en Libra esterlina es: "+gbp);

        
    

        


    }
}