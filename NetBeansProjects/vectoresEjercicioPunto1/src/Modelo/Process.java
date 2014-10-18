
package Modelo;

import Vista.View;
import java.util.Arrays;
public class Process {
    public int sizes=0;
    View obj=new View();
    public void back(){
    sizes = obj.menuM();
        ejecutarMenu(sizes);
    }
    
    public String listas="";
    public float media=0;
    public int[] mediana = new int[1];
    public int[] modaRecibe = new int [sizes];
    
    public float suma=0;
    public void ejecutarMenu(int sizesVect) {
      int []vect=new int [sizesVect];
        obj.mostrar("Ingrese los datos al vector ");
        for (int llenar = 0; llenar < vect.length; llenar++) {
            vect[llenar]=obj.solicitaData("Ingrese Dato al Vector");
        }
      int[]vectMedia=vect;
      int[]vectMediana=vect;
      int[]vectModa=vect;
      //obtiene la media
        for (int recorrer = 0; recorrer < vectMedia.length; recorrer++) {
            suma=suma+vectMedia[recorrer];
        }
        //ordena el arreglo para tolmar  la mediana
        int divTamaArreglo=0;
        int divtamMenosUno=0;
        for (int medianaOrdena = 0; medianaOrdena < vectMediana.length; medianaOrdena++) {
            Arrays.sort(vectMediana);
            //validar si es par  o no lo es para dividir la mediana el tamaño del vector
            if(sizes%2==0){
                divTamaArreglo=(sizes/2);
                divtamMenosUno=(medianaOrdena-1);
                vectMediana[divTamaArreglo]=medianaOrdena;
                
              }else{
                divTamaArreglo=(sizes/2);
                
            }
        }
        obj.imprimeNum(vectMediana[divTamaArreglo]);
        //hallar la moda es la cantida de veces que se repite un numero en un vector
        int maximaVecesQueSeRepite = 0; 
        int[] moda = new int [5]; 
        int modaAuxiliar[] = vectModa;
        int y;
        int vecesQueSeRepite=0; 
        
        for(int i=0; i<modaAuxiliar.length; i++){ 
            y=0;
            vecesQueSeRepite = 0; 
            for(int j=0; j<modaAuxiliar.length; j++){ 
                if(modaAuxiliar[i] == modaAuxiliar[j]) 
                    vecesQueSeRepite++; 
                } 
            if(vecesQueSeRepite > maximaVecesQueSeRepite){ 
                 moda[y] = modaAuxiliar[i]; 
                maximaVecesQueSeRepite = vecesQueSeRepite; 
                }
            y++;
        }
        String lista="Los datos del arreglo son: \n";
        for(int i=0;i<modaAuxiliar.length;i++) 
        { 
             lista = lista + modaAuxiliar[i]+"\n";
             lista = lista + "\n";
        }
        for (int i = 0; i < 1; i++) {
            lista = lista + "la moda es  "+moda[i]+ " y se repitio "+ maximaVecesQueSeRepite + " veces \n";
        }   
        
        listas=lista;
        media=(suma/sizes);
    }
    public String getLista(){
        return listas;
    }
    public float getMedia() {
        return media;
    }
}
