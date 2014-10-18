
package tallerb1e;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TallerB1E {
    /*
    public void aleatotio(){
      int seleccionado = (int) Math.round((Math.random()*10)); 
      System.out.println(seleccionado);
  }
    */
    //punto 3 Tecnicas de programacion
    //tamArreglo = tamaño arreglo
    public static int sizes =0;
    public static int tamArreglo=0;
    public int  pedirDatos(String dato){
        return Integer.parseInt(JOptionPane.showInputDialog(null,dato));
    }
    
    public void imprimirDatos(String dato){
        JOptionPane.showInternalMessageDialog(null, dato);
    }
    
    public static void main(String[] args) {
            redireccion();
    }
    public static void redireccion(){
          String message = "";
             int opcion=0;
             message = message + "Bienvenido\n";
             message = message + "seleccione una opcion \n";
             message = message + "1) punto #1\n";
             message = message + "2) punto #2\n";
             message = message + "3) punto #3\n";
             message = message + "4) salir #4\n";
             message = message + " seleccione una opcion\n";
            // JOptionPane.showMessageDialog(null,message);
            opcion=Integer.parseInt(JOptionPane.showInputDialog(message));
          
            switch(opcion){
                    case 1: 
                        JOptionPane.showMessageDialog(null, "Here point one ready");
                        break;
                    case 2: 
                        JOptionPane.showMessageDialog(null, "Here point two ready");
                        break;
                    case 3:
                           int numeros=0; 
                          
                           sizes=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
                           int[] arregloOriginal= new int [sizes];
                          for (int i = 0; i < arregloOriginal.length; i++) {
                                 arregloOriginal[i]=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese dato al vector "));
                            }
                        quitarRepetidos(arregloOriginal);
                        break; 
                    case 4:
                            char[] caracterOriginal= {' ','a','h',' ',' ',' ','c'};
                               reducirEspacios(caracterOriginal);
                          break; 
                            
                     default: System.exit(0);
            }
    }
    public static void quitarRepetidos(int[] arregloOriginal){
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
        int contador=0;
        char[] caracterValida = new char[caracterOriginal.length];
        for (int i = 0; i < caracterOriginal.length; i++) {
            char c = caracterOriginal[i];
               // i=i-1;
            if(caracterOriginal[i]!=' '){
                     caracterValida[i] = caracterOriginal[i];
            }
        }
        for (int i = 0; i < caracterValida.length; i++) {
            if(caracterValida[i]!=' ') {
                System.out.println("caracater valida "+caracterValida[i]);
            }            
        }
    }
}
