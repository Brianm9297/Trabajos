
package Control;
import Modelo.Proceso;
import Vista.inOut;
public class Ejecucion {
    public static void main(String[]args){
    inOut ob=new inOut();
    Proceso o=new Proceso();
    o.regresarCompra();
    ob.mostrarRes("total recolectado "+o.getTR());
    ob.mostrarRes("total Peliculas Vendidas "+" es "+o.mayorCantidad());
    
    }
}
