public class Ejercicio09{
    public static void main(String[] args){
        int arreglo [] = new int [10];

        
        arreglo =  llenarArreglo(arreglo);
        imprimirArreglo(arreglo);
        System.out.println("El minimo del arreglo es: "+minimoArreglo(arreglo));
 
        
    }
 
   



   
   
    public static void imprimirArreglo(int [] arreglo){
        for(int i = 0; i<arreglo.length; i++){
            System.out.print("["+arreglo[i]+"]");
        }
         System.out.println();
    }
   
   public static int [] llenarArreglo(int arreglo[]){
    for(int i = 0; i < arreglo.length; i++){
        int aleatorio = (int)(Math.random()*100);
        arreglo[i] = aleatorio; 
        
        
    }
    return arreglo;
   }

   public static int minimoArreglo(int arreglo[]){
    int minimo = arreglo[0];
    for(int i = 0; i < arreglo.length; i++){
        if(arreglo[i] < minimo){
            minimo = arreglo[i];
        }
       
    }
       return minimo;
    
    
   }
    
   
}