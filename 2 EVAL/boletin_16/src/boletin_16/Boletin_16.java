
package boletin_16;

import javax.swing.JOptionPane;


public class Boletin_16 {


    public static void main(String[] args) {
        metodos met = new metodos();
        met.engadirNumeros1();
        int par = met.numeroPar();
        int impar = met.numeroImpar();
        JOptionPane.showMessageDialog(null,"Numeros pares: "+par+" || Numeros impares: "+impar);
        
        metodos_2 met2 = new metodos_2();
        met2.engadirAltura2();
        float alturaMedia = met2.mediaAltura2();
        JOptionPane.showMessageDialog(null,"A altura media é: "+alturaMedia);
    
        
        metodo_3 met3 = new metodo_3();
        met3.separarTexto3();
        System.out.println("");
        met3.fusionarTexto3();
        System.out.println("");
        
        metodos_4 met4 = new metodos_4();
        met4.convertirMaiuscula4("javeros");
        met4.convertirMinuscula4();   
    }
}
