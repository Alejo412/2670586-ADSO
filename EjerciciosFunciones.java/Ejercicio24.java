public class Ejercicio24 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] resultado = contarParesEImpares(numeros);

        System.out.println("Cantidad de números pares: " + resultado[0]);
        System.out.println("Cantidad de números impares: " + resultado[1]);
    }

    public static int[] contarParesEImpares(int[] numeros) {
        int[] resultado = new int[2]; // Índice 0 para pares, índice 1 para impares

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                // Es par
                resultado[0]++;
            } else {
                // Es impar
                resultado[1]++;
            }
        }

        return resultado;
    }
}
