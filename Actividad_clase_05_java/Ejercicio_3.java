import java.util.Random;
import java.util.Scanner;

public class Ejercicio_3{

    public static void main(String[]ars){
        Scanner entrada =new Scanner (System.in);
        
        
        System.out.print("Ingrese numero: ");
        int n = entrada.nextInt();


        System.out.println("Primos Aleatorios: ");
        int contador = 1; 
        do{
            
            int numero = 1;
            boolean primo = true;
            int cifraprimo = 1;

            int aleatorio = (int) (Math.random()*10);
                numero = (numero *10) + aleatorio;
            int numprimo = contador +0;
            
            contador = contador +1;
            
            int limiteinferior = 1;
            int limitesuperior = 100;

            for(int i = limiteinferior; i <= limitesuperior; i++){
            int divisores = 0;

            for(int j = 1; j <= i/2; j++){
                if(i%j == 0){
                    divisores+=2;
                }
                if(divisores>2){
                    break;
                }
            }
                if(divisores==2){
               int aleatorio2 = (int) (Math.random()*100);
                i= (i *100) + aleatorio2;
                
                System.out.println("                  Primo "+numprimo+" Generado -> "+aleatorio2);
                
               }

               

               


            }


    



            




        }while(contador <= n); 


        

        
    










    }
}

