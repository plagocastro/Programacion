package com.EjerciciosProgramacion;
import javax.swing.*;
public class Main {

        public static void main(String[] args) {
            // Ejercicio6----------
            System.out.println("Ejercicio6");
            EJ6 obxej6 = new EJ6();
            String articulo = JOptionPane.showInputDialog("Nombre del articulo:");
            int ventas = Integer.parseInt(JOptionPane.showInputDialog("Numero de ventas:"));
            obxej6.Ejercicio6(articulo,ventas);
            //Ejercicio7-----------
            System.out.println("Ejercicio6");
            EJ7 obxej7 = new EJ7();
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Numero de la figura:"));
            obxej7.Ejercicio7(opcion);


    }
}
