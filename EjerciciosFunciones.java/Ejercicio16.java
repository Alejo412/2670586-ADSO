import java.util.Scanner;

public class Ejercicio16{
    public static void main(String[] args){
        Scanner entrada =new Scanner (System.in);
        
        System.out.println("Ingrese un número entero: ");
        int tamano = entrada.nextInt();
    

        verificarNumero(tamano);
        
    }

   
    public static int verificarNumero(int num){

        if(num > 0 && num <= 9){
            int uno = 1;
            System.out.println("El número ingresado tiene "+uno+" cifra$");
            return uno;
        }
        if(num > 9 && num < 100){
            int dos = 2;
            System.out.println("El número ingresado tiene "+dos+" cifra$");
            return dos;
        }
         if(num > 100 && num < 1000){
            int tres = 3;
            System.out.println("El número ingresado tiene "+tres+" cifra$");
            return tres;
        }
        if(num > 1000 && num < 10000){
            int cuatro = 2;
            System.out.println("El número ingresado tiene "+cuatro+" cifra$");
            return cuatro;
        }
    int no= 0;
       return no;
    }
 
   



   
   
}