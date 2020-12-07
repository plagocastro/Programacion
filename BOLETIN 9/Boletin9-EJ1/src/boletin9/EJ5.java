
package boletin9;

import javax.swing.JOptionPane;

public class EJ5 {
     private boolean alto=false;
      int soldo, traballadores=0, baixo=0;
      float porcentaxe;
    public boolean sueldo (){
          soldo=Integer.parseInt(JOptionPane.showInputDialog("Introduce soldo"));
        if (soldo>=1000){
            alto=true;
            return alto;
        } else return alto=false;
       
        while (soldo>= 0){  
           traballadores++;
           
            if (soldo>=1000){
                baixo++;
            }
            soldo = Integer.parseInt(JOptionPane.showInputDialog("Introduce outro soldo"));
        }
        porcentaxe=baixo*100/traballadores;
        JOptionPane.showMessageDialog(null,"O "+porcentaxe+"% dos traballadores ten un soldo inferior a 1000", "Titulo",JOptionPane.INFORMATION_MESSAGE);
         return false;
        
    }
}
 
    

