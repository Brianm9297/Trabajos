package Modelo;

import Vista.ClaseVista;

public class ClaseModelo {

    Vista.ClaseVista objC_Vista = new ClaseVista();
    private String[][] aMatriz;

    public String[][] getmatriz() {
        return aMatriz;
    }

    public void setmatriz(String[][] valor) {
        aMatriz = valor;
    }

    public void matriz(int m) {
        aMatriz = new String[m][m];
    }

    public void ejecuta() {

        int tamMatriz = 0;
        tamMatriz = objC_Vista.solicitarDataInt("Ingrese tamaño matriz");
        matriz(tamMatriz);
//leer sobre listas
        //leer expresiones regulares
        //leer exepciones
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz.length; j++) {
                aMatriz[i][j] = "*";//objC_Vista.solicitarDataString("Ingrese Data " + "[" + i + "]" + "[" + j + "]");
                if (tamMatriz<5) {
                    aMatriz[(i + 1)][(j+1)] = " ";
                }
                
                setmatriz(aMatriz);
            }
        }

        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz.length; j++) {
                System.out.print("" + aMatriz[i][j] + "");

            }
            System.out.println("");
        }
    }
}
