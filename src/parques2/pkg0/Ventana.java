/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parques2.pkg0;

import javax.swing.JFrame;
import Abstraccion.Fichas;
import Abstraccion.ServicioFichas;
import Fabricas.*;
import Tablero.Tablero;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import Dados.Dado1;
import Dados.Dado2;

/**
 *
 * @author User
 */
public class Ventana extends JFrame {

    Tablero tabl = Tablero.getInstancia("Tablero.png");
    private JPanel panel;
    private JLabel tab;
    private JLabel titulo;
    private JButton lanzaram;
    private JButton lanzaraz;
    private JButton lanzarver;
    private JButton lanzarro;
    private JLabel valor1;
    private JLabel valor2;
    private int suma;
    private JButton dpa1;
    private JButton dpa2;
    private JButton dpa3;
    private JButton dpa4;
    private JButton dpaz1;
    private JButton dpaz2;
    private JButton dpaz3;
    private JButton dpaz4;
    private JButton dpv1;
    private JButton dpv2;
    private JButton dpv3;
    private JButton dpv4;
    private JButton dpr1;
    private JButton dpr2;
    private JButton dpr3;
    private JButton dpr4;
    private JButton jugar;
    private int opca;

    public Ventana() {
        setSize(1000, 800); // tamaño de la ventana
        setLocationRelativeTo(null); // coloca la ventana en el centro
        setTitle("Proyecto Final Modelos de Programación I"); // titulo de la ventana
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE); // termina la ejecucion al cerrar la ventana
    }

    public static void Fichita(Fichas fich) {

    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
        MueveAmarillo(new Amarillo());

    }

    private void colocarPaneles() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void colocarEtiquetas() {
        tab = new JLabel(new ImageIcon(tabl.getruta()));
        tab.setBounds(220, 20, 550, 550);
        tab.setVisible(false);
        panel.add(tab);

        titulo = new JLabel();
        titulo.setText("BIENVENIDO AL PARQUÉS");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setBounds(150, 20, 600, 30);
        titulo.setFont(new Font("cooper black", 0, 30));
        panel.add(titulo);
        valor1 = new JLabel();
        valor1.setHorizontalAlignment(SwingConstants.CENTER);
        valor1.setBounds(150, 10, 20, 30);
        valor1.setFont(new Font("cooper black", 0, 15));
        panel.add(valor1);

        valor2 = new JLabel();
        valor2.setHorizontalAlignment(SwingConstants.CENTER);
        valor2.setBounds(150, 20, 20, 30);
        valor2.setFont(new Font("cooper black", 0, 15));
        panel.add(valor2);
    }

    private void colocarBotones() {
        jugar = new JButton();
        jugar.setText("JUGAR");
        jugar.setBounds(400, 75, 100, 30);
        panel.add(jugar);

        dpa1 = new JButton();
        dpa1.setBackground(Color.yellow);
        dpa1.setBounds(630, 437, 20, 20);
        dpa1.setVisible(false);
        dpa2 = new JButton();
        dpa2.setBackground(Color.yellow);
        dpa2.setBounds(680, 437, 20, 20);
        dpa2.setVisible(false);
        dpa3 = new JButton();
        dpa3.setBackground(Color.yellow);
        dpa3.setBounds(630, 470, 20, 20);
        dpa3.setVisible(false);
        dpa4 = new JButton();
        dpa4.setBackground(Color.yellow);
        dpa4.setBounds(680, 470, 20, 20);
        dpa4.setVisible(false);
        dpaz1 = new JButton();
        dpaz1.setBackground(Color.blue);
        dpaz1.setBounds(630, 87, 20, 20);
        dpaz1.setVisible(false);
        dpaz2 = new JButton();
        dpaz2.setBackground(Color.blue);
        dpaz2.setBounds(680, 87, 20, 20);
        dpaz2.setVisible(false);
        dpaz3 = new JButton();
        dpaz3.setBackground(Color.blue);
        dpaz3.setBounds(630, 120, 20, 20);
        dpaz3.setVisible(false);
        dpaz4 = new JButton();
        dpaz4.setBackground(Color.blue);
        dpaz4.setBounds(680, 120, 20, 20);
        dpaz4.setVisible(false);
        dpr1 = new JButton();
        dpr1.setBackground(Color.red);
        dpr1.setBounds(280, 87, 20, 20);
        dpr1.setVisible(false);
        dpr2 = new JButton();
        dpr2.setBackground(Color.red);
        dpr2.setBounds(330, 87, 20, 20);
        dpr2.setVisible(false);
        dpr3 = new JButton();
        dpr3.setBackground(Color.red);
        dpr3.setBounds(280, 120, 20, 20);
        dpr3.setVisible(false);
        dpr4 = new JButton();
        dpr4.setBackground(Color.red);
        dpr4.setBounds(330, 120, 20, 20);
        dpr4.setVisible(false);
        dpv1 = new JButton();
        dpv1.setBackground(Color.green);
        dpv1.setBounds(280, 437, 20, 20);
        dpv1.setVisible(false);
        dpv2 = new JButton();
        dpv2.setBackground(Color.green);
        dpv2.setBounds(330, 437, 20, 20);
        dpv2.setVisible(false);
        dpv3 = new JButton();
        dpv3.setBackground(Color.green);
        dpv3.setBounds(280, 470, 20, 20);
        dpv3.setVisible(false);
        dpv4 = new JButton();
        dpv4.setBackground(Color.green);
        dpv4.setBounds(330, 470, 20, 20);
        dpv4.setVisible(false);
        panel.add(dpaz1);
        panel.add(dpaz2);
        panel.add(dpaz3);
        panel.add(dpaz4);
        panel.add(dpa1);
        panel.add(dpa2);
        panel.add(dpa3);
        panel.add(dpa4);
        panel.add(dpr1);
        panel.add(dpr2);
        panel.add(dpr3);
        panel.add(dpr4);
        panel.add(dpv1);
        panel.add(dpv2);
        panel.add(dpv3);
        panel.add(dpv4);
        lanzaram = new JButton();
        lanzaram.setText("Lanzar");
        lanzaram.setBackground(Color.yellow);
        lanzaram.setBounds(780, 460, 100, 20);
        lanzaram.setVisible(false);
        panel.add(lanzaram);
        lanzaraz = new JButton();
        lanzaraz.setText("Lanzar");
        lanzaraz.setBackground(Color.blue);
        lanzaraz.setBounds(780, 110, 100, 20);
        lanzaraz.setVisible(false);
        panel.add(lanzaraz);
        lanzarro = new JButton();
        lanzarro.setText("Lanzar");
        lanzarro.setBounds(110, 110, 100, 20);
        lanzarro.setBackground(Color.red);
        lanzarro.setVisible(false);
        panel.add(lanzarro);
        lanzarver = new JButton();
        lanzarver.setText("Lanzar");
        lanzarver.setBounds(110, 460, 100, 20);
        lanzarver.setBackground(Color.GREEN);
        lanzarver.setVisible(false);
        panel.add(lanzarver);
        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dpa1.setVisible(true);
                dpa2.setVisible(true);
                dpa3.setVisible(true);
                dpa4.setVisible(true);
                dpaz1.setVisible(true);
                dpaz2.setVisible(true);
                dpaz3.setVisible(true);
                dpaz4.setVisible(true);
                dpr1.setVisible(true);
                dpr2.setVisible(true);
                dpr3.setVisible(true);
                dpr4.setVisible(true);
                dpv1.setVisible(true);
                dpv2.setVisible(true);
                dpv3.setVisible(true);
                dpv4.setVisible(true);
                tab.setVisible(true);
                jugar.setVisible(false);
                titulo.setVisible(false);
                lanzaram.setVisible(true);
                lanzaraz.setVisible(true);
                lanzarro.setVisible(true);
                lanzarver.setVisible(true);

            }

        };
        jugar.addActionListener(accion);

        ActionListener lanza = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Dado1 dado1 = new Dado1((int) (Math.random() * 6 + 1));
                valor1.setText(Integer.toString(dado1.getvalor1()));
                Dado2 dado2 = new Dado2((int) (Math.random() * 6 + 1));
                valor2.setText(Integer.toString(dado2.getvalor2()));
            }
        };
        lanzaram.addActionListener(lanza);

    }

    private void MueveAmarillo(Fichas fich) {
        ActionListener muevea1 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                opca = 1;
                suma = Integer.parseInt(valor1.getText()) + Integer.parseInt(valor2.getText());
                ServicioFichas servicio = fich.CrearFicha(opca, dpa1, suma);
                servicio.Recorrido();

            }
        };
        dpa1.addActionListener(muevea1);
        ActionListener muevea2 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                opca = 2;
                suma = Integer.parseInt(valor1.getText()) + Integer.parseInt(valor2.getText());
                ServicioFichas servicio = fich.CrearFicha(opca, dpa2, suma);
                servicio.Recorrido();

            }
        };
        dpa2.addActionListener(muevea2);
        ActionListener muevea3 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                opca = 3;
                suma = Integer.parseInt(valor1.getText()) + Integer.parseInt(valor2.getText());
                ServicioFichas servicio = fich.CrearFicha(opca, dpa3, suma);
                servicio.Recorrido();

            }
        };
        dpa3.addActionListener(muevea3);
        ActionListener muevea4 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                opca = 4;
                suma = Integer.parseInt(valor1.getText()) + Integer.parseInt(valor2.getText());
                ServicioFichas servicio = fich.CrearFicha(opca, dpa4, suma);
                servicio.Recorrido();

            }
        };
        dpa4.addActionListener(muevea4);

    }

}
