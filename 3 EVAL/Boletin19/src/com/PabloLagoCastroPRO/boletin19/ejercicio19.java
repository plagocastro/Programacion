package com.PabloLagoCastroPRO.boletin19;

import javax.swing.*;

public class ejercicio19 {

        JFrame marco;
        JPanel panel;
        JPasswordField contrasinal;
        JButton botonLimpiar;
        JLabel etqnom,etqcon;
        JTextField lTextNome;
        JTextArea aTextCopy;
        public void crearinterfaz(){

            marco = new JFrame("Compoñentes");
            panel = new JPanel();
            botonLimpiar = new JButton("LIMPAR");
            etqnom = new JLabel("NOME: ");
            etqcon = new JLabel("CONTRASINAL");
            campoTexto = new JTextField();
            contrasinal = new JPasswordField();
            areaTexto = new JTextArea("Area de texto");


            marco.setSize(800,800);
            panel.setSize(750,750);
            panel.setLayout(null);
            botonLimpiar.setBounds(500,650,100,50);
            campoTexto.setBounds(350,63,200,25);
            areaTexto.setBounds(150,250,500,300);
            etqnom.setBounds(200,50,100,50);
            contrasinal.setBounds(350,110,200,25);
            etqcon.setBounds(200,100,100,50);
            panel.add(etqnom);
            panel.add(campoTexto);
            panel.add(areaTexto);
            panel.add(bLimpiar);
            panel.add(etqcon);
            panel.add(contrasinal);

            marco.add(panel);

            marco.setLocationRelativeTo(null);
            marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            marco.setVisible(true);
       }
}

