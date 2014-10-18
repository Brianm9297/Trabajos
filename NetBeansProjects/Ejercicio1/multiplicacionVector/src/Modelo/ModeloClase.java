
package Modelo;

import Vista.VistaClase;

public class ModeloClase {

    Vista.VistaClase objV = new VistaClase();

    public void llenarVector() {

        String msg = "Multiplicacion de un vector\n";
        int cantidad = 0;
        msg = msg + "Ingrese tamaño vector";
        cantidad = objV.solicitarIformacion(msg);

        int[] numeros = new int[cantidad];
        String msg2 = "";
        int resultado = 1;
        
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = objV.solicitarIformacion("ingrese dato en la poscicion " + (i + 1));
            resultado *= numeros[i]; 
        }
        validaOperaVector(numeros,resultado);
    }

    public void validaOperaVector(int[] numeros,int resultado) {

        String res = "";
        res = res + "vector\n";
        for (int i = 0; i < numeros.length; i++) {
            res = res +"[ "+numeros[i]+" ]";
        }
        
        res = res +"\nResultado de la multiplicaion\n"+resultado;
        objV.imprimir(res);
    }

}
