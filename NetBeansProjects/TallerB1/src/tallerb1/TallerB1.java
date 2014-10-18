package tallerb1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TallerB1 {
    
    
    public static int sizes=0;
    
    public static void main(String[] args) {
     int resp;
     Scanner leer = new Scanner(System.in);
     System.out.println("Seleccione una Opcion");
                 System.out.println("1) Punto 1 #1");
                 System.out.println("2) Punto 2 #2");
                 System.out.println("3) Punto 3 #3");
                 System.out.println("4) Punto #4");
                 System.out.println("5) Punto #5");
    resp=leer.nextInt();
                switch(resp){
                        case 1:
                            int id = 1;  
                            minMaCentinela(id);
                        break;    
                        case 2:
                            int id2 = 2;  
                            imprimirArreglo2D(id2);
                        break;
                        case 3:
                            int id3 = 3;
                            System.out.println("ingreso de tamño de Arreglo");
                            sizes=leer.nextInt();
                            int []arregloOriginal = new int [sizes];
                            for (int llena = 0; llena < arregloOriginal.length; llena++){
                                System.out.print("llenar arreglo ");
                                arregloOriginal[llena]=leer.nextInt();
                            
                            }
                            quitarRepetido(arregloOriginal);
                            
                        break; 
                        case 4:
                            //System.out.println("ingreso de tamaño vector");
                            //sizes=leer.nextInt();
                            char[] caracterOriginal = {' ','a','h',' ',' ',' ','c'};
                            reducirEspacios(caracterOriginal);
                        break; 
                         default: System.exit(0);
                }
    }
    
   public static void minMaCentinela(int a){
        int ingresoNum=0;
        Scanner leer = new Scanner(System.in);
        int valor = 999999999;
        int mayor= valor;
        int menor= valor;
        do{
            
            System.out.println("Ingreso de Numeros");
            ingresoNum=leer.nextInt();
            
            if (ingresoNum != -99) {
                if(menor==valor) {
                  menor=ingresoNum;  
                }
                if(mayor==valor) {
                  mayor=ingresoNum;  
                }
                if (ingresoNum<menor) {
                    menor=ingresoNum;
                }
                if (ingresoNum>mayor) {
                    mayor=ingresoNum;
                }
            }
            
        }while(ingresoNum!=-99);
        
        if (ingresoNum == -99 && mayor == valor && menor == valor) {
            System.out.println("No ingreso ningun Numero");
        }
        if (mayor!=valor || menor!=valor ) {
        System.out.println("Mayor es "+mayor);
        System.out.println("Menor es "+menor);
        }
    }
   
   public static void imprimirArreglo2D(int b) {
    //int array1[][]= new int [10][5];
    int array1[][]=new int [10][];
    array1[0] = new int[1];
    array1[1] = new int[2];
    array1[2] = new int[3];
    array1[3] = new int[4];
    array1[4] = new int[5];
    array1[5] = new int[5];
    array1[6] = new int[4];
    array1[7] = new int[3];
    array1[8] = new int[2];
    array1[9] = new int[1];
    System.out.println("\nArray\n");
        outputArray(array1);
    }
   
   public static void outputArray(int array[][]) {
       System.out.println("    0  1  2  3  4");
       for (int filas = 0; filas < array.length; filas++){
           System.out.println("\t");
            System.out.printf(" %d ",filas);
           for (int columnas = 0; columnas < array[filas].length; columnas++) {
            array[filas][columnas]=(filas);
            if(array[1][1]==1){
                array[filas][columnas]=(filas);
            }    
               if (columnas==1) {
                   array[filas][columnas]=filas+columnas;
               }
               if (filas==8 && columnas==1) {
                   array[filas][columnas]=8;
               }
               if (columnas==2) {
                   array[filas][columnas]=filas+columnas;
               }if (filas==7 && columnas==2) {
                   array[filas][columnas]=7;
               }
               if (columnas==3) {
                   array[filas][columnas]=filas+columnas;
               }if (filas==6 && columnas==3) {
                   array[filas][columnas]=6;
               }
               if(filas==3 && columnas==3){
               array[filas][columnas]=3;
               }
               if(filas==2 && columnas==2){
               array[filas][columnas]=2;
               }
               if(filas==1 && columnas==1){
               array[filas][columnas]=1;
               }
               System.out.printf(" %d ",array[filas][columnas]);
           }
       }
       System.out.println("\n");
    }
   
   public static void quitarRepetido(int[] arregloOriginal){
       
        int[] arregloValida = new int [sizes];
        int[] arrFinal= new int [sizes];
        int cont,num,i,j=0,k,z=0;
        
        for ( i = 0; i < arregloOriginal.length; i++) {
            cont=0;
            num=arregloOriginal[i];
            arregloValida[j]=num;
            j++;
            for (k = 0; k < arregloOriginal.length; k++) {
                if (arregloValida[k]==num){
                    cont++;
                }
            }
             if(cont==1){
                    arrFinal[z]=num;
                    z++;
            }
        }
        for (i = 0; i < z; i++) {
            System.out.println(" "+arrFinal[i]);
        }
   }
   
   public static void reducirEspacios(char[] caracterOriginal){
   //contar  vacios 
       //verificar si la candiddad de vacios entre letar es mayor a uno es
       //falso
       //de lo contario si y solo si ahí un espaco entre letras es verdadero
       //boolean vacio = false;
       int contador = 0;
       
       int j=0;
       
       char[] caracterValida = new char[caracterOriginal.length];
       
       for(int i = 0; i < caracterOriginal.length; i++){
            if(caracterOriginal[i]==' '){
                    contador++;
                    if (contador>1) {
                        caracterValida[j] = caracterOriginal[(i-1)];
                        j++;
                    }   
            }
            if(contador==1){
                caracterValida[j] = caracterOriginal[i];
                j++;      
            }
            
       }
       
       char[] caracteFinal = caracterValida;
       for (int i = 0; i < caracteFinal.length; i++) {
           System.out.println(""+caracteFinal[i]);
       }
       
   }
}
