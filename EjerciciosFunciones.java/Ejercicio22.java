public class Ejercicio22 {
    public static void main(String[] args) {
        int n = 10; // Cambia este valor al número deseado
        int[] arreglo = generartamano(n);
        
        // Imprimir el arreglo de números primos
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }

    public static boolean esprimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] generartamano(int size) {
        int[] arreglo = new int[size];
        int num = 2; // Empezamos desde el primer número primo

        for (int i = 0; i < size; ) {
            if (esprimo(num)) {
                arreglo[i] = num;
                i++;
            }
            num++;
        }

        return arreglo;
    }
}
