
package Felino;

import com.mycompany.boletin13.IPodeCamiñar;


public class felino implements IPodeCamiñar{
    public static void main(String[] args) {
        Gato obxGato = new Gato();
        obxGato.son();
        tigre obxti = new tigre();
        obxti.son();
    }

    @Override
    public void camiña() {
        System.out.println("Camiña");
    }
}
