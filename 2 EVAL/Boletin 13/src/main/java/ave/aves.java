
package ave;

import com.mycompany.boletin13.IPodeCamiñar;

public class aves  implements IPodeCamiñar {
    public static void main(String[] args) {
   
    Papagaio obxPa = new Papagaio();
    avestruza obxave = new avestruza();
    
    }
    @Override
    public void camiña() {
        System.out.println("Camiña");
    }
    
    
}
