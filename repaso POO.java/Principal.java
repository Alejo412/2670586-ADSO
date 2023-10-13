public class Principal{
    public static void main (String[] args){

        Perro perro_1 = new Perro ("Richar","Alejo",108,"Criollo",7.5,100);
        Perro perro_2 = new Perro ("Manchas","Camila",67,"Dalmata",5.3,70);

        //perro_1.setNombre("Toby");
        //perro_1.setPropietario("Carlos");

       //System.out.println("Perro 1: "+perro_1.getNombre());
       //System.out.println("Perro 1: "+perro_1.getPropietario());
       //perro_1.comer(800);
       perro_1.imprimirDetalle();
       perro_1.comer(6); //ingresar en (gramos), aumenta peso y energia
       perro_1.cagar(3); //ingresar en (numero_veces), baja peso
       perro_1.correr(23);//ingresar en (tiempo), baja peso y energia
       perro_1.dormir(4);//ingresar en (tiempo), aumenta  energia
       perro_1.ladrar(2);//ingresar en (numero_veces), baja energia
       perro_1.jugar(3, 15);//ingresar en (intensidad y tiempo), baja peso y energia
       perro_1.pelear(5);//ingresar en (intensidad), baja energia



       perro_1.imprimirDetalle();
      








        // clases: son los archivos.java y definen nuevos 
        //         tipos de datos, son consideradas plantillas.
        //         donde se crean objetos/variables.

        // Atributos: Datos propios de la clase definida o una caracteristica.
        //            Los atributos son variables globales.

        //Métodos: son las acciones que puede realizar un objeto 
        //         perteneciente a una clase.
        //          se representan como Funciones.



    }
}