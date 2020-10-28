
package ej1.boletin05;

import java.util.Scanner;


public class Ej1Boletin05 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        Consumo obxConsumo= new Consumo();
        obxConsumo.setLitros(50);
        obxConsumo.setPGas(1.57f);
        obxConsumo.PrezoLitros();
        
        Consumo obxConsumo2=new Consumo();
        obxConsumo2.setPGas(2.5f);
        obxConsumo2.setLitros(70);
        obxConsumo2.setkms(400);
        obxConsumo2.setvMed(12);
        obxConsumo2.consumo();
        obxConsumo2.AmosoVelMedia();
        
        System.out.println("Precio da gasolina= ");
        float p = sc.nextFloat();
        System.out.println("Litros consumidos= ");
        float l = sc.nextFloat();
        System.out.println("Kilometros recorridos= ");
        float k = sc.nextFloat();
        System.out.println("Velocidad media= ");
        float v = sc.nextFloat();
        System.out.println("El consumo medio será de "+ (l * 100)/ k);
        System.out.println("El gasto medio será de "+ ((((l * 100)/ k))/100) * p);
        System.out.println("La velocidad media será de "+ v);
    }
    
}
