
package Modelo;

import Vista.ClaseVista;


public class ClasePunto7 {
    
    Vista.ClaseVista obVista = new ClaseVista();
    Modelo.ClasePunto1 llenaMatriz = new ClasePunto1();
    
    public void ejecutarMatrizTraspuesta(){
        int[][] matriz = llenaMatriz.llenarMatriz();
        obVista.imprimirMatrizOriginal(matriz);
        
        System.out.println("La matriz transpuesta es:");
        for(int j = 0; j < matriz[0].length; j++){
            for(int i = 0; i < matriz.length; i++){
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        
        
    }
    
}
