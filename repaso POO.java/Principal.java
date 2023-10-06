public class Principal{
    public static void main (String[] args){

        Perro perro_1 = new Perro ("Richar","Alejo",108,"Criollo",7.5,40);
        Perro perro_2 = new Perro ("Manchas","Camila",67,"Dalmata",5.3,70);

        //perro_1.setNombre("Toby");
        //perro_1.setPropietario("Carlos");

       //System.out.println("Perro 1: "+perro_1.getNombre());
       //System.out.println("Perro 1: "+perro_1.getPropietario());
       perro_1.comer(800);


       perro_1.imprimirDetalle();
       perro_2.imprimirDetalle();








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