package com.PabloLago.programacion;

public class excepcionTemperatura extends Exception{
        public excepcionTemperatura(){
            super("La temperatura no puede ser inferior a 80º ");
        }
        public excepcionTemperatura(String mensaje){
            super(mensaje);
        }
    }

