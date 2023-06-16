import java.util.Scanner;

public class Ejercicio_3{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

        System.out.print("Ingrese la altura: ");
        int altura_piramide = entrada.nextInt();

         String equis = new String ("x");
         System.out.println("Altura de piramide: "+altura_piramide);
    
    
      for (int i=0; i <= altura_piramide; i=i+1){
        equis = equis + ("x");
        System.out.println("" +equis);
       


      }

    }  
}