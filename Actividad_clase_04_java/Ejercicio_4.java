import java.util.Scanner;

public class Ejercicio_4{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);

       System.out.println("                      |-----------Bienvenido---------|");
       System.out.println("                      |                              |");
       System.out.println("                      |1. Docente                    |");
       System.out.println("                      |2. Estudiante                 |");
       System.out.println("                      |3. Salir                      |");
       System.out.println("                      |                              |");
       System.out.println("                      |------------------------------|");
       

       System.out.print("Ingrese una opción del menú: ");
       int opcion = entrada.nextInt();

       int i = 0;
       do{
        if(opcion == 1){
        System.out.print("Ingrese cantidad de notas: ");
        int numero_notas= entrada.nextInt();

        double sumanotas = 0; 
        int contador = 1;
        while ( contador <= numero_notas){
           System.out.print("Nota" +contador+ ": ");
            double nota = entrada.nextDouble();

            sumanotas = sumanotas + nota;
           contador = contador + 1; 
        }

            double prom = sumanotas / numero_notas;
            System.out.println("El promedio de las notas es: "+prom);


       System.out.println("                      |-----------Bienvenido---------|");
       System.out.println("                      |                              |");
       System.out.println("                      |1. Docente                    |");
       System.out.println("                      |2. Estudiante                 |");
       System.out.println("                      |3. Salir                      |");
       System.out.println("                      |                              |");
       System.out.println("                      |------------------------------|");


       }else if(opcion == 2){
        System.out.print("Ingrese cantidad de notas: ");
        int numero_notas= entrada.nextInt();

       int contador = 1;
       double sumanotas = 0;
       int sumacreditos = 0;
       while (contador <= numero_notas){
            System.out.print("Ingrese nota materia "+contador+ ": ");
            double nota = entrada.nextDouble();

            System.out.print("Creditos materia: ");
            int creditos = entrada.nextInt();

            sumanotas = sumanotas + (nota*creditos);
            sumacreditos = sumacreditos + creditos;
           contador = contador + 1;
       }


         double promponderado = (sumanotas / sumacreditos);
         System.out.println("Total creditos: "+sumacreditos);
        System.out.println("El promedio del semestre es: "+promponderado);


       System.out.println("                      |-----------Bienvenido---------|");
       System.out.println("                      |                              |");
       System.out.println("                      |1. Docente                    |");
       System.out.println("                      |2. Estudiante                 |");
       System.out.println("                      |3. Salir                      |");
       System.out.println("                      |                              |");
       System.out.println("                      |------------------------------|");

       }else if(opcion == 3){
        System.out.print("Gracias");
       }

       }while(i==3);

       
    
       


       



    }  
}