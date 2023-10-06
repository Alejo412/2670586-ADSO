import java.util.Scanner;

public class Ejercicio19{
    public static void main(String[] args){
        Scanner entrada =new Scanner (System.in);


        System.out.println("Ingrese el radio de un circulo (n/entero): ");
        int radio = entrada.nextInt();

        System.out.println("El area del circulo es: "+areaCirculo(radio));
 
        
    }
 
   



   
   
   

   public static float areaCirculo(int radio){
        float pi = 3.1416f;
        float potencia = ((float)radio*2);

        float area = (pi * potencia);

        return area;
    }
    
   
}