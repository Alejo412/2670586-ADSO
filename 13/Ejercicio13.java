import java.util.Scanner;

public class Ejercicio13{
    public static void main(String[] args){
        Scanner entrada =new Scanner (System.in);
        
        System.out.println("Ingrese el tamaño del arrglo: ");
        int tamano = entrada.nextInt();
        int arreglo [] = new int [tamano]; 

        System.out.println("Ingrese un número en el arreglo: ");
        int numIngresado = entrada.nextInt();

        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = numIngresado;
        }

        arreglo =  arregloAscendente(arreglo);
        imprimirArreglo(arreglo);
        

        

        
        
    }

    public static void imprimirArreglo(int [] arreglo){
        for(int i = 0; i<arreglo.length; i++){
            System.out.print("["+arreglo[i]+"]");
        }
         System.out.println();
    }
   

    public static int arregloAscendente(int arreglo[]){
         int mayor = arreglo[0];
        for(int i = 0; i<arreglo.length;i++){
           if(arreglo[i] > mayor){
            mayor = arreglo[i];
                for(int j = 0; j < arreglo.length; j++){
                    arreglo[j] = mayor;
                    
                }
           }
           
        }
        return arreglo;
    }
 
   



   
   
}