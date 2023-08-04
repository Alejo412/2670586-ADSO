import java.util.Scanner;

public class Ejercicio_13_08{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

        System.out.println("Ingresar un número: ");
        int numero = entrada.nextInt();

        int arreglo1 [] = new int [numero];

      
        System.out.print("Arreglo 1 { ");
        int suma = 0;
        int aleatorio1 = 0;

        for(int i = 0; i<numero; i++){
            aleatorio1 = (int)(Math.random()*10);
            arreglo1[i] = aleatorio1;
            System.out.print(aleatorio1+" ");
            suma = suma + aleatorio1;
        }
         System.out.println(" }");
         




         int arreglo2 [] = new int [numero];
         int aleatorio2 = 0;
         System.out.print("Arreglo 2 { ");
         for(int i = 0; i<numero; i++){
            aleatorio2 = (int)(Math.random()*10);
            arreglo2[i] = aleatorio2;
            System.out.print(aleatorio2+" ");
            suma = suma + aleatorio2;
        }
         System.out.println(" }");
         



         int suma_arreglos [] = new int[numero];
         for(int i = 0; i < numero; i++){
            int sumatoria = arreglo1[i] + arreglo2[i] ;
            suma_arreglos[i] = sumatoria;
            
         }
         System.out.print("Suma: { ");
         for(int i = 0;i < numero; i++){
            System.out.print(suma_arreglos[i]+" ");
         }
         System.out.println(" }");





         

         
         
        

        

     



    }  
}