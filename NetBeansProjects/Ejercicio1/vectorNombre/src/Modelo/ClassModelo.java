package Modelo;

/**
 *
 * @author bmendivelso
 */
import Vista.ClassVista;
import javax.swing.JOptionPane;

public class ClassModelo {

    Vista.ClassVista objVista = new ClassVista();

    public void llenarVector() {

        String nombreApellido = "";

        nombreApellido = objVista.solicitarIformacionStr("Ingrese el nombre");
        nombreApellido = nombreApellido + " ";
        objVista.imprimir(nombreApellido);

        char[] vectorNombre = nombreApellido.toCharArray();

        validarVector(vectorNombre);
    }

    public void validarVector(char[] vectorNombre) {
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        int contarEspacios = 0;

        int contarNombre = 0;
        String N1 = "";
        int contarSegundoNombre = 0;
        String N2 = "";
        int contarPrimerApellido = 0;
        String N3 = "";
        int contarSegundoApellido = 0;
        int contarVocales = 0;
        String N4 = "";
        String msg = "";
        for (int i = 0; i < vectorNombre.length; i++) {
            msg = msg + " " + vectorNombre[i] + " ";
            if (vectorNombre[i] == ' ') {
                //vectorNombre[i] = '-';
                contarEspacios++;
            }
            // validar el primer nombre
            if (contarEspacios == 0 && vectorNombre[i] != ' ') {
                contarNombre++;
                N1 = N1 + vectorNombre[i];
            }
            if (contarEspacios == 1 && vectorNombre[i] != ' ') {
                contarSegundoNombre++;
                N2 = N2 + vectorNombre[i];
            }
            if (contarEspacios == 2 && vectorNombre[i] != ' ') {
                contarPrimerApellido++;
                N3 = N3 + vectorNombre[i];
            }
            if (contarEspacios == 3 && vectorNombre[i] != ' ') {
                contarSegundoApellido++;
                N4 = N4 + vectorNombre[i];
            }

            for (int j = 0; j < vocales.length; j++) {
                if (vectorNombre[i]==vocales[j]) {
                    contarVocales++;
                }
            }
        }

        if (contarNombre != 0) {
            msg = msg + "\n" + N1 + ": " + contarNombre + "\n";
        }
        if (contarSegundoNombre != 0) {
            msg = msg + "" + N2 + ": " + contarSegundoNombre + "\n";
        }

        if (contarPrimerApellido != 0) {
            msg = msg + "" + N3 + ": " + contarPrimerApellido + "\n";
        }
        if (contarSegundoApellido != 0) {
            msg = msg + "" + N4 + ": " + contarSegundoApellido + "\n";
        }
        
        msg = msg +"Cantidad Vocales "+contarVocales+"\n";
        objVista.imprimir(msg);

    }

}
