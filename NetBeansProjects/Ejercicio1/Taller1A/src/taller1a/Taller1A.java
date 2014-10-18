
package taller1a;
import java.util.Scanner;
public class Taller1A {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduce Numero: ");
        num = sc.nextInt();
        if (esPrimo(num)) 
        {
            System.out.println("es primo ");
        } else {
            System.out.println("No es Primo ");
        }
            int desde;
            int hasta;
            System.out.print("Introduce Numero Inicial : ");
            desde = sc.nextInt();
            System.out.print("Introduce Numero Final : ");
            hasta = sc.nextInt();
            imprimirPrimosEnRango(desde, hasta);
            int valorAPagar;
            int valorPagado;
            int Cambio;
            System.out.print("Valor a Pagar : ");
            valorAPagar = sc.nextInt();
            System.out.print("ValorPa pagodo : ");
            valorPagado = sc.nextInt();
            calcularCambio(valorAPagar, valorPagado);   
    }
      public static boolean esPrimo(int numero) {
        int b = 0;
        for (int i = 1; i < (numero + 1); i++) {
            if (numero % i == 0) {
                b++;
            }
        }
        if (b != 2) {
            return false;
        } else {
            return true;
        }
    }
    public static void imprimirPrimosEnRango(int desde, int hasta) {
        for (int i = desde; i <= hasta; i++) {
            if (esPrimo(i) == true) {
                System.out.println("Es Primo: " + i + "");
            } else {
                System.out.println("No es primo " + i + "");
            }
        }
    }
    public static int calcularCambio(int valorAPagar, int valorPagado) {
        int Cambio;
        Cambio = valorAPagar - valorPagado;        
        imprimirDenominaciones(Cambio);
        return Cambio;
    }
     public static void  imprimirDenominaciones(int valor) {
         
            System.out.println("Cambio " + valor);
     }
      
      
    
    
}
