
package mamifero;


import Felino.felino;
import com.mycompany.boletin13.IPodeCamiñar;


public class Mamifero implements IPodeCamiñar{
   public static void main(String[] args) {
    
    felino obxGato = new felino();
    morcego obxmor = new morcego();
    
   }
    @Override
    public void camiña() {
        System.out.println("Camiña");
    }


}