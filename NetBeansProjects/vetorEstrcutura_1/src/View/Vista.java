

package View;

import javax.swing.JOptionPane;

public class Vista {
    
    public int pedirDatoEntero(String dato){
        return Integer.parseInt(JOptionPane.showInputDialog(dato));
    }
    public String pedirDatoString(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }
    public void imprime(String dato){
    JOptionPane.showMessageDialog(null, dato);
    } 
    
    public void mostarMenu(){
        String menuPrincipal = "";
        menuPrincipal =menuPrincipal+" Bienvenido\n";
        menuPrincipal =menuPrincipal+" Ejercicio Clase\n";
        imprime(menuPrincipal);
    }
}
