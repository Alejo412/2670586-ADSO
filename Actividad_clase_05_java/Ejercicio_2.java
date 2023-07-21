import java.util.Scanner;

public class Ejercicio_2{

    public static void main(String[]ars){
        Scanner entrada =new Scanner (System.in);

        int dia = 1;
        if(dia <= 31){
            int numdia=1;
            for(int i = 1; i <=dia; i=i+i){
                int aleatorio1 = (int) (Math.random()*31);
                numdia = (numdia *10) + aleatorio1;
                System.out.print( "Fecha generada: "+aleatorio1);
            }
            
        }
        
        int mes = 1; 
        if(mes <= 12){

            int nummes=1;
            for(int i = 1; i <=mes; i=i+i){
                int aleatorio2 = (int) (Math.random()*12);
                nummes = (nummes *1) + aleatorio2;
                System.out.print("/"+aleatorio2);
            }
        }

        int año = 1; 
        if( año <= 2023){

            int numaño=1;
            for(int i = 1; i <=año; i=i+i){
                int aleatorio3 = (int) (Math.random()*2023);
                numaño = (numaño *1000) + aleatorio3;
                System.out.print("/"+aleatorio3);
            }
        }
           

        


    










    }
}