import java.util.Scanner;

public class Ejercicio_9{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

        
        
        System.out.println("Ingrese las horas trabajadas en la semana: ");
        int horas = entrada.nextInt();

        System.out.println("Ingrese la tarifa por hora $: ");
        double valor_h = entrada.nextDouble();

        double salario_s = (horas * valor_h);
        System.out.println("El PREsalario semanal es de $: "+salario_s);

        double hora1 = (salario_s*10000);

        if (horas > 40){
            int extras = (horas-40);
            System.out.println("Trabajó "+extras+ " horas extras");

            double valor_ex = (valor_h * 1.50);

            double valor_finextras = (valor_ex * extras);
            System.out.println("Excedente  del 50% por horas extras es $: "+valor_finextras);

            double salario_final = (salario_s + valor_finextras);
            System.out.println("El salario final semanal es de $: "+salario_final);

            

        }else{
            System.out.println("El salario final semanal es de $: "+salario_s);
        }

       

    



        
        



    }  
}