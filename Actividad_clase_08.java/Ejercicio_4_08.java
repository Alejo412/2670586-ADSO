import java.util.Scanner;

public class Ejercicio_4_08{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

        System.out.println("Ingresar un número: ");
        int numero = entrada.nextInt();

        int arreglo [] = new int [numero];

        
        System.out.print("{ ");
       
        int aleatorio = 0;
    

        for(int i = 0; i<numero; i++){
            aleatorio = (int)(Math.random()*10);
            arreglo[i] = aleatorio;
            System.out.print(aleatorio+" ");
            
   
        }
        System.out.println(" }");

         int minimo = arreglo[1];
         for(int m = 0 ; m < arreglo.length; m++ ){
                if(arreglo[m] < minimo){
                    minimo = arreglo[m];
                  

                }
            }

              System.out.println("El minimo es: "+minimo);

         
         

         
         
        

        

     



    }  
}