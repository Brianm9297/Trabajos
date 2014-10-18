/*
**file:///C:/Users/Brian%20Mendivelso/Downloads/Ejercicio%20taller.pdf
* link para la realizar los ejercicios Tecnicas de Programacion 1
*/


package taller2a;

import java.util.Scanner;

public class Taller2A {
    public static void main(String[] args) {
        
        minMaxCentinela();
    }
    public static void minMaxCentinela(){
        Scanner leer = new Scanner(System.in);
        int num;
        int guardaNum=0;
        do{
        System.out.println("Ingrese Numero Centinela");
        num = leer.nextInt();
        guardaNum=guardaNum+num;
        }while(num!=-99);
        System.out.println("Guarda Num "+guardaNum);
                
    }
}
