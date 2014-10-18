
package Controlador;

import Vista.View;

public class Execute {
    public static void main(String[] args) {
        View obj=new View();
        Modelo.Process obj2=new Modelo.Process();
            obj2.back();
        obj.mostrar("Resultado Media "+obj2.getMedia()+"\nEl Resultadonde la Moda "+obj2.getLista());
        
        
    }
}
