import java.util.Scanner;

public class Ejercicio_10{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);
       
      System.out.print("Ingrese la nota de Matematicas: ");
      double nota1 = entrada.nextDouble();

      System.out.print("Ingrese la nota de Sociales: ");
      double nota2 = entrada.nextDouble();

      System.out.print("Ingrese la nota de Naturales: ");
      double nota3 = entrada.nextDouble();

      System.out.print("Ingrese la nota de Quimica: ");
      double nota4 = entrada.nextDouble();

      System.out.print("Ingrese la nota de Inglés: ");
      double nota5 = entrada.nextDouble();


      String asignatura1 =  new String ("matematicas");
      String asignatura2 =  new String ("sociales");
      String asignatura3 =  new String ("naturale");
      String asignatura4 =  new String ("quimica");
      String asignatura5 =  new String ("ingles");


      System.out.println("Informe: ");

      if(nota1>nota2 && nota1>nota3 && nota1>nota4 && nota1>nota5){
        System.out.println("La asignatura con mayor nota fue: "+asignatura1);
      }else if(nota2>nota1 && nota2>nota3 && nota2>nota4 && nota2>nota5){
        System.out.println("La asignatura con mayor nota fue: "+asignatura2);
      }else if(nota3>nota1 && nota3>nota2 && nota3>nota4 && nota3>nota5){
        System.out.println("La asignatura con mayor nota fue: "+asignatura3);
      }else if(nota4>nota1 && nota4>nota2 && nota4>nota2 && nota4>nota5){
        System.out.println("La asignatura con mayor nota fue: "+asignatura4);
      }else if(nota5>nota1 && nota5>nota2 && nota5>nota3 && nota5>nota4){
        System.out.println("La asignatura con mayor nota fue: "+asignatura5);
      }



      if(nota1<nota2 && nota1<nota3 && nota1<nota4 && nota1<nota5){
        System.out.println("La asignatura con menor nota fue: "+asignatura1);
      }else if(nota2<nota1 && nota2<nota3 && nota2<nota4 && nota2<nota5){
        System.out.println("La asignatura con menor nota fue: "+asignatura2);
      }else if(nota3<nota1 && nota3<nota2 && nota3<nota4 && nota3<nota5){
        System.out.println("La asignatura con menor nota fue: "+asignatura3);
      }else if(nota4<nota1 && nota4<nota2 && nota4<nota2 && nota4<nota5){
        System.out.println("La asignatura con menor nota fue: "+asignatura4);
      }else if(nota5<nota1 && nota5<nota2 && nota5<nota3 && nota5<nota4){
        System.out.println("La asignatura con menor nota fue: "+asignatura5);
      }


      double prom = (nota1+nota2+nota3+nota4+nota5)/5;
      System.out.println("Promerdio de notas: "+prom);


      

      if (prom < 3){
        if(nota1<nota2 && nota1<nota3 && nota1<nota4 && nota1<nota5){
            if (nota1<3.0){
               double faltante1 = (nota1 + 1.9);
               System.out.println("Debió obtener una nota de: "+faltante1+ " en "+asignatura1+ " para aprobar el periodo.");
            }
          }else if(nota2<nota1 && nota2<nota3 && nota2<nota4 && nota2<nota5){
            if (nota2<3.0){
                double faltante2 = (nota2 + 1.9);
                System.out.println("Debió obtener una nota de: "+faltante2+ " en "+asignatura2+ " para aprobar el periodo.");
             }
          }else if(nota3<nota1 && nota3<nota2 && nota3<nota4 && nota3<nota5){
            if (nota2<3.0){
                double faltante2 = (nota2 + 1.9);
                System.out.println("Debió obtener una nota de: "+faltante2+ " en "+asignatura2+ " para aprobar el periodo.");
             }
          }else if(nota4<nota1 && nota4<nota2 && nota4<nota2 && nota4<nota5){
            if (nota3<3.0){
                double faltante3 = (nota3 + 1.9);
                System.out.println("Debió obtener una nota de: "+faltante3+ " en "+asignatura3+ " para aprobar el periodo.");
             }
          }else if(nota5<nota1 && nota5<nota2 && nota5<nota3 && nota5<nota4){
            if (nota5<3.0){
                double faltante5 = (nota5 + 1.9);
                System.out.println("Debió obtener una nota de: "+faltante5+ " en "+asignatura5+ " para aprobar el periodo.");
             }
          }
        
      }




      


       




    }  
}