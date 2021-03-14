
package boletin_16;

import javax.swing.JOptionPane;


public class metodos {
    private int[] numeros;
    
    public void engadirNumeros1() {
        numeros = new int[10];
        
        JOptionPane.showMessageDialog(null, "Introduce 10 números");
        
        for (int i=0; i < numeros.length; i++){
            numeros[i]= Integer.parseInt(JOptionPane.showInputDialog(null,""));
        }
        numeroPar();
        numeroImpar();
    }
    
    public int numeroPar(){
        int pares=0;
        
        for(int i=0;i<numeros.length;i++) {
            if ((numeros[i]%2)==0) {
                pares++;
            }
        }
        return pares;
    }
    
    public int numeroImpar(){
        int impares=0;
        
        for(int i=0;i<numeros.length;i++){
             if((numeros[i]%2)!=0) {
                impares++;
            }
        }
        return impares;
    }
}