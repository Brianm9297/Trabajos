package Modelo;

import Vista.ClaseVista;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClasePunto1 {

    Vista.ClaseVista objC_Vista = new ClaseVista();
    private int[][] aMatriz;
    private int tamMatrizFilas = 0;
    private int tamMatrizColumnas = 0;

    public int getTamMatrizFilas() {
        return tamMatrizFilas;
    }

    public int getTamMatrizColumnas() {
        return tamMatrizColumnas;
    }

    public void setTamMatrizFilas(int tamMatrizFilas) {
        this.tamMatrizFilas = tamMatrizFilas;
    }

    public void setTamMatrizColumnas(int tamMatrizColumnas) {
        this.tamMatrizColumnas = tamMatrizColumnas;
    }

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
        int tamMatrizFilas = 0;
        int tamMatrizColumnas = 0;
        try {
            objC_Vista.mostrar("Ingrese Tamaño matriz de N*M");
            tamMatrizFilas = objC_Vista.solicitarDataInt("Ingrese # Filas de la matriz");
            tamMatrizColumnas = objC_Vista.solicitarDataInt("Ingrese # Columnas de la matriz");
            
            matriz(tamMatrizFilas, tamMatrizColumnas);
            setTamMatrizColumnas(tamMatrizColumnas);
            setTamMatrizFilas(tamMatrizFilas);
        } catch (NumberFormatException noLetra) {
            objC_Vista.mostrar("Ingrese Datos Correctos");
            llenarMatriz();
        }

        boolean valida = true;
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                ///realizar las validaciones correspondientes...
                do {
                    try {
                        aMatriz[i][j] = objC_Vista.solicitarDataInt("Ingrese Numero en la poscicion " + "[" + i + "]" + "[" + j + "]");
                        if (letras(aMatriz[i][j] + "") == true) {
                            valida = false;
                        }
                        if (letras(aMatriz[i][j] + "") == false) {
                            valida = true;
                        }
                        setMatriz(aMatriz);
                    } catch (NumberFormatException noLetra) {
                        objC_Vista.mostrar("No se pueden Ingresar letras");
                        valida = false;
                    }

                } while (valida == false);

            }
        }

        return aMatriz;
    }

    public void ejecuta() {
        aMatriz = llenarMatriz();
        objC_Vista.mostrar("Matriz Original");
        objC_Vista.imprimirMatrizOriginal(aMatriz);
        System.out.println("");
        objC_Vista.mostrar("Suma de  la Matriz");
        int[][] sumaMatriz = new int[tamMatrizFilas][tamMatrizColumnas];
     
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                sumaMatriz[i][j] = aMatriz[i][j];
                sumaMatriz[i][j] += aMatriz[i][j];
                System.out.print(" " + sumaMatriz[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        objC_Vista.mostrar("Multiplicacion de  la Matriz");
        int[][] multiplicaMatris = new int[tamMatrizFilas][tamMatrizColumnas];
       
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                multiplicaMatris[i][j] = aMatriz[i][j];;
                multiplicaMatris[i][j] *= aMatriz[i][j];
                System.out.print(" " + multiplicaMatris[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean numeros(String dato) {
        boolean valida = true;
        String patron = "-[[0-9]&&[0-9]]+";
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
        String patron = "[a-z&&A-Z]";
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
