import java.util.Scanner;

public class Ejercicio21{
    public static void main(String[] args){
        Scanner entrada =new Scanner (System.in);


        System.out.println("Ingrese temperatura en G/Celsius ");
        int celsius = entrada.nextInt();

        System.out.println("La tempeartura en G/Fahrenheit es: "+temperatura(celsius));
 
        
    }
 
   



   
   
   

   public static float temperatura(int celsius){
        float fahrenheit = ((float)celsius * 9/5) +32;
        return fahrenheit;
    }
    
   
}