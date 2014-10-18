
package numdivisible;

import java.util.Scanner;

public class NumDivisible {

    public static void main(String[] args) {
        Scanner leer = new  Scanner(System.in);
       /* int numero=0;
        int posibleDiviso=0;
        System.out.println("Ingrese Numero");
        numero = leer.nextInt();
        
        System.out.println("ingrese numero para validar si es Divisor");
        posibleDiviso = leer.nextInt();
        
        esDivisible(numero, posibleDiviso);
        
        if (esDivisible(numero, posibleDiviso)==true) {
            System.out.println("es Divisor");
        } else {
            System.out.println("No es Divisor");
        }
        
        int numeroBuscarMultiplo=0;
        int desde=0;
        int hasta=0;
        
        System.out.println("Ingrese Numero para ver sus multiplos");
        numeroBuscarMultiplo = leer.nextInt();
        System.out.println("ingrese desde que numero");
        desde = leer.nextInt();
        System.out.println("ingrese hasta que numero");
        hasta = leer.nextInt();
        imprimirMultiplosEnRango(numeroBuscarMultiplo, desde, hasta);
     */
        //hallar divisores
        int hallarDivisor=0;
        System.out.println("Hallar divisor ");
        hallarDivisor = leer.nextInt();
        hallarDivisores(hallarDivisor);
        
    }
    
    public static boolean esDivisible(int numero,int posibleDivisor){
   
        boolean retornoDiv = true;
        if (numero%posibleDivisor==0) {
            retornoDiv = true;
        } else {
            retornoDiv = false;
        }
    
    return retornoDiv;
    }
    
    public static void imprimirMultiplosEnRango(int numeroMultiplo,int desde,int hasta){
           
        for (int i = desde; i <= hasta; i++) {
            
            if (i%numeroMultiplo==0){
                System.out.println("multiplos de "+numeroMultiplo+" son "+ i);
            }
        }
        
    }
    
    public static int[] hallarDivisores(int numero){
        
        int con=0;
        int y=0;
        for (int i = 0; i <= numero; i++) {
            if (numero%i == 0) {
                con++;
            }
        }
        
        int[] div = new int [con];
        
        for (int d = 0; d < con; d++) {
            if (numero%d==0) {        
                div[y] = d;
                y++;
            }
        }
        
        System.out.println("");
        for (int i = 0; i < div.length; i++) {
            System.out.println(" "+div[i]);
            
        }
        return div;
    }
    
}
