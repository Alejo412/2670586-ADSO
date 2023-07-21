
import java.util.Scanner;

public class Ejercicio_5{

    public static void main(String[]ars){
        Scanner entrada =new Scanner (System.in);

        System.out.print("Ingrese numero: ");
        int n =  entrada.nextInt();
        

        int multiplicador = 1;
        
        

        for(int i = 1; i <=n; i++){
            int resultmulti1 = i;
            multiplicador = multiplicador * i;
            System.out.print(i+ " x ");

        }

         System.out.print(" = "+multiplicador);
         


    










    }
}