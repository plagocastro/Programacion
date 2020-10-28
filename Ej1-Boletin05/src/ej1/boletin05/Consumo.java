
package ej1.boletin05;


public class Consumo {
    private float kilometros;
    private float PrezoDaGasolina;
    private float velocidadeMedia;
    private float litrosConsumidos;
    
    public Consumo (){
    }
    public Consumo(float km, float pGas, float vMed, float litros){
            kilometros = km;
            PrezoDaGasolina = pGas;
            velocidadeMedia = vMed;
            litrosConsumidos = litros;
    }
    public void getTempo() {
        float tempo = kilometros / velocidadeMedia;
    }
     public void setkms(float km){
        kilometros = km;
    }
     public float getkms(){
        return kilometros;
     }
     public void setvMed(float vMed){
        velocidadeMedia = vMed;
    }
     public float getvMed(){
        return velocidadeMedia;
     }
     public void setLitros(float litros){
        litrosConsumidos = litros;
    }
     public float getLitros(){
        return litrosConsumidos;
     }    
     public void setPGas(float pGas){
        PrezoDaGasolina = pGas;
    }
     public float getPGas(){
        return PrezoDaGasolina;
     }
     public void consumo(){
         float ConsumoMedio = (litrosConsumidos * 100)/ kilometros;
         System.out.println("El consumo medio es de "+ ConsumoMedio + " cada 100km");
         float consumoEuros = (ConsumoMedio / 100)* PrezoDaGasolina;
         System.out.println("El gasto medio de dinero es de "+ consumoEuros + " cada 100km");
     }
     public void PrezoLitros(){
         System.out.println("Litros = "+ litrosConsumidos+" y o Prezo= "+ PrezoDaGasolina);
     }
     public void AmosoVelMedia(){
         System.out.println("A velocidade media foi "+velocidadeMedia + "km/h");
     }
}