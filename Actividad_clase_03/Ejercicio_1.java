import java.util.Scanner;

public class Ejercicio_1{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

       System.out.println("Por favor ingrese un número: ");
       int numero = entrada.nextInt();

       if (numero >= 0 ){
           System.out.println("El número ingresado es positivo");
       }else{
        System.out.println("El número ingresado es negativo");
       }
        




    }  
}
        