
import java.util.Scanner;

public class Ejercicio_4{

    

 
    public static boolean isPalindrome(int num)
    {
        int n = num;
        int reves = 0;
 
        while (n > 0)
        {
            
            int r = n % 10;
            reves = reves * 10 + r;
            n = n / 10;
        }
 
        
        return (num == reves);
    }
 
    public static void main(String[] args)
    {
        Scanner entrada =new Scanner (System.in);
        System.out.print("Ingrese un número de maximo 6 cifras: ");
        int n = entrada.nextInt();
 
        if (isPalindrome(n)) {
            System.out.println("Es Palindromo");
        }
        else {
            System.out.println("No es Palindromo");
        }
    }
}
