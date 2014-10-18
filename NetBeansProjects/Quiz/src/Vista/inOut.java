
package Vista;

import javax.swing.JOptionPane;
public class inOut {
        public int solicitarD(String m){
      return  Integer.parseInt( JOptionPane.showInputDialog(m));
    }
    public void mostrarRes(String me){
        JOptionPane.showMessageDialog(null, me);
    }
    public int mostrarMenu(){
        String a="";   
        a=a+"Generos de Peliculas\n";
        a=a+ "1. Terror\n";
        a=a+ "5. Salir\n";
        mostrarRes(a);
        return solicitarD("Escoja la opción para comprar ");
    }
}
