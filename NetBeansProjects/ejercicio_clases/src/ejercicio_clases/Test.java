/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Brian Mendivelso
 */
public class Test {

    public static void main(String[] args) {
        Test onVi = new Test();
        onVi.menu();
        int opcionMenu;

        boolean valida = true;
        do {
            opcionMenu = onVi.solicitarData("Igrese opcion del menu (5 para salir )");
            if (opcionMenu > 0 && opcionMenu < 5) {
                ejecutar(opcionMenu);
                valida = true;
            }
            if (opcionMenu <= 0 && opcionMenu > 5) {
                valida = false;
            }
            if (opcionMenu == 5) {
                System.exit(0);
            }
        } while (valida == true);
    }

    public int solicitarData(String dato) {
        return Integer.parseInt(JOptionPane.showInputDialog(dato));
    }

    public void imperimirData(String data) {
        JOptionPane.showMessageDialog(null, data);
    }

    public static void ejecutar(int opcion) {
        Test onVi = new Test();
        Punto3D obPunto = new Punto3D();
        Punto3D otroPunto = new Punto3D();
        
        int numXobjetoA = 0;
        int numYobjetoA = 0;
        int numZobjetoA = 0;
        
        numXobjetoA = onVi.solicitarData("Ingrese al pirmer objeto el valor de X");
        numYobjetoA = onVi.solicitarData("Ingrese al pirmer objeto el valor de Y");
        numZobjetoA = onVi.solicitarData("Ingrese al pirmer objeto el valor de Z");
        
        obPunto.setX(numXobjetoA);
        obPunto.setY(numYobjetoA);
        obPunto.setZ(numZobjetoA);
        
        if (opcion == 3) {
            double escalar;
            escalar = onVi.solicitarData("Ingrese Escalar");
            otroPunto.setX(escalar);
            otroPunto.setY(escalar);
            otroPunto.setZ(escalar);
        }
        
        int numXobjetoB = 0;
        int numYobjetoB = 0;
        int numZobjetoB = 0;
        
        
        if (opcion != 3) {
            numXobjetoB = onVi.solicitarData("Ingrese al segundo objeto el valor de X");
            numYobjetoB = onVi.solicitarData("Ingrese al segundo objeto el valor de Y");
            numZobjetoB = onVi.solicitarData("Ingrese al segundo objeto el valor de Z");
            
        otroPunto.setX(numXobjetoB);
        otroPunto.setY(numYobjetoB);
        otroPunto.setZ(numZobjetoB);
        }
        Punto3D retorno = new Punto3D();
        String msg = "";
        
        switch (opcion) {
            case 1:        
                retorno = obPunto.sumar(otroPunto);
                msg = msg + retorno.getX()+"\n";
                msg = msg + retorno.getY()+"\n";
                msg = msg + retorno.getZ()+"\n";
                onVi.imperimirData(msg);
                break;
            case 2:
                retorno = obPunto.resta(otroPunto);
                msg = msg + retorno.getX()+"\n";
                msg = msg + retorno.getY()+"\n";
                msg = msg + retorno.getZ()+"\n";
                onVi.imperimirData(msg);
                break;
            case 3:
                retorno = obPunto.multiplicarPorEscalar(otroPunto);
                msg = msg + retorno.getX()+"\n";
                msg = msg + retorno.getY()+"\n";
                msg = msg + retorno.getZ()+"\n";
                onVi.imperimirData(msg);
                break;
                
            case 4:
                break;

        }
    }

    public void menu() {
        String mensaje = "";
        mensaje = mensaje + " Digite una Opcion\n";
        mensaje = mensaje + " 1*Sumar \n";
        mensaje = mensaje + " 2*Restar \n";
        mensaje = mensaje + " 3*Multiplicacion por Escalar\n";
        mensaje = mensaje + " 4*Producto Punto \n";
        mensaje = mensaje + " 5*Distancia al Origen\n";
        mensaje = mensaje + " 6*Calcular Distancia\n";
        mensaje = mensaje + " 7*Salir\n";
        
        imperimirData(mensaje);
    }

}
