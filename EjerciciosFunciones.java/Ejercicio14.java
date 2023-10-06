import java.util.Scanner;

public class Ejercicio14{
    public static void main(String[] args){
        Scanner entrada =new Scanner (System.in);
        
        System.out.println("Ingrese el tamaño del arrglo: ");
        int tamano = entrada.nextInt();
        int arreglo [] = new int [tamano]; 

    

      
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Ingrese un número en el arreglo: ");
            int numIngresado = entrada.nextInt();
            arreglo[i] = numIngresado;
        }

        imprimirArreglo(arreglo);
        verificarArreglo(arreglo);
        

        

        
        
    }

    public static void imprimirArreglo(int [] arreglo){
        for(int i = 0; i<arreglo.length; i++){
            System.out.print("["+arreglo[i]+"]");
        }
         System.out.println();
    }
   

    public static boolean verificarArreglo(int [] arreglo){
        for(int i = 0; i<arreglo.length-1;i++){
           if(arreglo[i] > arreglo[i+1]){
            System.out.println("El arreglo NO esta ordenado");
            return false;
           }
           
        }

            System.out.println("El arreglo esta ordenado Ascendenteme");
            return true;
       
    }
 
   



   
   
}