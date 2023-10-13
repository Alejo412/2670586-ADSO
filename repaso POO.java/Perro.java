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

public void cagar(int numVeces){
    //debe bajar el peso según el número de veces que cago
    //cada cagada baja 0,5g
    double gramos = 0.5f;
    double bajaPeso = (numVeces * gramos);
    
}

public void correr(int tiempo){
    //modifica peso y energia
    //por cada 10 minutos el perro baja 1 gramo;
    //por cada 10 minutos el perro baja un entero de energia
    peso -= ((double)tiempo / 10 );
    if(peso <= 1.0){
        System.out.println("|---El perro perdio mucho peso, PORFAVOR SUMINISTRLE---|");
    }
    int timepoEnergia = (tiempo/10);
    energia -= timepoEnergia;
    if(energia <= 5){
        System.out.println("|---El perro no tiene energia, PORFAVOR SUMINISTRLE---|");
    }
    
}

public void dormir(int tiempo){
    //la energia debe aumentar
    //el tiempo es en minutos / por cada 10 minutos, sube una rayita de energia
    energia += (tiempo/10);
}


public void ladrar(int numVeces){
    //debe de bajar la energia
    //por cada 10 veces que ladre, baja una rayita la energia
    if(numVeces >= 10){
        energia -= (numVeces / 10);
    }
}

public void jugar(int intensidad, int tiempo){
    //debe bajar la energia y el peso
    //la intensidad se mide en un rango del 1 al 10
    if(intensidad > 0 && intensidad <= 10){
         int bajar = (intensidad * tiempo)/100;
         energia -= bajar;

         peso -= ((double)bajar/1000);
    }
   
}

public void pelear(int intensidad){
    //debe bajar la energia, como resultado de multiplicar la intensidad por 5, para que /de un porcentaje alto
     //la intensidad se mide en un rango del 1 al 10
    if(intensidad > 0 && intensidad <= 10){ 
         energia -= (intensidad*5);
    }
}







}