import java.util.Scanner;

public class Ejercicio_1{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

       System.out.println("Escríba su nombre"); 
       String nombre = entrada.next();
       
    System.out.println("Hola "+nombre+ " cómo estas?");

    System.out.println("Cuál es su edad?: ");
    int edad = entrada.nextInt();

    if (edad <18){
        System.out.println(" Usted recibe un auxilio de $ 800.000");
    }else if (edad >=18 ){
         System.out.println("Usted paga un impuesto de $ 200.000");
    }






    }  
}
        