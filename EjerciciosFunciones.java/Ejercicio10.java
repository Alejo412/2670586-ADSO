public class Ejercicio10{
    public static void main(String[] args){
        int arreglo [] = new int [5];

        
        arreglo =  llenarArreglo(arreglo);
        imprimirArreglo(arreglo);
        System.out.println("El Promedio del arreglo es: "+promArreglo(arreglo));
 
        
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

   public static float promArreglo(int arreglo[]){
        int acum = 0; 
        float prom = 0;
    for(int i = 0; i < arreglo.length; i++){
        acum += arreglo[i];
        prom = ((float)acum/arreglo.length);

        
       
    }
       return prom;
    
    
   }
    
   
}