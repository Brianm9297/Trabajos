
package Vista;

import javax.swing.JOptionPane;

public class VistaDatos {
    
    
    public int  entradaDatos(String dato){
        return Integer.parseInt(JOptionPane.showInputDialog(dato));
    }
   
    public void imprimirString(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public void MenuPrincipal(){
        String mensaje = "";
        mensaje = mensaje + "Bienvenido\n";
        mensaje = mensaje + "Juego del Ahoracado\n";
        imprimirString(mensaje);
    }
}
