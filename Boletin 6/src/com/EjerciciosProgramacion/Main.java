package com.EjerciciosProgramacion;

public class Main {

    public static void main(String[] args) {
        //Ejercicio 1
        Coche seat = new Coche();
        System.out.println("Velocidad inicial: "+seat.getVelocidade());
        seat.acelerar(50);
        System.out.println("Velocidad actual: "+seat.getVelocidade());
        seat.frenar(15);
        System.out.println("Velocidad actual: "+seat.getVelocidade());
        //Ejercicio2
        Satelite meteoSat = new Satelite(5.6,8.3,10000) ;
        meteoSat.verPosicion();
        //Ejercicio3
        Circulo circulo1 = new Circulo();
        circulo1.setRadio(1);
        System.out.println("Longitud circunferencia: "+circulo1.calcularLonxitude());
        Circulo circulo2 = new Circulo(3);
        System.out.println("Área del circulo de radio "+circulo2.getRadio()+" es: "+circulo2.calcularArea());
    }
}
