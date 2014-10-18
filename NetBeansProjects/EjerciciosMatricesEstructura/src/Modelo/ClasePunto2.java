package Modelo;

import Vista.ClaseVista;
import java.util.Scanner;

public class ClasePunto2 {

    Vista.ClaseVista obVista = new ClaseVista();
    Modelo.ClasePunto1 llenarMatriz = new ClasePunto1();
    private int numMayor = 0;
    private int numMenor = 0;
    private String poscMayor = "";
    private String poscMenor = "";

    public String getPoscMayor() {
        return poscMayor;
    }

    public String getPoscMenor() {
        return poscMenor;
    }

    public void setPoscMayor(String poscMayor) {
        this.poscMayor = poscMayor;
    }

    public void setPoscMenor(String poscMenor) {
        this.poscMenor = poscMenor;
    }

    public void setNumMayor(int numMayor) {
        this.numMayor = numMayor;
    }

    public int getNumMayor() {
        return numMayor;
    }

    public void setNumMenor(int numMenor) {
        this.numMenor = numMenor;
    }

    public int getNumMenor() {
        return numMenor;
    }

    public void punto2Ejecutar() {
        String msg = "";
        msg = msg + "Punto 2 \n";
        msg = msg + "Determinar el Numero mayor \n";
        msg = msg + "y el Numero menor de una Matriz \n";
        obVista.mostrar(msg);
        int[][] matrizOriginal = llenarMatriz.llenarMatriz();

        int mayor = 0;
        int menor = 999999999;
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                mayor = matrizOriginal[i][j];
                if (mayor > getNumMayor()) {
                    setNumMayor(matrizOriginal[i][j]);
                    setPoscMayor("[" + i + "][" + j + "]");
                }
                menor = matrizOriginal[i][j];
                if (menor < getNumMenor()) {
                    setNumMenor(matrizOriginal[i][j]);
                    setPoscMenor("[" + i + "][" + j + "]");
                }
            }
        }

        System.out.println("Matriz Original\n");
        obVista.imprimirMatrizOriginal(matrizOriginal);
        System.out.println("\nNumero Mayor de la Matriz " + getNumMayor() + " en la posicion " + getPoscMayor());
        System.out.println("\nNumero Menor de la Matriz " + getNumMenor() + " en la posicion  " + getPoscMenor());
    }

}
