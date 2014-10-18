package Modelo;

import Vista.ClaseVista;

public class ClaseRedireccion {

    Vista.ClaseVista obVista = new ClaseVista();
    
    Modelo.ClasePunto1 obPunto1 = new ClasePunto1();
    Modelo.ClasePunto2 obPunto2 = new ClasePunto2();
    Modelo.ClasePunto3 obPunto3 = new ClasePunto3();
    Modelo.ClasePunto4 obPunto4 = new ClasePunto4();
    Modelo.ClasePunto5 obPunto5 = new ClasePunto5();
    Modelo.ClasePunto6 obPunto6 = new ClasePunto6();
    Modelo.ClasePunto7 obPunto7 = new ClasePunto7();
    Modelo.ClasePunto8 obPunto8 = new ClasePunto8();
    Modelo.ClasePunto9 obPunto9 = new ClasePunto9();
    Modelo.ClasePunto10 obPunto10 = new ClasePunto10();
    
    public void redireccionAClases() {
        int dato = obVista.mostrarM();
        caseClass(dato);
    }

    public void caseClass(int opcion) {
        switch (opcion) {
            case 1:
                obPunto1.ejecuta();
                break;
            case 2:
                obPunto2.punto2Ejecutar();
                break;
            case 3:
                obPunto3.punto3Ejecutar();
                break;
            case 4:
                obPunto4.diagonalSecundaria();
                break;
            case 5:
                obPunto5.ejecutarPunto5();
                break;
            case 6:
                obPunto6.ejecutarPunto6();
                break;
            case 7:
                obPunto7.ejecutarMatrizTraspuesta();
                break;
            case 8:
                obPunto8.frase();
                break;
            case 9:
                obPunto9.ejecutarPunto9();
                break;
            case 10:
                obPunto10.ejecutar();
                break;
            case 11:
                System.exit(0);
                break;    
        }
    }

    
    
}
