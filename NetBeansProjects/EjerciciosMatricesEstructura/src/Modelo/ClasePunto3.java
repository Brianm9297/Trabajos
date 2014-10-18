package Modelo;

import Vista.ClaseVista;

public class ClasePunto3 {

    Vista.ClaseVista obVista = new ClaseVista();
    Modelo.ClasePunto1 llenarMatriz = new ClasePunto1();

    private int mayorFila = 0;
    private int mayorColumna = 0;
    private String poscColumna = "";
    private String poscFila = "";

    public String getPoscColumna() {
        return poscColumna;
    }

    public String getPoscFila() {
        return poscFila;
    }

    public void setPoscColumna(String poscColumna) {
        this.poscColumna = poscColumna;
    }

    public void setPoscFila(String poscFila) {
        this.poscFila = poscFila;
    }

    public int getMayorFila() {
        return mayorFila;
    }

    public int getMayorColumna() {
        return mayorColumna;
    }

    public void setMayorFila(int mayorFila) {
        this.mayorFila = mayorFila;
    }

    public void setMayorColumna(int mayorColumna) {
        this.mayorColumna = mayorColumna;
    }

    public void punto3Ejecutar() {
        int[][] matriz = llenarMatriz.llenarMatriz();

        int[] sumaFilas = new int[llenarMatriz.getTamMatrizFilas()];
        int[] sumaColumnas = new int[llenarMatriz.getTamMatrizColumnas()];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFilas[i] += matriz[i][j];
                sumaColumnas[j] += matriz[i][j];
            }
        }

        int mayorF = 0;

        for (int i = 0; i < sumaFilas.length; i++) {
            mayorF = sumaFilas[i];
            if (mayorF > getMayorFila()) {
                setMayorFila(sumaFilas[i]);
                setPoscFila(" " + i + " ");
            }
        }

        int mayorCol = 0;
        for (int i = 0; i < sumaColumnas.length; i++) {
            mayorCol = sumaColumnas[i];
            if (mayorCol > getMayorColumna()) {
                setMayorColumna(sumaColumnas[i]);
                setPoscColumna(" " + i + " ");
            }
        }
        obVista.imprimirMatrizOriginal(matriz);
        System.out.println("");
        obVista.imprimirVector(sumaFilas);
        System.out.println("");

        for (int i = 0; i < sumaColumnas.length; i++) {
            System.out.print(" " + sumaColumnas[i] + " ");
        }

        System.out.print("\nFila " + getPoscFila() + " con Mayor Suma  " + getMayorFila());
        System.out.println("\nColumna " + getPoscColumna() + " con Mayor Suma  " + getMayorColumna());
        System.out.println("");
    }
}
