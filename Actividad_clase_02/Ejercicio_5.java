import java.util.Scanner;
    public class Ejercicio_5{
        public static void main(String[]args){
            Scanner entrada =new Scanner(System.in);

            System.out.println("Ingrese el primer número: ");
            int numero1 = entrada.nextInt();

            System.out.println("Ingrese el segundo número: ");
            int numero2 = entrada.nextInt();

            System.out.println("Ingrese el tercer número: ");
            int numero3 = entrada.nextInt();


            if (numero1<numero2) {
                System.out.println("Los números se ingresaron en orden ascendente");
            } else if (numero2<numero3){
                System.out.println("Los números se ingresaron en orden ascendente");
            } else if (numero1<numero3){
                System.out.println("Los números se ingresaron en orden ascendente");
            }else{
                System.out.println("Los números se ingresaron en orden descendente");
            } 




           
        }

        
    }