/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author bmendivelso
 */
public class VistaClase {

    public int solicitarIformacion(String dato) {
        return Integer.parseInt(JOptionPane.showInputDialog(dato));
    }

    public String solicitarIformacionStr(String dato) {
        return JOptionPane.showInputDialog(dato);
    }

    public void imprimir(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}
