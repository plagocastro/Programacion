package com.PabloLago.programacion;

public class Main {

    public static void main(String[] args) {
            Temperatura tem1 = new Temperatura();
            Temperatura tem2 = new Temperatura();
            try {
                    System.out.println("Estos grados son en Farenheit "+tem1.centigradosAFarenheit(78));
            }catch (excepcionTemperatura error){
                    System.out.println(error.getMessage());
            }

            tem2.pasarReamur(426);
        }
 }


