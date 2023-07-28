import java.util.Scanner;

public class Ejercicio_2{
   
        public static void main(String[] args) {
            
                Scanner scanner = new Scanner(System.in);
        
                System.out.print("Ingrese el tamaño del arreglo: ");
                int tamañoArreglo = scanner.nextInt();
        
                int[] arreglo = new int[tamañoArreglo];
                int numero = 2; 
        
                for (int i = 0; i < tamañoArreglo; i++) {
                    while (!esPrimo(numero)) {
                        numero++;
                    }
                    arreglo[i] = numero;
                    numero++;
                }
        
                System.out.println("El arreglo de números primos es:");
                for (int i = 0; i < tamañoArreglo; i++) {
                    System.out.println("Posición "+i+" = "+arreglo[i]);
                }
            }
        
            public static boolean esPrimo(int numero) {
                if (numero <= 1) {
                    return false;
                }
        
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        return false;
                    }
                }
        
                return true;
            }
}

        

        




    
