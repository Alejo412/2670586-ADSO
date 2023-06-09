import java.util.Scanner;

public class Ejercicio_8{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

        System.out.println("Ingrese la base de un triangulo: ");
        double base = entrada.nextDouble();

        System.out.println("Ingrese la altura de un triangulo: ");
        double altura = entrada.nextDouble();


        if(base > 0 && altura > 0){
            double area = (base*altura)/2;
            System.out.println("El área del triangulo es: "+area);
        }else{
            System.out.println("No se puede encontrar el área");
        }

        
        



        


    }  
}