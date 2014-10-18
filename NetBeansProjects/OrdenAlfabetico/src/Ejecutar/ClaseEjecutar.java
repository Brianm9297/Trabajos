
package Ejecutar;

import Modelo.ClaseModelo;
import Vista.ClaseVista;

/**
 *
 * @author Brian Mendivelso
 */
public class ClaseEjecutar {
    
    public static void main(String[] args) {
        Vista.ClaseVista objVista = new ClaseVista();
        Modelo.ClaseModelo objModelo = new ClaseModelo();
        
        objModelo.llenarAgenda();
    }
    
}
