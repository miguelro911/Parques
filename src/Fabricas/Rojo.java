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
public class Rojo implements Fichas {

    @Override
    public ServicioFichas CrearFicha(int opc, JButton bt, int sum) {
        if (opc == 1) {
            return new Rojo1(bt, sum);
        }
        if (opc == 2) {
            return new Rojo2(bt, sum);
        }
        if (opc == 3) {
            return new Rojo3(bt, sum);
        }
        if (opc == 4) {
            return new Rojo4(bt, sum);
        } else {
            return null;
        }
    }
}


