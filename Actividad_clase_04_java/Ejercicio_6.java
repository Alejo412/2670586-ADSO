import java.util.Scanner;

public class Ejercicio_6{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

       

       int a = 0; 
       int b = 1; 
       int contador = 2; 
    
       System.out.print("Ingresar la posicion del n-esimo Fibonacci: ");
       int posicion = entrada.nextInt();
      while(contador < posicion ){
        int resultado = a+b;
        a = b;
        b = resultado;
        contador = contador + 1;


        System.out.println("La posicion del n-esimo Fibonacci es: "+b);
      }

      

      
       


      

    }  
}