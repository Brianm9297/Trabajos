

package Modelo;

import Vista.ClaseVista;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ClasePunto4 {
    
    Vista.ClaseVista obVista = new ClaseVista();
    private int tamMatriz = 0;
    
    
    public int getTamMatriz() {
        return tamMatriz;
    }

    public void setTamMatriz(int tamMatriz) {
        this.tamMatriz = tamMatriz;
    }
    
    public void diagonalSecundaria(){
      Modelo.ClasePunto4 llenarMatrizz = new ClasePunto4();
        int[][] matriz = llenarMatrizz.llenarMatriz();
        
        int[] diagonalsecundaria = new int [matriz.length];   
        int n = diagonalsecundaria.length;
        for (int i = 0; i < matriz.length; i++) {
            diagonalsecundaria[i]=matriz[i][(n-1)-i];
        }
        obVista.imprimirMatrizOriginal(matriz);
        System.out.println("\nDiagonal Secundaria");
        for (int i = 0; i < diagonalsecundaria.length; i++) {
            System.out.print(" "+diagonalsecundaria[i]+" ");
        }
        System.out.println("");
    }
    public int[][] llenarMatriz() {
        
        tamMatriz = obVista.solicitarDataInt("Ingrese Tamaño matriz de N*N");
        setTamMatriz(tamMatriz);
        int[][] aMatriz = new int[tamMatriz][tamMatriz];
        boolean valida = true;
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz.length; j++) {
                      do {
                    try {
                        aMatriz[i][j] = obVista.solicitarDataInt("Ingrese Numero en la poscicion " + "[" + i + "]" + "[" + j + "]");
                        if (letras(aMatriz[i][j] + "") == true) {
                            valida = false;
                        }
                        if (letras(aMatriz[i][j] + "") == false) {
                            valida = true;
                        }
                    } catch (NumberFormatException noLetra) {
                        obVista.mostrar("No se pueden Ingresar letras");
                        valida = false;
                    }

                } while (valida == false);
            }
        }
        return aMatriz;
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
