
package boletin_16;

import javax.swing.JOptionPane;


public class metodos_2 {
    private int cantidadPersoas;
    private float[] alturaPersoas;
    private float alturaMedia;
    
    public void engadirAltura2() {
        cantidadPersoas=Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cantas persoas desexa engadir?"));
        for (int i=0; i < cantidadPersoas; i++){
            alturaPersoas[i]= Float.parseFloat(JOptionPane.showInputDialog(null,""));
        }
        mediaAltura2();
    }
    
    public float mediaAltura2(){
        float calculo = 0;
        
        for (int i=0; i<alturaPersoas.length;i++){
            calculo += alturaPersoas[i];
        }
        alturaMedia = calculo / alturaPersoas.length;
        return alturaMedia;
    }
    
}

