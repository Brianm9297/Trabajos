package Modelo;

import Vista.ClaseVista;
import java.util.Arrays;

public class ClaseModelo {

    Vista.ClaseVista oVista = new ClaseVista();

    public void llenarAgenda() {
        int tamAgenda = 0;
        tamAgenda = oVista.solicitarDatosInt("Ingrese tamaño Agenda");
        String data = "";

        String[] agenda = new String[tamAgenda];
        oVista.imprimirDatos("Ahora Ingrese contactos para ser organizados");
        for (int i = 0; i < agenda.length; i++) {

            agenda[i] = oVista.solicitarDatosString("Ingrese Registro");
        }
        ordenarAgenda(agenda);
    }
    
    public void ordenarAgenda(String[] agenda){
        
        
        String msg = "";
        msg = msg +"Agenda Original "+"\n";
        for (int i = 0; i < agenda.length; i++) {
            msg = msg + agenda[i]+"\n";
        }
        
        msg = msg + "\nAgenda Organizada\n";
       
       Arrays.sort(agenda,String.CASE_INSENSITIVE_ORDER);
        
       for (int i = 0; i < agenda.length; i++) {
            msg = msg + agenda[i]+"\n"; 
        }
       
       oVista.imprimirDatos(msg);
       
    }

}
