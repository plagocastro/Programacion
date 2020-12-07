
package boletin9;


import javax.swing.*;

public class EJ1 {
    public int contador=0,nPositivos=0,nNegativos=0,ceros=0,numero;

    public void primerEJ(){
        int numero;
        int i;
        int positivo = 0;
        int negativo = 0;
        int ceros = 0;

        for (i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número " + "(x" + i + ")"));

            if (numero>0) {
                positivo++;
            } else if (numero<0) {
                negativo++;
            } else {
                ceros++;
            }
        }
        System.out.println("Temos "+positivo+" numeros positivos, "+negativo+" numeros negativos e "+ceros+" ceros.");
    }
}

