import java.util.Scanner;

public class Ejercicio_19{

    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

       System.out.print("Por favor ingrese el nombre del empleado: ");
       String nombre = entrada.next();


       System.out.print("Por favor ingrese la edad del empleado: ");
       int edad = entrada.nextInt();
       

       System.out.print("Por favor ingrese el salario del empleado: ");
       float salario = entrada.nextFloat();

    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
    System.out.println("|              Empleado: "+nombre+"                       |");
    System.out.println("|+++                                                 ++++|");
    System.out.println("|              Edad: "+edad+" años                        |");
    System.out.println("|              Salario: $ "+salario+"                     |");
    System.out.println("|+++                                                 ++++|");
    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
       
       
       
       
        
    

        


    }
}