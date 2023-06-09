import java.util.Scanner;

public class Ejercicio_3{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

    System.out.println("Ingrese un número: ");
    int numero = entrada.nextInt();

    if(numero % 2 ==0){
      System.out.println("El número es par");
    }else{
        System.out.println("El número es impar");
    }


    }  
}