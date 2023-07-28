import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] arg){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese cantidad de números: ");
        int cantidad_nums = entrada.nextInt();

        int arreglo [] = new int[cantidad_nums];

        for(int i = 0; i < cantidad_nums; i++){
            System.out.print("Digite número: ");
            arreglo[i] = entrada.nextInt();
             

        }
        
        System.out.print("Arreglo original: ");
         System.out.print("{ ");
        for(int i = 0; i<cantidad_nums; i++){
            System.out.print(+arreglo[i]+" ");
            
        }
        System.out.println(" } ");



        
           


    }
          
          
        

        

        




}