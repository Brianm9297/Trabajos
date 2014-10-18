/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import javax.swing.JOptionPane;

public class ClaseVista {

   public int solicitarDataInt(String data){
       return Integer.parseInt(JOptionPane.showInputDialog(data));
   }
   
   public String solicitarDataString (String data){
       return JOptionPane.showInputDialog(data);
   }
   
    
}
