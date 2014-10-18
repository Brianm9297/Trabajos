/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Brian Mendivelso
 */
public class ClaseVista {

    public int solicitarDataInt(String data) {
        return Integer.parseInt(JOptionPane.showInputDialog(data));
    }

    public String solicitarDataString(String data) {
        return JOptionPane.showInputDialog(data);
    }

    public void mostrar(String r) {
        JOptionPane.showMessageDialog(null, r);
    }

    public void imprimirMatrizOriginal(int aMatriz[][]) {
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                System.out.print(" " + aMatriz[i][j] + " "/* + " [ "+i+" ]"+"[ "+j+" ]"*/);

            }
            System.out.println("");
        }
    }

    public void imprimirVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
                System.out.print(" " + vector[i]+ " ");
            System.out.println("");
        }
    }    

    public void imprimirVectorVertical(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
                System.out.print(" " + vector[i]+ " ");
        }
    }    
    public int mostrarM() {
        String r = "MENU DE OPCIONES \n";
        r = r + "1. Punto 1\n";
        r = r + "2. Punto 2\n";
        r = r + "3. Punto 3\n";
        r = r + "4. Punto 4\n";
        r = r + "5. Punto 5\n";
        r = r + "6. Punto 6\n";
        r = r + "7. Punto 7\n";
        r = r + "8. Punto 8\n";
        r = r + "9. Punto 9\n";
        r = r + "10. Punto 10\n";
        r = r + "11. Salir\n";
        mostrar(r);
        return solicitarDataInt("Escoja la Opción");
    }
}
