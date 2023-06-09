import java.util.Scanner;

public class Ejercicio_6{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();

        if (edad >= 18){
            
            System.out.println("Usted es mayor de edad, SI PUEDE VOTAR"); 
        }else{
            System.out.println("Usted es menor de edad, NO PUEDE VOTAR");
        }
        



    }  
}