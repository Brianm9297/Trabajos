package taller1a;
import java.util.Scanner;
public class Taller1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año;
        System.out.print("Introduce año: ");
        año = sc.nextInt();
        if(esPrimo(año))  //llamada al método
           System.out.println("Bisiesto");
        else
           System.out.println("No es bisiesto");
    }
       public static boolean esPrimo(int numero){   
        if(numero%4==0 && numero%100!=0 || numero%400==0)
           return true;
        else
           return false;
    }
}
