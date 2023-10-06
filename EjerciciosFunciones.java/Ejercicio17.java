import java.util.Scanner;

public class Ejercicio17{
    public static void main(String[] args){
        Scanner entrada =new Scanner (System.in);
        
        System.out.println("Ingrese un número entero: ");
        int tamano = entrada.nextInt();
    

        System.out.println(" = "+verificarNumero(tamano));
        
    }

   
    public static int verificarNumero(int num){

        int potencia = 10;
        if(num > 9 && num < 100){
            int segundonum = (num%10);
            int primernum = (num/10);
            int suma = (primernum + segundonum);
            
            return suma;
        }
        if(num > 100 && num < 1000){
            int tercernum = (num%10);
            int segundonum = ((int)tercernum % 10);
            int primernum = (num/100);
            int suma = ((int)primernum + segundonum + tercernum)-1;
            
            return suma;
        }
       return 0;
    }
 
   



   
   
}
 