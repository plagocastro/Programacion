
package boletin9;


public class EJ2 {
     public void mulNum(){
        int i;
        double resultado = 1;

        for (i = 10; i <= 90; i++) {
            resultado = resultado * i;
        }
        System.out.println(resultado);
    }
    
    public void sumNum(){
        int i;
        int resultado = 0;

        for (i = 10; i <= 90; i++) {
            resultado = resultado + i;
        }
        System.out.println(resultado);
    }
}

