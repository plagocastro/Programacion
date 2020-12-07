
package boletin9;

import javax.swing.*;

public class EJ4{
    private int i=0;
    public void calculaNum(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
         while( i <= 10) {
            System.out.println(num + "*"+i+"="+(num*i));
            i++;
        }
         i=0;
    }
}