import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[] args){
        Scanner entrada =new Scanner (System.in);
        
        System.out.println("Ingrese un número entero: ");
        int entero = entrada.nextInt(); 

        System.out.println("EL factorial de "+entero+"! es = ");
        for(int i = 1; i <= entero; i++){
            System.out.print(i);
            if (i < entero) {
                System.out.print(" x ");
            }
            
        }
        System.out.print(" = "+factorial(entero));
 
        
    }


    public static int factorial(int num ){
        int acum = 1;
        for(int i = 1; i <= num; i++){
            acum *= i;
        }

        return acum;

    }
 
   



   
   
}