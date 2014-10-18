
package modamedianamedia;
import java.util.Arrays;
import java.util.Scanner;
public class ModaMedianaMedia {
public int sizes=0;
public float media=0;
public int[] mediana=new int[1];
public int modaRecibe;
public float suma=0;

    public static void main(String[] args) {

    }
       public void ejecutarMenu(int sizesVect) {
           Scanner leer = new Scanner(System.in);
      
      int []vect=new int [sizesVect];
           System.out.print("Ingrese los datos al vector ");
        
        for (int llenar = 0; llenar < vect.length; llenar++) {
            System.out.print("Ingrese Dato al Vector");
            vect[llenar]=leer.nextInt();
        }
      int[]vectMedia=vect;
      int[]vectMediana=vect;
      int[]vectModa=vect;
      //obtiene la media
        for (int recorrer = 0; recorrer < vectMedia.length; recorrer++) {
            suma=suma+vectMedia[recorrer];
        }
        //ordena el arreglo para tolmar  la mediana
        float divTamaArreglo;
        
        for (int medianaOrdena = 0; medianaOrdena < vectMediana.length; medianaOrdena++) {
            Arrays.sort(vectMediana);
            //validar si es primo  o no lo es para dividir la mediana
            if(sizes%2==0){
                divTamaArreglo=(sizes/2);
              }else{

            }
        
        }
     }
}
