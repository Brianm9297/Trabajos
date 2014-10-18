
package view;

import javax.swing.JOptionPane;

public class inOut {
    public int solicitarD(String m){
    return Integer.parseInt(JOptionPane.showInputDialog(m));
    }
    public void mostrarRes(){
    
    }
    public int mostrarMenu(){
        String a="";
        a=a+"Menu de Articulos\n";
        a=a+"1.  kit montaña";
        a=a+"2. Articulo dos";
        a=a+"3. Articulo dos";
        a=a+"4. Articulo dos";
        a=a+"5. Articulo dos";
        a=a+"6. Salir";
        mostrarRes(a);
        
        
    }
}
