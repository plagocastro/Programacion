package com.EjerciciosProgramacion;

public class Circulo {
    private final double PI = 3.14;
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularLonxitude() {
        return 2 * PI * radio;
    }

    public double calcularArea() {
        return (PI * Math.pow(radio, 2));
    }
}
