import java.util.Random;

public class Ejercicio25 {
    public static void main(String[] args) {
        int limiteInferior = 1; 
        int limiteSuperior = 100; 

        int numeroAleatorio = generarNumeroAleatorio(limiteInferior, limiteSuperior);

        System.out.println("Número aleatorio dentro del rango: " + numeroAleatorio);
    }

    public static int generarNumeroAleatorio(int limiteInferior, int limiteSuperior) {
        if (limiteInferior >= limiteSuperior) {
            throw new IllegalArgumentException("El límite inferior debe ser menor que el límite superior.");
        }

        Random random = new Random();
        int rango = limiteSuperior - limiteInferior + 1;
        int numeroAleatorio = limiteInferior + random.nextInt(rango);

        return numeroAleatorio;
    }
}
