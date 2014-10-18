
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Brian Mendivelso
 */
public class ClaseVista {
    
    public void imprimeString(String mensajes){
        
        JOptionPane.showMessageDialog(null, mensajes);
    
    }
    
    public int solicitarInfo(String datos){
    
        String d = JOptionPane.showInputDialog(datos);
        int dato = Integer.parseInt(d);
        return dato; 
    
    }
    
    public String mostrarMenus(){
    
        String mensaje = "";
        mensaje = mensaje+" Operaciones Basicas de un vector\n";
        mensaje = mensaje+" 1* Suma\n";
        mensaje = mensaje+" 2* Ressta\n";
        mensaje = mensaje+" 3* Muiltiplicacion\n";
        mensaje = mensaje+" 4* Division\n";
        mensaje = mensaje+" 5* Salir\n";
                
       return mensaje;
        
    }
    
}
