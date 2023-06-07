import java.util.Scanner;

public class Ejercicio_8{

    public static void main (String [] args){

        Scanner entrada=new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.next();

        String primertexto = "Hola estimado "+nombre;
        String segundotexto =  "¿Cómo va tu día?"; 


        String textocompleto = primertexto +  ""  +segundotexto;

        System.out.println(textocompleto);
        
        
    }
}