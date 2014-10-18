/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejecutar;

import Modelo.ModeloClase;
import Vista.VistaClase;

/**
 *
 * @author Brian Mendivelso
 */
public class EjecutarClase {
    
    public static void main(String[] args) {
        
        Vista.VistaClase obVista = new VistaClase();
        Modelo.ModeloClase objModelo = new ModeloClase();
        
        objModelo.palabraRandom();
        
    }
    
}
