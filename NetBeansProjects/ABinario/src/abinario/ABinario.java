
package abinario;

import javax.swing.JOptionPane;

public class ABinario {
    public static void main(String[] args) {
            
     String numero = JOptionPane.showInputDialog("Introduzca el numero Decimal:");  
     int num = Integer.parseInt(numero);
     String binario = Integer.toBinaryString(num);
     System.out.println("El numero en binario es: "+binario);
    }
    
}
