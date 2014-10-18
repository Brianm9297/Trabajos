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
public class ClaseVista {

    public int solicitarDatosInt(String dato) {

        return Integer.parseInt(JOptionPane.showInputDialog(dato));

    }

    public String solicitarDatosString(String dato) {

        return JOptionPane.showInputDialog(dato);

    }

    public void imprimirDatos(String mensaje) {

        JOptionPane.showMessageDialog(null, mensaje);

    }

}
