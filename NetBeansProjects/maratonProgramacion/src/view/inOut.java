
package view;

import javax.swing.JOptionPane;

public class inOut {
    public int solicitarN(String n){
       return Integer.parseInt(JOptionPane.showInputDialog(n));
    }
    public void mostrarP(String n){
    JOptionPane.showMessageDialog(null, n);
    }
    public int mostrarMen(){
    String mensaje="";
    mensaje=mensaje+" Menu \n";
    mensaje=mensaje+" Seleccion de Equipo \n";
    mensaje=mensaje+" 1) Equipo #A \n";
    mensaje=mensaje+" 2) Equipo #B \n";
        mostrarP(mensaje);
    return solicitarN("Elija una Opcion");
    
    }
}
