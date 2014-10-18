
package edadestructurado;

import java.util.Scanner;

public class EdadEstructurado {
    public static void main(String[] args) {
        int fechaNacimiento=0;
        Scanner Lee = new Scanner(System.in);
        System.out.print("Ingrese fecha Nacimiento ");
        fechaNacimiento = Lee.nextInt();
        validaEdad(fechaNacimiento);
        
        System.out.println("edad " + validaEdad(fechaNacimiento));
    }
    public static int validaEdad(int fechaNacimiento){
    int anioActual=2014;
    int edad = anioActual-fechaNacimiento;
        return edad;
    }
    
}
