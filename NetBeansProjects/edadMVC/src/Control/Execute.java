/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;
import Vista.View;
import Modelo.Process;
public class Execute {
    public static void main(String[] args) {
        View obj=new View();
        Process obj2=new Process();
        obj2.back();
        obj.mostrar("Result "+obj2.getEdad()+" menos 5 "+obj2.getResta());
        
    }
}
