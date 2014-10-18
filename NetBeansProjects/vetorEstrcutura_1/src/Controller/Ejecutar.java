
package Controller;

import Model.Proceso;
import View.Vista;

public class Ejecutar {
    public static void main(String[] args) {
        View.Vista obj_Vista = new Vista();
        Model.Proceso obj_Proces = new Proceso();
        obj_Vista.mostarMenu();
        obj_Proces.ingresaVector();
        obj_Vista.imprime("Resultado de los Vectores validados \n"+obj_Proces.getResultString());
     }
}
