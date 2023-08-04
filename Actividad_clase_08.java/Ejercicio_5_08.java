import java.util.Scanner;

public class Ejercicio_5_08{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

        System.out.println("Ingresar un número: ");
        int numero = entrada.nextInt();

        int arreglo [] = new int [numero];

        
        System.out.print("{ ");
       
        float aleatorio = 0;
        float acumulador = 0;
    

        for(int i = 0; i<numero; i++){
            aleatorio = (float)(Math.random()*0.10);
            System.out.print(aleatorio+" ");
            acumulador += aleatorio;
   
        }
        System.out.println("}");

        float prom = acumulador / numero;

         System.out.println("El promedio es: "+prom);

        
         
         

         
         
        

        

     



    }  
}