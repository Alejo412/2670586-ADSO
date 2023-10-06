public class Ejercicio05{
    public static void main(String[] args){
        System.out.println("Potencia= "+potenciar(2,5));
    }

   
   
   
   
   public static int potenciar(int a, int b){
    int resultado = a;
    for(int i = 1; i <= b; i++){
      resultado = resultado * a;
    }
    
        return resultado;
    
    
    

    }
}