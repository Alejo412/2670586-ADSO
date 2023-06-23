import java.util.Scanner;

public class Ejercicio_9{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

       System.out.print("Ingresar numero : ");
       int numero = entrada.nextInt();

      int divisores = 0;

      for(int i = 1; i<=numero; i=i+1){
        if(numero%i ==0){
            divisores = divisores +1;
        }

      }
      if (divisores ==2){
        System.out.println("Numero ingresado Es Primo.");
      }else{
        System.out.println("Numero ingresado No es Primo.");
      }



      

    }  
}