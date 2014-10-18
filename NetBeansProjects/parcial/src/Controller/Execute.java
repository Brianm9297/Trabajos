

package Controller;
import View.inOut;
import Model.Process;
import javax.swing.JOptionPane;

public class Execute {
    
    public static void main(String[] args) {
        Process obj_proceso = new Process();
        inOut obj_vista=new inOut();
        
        int idCandidato = obj_vista.pedirDatoEntero("Ingrese Numero de participantes");
        Process objProceso = new Process();
        while (objProceso.validarP_info(idCandidato)==false) {            
            idCandidato=obj_vista.pedirDatoEntero("Ingrese Numero Mayor a  0");
        }
        Process redireccionyValidacion = new Process(idCandidato);
        redireccionyValidacion.ingresarCandidatos();
        redireccionyValidacion.votosPuntuar();
        String m = redireccionyValidacion.RecoorerVector();
        obj_vista.imprimir(m);
        redireccionyValidacion.imprimirResultado();
    }
    
}
