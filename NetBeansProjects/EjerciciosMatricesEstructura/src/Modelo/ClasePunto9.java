

package Modelo;

import Vista.ClaseVista;


public class ClasePunto9 {
    
    Vista.ClaseVista obVista = new ClaseVista();
    
    public void ejecutarPunto9(){
        
        String frase = obVista.solicitarDataString("Ingresar frase");
        String[] miArray;
        miArray = frase.split(" +");
        
        for (String palabra : miArray) {
            System.out.println(palabra + " : "+ (palabra.length()));
        }
        
        
    }
    
}
