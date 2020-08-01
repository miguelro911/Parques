/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Abstraccion.Fichas;
import Abstraccion.ServicioFichas;
import ProductosConcretos.*;
import javax.swing.JButton;

/**
 *
 * @author User
 */
public class Amarillo implements Fichas {

    @Override
    public ServicioFichas CrearFicha(int opc, JButton bt, int sum) {
        if (opc == 1) {
            System.out.println("Se ha accedido al objeto");
            return new Amarillo1(bt, sum);
        }
        if (opc == 2) {
            System.out.println("Se ha accedido al objeto");

            return new Amarillo2(bt, sum);
        }
        if (opc == 3) {
            System.out.println("Se ha accedido al objeto");
            return new Amarillo3(bt, sum);

        }
        if (opc == 4) {
            System.out.println("Se ha accedido al objeto");
            return new Amarillo4(bt, sum);
        } else {
            return null;
        }
    }

}
