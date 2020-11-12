

package boletin.pkg7;

import javax.swing.JOptionPane;


public class Boletin7 {


    public static void main(String[] args) {
      Numeros obx = new Numeros();
      int numero = Integer.parseInt(JOptionPane.showInputDialog(" teclea numero dia :"));
      obx.numero(numero);
      short num1 = Short.parseShort(JOptionPane.showInputDialog(" teclea numero :"));
      short num2 = Short.parseShort(JOptionPane.showInputDialog(" teclea numero :"));
      obx.numero2(num1, num2);
      int num = Integer.parseInt(JOptionPane.showInputDialog(" teclea numero dia :"));
      obx.numero3(num);
      int peso1 = Integer.parseInt(JOptionPane.showInputDialog(" teclea peso Paco :"));
      int peso2 = Integer.parseInt(JOptionPane.showInputDialog(" teclea peso Pepe :"));
      obx.peso(peso1, peso2);
      int numero1 = Integer.parseInt(JOptionPane.showInputDialog(" teclea numero1 :"));
      int numero2 = Integer.parseInt(JOptionPane.showInputDialog(" teclea numero2 :"));
      int numero3 = Integer.parseInt(JOptionPane.showInputDialog(" teclea numero3 :"));
      obx.numero5(numero1, numero2, numero3);
        
    }
    
}
