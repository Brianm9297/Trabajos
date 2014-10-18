package Vista;
import javax.swing.JOptionPane;
public class View {
        public int solicitaEdad(String ed){
             return Integer.parseInt(JOptionPane.showInputDialog(ed));
        }
        public void mostrar(String ede){
             JOptionPane.showMessageDialog(null, ede);
        }
        public int menuM(){
            String message="";
            message=message+" programa calcula Edad\n";
            message=message+";)";
            mostrar(message);
            return solicitaEdad("Bienvenido Digite Fecha Nacimiento");
        }
}
