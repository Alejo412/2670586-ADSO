import java.util.Scanner;

public class Ejercicio_5{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

       System.out.println("Ingrese el año: ");
       int año = entrada.nextInt();

       if(año % 4 ==0){
        System.out.println("ESTE AÑO ES BISIESTO");
       }else{
        System.out.println("año normal");
       }



    }  
}