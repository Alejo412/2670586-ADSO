import java.util.Date;
public class CajeroElectronico{

    //Atributos
    int capacidadTotal;
    int dineroDisponible;
    int cant_10;
    int cant_20;
    int cant_50;
    int cant_100;
    String nombreBanco;
    String listaTransacciones [];
    String usuarioAdmi;
    String claveAdmi;
    

    //Constructor - metodos
    public CajeroElectronico(int capacidadTotal,int dineroDisponible,int cant_10,int cant_20, int cant_50,int cant_100,String nombreBanco,String usuarioAdmi,String claveAdmi ){
     this.capacidadTotal = capacidadTotal;
     this.dineroDisponible = dineroDisponible;
     this.cant_10 = cant_10;
     this.cant_20 = cant_20;
     this.cant_50 = cant_50;
     this.cant_100 = cant_100;
     this.nombreBanco = nombreBanco;
     this.usuarioAdmi = usuarioAdmi;
     this.claveAdmi = claveAdmi;
     listaTransacciones = new String[100];



    }

    public CajeroElectronico(int capacidadTotal,String nombreBanco, String usuarioAdmi, String claveAdmi){
        this.capacidadTotal = capacidadTotal;
        this.nombreBanco = nombreBanco;
        this.usuarioAdmi = usuarioAdmi;
        this.claveAdmi = claveAdmi;

        this.dineroDisponible = 0;
        this.cant_10 = 0;
        this.cant_20 = 0;
        this.cant_50 = 0;
        this.cant_100 = 0;
        listaTransacciones = new String[100];

        
    }

    public void imprimirDetalle(){
        System.out.println("------------------------------------------- ");
         System.out.println("           CAJERO AUTOMATICO               ");
        System.out.println("Capacidad Total: "+ capacidadTotal);
        System.out.println("Dinero Disponible: "+ dineroDisponible);
        System.out.println("Cant_10: "+ cant_10);
        System.out.println("Cant_20: "+ cant_20);
        System.out.println("Cant_50: "+ cant_50);
        System.out.println("Cant_100: "+ cant_100);
        System.out.println("Nombre Banco: "+ nombreBanco);
        System.out.println("Usuario Admi: "+ usuarioAdmi);
        System.out.println("Clave Admi: "+ claveAdmi);
       
        for(int i = 0; i< listaTransacciones.length; i++){
            if(listaTransacciones[i] !=null){
                System.out.println("   => "+listaTransacciones[i]);
            }
        }
         System.out.println("------------------------------------------- ");


    }

    

    

    public void registrarTransaccion(String tipo, String numeroTarjeta, int monto, String estado ){
        Date fecha = new Date(); //  es un objeto que crea la fecha actual y el toString es para que  se muestre en pantalla
        String texto = fecha.toString()+" - "+tipo+" - "+numeroTarjeta+" - "+monto+" - "+estado;

        //Buscar un indice donde este vacio
        int indice = -1;
        for(int i = 0; i < listaTransacciones.length; i++){
            if(listaTransacciones[i] == null){
                indice = i;
                break;
            }
        }

        if(indice != -1){
            listaTransacciones[indice] = texto;
        }else{
            for(int i = 0; i < listaTransacciones.length-1; i++){
                listaTransacciones[i] = listaTransacciones[i+1];
            }
            listaTransacciones[listaTransacciones.length-1] = texto;
        }

    }

    public boolean abastecerCajero(int cant_10, int cant_20, int cant_50, int cant_100){
        //calcular total ingresado
        int total = (cant_10*10000) + (cant_20*20000)+ (cant_50*50000) + (cant_100*100000);

        //validar que no exceda el limite
        if(total <= capacidadTotal){
            //si. Almacenar los datos en los atributos y retornar un true.
            dineroDisponible = total;
            this.cant_10 = cant_10;
            this.cant_20 = cant_20;
            this.cant_50 = cant_50;
            this.cant_100 = cant_100;
          
            registrarTransaccion("ABASTECER", "0000 0000 0000 0000", total, "OK");
            return true;

        }else{
            //No. imprimir mensaje y retornar false
           registrarTransaccion("ABASTECER", "0000 0000 0000 0000", total, "ERROR");
            return false;
            
        }
        
        

    }

    



}