package Modelo;

import Vista.ClaseVista;

public class ClasePunto6 {

    Vista.ClaseVista obVista = new ClaseVista();
    Modelo.ClasePunto1 llenarMtriz = new ClasePunto1();
///punto incompleto.....
    public void ejecutarPunto6() {
        int[][] matriz = llenarMtriz.llenarMatriz();

        
        int[] ingresaNumeros = new int[5];
        obVista.mostrar("Ingrese los numero para validar si estan el la matriz");
        
        for (int i = 0; i < ingresaNumeros.length; i++) {
            ingresaNumeros[i] = obVista.solicitarDataInt("Ingrese numero para buscar en la Matriz");
        }
        
        int[] buscarNumeros = new int[5];
        int busca = 0;
        for (int i = 0; i < matriz.length; i++) {
            busca = ingresaNumeros[i];
            for (int j = 0; j < matriz[i].length; j++) {
                
                if (busca==matriz[i][j]) {
                    buscarNumeros[i]=matriz[i][j];
                }
            }
        }
        
        obVista.imprimirMatrizOriginal(matriz);
        System.out.println("");
        obVista.imprimirVectorVertical(ingresaNumeros);
        System.out.println("");
        obVista.imprimirVectorVertical(buscarNumeros);
        System.out.println("");
        
    }

}
