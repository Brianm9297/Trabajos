
package Controlador;

import Modelo.ProcesoDatos;
import Vista.VistaDatos;

public class EjecucionDatos {
    public static void main(String[] args) {
        Vista.VistaDatos objVista = new VistaDatos();
        Modelo.ProcesoDatos objModelo = new ProcesoDatos();  
        objVista.MenuPrincipal();
        objModelo.vectorPalabraClave();
    }
    
}
