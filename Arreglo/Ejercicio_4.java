import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] arg){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese cantidad de números: ");
        int cantidad_nums = entrada.nextInt();

        int arreglo [] = new int[cantidad_nums];

        for(int i = 0; i < cantidad_nums; i++){
            System.out.print("Digite número: ");
            arreglo[i] = entrada.nextInt();
             

        }
        int aux = 0;

        System.out.print("Arreglo: ");
        for(int i = 0; i<cantidad_nums; i++){
            System.out.print("{ "+arreglo[i]+" }");
            
        }

        System.out.println("Posición: ");
        int Posición = entrada.nextInt();
        System.out.println(arreglo[Posición]);

        for (int i = 0; i < cantidad_nums - 1; i++) {
            for (int j = 0; j < cantidad_nums - i - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    // Intercambiar los elementos si están en el orden incorrecto
                    int temp =arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        // Imprimir los números ordenados en forma descendente
        System.out.println("Números en orden descendente:");
        for (int numero : arreglo) {
            System.out.println(numero);
        }

    

        }
          
          
    }
