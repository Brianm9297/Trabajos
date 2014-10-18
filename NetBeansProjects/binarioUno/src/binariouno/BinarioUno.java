
package binariouno;
import javax.swing.JOptionPane;  
public class BinarioUno {

    public static void main(String[] args) {
   //Archivo: Binario.java  
        //convierte de binario a Numero
    String numero=JOptionPane.showInputDialog("Introduce un numero:");
    int num=Integer.parseInt(numero,2);      
    System.out.println("El numero en decimal es: "+num);  
 }    
}
