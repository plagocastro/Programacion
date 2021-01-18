
package Felino;

import com.mycompany.boletin13.IPodeNadar;
import mamifero.Mamifero;


public class felino extends Mamifero implements IPodeNadar{
    public static void main(String[] args) {
        Gato obxGato = new Gato();
        obxGato.son();
        tigre obxti = new tigre();
        obxti.son();
    }

    @Override
    public void nada() {
        System.out.println("nada");
    }
}
