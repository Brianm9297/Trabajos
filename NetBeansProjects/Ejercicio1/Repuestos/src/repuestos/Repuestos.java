package repuestos;
import java.util.Scanner;
public class Repuestos {

    static int AcumuladorA=0;
    static int AcumuladorB=0;
    static int AcumuladorC=0;
    public static void main(String[] args) {
        int resp;
        Scanner leer = new Scanner(System.in);
       do{
                 System.out.println("Seleccione una Opcion");
                 System.out.println("1) Empleado #1");
                 System.out.println("2) Empleado #2");
                 System.out.println("3) Empleado #3");
                 System.out.println("4) SALIR #4");
                resp=leer.nextInt();
                switch(resp){
                        case 1:
                            int id = 1;  
                            ventasE(id);
                        break;    
                        case 2:
                            int id2 = 2;  
                            ventasE(id2);
                        break;
                        case 3:
                            int id3 = 3;  
                            ventasE(id3);
                        break; 
                }
         } while(resp!=4); 
       if(resp==4){
        if((AcumuladorA>0) || (AcumuladorB>0) || (AcumuladorC>0)){
             int TotalE1=0;        
                int TotalE2=0;
                int TotalE3=0;
                int Totales=0;   
                int descuento=20;
                int porcentaje=100;
                int DesTo;
                int Resul;
            Totales=Totales+AcumuladorA+AcumuladorB+AcumuladorC;
            System.out.println("Total Ventas Registradas sin descuento $" + Totales);   
            if((AcumuladorA>=50000000 && AcumuladorA<=100000000)||(AcumuladorB>=50000000 && AcumuladorB<=100000000)||(AcumuladorC>=50000000 && AcumuladorC<=100000000)){
                DesTo=Totales*descuento;
                Resul=DesTo/porcentaje;
                System.out.println("Total Ventas Registradas con descuento $" + Resul);  
            }
                TotalE1=TotalE1+AcumuladorA;
                TotalE2=TotalE2+AcumuladorB;
                TotalE3=TotalE3+AcumuladorC;
                System.out.println("Total Ventas Empleado 1 $" + TotalE1);     
                System.out.println("Total Ventas Empleado 2 $" + TotalE2);     
                System.out.println("Total Ventas Empleado 3 $" + TotalE3);  
                
            }else{
         System.out.println("Bye Bye");     
        }
       }
    }
    public static void ventasE(int idEmpleado){
         Scanner leer = new Scanner(System.in);
        if(idEmpleado==1){
                    int valorVenta;
                    int dia;
                    int NextDay;
                    System.out.println("ingrese #Dia");   
                    dia=leer.nextInt();
                 do{
                    System.out.println("Ingrese valor Venta");
                    valorVenta=leer.nextInt();
                    AcumuladorA=AcumuladorA+valorVenta;
                    System.out.println("desea pasar al dia siguiente digite cero (0) de lo contrario Digite 1");
                    NextDay=leer.nextInt();
                    if(NextDay==0){
                    dia=0;
                    System.out.println("Acumulado Venta " +AcumuladorA);
                    }
                 }while(dia!=0); 
            }
    if(idEmpleado==2){
                    int valorVenta;
                    int dia;
                    int NextDay;
                    System.out.println("ingrese #Dia");   
                    dia=leer.nextInt();
                 do{
                    System.out.println("Ingrese valor Venta");
                    valorVenta=leer.nextInt();
                    AcumuladorB=AcumuladorB+valorVenta;
                    System.out.println("desea pasar al dia siguiente digite cero (0) de lo contrario Digite 1");
                    NextDay=leer.nextInt();
                    if(NextDay==0){
                    dia=0;
                    System.out.println("Acumulado Venta " +AcumuladorB);
                    }
                 }while(dia!=0); 
            }
    if(idEmpleado==3){
                    int valorVenta;
                    int dia;
                    int NextDay;
                    System.out.println("ingrese #Dia");   
                    dia=leer.nextInt();
                 do{
                    System.out.println("Ingrese valor Venta");
                    valorVenta=leer.nextInt();
                    AcumuladorC=AcumuladorC+valorVenta;
                    System.out.println("desea pasar al dia siguiente digite cero (0) de lo contrario Digite 1");
                    NextDay=leer.nextInt();
                    if(NextDay==0){
                    dia=0;
                    System.out.println("Acumulado  Venta " +AcumuladorC);
                    }
                 }while(dia!=0); 
       }   
    
    
    }
    
}
