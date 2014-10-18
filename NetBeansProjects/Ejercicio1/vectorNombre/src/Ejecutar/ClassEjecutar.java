
package Ejecutar;

import Modelo.ClassModelo;
import Vista.ClassVista;

/**
 *
 * @author bmendivelso
 */
public class ClassEjecutar {

    public static void main(String[] args) {

        Vista.ClassVista objV = new ClassVista();
        Modelo.ClassModelo objM = new ClassModelo();

        objM.llenarVector();

    }
}
