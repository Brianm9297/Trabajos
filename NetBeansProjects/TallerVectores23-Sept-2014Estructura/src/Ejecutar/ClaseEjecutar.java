/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejecutar;

import Modelo.ClaseProceso;
import Vista.ClaseVista;

/**
 *
 * @author Brian Mendivelso
 */
public class ClaseEjecutar {
    public static void main(String[] args) {
        Vista.ClaseVista objVista = new ClaseVista();
        Modelo.ClaseProceso obj_Proceso = new ClaseProceso();
        
        obj_Proceso.redireccionarMenu();
    }
}
