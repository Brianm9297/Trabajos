package Modelo;

import Vista.ClaseVista;
import java.util.Scanner;

public class ClasePunto8 {

    Vista.ClaseVista obVista = new ClaseVista();

    public void frase() {
        String frasef = "";
        String frase;
        frasef = obVista.solicitarDataString("Ingrese la frase");
            
        frase = frasef.toLowerCase();
        
        
        char a = 'a'; float conA =0;
        char e = 'e'; float conE =0;
        char i = 'i'; float conI =0;
        char o = 'o'; float conO =0;
        char u = 'u'; float conU =0;
        float total =0;
        
        char[] vectFrase = frase.toCharArray();
        for (int y = 0; y < vectFrase.length; y++) {
            if (a==vectFrase[y]) {
             conA++;   
            }
            if (e==vectFrase[y]) {
             conE++;   
            }
            if (i==vectFrase[y]) {
             conI++;   
            }
            if (o==vectFrase[y]) {
             conO++;   
            }
            if (u==vectFrase[y]) {
             conU++;   
            }
            if (vectFrase[y]!= ' ') {
                total++;
            }
            
        }
        for (int j = 0; j < vectFrase.length; j++) {
            System.out.print(" "+vectFrase[j]+" ");
        }
        float resultadoA = 0;
        float resultadoE = 0;
        float resultadoI = 0;
        float resultadoO = 0;
        float resultadoU = 0;
        
        if (conA!=0) {
            resultadoA = ((conA*100)/total);
        }
        if (conE!=0) {
            resultadoE = ((conE*100)/total);
        }
        if (conI!=0) {
            resultadoI = ((conI*100)/total);
        }
        if (conO!=0) {
            resultadoO = ((conO*100)/total);
        }
        if (conU!=0) {
            resultadoU = ((conU*100)/total);
        }
        System.out.println();
        System.out.println(" la vocal "+a+" se repite "+conA +" Frecuencia " + resultadoA+"%");
        System.out.println(" la vocal "+e+" se repite "+conE +" Frecuencia " + resultadoE+"%");
        System.out.println(" la vocal "+i+" se repite "+conI +" Frecuencia " + resultadoI+"%");
        System.out.println(" la vocal "+o+" se repite "+conO +" Frecuencia " + resultadoO+"%");
        System.out.println(" la vocal "+u+" se repite "+conU +" Frecuencia " + resultadoU+"%");
        System.out.println(" Total letras  "+total);
        

        
        System.out.println("");
    }

}
