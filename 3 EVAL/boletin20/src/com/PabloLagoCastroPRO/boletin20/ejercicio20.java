package com.PabloLagoCastroPRO.boletin20;

import javax.swing.*;
import java.awt.*;

public class ejercicio20 {

    JFrame marco;
    JPanel panel_1,panel_2;
    JPasswordField contrasinal;
    JButton botonLimpiar,botonPulsar,botoninutil;
    JLabel etqnom,etqcon;
    JTextField campoTexto;
    JTextArea areaTexto,lista;

    public void crearinterfaz(){

        marco = new JFrame("Compoñentes");
        panel_1 = new JPanel();
        panel_2 = new JPanel();
        botonLimpiar = new JButton("LIMPAR");
        botonPulsar = new JButton("PULSAME");
        botoninutil = new JButton("BOTON");
        etqnom = new JLabel("NOME:");
        etqcon = new JLabel("CONTRASINAL:");
        campoTexto = new JTextField();
        contrasinal = new JPasswordField();
        areaTexto = new JTextArea("Area de texto");
        lista = new JTextArea("Primer elemento de lista\nSegundo elemento de lista\nTercer elemento de lista");

        marco.setSize(800,800);
        marco.setResizable(false);
        panel_1.setSize(800,400);
        panel_2.setLayout(null);
        botonLimpiar.setBounds(500,325,100,50);
        botonPulsar.setBounds(250,325,100,50);
        campoTexto.setBounds(350,63,200,25);
        etqnom.setBounds(50,50,1000,50);
        etqcon.setBounds(350,110,200,25);
        contrasinal.setBounds(200,100,200,100);
        panel_2.setSize(800,400);
        panel_2.setBackground(Color.blue);
        lista.setBounds(50,450,150,150);
        botoninutil.setBounds(325,525,100,50);
        areaTexto.setBounds(500,450,225,225);

        panel_1.add(etqnom);
        panel_1.add(campoTexto);
        panel_1.add(botonPulsar);
        panel_1.add(botonLimpiar);
        panel_1.add(etqcon);
        panel_1.add(contrasinal);
        panel_2.add(lista);
        panel_2.add(botoninutil);
        panel_2.add(areaTexto);

        marco.add(panel_1);
        marco.add(panel_2);

        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

