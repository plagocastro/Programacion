package com.EjerciciosProgramacion;
import java.util.Scanner;
public class Ejercicio1 {
    public Ejercicio1() {
        Scanner sc = new Scanner(System.in);
        float tarifa, pagado;
        System.out.println("Escriba a tarifa do producto: ");
        tarifa= sc.nextFloat();
        System.out.println("Inrtoduce o precio pagado: ");
        pagado=sc.nextFloat();
        System.out.println(" O porcetaxe de desconto é igual a " + ((100-(pagado*100)/tarifa)) + "%.");
    }
}