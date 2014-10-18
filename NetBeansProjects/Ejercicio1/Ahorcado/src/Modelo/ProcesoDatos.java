

package Modelo;

import Vista.VistaDatos;
import javax.swing.JOptionPane;

public class ProcesoDatos {
    Vista.VistaDatos objeto_vista = new VistaDatos();
    
    public void vectorPalabraClave(){
        char[] palabraClave = {'c','l','a','v','e'};
        char[] encriptaPalabra = {'*','*','*','*','*'}; 
        validaComparar(palabraClave, encriptaPalabra);
    }
    //public void vectorc
    public void validaComparar(char[] palabaClave,char[] palabraEncripta){
        String encripta = "";
        for (int i = 0; i < palabraEncripta.length; i++) {
            encripta = encripta +" "+palabraEncripta[i]+" ";
        }
        objeto_vista.imprimirString(encripta);  
        char  letra = ' ';
        //contador = intentos
        int cont=0;
        do {  
            objeto_vista.imprimirString("Ingrese letra");
           letra = JOptionPane.showInputDialog(null," Ingrese la letra ").charAt(0); 
            for (int i = 0; i < palabaClave.length; i++) {
                if(letra==palabaClave[i]){
                  palabraEncripta[i]=letra;  
                }
            }
            cont++;
        }while (cont==10);
        imprimeVector(palabraEncripta);
    }
    public void imprimeVector(char[] vectorDesenciptando){
        
        String palabra="";
        for (int i = 0; i < vectorDesenciptando.length; i++) {
            palabra = palabra +" "+vectorDesenciptando[i]+" ";
        }
        objeto_vista.imprimirString(palabra);
        vectorPalabraClave();
    }
   
    
}
