package View;

import javax.swing.JOptionPane;

public class inOut {
        
    public int pedirDatoEntero(String mensaje){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    public String pedirDatoString(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }
    public void imprimir(String dato){
        JOptionPane.showMessageDialog(null,dato);
    }
    public void imprimirEnLista(String[] dato){
        JOptionPane.showMessageDialog(null,dato);
    }
    public int mostarMenu(){
        String menu = "";
        menu = menu + "Bienvenido\n";
        menu = menu + "1 Ingrese Candidatos\n";
        menu = menu + "2 Votar\n";        
        menu = menu + "3 Salir\n\n";
        menu = menu + "Seleccione una opción";
       
        return pedirDatoEntero(menu);
     }
    
}
