
package Vista;

import javax.swing.JOptionPane;

public class View {
            public int solicitaData(String ed){
             return Integer.parseInt(JOptionPane.showInputDialog(ed));
        }
        public void mostrar(String ede){
             JOptionPane.showMessageDialog(null, ede);
        }
        
        public void imprimeNum(float ede){
             JOptionPane.showMessageDialog(null, ede);
        }
        public void imprimeNum(int ede){
             JOptionPane.showMessageDialog(null, ede);
        }
        public void imprimeEntero(int[] ede){
             JOptionPane.showMessageDialog(null, ede);
        }
        public int menuM(){
            String message="";
            message=message+" programa calcula media,Mediana,Moda\n";
            message=message+"  ;) ";
            mostrar(message);
            return solicitaData("Ingrese tamaño vector");
        }
}
