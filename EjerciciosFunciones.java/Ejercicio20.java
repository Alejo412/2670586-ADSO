import java.util.Scanner;

public class Ejercicio20{
    public static void main(String[] args){
        Scanner entrada =new Scanner (System.in);


        System.out.println("Ingrese la base de un triangulo (n/entero): ");
        int base = entrada.nextInt();

        System.out.println("Ingrese la altura de un triangulo (n/entero): ");
        int altura = entrada.nextInt();


        System.out.println("El area del triangulo es: "+areaTriangulo(base, altura));
 
        
    }
 
   



   
   
   

   public static float areaTriangulo(int base, int altura){
        float area = (base*altura);
        return area;
    }
    
   
}