import java.util.Scanner;

public class Ejercicio_2{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

     System.out.print("1. Ingrese primer número: ");
     int numero1 = entrada.nextInt();

     System.out.print("2. Ingrese segundo número: ");
     int numero2 = entrada.nextInt();

     System.out.print("3. Ingrese tercer número: ");
     int numero3 = entrada.nextInt();


     System.out.print("4. Ingrese cuarto número: ");
     int numero4 = entrada.nextInt();

     String cifra1 = new String("Primero");
     String cifra2 = new String("Segundo");
     String cifra3 = new String("Tercero");
     String cifra4 = new String("Cuarto");


     if (numero1>numero2 && numero1>numero3 && numero1>numero4){
        System.out.println("El número mayor es el: "+cifra1);
     }else if(numero2>numero1 && numero2>numero3 && numero2>numero4){
        System.out.println("El número mayor es el: "+cifra2);
     }else if(numero3>numero1 && numero3>numero2 && numero3>numero4){
        System.out.println("El número mayor es el: "+cifra3);
     }else if(numero4>numero1 && numero4>numero2 && numero4>numero3){
        System.out.println("El número mayor es el: "+cifra4);
     }




    }  
}