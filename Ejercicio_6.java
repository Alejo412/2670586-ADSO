import java.util.Scanner;
public class Ejercicio_6{
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("numero 1: ");
        int numero1 = entrada.nextInt();
        
        System.out.println("numero 2: ");
        int numero2 = entrada.nextInt();

        System.out.println("numero 3: ");
        int numero3 = entrada.nextInt();

        System.out.println("numero 4: ");
        int numero4 = entrada.nextInt();


        float prom = (numero1+numero2+numero3+numero4)/4;
        System.out.println("El promerdio de los numeros es: "+prom);
        

    }

}
