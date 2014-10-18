/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Brian Mendivelso
 */
public class VistaClase {
    
    public String solicitarString(String dato){
        return JOptionPane.showInputDialog(dato);
    }
    
    public int solicitarInt(String dato){
        return Integer.parseInt(JOptionPane.showInputDialog(dato));
    }
    
    public void imprimirInfo(String dato){
        JOptionPane.showMessageDialog(null, dato);
    }
    
}
