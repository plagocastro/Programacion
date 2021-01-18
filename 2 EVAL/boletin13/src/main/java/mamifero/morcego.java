
package mamifero;

import com.mycompany.boletin13.IPodeVoar;

public class morcego implements IPodeVoar {
    public void son(){
        System.out.println("Sou un morcego");
    }
    @Override
    public void voar() {
        System.out.println("Voa");
    }
    
}
