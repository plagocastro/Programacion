
package Felino;

import com.mycompany.boletin13.IPodeNadar;


public class felino implements IPodeNadar{
    public static void main(String[] args) {
        Gato obxGato = new Gato();
        obxGato.son();
        tigre obxti = new tigre();
        obxti.son();
    }

    @Override
    public void nada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
