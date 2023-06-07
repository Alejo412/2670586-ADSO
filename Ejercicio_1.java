import java.util.Scanner;
public class Ejercicio_1{
    public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        System.out.println ("Hola compañero");

        int edad = 0;
        System.out.println("Ingrese su edad");
        edad = input.nextInt();

        if(edad < 18){
        System.out.println("Usted recibe un auxilio de transporte de $ 800.000");
        }

        if (edad > 18){
            System.out.println("Usted paga impuestos de $ 200.000");
        }


    }
}