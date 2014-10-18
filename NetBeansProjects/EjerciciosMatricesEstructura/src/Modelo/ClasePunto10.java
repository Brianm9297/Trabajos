package Modelo;

import Vista.ClaseVista;
import java.util.regex.Pattern;
import java.util.regex.*;

public class ClasePunto10 {

    Vista.ClaseVista objC_Vista = new ClaseVista();
    private int[][] aMatriz;

    public int[][] getmatriz() {
        return aMatriz;
    }

    public void setMatriz(int[][] valor) {
        aMatriz = valor;
    }

    public void matriz(int filas, int columnas) {
        aMatriz = new int[filas][columnas];
    }

    public int[][] llenarMatriz() {
        objC_Vista.mostrar("Cuadrado Magico 3X3");
        matriz(3, 3);

        boolean vali = true;

        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                do {
                    try {
                        aMatriz[i][j] = objC_Vista.solicitarDataInt("Ingrese Numero en la poscicion " + "[" + i + "]" + "[" + j + "]");
                        if (numeros(aMatriz[i][j] + "") == true) {
                            vali = true;
                        }
                        if (numeros(aMatriz[i][j] + "") == false) {
                            objC_Vista.mostrar("registro no valido.. los numeros deben ser entre 0 y 9 ");
                            vali = false;
                        }
                        setMatriz(aMatriz);
                    } catch (NumberFormatException noLetra) {
                        objC_Vista.mostrar("No se pueden Ingresar letras");
                        vali = false;
                    }

                } while (vali == false);

            }
        }
        return aMatriz;
    }

    public void ejecutar() {
        ///incompleto.......................   
        int[][] matriz = llenarMatriz();
        objC_Vista.imprimirMatrizOriginal(aMatriz);
        int[] sumaFilas = new int[3];
        int[] sumaColumnas = new int[3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFilas[i] += matriz[i][j];
                sumaColumnas[j] += matriz[i][j];
            }
        }

        for (int i = 0; i < sumaFilas.length; i++) {
            if (sumaFilas[i] == 15) {
                System.out.print("Filas " + i+" ");
                System.out.print(" " + sumaFilas[i] + " ");
            } else {
                System.out.print("Filas " + i + " ");
                System.out.print(" " + sumaFilas[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < sumaColumnas.length; i++) {
           if (sumaColumnas[i] == 15) {
                System.out.print("Columnas " + i+" ");
                System.out.print(" " + sumaColumnas[i] + " ");
            } else {
                System.out.print("Columnas " + i + " ");
                System.out.print(" " + sumaColumnas[i] + " ");
            }
        }
  
        System.out.println();
    }

    public boolean numeros(String dato) {
        boolean valida = true;
        String patron = "[0-9]";
        Pattern p1 = Pattern.compile(patron);
        String datos = dato;
        Matcher m = p1.matcher(datos);
        if (m.matches()) {
            valida = true;
        } else {
            valida = false;
        }
        return valida;
    }

    public boolean letras(String dato) {
        boolean valida = true;
        String patron = "[^abc]||[^a-z]";
        Pattern p1 = Pattern.compile(patron);
        String datos = dato;
        Matcher m = p1.matcher(datos);
        if (m.matches()) {
            valida = true;
        } else {
            valida = false;
        }
        return valida;
    }
}
