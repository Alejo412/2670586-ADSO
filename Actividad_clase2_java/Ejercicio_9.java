import java.util.Scanner;
    public class Ejercicio_9{
        public static void main(String[]args){
            Scanner entrada =new Scanner(System.in);

            System.out.println("Ingrese una fecha (día,mes,año): ");
            int fecha = entrada.nextInt();

            if (fecha > 0){
                int d1 = (fecha/10)%10;
                int d2 = (fecha/10)%10;
                int d3 = (fecha/10)%10;
                int d4 = (fecha/10)%10;
                int d5 = (fecha/1000)%10;
                int d6 = (fecha/100)%10;
                int d7 = (fecha/10)%10;
                int d8 = fecha%10;



                
                if(d1 == 0){
                    if (d2 == 1){
                        System.out.print("Primero de ");
                    }else if (d1 == 2){
                        System.out.print("Dos de ");
                    }else if (d1 == 3){
                        System.out.print("Tres de ");
                    }else if (d1 == 4){
                        System.out.print("Cuatro de ");
                    }else if (d1 == 5){
                        System.out.print("Cinco de ");
                    }else if (d1 == 6){
                        System.out.print("Seis de ");
                    }else if (d1 == 7){
                        System.out.print("Siete de ");
                    }else if (d1 == 8){
                        System.out.print("Ocho de ");
                    }else if (d1 == 9){
                        System.out.print("Nueve de ");
                    }
                }

                if (d1==1){
                    if (d2 == 0){
                        System.out.print("Deiz ");
                    }if (d2 == 1){
                        System.out.print("Once de ");
                    }else if (d2 == 2){
                        System.out.print("Doce de ");
                    }else if (d2 == 3){
                        System.out.print("Trece de ");
                    }else if (d2 == 4){
                        System.out.print("Catorce de ");
                    }else if (d2 == 5){
                        System.out.print("Quince de ");
                    }else if (d2 == 6){
                        System.out.print("Dieciseis de ");
                    }else if (d2 == 7){
                        System.out.print("Diecisiete de ");
                    }else if (d2 == 8){
                        System.out.print("Dieciocho de ");
                    }else if (d2 == 9){
                        System.out.print("Diecinueve de ");
                    }

                } 

            





                

                if (d3 ==0){
                    if (d4 == 0){
                        System.out.print("");
                    }else if (d4 == 1){
                        System.out.print("Febrero del ");
                    }else if (d4 == 2){
                        System.out.print("Febrero del ");
                    }else if (d4 == 3){
                        System.out.print("Marzo del ");
                    }else if (d4 == 4){
                        System.out.print("Abril del ");
                    }else if (d4 == 5){
                        System.out.print("Mayo del ");
                    }else if (d4 == 6){
                        System.out.print("Junio del ");
                    }else if (d4 == 7){
                        System.out.print("Julio del ");
                    }else if (d4 == 8){
                        System.out.print("Agosto del ");
                    }else if (d4 == 9){
                        System.out.print("Septiembre del ");
                    }
                }
                    
                if (d3==1){
                    if (d4 == 0){
                        System.out.print("Octubre del ");
                    }else if (d4 == 1){
                        System.out.print("Noviembre del ");
                    }else if (d4 == 2){
                        System.out.print("Diciembre del ");
                    }
                }


                if(d5==0){
                    System.out.print("Error, digite un número valido");
                }else if (d5==1){
                    System.out.print("Mil ");
                }else if (d5==2){
                    System.out.print("Dos mil ");
                }
                else if (d5==3){
                    System.out.print("Tres mil ");
                }
                else if (d5==4){
                    System.out.print("Cuatro mil ");
                }
                else if (d5==5){
                    System.out.print("Cinco mil ");
                }else if (d5==6){
                    System.out.print("Seis mil ");
                }
                else if (d5==7){
                    System.out.print("Siete mil ");
                }
                else if (d5==8){
                    System.out.print("Ocho mil ");
                }else if (d5==9){
                    System.out.print("Nueve mil ");
                }

                 
                
                if(d6==0){
                    System.out.print("");
                }else if(d6 ==1){
                    System.out.print("ciento ");
                }else if(d6 ==2){
                    System.out.print("Doscientos ");
                }
                else if(d6 ==3){
                    System.out.print("Trescientos ");
                }
                else if(d6 ==4){
                    System.out.print("Cuatrocientos ");
                }
                else if(d6 ==5){
                    System.out.print("Qunientos ");
                }
                else if(d6 ==6){
                    System.out.print("Seiscientos ");
                }else if(d6 ==7){
                    System.out.print("Setecientos ");
                }
                else if(d6 ==8){
                    System.out.print("Ochocientos ");
                }
                else if(d6 ==9){
                    System.out.print("Novecientos ");
                }


                if(d7==1){
                    if(d8==0){
                        System.out.print("Diez");
                    }
                }else if(d7==2){
                    if(d8==0){
                        System.out.print("Veinte");
                    }
                }else if(d7==3){
                    if(d8==0){
                        System.out.print("Treinta");
                    }
                }else if(d7==4){
                    if(d8==0){
                        System.out.print("Cuarenta");
                    }
                }else if(d7==5){
                    if(d8==0){
                        System.out.print("Cincuenta");
                    }
                }else if(d7==6){
                    if(d8==0){
                        System.out.print("Sesenta");
                    }
                }else if(d7==7){
                    if(d8==0){
                        System.out.print("Setenta");
                    }
                }else if(d7==8){
                    if(d8==0){
                        System.out.print("Ochenta");
                    }
                }else if(d7==9){
                    if(d8==0){
                        System.out.print("Noventa");
                    }
                }

                

                if(d7==2){
                    System.out.print("Veinti ");
                }else if(d7==3){
                    System.out.print("Treinta y ");
                }
                else if(d7==4){
                    System.out.print("Cuarenta y ");
                }
                else if(d7==5){
                    System.out.print("Cincuenta y ");
                }
                else if(d7==6){
                    System.out.print("Sesenta y ");
                }
                else if(d7==7){
                    System.out.print("Setenta y ");
                }
                else if(d7==8){
                    System.out.print("Ochenta y ");
                }
                else if(d7==9){
                    System.out.print("Noventa y ");
                }





                if(d8 ==1){
                    System.out.print("Uno");
                }else if(d8==2){
                    System.out.print("Dos");
                }
                else if(d8==3){
                    System.out.print("Tres");
                }
                else if(d8==4){
                    System.out.print("Cuatro");
                }
                else if(d8==5){
                    System.out.print("Cinco");
                }
                else if(d8==6){
                    System.out.print("Seis");
                }
                else if(d8==7){
                    System.out.print("Siete");
                }
                else if(d8==8){
                    System.out.print("Ocho");
                }
                else if(d8==9){
                    System.out.print("Nueve");
                }


                

            }

            

           
        }

        

    }

