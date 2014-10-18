
package vectoresestructurado;

import java.util.Scanner;

public class VectoresEstructurado {
    int mayor=0;
    public static void main(String[] args) {
       int size=0;
       System.out.println("Ingrese tamaño vector");
       Scanner leer = new Scanner(System.in);
       size=leer.nextInt();
       String []empleado = new String [size];
       int []salario = new int [size];
        for (int x = 0; x < empleado.length; x++) {
            System.out.println(" Ingrese Nombre Empleado");
            empleado[x]=leer.next();
            System.out.println(" Ingrese Salario Empleado");
            salario[x]=leer.nextInt();
        
        }
        for (int mostar = 0; mostar < empleado.length; mostar++) {
                System.out.print(" Empleado " +empleado[mostar]);
                System.out.println(" Salario " +salario[mostar]);
        }
        
        
        
    }
    
    
}
