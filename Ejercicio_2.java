import java.util.Scanner;
public class Ejercicio_2 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        double celsius = 0 ;
        System.out.println("Ingres temperatura en grados celsius: ");
        celsius = input.nextDouble();

        double fahrenheit = (celsius*9/5)+32;
        System.out.println ("LOs grados Fahrenheit son :" +fahrenheit);


    


    }
    
}
