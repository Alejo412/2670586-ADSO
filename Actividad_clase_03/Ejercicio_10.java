import java.util.Scanner;

public class Ejercicio_10{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento: ");
        int fecha_naci = entrada.nextInt();

        int año_actual = (2023);

        int edad = (año_actual - fecha_naci);
        System.out.println("Usted tiene: "+edad+ " años");
        



        


    }  
}