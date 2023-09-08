import java.util.Scanner;

public class Principal_1{
     public static void main(String[] args){

        CajeroElectronico cajero_1  = new CajeroElectronico(2000000, 1500000, 10, 20, 10, 20, "Alejo Bank","Alejo","12345");
        cajero_1.imprimirDetalle();

        CajeroElectronico cajero_2  = new CajeroElectronico(350000000, "Davivienda","adso123","12345");
        cajero_2.imprimirDetalle();

        cajero_2.abastecerCajero(1000, 1000, 500, 500);
        cajero_2.abastecerCajero(20000, 20000, 5000, 5000);
        cajero_2.imprimirDetalle();

        //TarjetaDebito tarjeta_1 = new TarjetaDebito("Alejandro Hernandez", "51015","Davivienda",5000000,2000000,10,20,50,100,1500000,"54321");
       // tarjeta_1.imprimirDetalleTarjeta();
       TarjetaDebito tarjeta_1 = new TarjetaDebito("Alejandro Hernandez", "5571", "Bancolombia", 5000000, 1000000, "12345");

         tarjeta_1.consignarDineroTarjeta(10, 5, 2, 4);
         tarjeta_1.consignarDineroTarjeta(3, 10, 0, 1);
         tarjeta_1.imprimirDetalleTarjeta();
         tarjeta_1.retirarDineroTarjeta(400000);
         tarjeta_1.imprimirRetiroTarjeta();
       

        


     }
}