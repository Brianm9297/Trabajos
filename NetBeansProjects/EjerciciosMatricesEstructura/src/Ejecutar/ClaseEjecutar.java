
package Ejecutar;

import Modelo.ClaseRedireccion;
import Vista.ClaseVista;


public class ClaseEjecutar {
    
    public static void main(String[] args) {
        Vista.ClaseVista  ob_Vista = new ClaseVista();
        Modelo.ClaseRedireccion obj_red = new ClaseRedireccion();
        
        obj_red.redireccionAClases();
    }
}
