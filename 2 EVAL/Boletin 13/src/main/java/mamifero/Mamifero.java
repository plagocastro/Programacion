
package mamifero;


import Felino.felino;
import com.mycompany.boletin13.IPodeCamiñar;
import com.mycompany.boletin13.IPodeNadar;


public class Mamifero implements IPodeCamiñar, IPodeNadar {
   public static void main(String[] args) {
    
    felino obxGato = new felino();
    
   }
    @Override
    public void camiña() {
        System.out.println("Camiña");
    }

    @Override
    public void nada() {
        System.out.println("Nada");
    }

}