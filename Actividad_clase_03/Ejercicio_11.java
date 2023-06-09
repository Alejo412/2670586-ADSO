import java.util.Scanner;

public class Ejercicio_11{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int n1 = entrada.nextInt();

        if(n1%2==0){
            System.out.println("El número es par: ");
        }else{
            System.out.println("El número es impar:");
        }


        


    }  
}