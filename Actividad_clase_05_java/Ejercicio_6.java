import java.util.Scanner;

public class Ejercicio_6{

    public static void main(String[]ars){
        Scanner entrada =new Scanner (System.in);

        System.out.print("Ingrese numero N: ");
        int n =  entrada.nextInt();

         System.out.print("Ingrese numero M: ");
        int m =  entrada.nextInt();
        

        

        int rango = 1;
        
        

        for(int j = n; j <=m; j++){
            int numentre = j;
           
         System.out.print(" Factorial de "+j+" : ");

           int multiplicador = 1;
           for(int i = 1; i <=j; i++){
            int resultmulti1 = i;
            multiplicador = multiplicador * i;

            System.out.print(i+" x ");

          }

         System.out.println(" = "+multiplicador);
        

        }

        

       


    










    }
}