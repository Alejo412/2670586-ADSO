import java.util.Scanner;

public class Ejercicio_15{

    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);


        int metros;
        System.out.println("Ingrese una longitud en metros: ");
        metros = entrada.nextInt();

        int centimetros = (metros * 100);
        System.out.println("La longitud en centimetros es: "+centimetros);

        double pulgadas = (metros * 39.3701);
        System.out.println("La longitud en pulgadas es: "+pulgadas);

        double pies = (metros * 3.28084);
        System.out.println("La longitud en pies es: "+pies);




        

        


    }
}