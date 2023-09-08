import java.util.Date;

public class TarjetaDebito{

    //Atributos
    String nombrePropietario;
    String numeroTarjeta;
    String nombreBanco;
    int capacidadCantTarjeta;
    int cantidadDineroTarjeta;
    int cant_10;
    int cant_20;
    int cant_50;
    int cant_100;
    int cantidadDineroParaRetirar;
    String ultimasTransacciones [];
    String clave;
    int saldoDisponible = 0;


    //Constructor - metodos
     public TarjetaDebito(String nombrePropietario, String numeroTarjeta, String nombreBanco,int capacidadCantTarjeta,  int cantidadDineroTarjeta,int cant_10,int cant_20, int cant_50,int cant_100,  int cantidadDineroParaRetirar, String clave){
        this.nombrePropietario = nombrePropietario;
        this.numeroTarjeta = numeroTarjeta;
        this.nombreBanco = nombreBanco;
        this.cantidadDineroTarjeta = cantidadDineroTarjeta;
        this.cant_10 = cant_10;
        this.cant_20 = cant_20;
        this.cant_50 = cant_50;
        this.cant_100 = cant_100;
        this.cantidadDineroParaRetirar = cantidadDineroParaRetirar;
        this.clave = clave;
        ultimasTransacciones = new String [5];

     }

     public TarjetaDebito(String nombrePropietario,String numeroTarjeta,String nombreBanco,int capacidadCantTarjeta,int cantidadDineroParaRetirar, String clave ){
        this.nombrePropietario = nombrePropietario;
        this.numeroTarjeta = numeroTarjeta;
        this.nombreBanco = nombreBanco;
        this.capacidadCantTarjeta = capacidadCantTarjeta;
        this.cantidadDineroParaRetirar = cantidadDineroParaRetirar;
        this.clave = clave;
        

        this.cantidadDineroTarjeta = 0;
        this.cant_10 = 0;
        this.cant_20 = 0;
        this.cant_50 = 0;
        this.cant_100 = 0;
        ultimasTransacciones = new String[5];

        
    }



    public void registroTransaccionesTarjeta(String tipoTransaccion, int monto, String estado){
        Date fecha = new Date();
        String texto = fecha.toString()+" - "+tipoTransaccion+" - "+monto+" - "+estado;
        int indice = -1;
        for(int i = 0; i < ultimasTransacciones.length; i++){
            if(ultimasTransacciones[i] == null){
                indice = i;
                break;
            }
        }
        
        if(indice != -1){
            ultimasTransacciones[indice] = texto;
        }else{
            for(int i = 0; i < ultimasTransacciones.length-1; i++){
                ultimasTransacciones[i] = ultimasTransacciones[i+1];
            }
            ultimasTransacciones[ultimasTransacciones.length-1] = texto;
        }
    } 
     

    public boolean consignarDineroTarjeta(int cant_10, int cant_20, int cant_50, int cant_100){
        int total = ((cant_10 * 10000) + (cant_20*20000) + (cant_50*50000) + (cant_100*100000));
        if(total <= capacidadCantTarjeta){
            cantidadDineroTarjeta = total;

            this.cant_10 = cant_10;
            this.cant_20 = cant_20;
            this.cant_50 = cant_50;
            this.cant_100 = cant_100;
            registroTransaccionesTarjeta("CONSIGNACION", total, "OK");
            imprimirRetiroTarjeta();
            return true;
        }else{
            registroTransaccionesTarjeta("CONSIGNACION", total, "ERROR");
            return false;
        }
    }
            Date fecha = new Date();
            String texto = fecha.toString();
    public boolean retirarDineroTarjeta(int cantidadDineroParaRetirar){
       
        if(cantidadDineroParaRetirar >= 20000 && cantidadDineroParaRetirar <= 1000000){
            
            this.cantidadDineroParaRetirar = cantidadDineroParaRetirar;
            saldoDisponible = (cantidadDineroTarjeta - cantidadDineroParaRetirar);
            
            return true;
        }else{
            System.out.println("----------ERROR------------");
            System.out.println("Monto no permitido");
            System.out.println("---------------------------");
            return false;
        }
    }

    public void imprimirRetiroTarjeta(){
        System.out.println("---------------RETIRO TARJETA-------------------------");
        System.out.println("Fecha: "+texto);
        System.out.println("Nombre propietario: "+nombrePropietario);
        System.out.println("Numero tarjeta: "+numeroTarjeta);
        System.out.println("Retiro dinero de tarjeta: "+cantidadDineroParaRetirar);
        System.out.println("Saldo disponible: "+saldoDisponible);
        System.out.println("------------------------------------------------------");
    }

    public boolean cambiarClave(String clave){
        

    }






    public void imprimirDetalleTarjeta(){
        System.out.println("--------------------------------");
        System.out.println("       TARJETA DEBITO           ");
        System.out.println("Nombre Propietario: "+nombrePropietario);
        System.out.println("Numero Tarjeta: "+numeroTarjeta);
        System.out.println("Nombre Banco: "+nombreBanco);
        System.out.println("Saldo disponible: "+cantidadDineroTarjeta);
        System.out.println("Cant_10: "+ cant_10);
        System.out.println("Cant_20: "+ cant_20);
        System.out.println("Cant_50: "+ cant_50);
        System.out.println("Cant_100: "+ cant_100);
        System.out.println("Cantidad de dinero para retirar: "+cantidadDineroParaRetirar);
        System.out.println("Clave: "+clave);

        for(int i = 0; i < ultimasTransacciones.length; i++){
            if(ultimasTransacciones[i] != null){
                System.out.println(" => "+ultimasTransacciones[i]);
            }
        }
        System.out.println("-----------------------------------");


    }



}