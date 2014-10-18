package Modelo;

import Vista.ClaseVista;

public class ClasePunto5 {

    Vista.ClaseVista obVista = new ClaseVista();
    Modelo.ClasePunto1 llenarMatriz = new ClasePunto1();

    public void ejecutarPunto5() {
        int[][] matriz = llenarMatriz.llenarMatriz();

        int cero=0;
        int negativo = 0;
        int positivo = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                if (matriz[i][j]==0) {
                    cero++;
                }
                
                if (matriz[i][j]>0) {
                    positivo++;
                }
                
                if (matriz[i][j]<0) {
                    negativo++;
                }
                
            }
        }
        obVista.imprimirMatrizOriginal(matriz);
        System.out.println(" cantidad de Ceros "+cero);
        System.out.println(" cantidad de Positivos "+positivo);
        System.out.println(" cantidad de Negativos "+negativo);
    
    }

}
