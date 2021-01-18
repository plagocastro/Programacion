
package ave;

import com.mycompany.boletin13.IPodeVoar;


public class Papagaio implements IPodeVoar{
    public void son(){
        System.out.println("Sou un Papagaio");
    }

    @Override
    public void voar() {
        System.out.println("Podo voar");
    }

}
