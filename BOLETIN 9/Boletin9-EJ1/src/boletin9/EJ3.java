
package boletin9;

import javax.swing.JOptionPane;


public class EJ3 {

    public float calcularArea(){
        float base, altura;
         base =Float.parseFloat(JOptionPane.showInputDialog("Dame la base"));
         altura =Float.parseFloat(JOptionPane.showInputDialog("Dame la altura"));
        
         return base*altura;
        
    }

}    

