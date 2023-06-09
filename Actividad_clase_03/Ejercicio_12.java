import java.util.Scanner;

public class Ejercicio_12{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra $: ");
        double valor_original = entrada.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento de la compra: " );
        int porcentaje_desc = entrada.nextInt();

        

        if(porcentaje_desc >= 0 && porcentaje_desc <= 100){
            double prevalor_desc = (porcentaje_desc % 100);
            double valor_final = (prevalor_desc * valor_original);
            System.out.println("El descuento aplicado es: "+valor_final);
        }else{
            System.out.println("El  porcentaje de descuento no es válido");
        }


        


    }  
}