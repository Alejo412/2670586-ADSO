public class Perro{


//atributos
 private String nombre;
 private String propietario;
 private int edad;
 private String raza;
 private double peso;
 private int energia;

 //metodos
//CONSTRUCTOR = es usado para crear objetos de esa clase (Instanciacion)
//             y su labor es dar valor inicial a los atributos.
public Perro(String nombre, String propietario, int edad, String raza, double peso, int energia){
    this.nombre = nombre;
    this.propietario = propietario;
    this.edad = edad;
    this.raza = raza;
    this.peso = peso;
    this.energia = energia;

   // imprimirDetalle(); solo si se quieren mostrar todos los perros y NO solo algunos
  
}

public void imprimirDetalle(){
    
    System.out.println("+----------------------------------------------+");
    System.out.println("+                    PERRO                     +");
    System.out.println("+                                              +");
    System.out.println("+-------NOMBRE: "+nombre);
    System.out.println("+-------PROPIETARIO: "+propietario);
    System.out.println("+-------EDAD: "+edad+" meses ("+((double)edad/12)+" años)");
    System.out.println("+-------RAZA: "+raza);
    System.out.println("+-------PESO: "+peso+" Kg");
    System.out.println("+-------ENERGIA: "+energia+" %");
    System.out.println("+-----------------------------------------------+");
}

//getters = extraer el valor de los atributos
public String getNombre(){
    return nombre;
}

public String getPropietario(){
    return propietario;
}

public int getEdad(){
    return edad;
}
public String getRaza(){
    return raza;
}

public double getPeso(){
    return peso;
}

public int getEnergia(){
    return energia;
}

//setter = recibe un dato y asigna el valor al atributo extraido por el get

public void setNombre(String dato){
    nombre = dato;
}

public void setPropietario(String dato){
    propietario = dato;
}

public void setEdad(int dato){
    edad = dato;
}

public void setRaza(String dato){
    raza = dato;
}

public void setPeso(double dato){
    peso = dato;
}

public void setEnergia(int dato){
    energia = dato;
}

public void comer(int gramos){
    // modificar peso
    //peso = peso actual + kg ingeridos
    peso = peso + ((double)gramos / 1000);
    energia = energia + (gramos/100);
    

}












}