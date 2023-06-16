import java.util.Scanner;

public class Ejercicio_5{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

       System.out.print("Ingrese un numero: ");
       int numero = entrada.nextInt();

       int contador = 0;
       int sumanumeros = 0;
       int numero1 = 0;
       int numero2 = 1;
       int sumanumeros2 = 0;
       int sumanumeros3 = 0;
       while(contador <= numero){
        
        sumanumeros = (numero1 + numero2);
        sumanumeros2 = (sumanumeros + numero2);
        sumanumeros3 = (sumanumeros2 + sumanumeros);
        contador = contador + 1;
        System.out.print(""+numero1+" ,"+numero2+" ,"+sumanumeros3);

        
        
    

       }
       


      

    }  
}