import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] arg){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese cantidad de números: ");
        int cantidad_nums = entrada.nextInt();

        int arreglo [] = new int[cantidad_nums];

        for(int i = 0; i < cantidad_nums; i++){
            System.out.print("Digite número: ");
            arreglo[i] = entrada.nextInt();
             

        }
        

        System.out.print("Arreglo: ");
         System.out.print("{ ");
        for(int i = 0; i<cantidad_nums; i++){
            System.out.print(+arreglo[i]+" ");
            
        }
        System.out.println(" } ");

        System.out.print("Número de movimientos: ");
        int num_movimientos = entrada.nextInt();
        

        int aux = 0;
        for (int i = 0; i < cantidad_nums - 1; i++) {
            for (int j = 0; j < cantidad_nums - i - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        /*
         */

         for(int m = 1; m <= num_movimientos; m++){
            System.out.print("Movimiento "+m);
            System.out.print(" { ");
               for (int numero : arreglo) {
            System.out.print(numero+" ");
        }
         System.out.println("}");

         }

        


        }
          


    }

    