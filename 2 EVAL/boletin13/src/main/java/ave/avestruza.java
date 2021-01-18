
package ave;

import com.mycompany.boletin13.IPodeCamiñar;

public class avestruza implements IPodeCamiñar{
    public void son(){
            System.out.println("Son unha avestruza");
}

    @Override
    public void camiña() {
        System.out.println("Camiña");
    }
    
}
