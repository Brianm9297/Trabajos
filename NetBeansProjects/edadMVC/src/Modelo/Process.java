
package Modelo;
import Vista.View;
public class Process {
    View obj=new View();
    public void back(){
    int date;
    
    date = obj.menuM();
        ejecutarMenu(date);
    }
    public int edad=0;
    public int resta=0;
    public void ejecutarMenu(int fechaNacimiento) {
        int fechaActual=2014;
        edad = fechaActual-fechaNacimiento;
        resta = edad-5;
    }
    public View getObj() {
        return obj;
    }
    public int getEdad() {
        return edad;
    }

    public int getResta() {
        return resta;
    }

}
