package com.PabloLago.programacion;

public class Temperatura {
        public static final float temperaturaMinima =80F;

        public Temperatura() {
        }
        public float centigradosAFarenheit(float temperaturaCentigrados) throws excepcionTemperatura{
            if (temperaturaCentigrados<temperaturaMinima)
                throw new excepcionTemperatura("Introduzca una temperatura superior a 80º");
            else {
                return (temperaturaCentigrados * 1.8F) + 32.4F;
            }
        }
        public void pasarReamur (float celsius){
            try {
                float temperaturaReamur=0.8F*celsius;
                if (celsius<temperaturaMinima) {
                    throw new excepcionTemperatura();
                }
                System.out.println("temperatura en celsius= " + temperaturaReamur);
            }catch (excepcionTemperatura es){
                System.out.println(" la temperatura es "+ new excepcionTemperatura());
            }
        }
    }

