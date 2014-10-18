
package Model;

import View.Vista;

public class Proceso {
 View.Vista obj_Vista = new Vista();
 
 public int tamVector;
 public String resultString="";
 
    public void ingresaVector(){
        tamVector=obj_Vista.pedirDatoEntero("Ingrese el tamaño del vector");
        int[] numeroVecto = new int [tamVector];
        while (validarP_info(tamVector)==false) {            
            tamVector=obj_Vista.pedirDatoEntero("Ingrese Numero Mayor a  0");
        }
        for (int i = 0; i < numeroVecto.length; i++) {
            numeroVecto[i]=obj_Vista.pedirDatoEntero("Igrese valor Numerico");
        }
        validarVector(numeroVecto);
    }
    public void validarVector(int[] vectorAvalidar){
        //vector del resultado de los numeros pares
        //vector al sumarles el 2 a los impares
        int[] vectoResultadoPares = new int [vectorAvalidar.length];
        int[] vectorResultadoImpares = new int [vectorAvalidar.length];
        for (int i = 0; i < vectorAvalidar.length; i++) {
            if (vectorAvalidar[i]%2==0) {
                vectoResultadoPares[i]=(vectorAvalidar[i]*-1);
            }else{
                vectorResultadoImpares[i]=(vectorAvalidar[i]+2);
            }
        }
        imprimirResultadoVectores(vectorAvalidar,vectoResultadoPares, vectorResultadoImpares);
    }
    public void imprimirResultadoVectores(int[] vectorOriginal,int[] vectorResultadoPares,int[] vectorResultadoImpares){
        String listaNumerosPrincipal="";
        String listaNumerosA="";
        String listaNumerosB="";
        String ResultadoFinal="";
        for (int i = 0; i < vectorOriginal.length; i++) {
            listaNumerosPrincipal=listaNumerosPrincipal+vectorOriginal[i]+"\n";
        }
        for (int i = 0; i < vectorResultadoPares.length; i++) {
            listaNumerosA =listaNumerosA+vectorResultadoPares[i]+"\n";
        }
        for (int i = 0; i < vectorResultadoImpares.length; i++) {
            listaNumerosB = listaNumerosB + vectorResultadoImpares[i]+"\n";
        }
        ResultadoFinal=ResultadoFinal+"Principal\n"+listaNumerosPrincipal+"\n"+"vect Pares"+"\n"+listaNumerosA+"\n"+" veect Impares "+"\n"+listaNumerosB+"\n";
        resultString=ResultadoFinal;
    }
    
     public boolean validarP_info(int validar){
        if (validar>0){
            return  true;
        } else {
            return false;
        }
    }

    public String getResultString() {
        return resultString;
    }
     
}
