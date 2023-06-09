import java.util.Scanner;

public class Ejercicio_13{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

        System.out.print("Ingrese un núumero: ");
        int num = entrada.nextInt();

        if (num % 2 ==0 && num % 3 ==0 && num % 5 ==0){
            System.out.println("El número es divisible por 2, 3 y 5");
        }else{
           System.out.println("El número NO es divisible por 2, 3 y 5"); 
        }
        


        


    }  
}