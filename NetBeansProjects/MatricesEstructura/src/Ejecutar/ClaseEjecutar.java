
package Ejecutar;

import Modelo.ClaseModelo;

import Vista.ClaseVista;

/**
 *
 * @author Brian Mendivelso
 */
public class ClaseEjecutar {
    
    public static void main(String[] args) {
        Vista.ClaseVista objC_Vista = new ClaseVista();
        Modelo.ClaseModelo objC_Modelo = new ClaseModelo();
        objC_Modelo.ejecuta();
                
        
        
        
    }
    
}
