import java.util.Scanner;

public class Ejercicio_5{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

       System.out.print("Ingrese un numero: ");
       int numero = entrada.nextInt();

       int a = 0; 
       int b = 1; 
       int contador = 1; 
    
      while(contador <= numero){
        if(contador == 1){
            System.out.print(a+",");
        }
        if(contador == 2){
            System.out.print(b+" ,");
        }
         if(contador > 2){
            int numfab = a + b;
            System.out.print(numfab+" ,");
            a = b;
            b = numfab;
        }

        contador = contador + 1;


      }
       


      

    }  
}