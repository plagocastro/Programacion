package com.EjerciciosProgramacion;

public class Satelite {
    private double meridiano;
    private double paralelo;
    private double dTerra;

    public Satelite() {

        meridiano = paralelo = dTerra = 0;
    }

    public Satelite(double m, double p, double d) {

        meridiano = m;
        paralelo = p;
        dTerra = d;

    }

    public void verPosicion() {

        System.out.println(" o satelite atopase  no paralelo " + paralelo + "meridiano " + meridiano + " a unha distancia da terra " + dTerra);
    }
}
