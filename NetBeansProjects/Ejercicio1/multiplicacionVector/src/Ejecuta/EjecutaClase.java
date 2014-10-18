package Ejecuta;

import Modelo.ModeloClase;
import Vista.VistaClase;

/**
 *
 * @author bmendivelso
 */
public class EjecutaClase {

    public static void main(String[] args) {

        Vista.VistaClase objV = new VistaClase();
        Modelo.ModeloClase objM = new ModeloClase();

        objM.llenarVector();

    }

}
