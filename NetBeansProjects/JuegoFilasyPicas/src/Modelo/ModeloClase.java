package Modelo;

/**
 *
 * @author Brian Mendivelso
 */
import Vista.VistaClase;
import java.util.Random;

public class ModeloClase {

    Vista.VistaClase objVista = new VistaClase();
    private int vidas = 5;
    public void palabraRandom() {
        String dictionaryWord = "";
        // las palabras claves seran equipos de futbol
        /*String dictionary[]
         = {"santafe", "medellin", "oncecaldas", "cali", "envigado", "patriotas", "nacional", "alianza",
         "tolima", "aguilasdoradas", "chico", "junior", "huila", "pasto", "millonarios", "fortaleza", "uniautonoma",
         "equidad"
         };*/
        String dictionary[]
         = {"foto", "foto", "foto", "foto", "foto", "foto", "foto", "foto",
         "foto", "foto", "foto", "foto", "foto", "foto", "foto", "foto", "foto",
         "foto"
         };
        Random r = new Random();
        dictionaryWord = dictionary[r.nextInt(dictionary.length)];
        
        ejecutar(dictionaryWord);
    }

    public void ejecutar(String palabra) {
        objVista.imprimirInfo(palabra);
        char[] charPalabraOriginal = palabra.toCharArray();
        setVidas(palabra.length()+2);
        int cantidadMaximaLetras = palabra.length();
        String palabraUsuario = "";
        palabraUsuario = objVista.solicitarString("Ingrese la palabra para empezar a Jugar \ndebe contener  " + cantidadMaximaLetras + "  caracteres");
        palabraUsuario = palabraUsuario.toLowerCase();
        
        boolean valida = true;
        do {

            if (palabraUsuario.length() == cantidadMaximaLetras) {
                objVista.imprimirInfo("Palabra Valida(OK) en cantidad de carateres permitidos");
                valida = true;
            }

            if (palabraUsuario.length() < cantidadMaximaLetras) {
                objVista.imprimirInfo("la palabra ingresada debe ser al informado  " + cantidadMaximaLetras);
                valida = false;
                palabraUsuario = objVista.solicitarString("Ingrese la palabra para empezar a Jugar \ndebe contener  " + cantidadMaximaLetras + "  caracteres");
            }

            if (palabraUsuario.length() > cantidadMaximaLetras) {
                objVista.imprimirInfo("la palabra no puede superar a los caracteres informados " + cantidadMaximaLetras);
                valida = false;
                palabraUsuario = objVista.solicitarString("Ingrese la palabra para empezar a Jugar \ndebe contener  " + cantidadMaximaLetras + "  caracteres");
            }

        } while (valida == false);
        palabraUsuario = palabraUsuario.toLowerCase();
        char[] charPalabraUsuario = palabraUsuario.toCharArray();
        char[] linea = new char[cantidadMaximaLetras];

        String stringUsuario = "";
        for (int i = 0; i < charPalabraUsuario.length; i++) {
            stringUsuario = stringUsuario + " " + charPalabraUsuario[i] + " ";
        }
        stringUsuario = stringUsuario + "\n";

        for (int i = 0; i < linea.length; i++) {
            linea[i] = '_';
        }
        int contarFilas = 0;
        int contarPicas = 0;
        int contarRepetidos = 0;
        int resta = 0;

        for (int z = 0; z < charPalabraUsuario.length; z++) {
            for (int d = z + 1; d < charPalabraUsuario.length; d++) {
                if (charPalabraUsuario[d] == charPalabraUsuario[z]) {
                    contarRepetidos++;
                }
            }
        }
        
        for (int i = 0; i < charPalabraOriginal.length; i++) {
            if (charPalabraOriginal[i] == charPalabraUsuario[i]) {
                linea[i] = charPalabraUsuario[i];
                if (linea[i] == charPalabraOriginal[i]) {
                    contarFilas++;
                }
            }
        }
        for (int i = 0; i < charPalabraOriginal.length; i++) {
            if (charPalabraOriginal[i] != charPalabraUsuario[i]) {
                linea[i] = charPalabraUsuario[i];
                if (linea[i] != charPalabraOriginal[i]) {
                        contarPicas++;
                }
            }
        }

        stringUsuario = stringUsuario + "\n usted tiene " + contarFilas + " fijas(s)";
        stringUsuario = stringUsuario + "\n usted tiene " + contarPicas + " pica(s)";
        objVista.imprimirInfo(stringUsuario);

        if (contarFilas != palabra.length()) {
            vidas = (vidas-1);
            setVidas(vidas);
            objVista.imprimirInfo("usted tiene  "+getVidas()+" vida(s)");
            if (getVidas()==0) {
                objVista.imprimirInfo("intentos finalizados");
                System.exit(0);
            }
            ejecutar(palabra);
            
        } else {
            objVista.imprimirInfo("Felicidades la palabra es correcta");
        }
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getVidas() {
        return vidas;
    }
    
}
