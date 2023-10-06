public class Ejercicio23 {
    public static void main(String[] args) {
        double capitalInicial = 1000.0; 
        double tasaInteresAnual = 0.05; 
        int periodoEnAnios = 5; 
        double montoFinal = calcularMontoFinal(capitalInicial, tasaInteresAnual, periodoEnAnios);

        System.out.println("El monto final es: " + montoFinal);
    }

    public static double calcularMontoFinal(double capitalInicial, double tasaInteresAnual, int periodoEnAnios) {
        // Fórmula del interés compuesto: A = P(1 + r/n)^(nt)
        
        int n = 1; //  interés anual
        double r = tasaInteresAnual;

        double montoFinal = capitalInicial * Math.pow(1 + (r / n), n * periodoEnAnios);

        return montoFinal;
    }
}
