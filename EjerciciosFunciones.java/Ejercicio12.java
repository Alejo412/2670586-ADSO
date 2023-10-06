import java.util.Scanner;


public class Ejercicio12{
    public static void main(String[] args){

        Scanner entrada =new Scanner (System.in);
        
        System.out.println("Ingrese un número: ");
        int numero = entrada.nextInt(); 

        System.out.print("El número "+numero);
        System.out.println(primo(numero));
        
        
    }


    public static boolean primo(int num ){
        int divisores = 0; 

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                divisores += 1;

            }

           
        }
         if(divisores == 2){
            System.out.println(" Es primo");    
            return true;
                
            }else{
                System.out.println("No es primo");
                return false;
                
            }
       
    }
 
   



   
   
}