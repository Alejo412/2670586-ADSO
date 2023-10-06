public class Ejercicio07{
    public static void main(String[] args){
        int arreglo [] = new int [10];

        imprimirArreglo(arreglo);
        arreglo =  llenarArreglo(arreglo);
        imprimirArreglo(arreglo);
 
        
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
    
   
}