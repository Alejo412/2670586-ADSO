import java.util.Random;
import java.util.Scanner;

public class Ejercicio_1{

    public static void main(String[]ars){
        Scanner entrada =new Scanner (System.in);

        System.out.println("Ingrese un numero entre 1 y 6: ");
        int n =  entrada.nextInt();
        

        if(n <= 6){
            int numero=1; 
            
            
            for(int i = 1; i <=n; i=i+i){
                int aleatorio = (int) (Math.random()*10);
                numero = (numero *10) + aleatorio;



            }
            System.out.println("El numero construido es: "+numero);
            int resultado = (numero * 2);
            System.out.println("Resultado producto: "+resultado);


        }


    










    }
}