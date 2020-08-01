/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductosConcretos;

import Abstraccion.ServicioFichas;
import javax.swing.JButton;

/**
 *
 * @author User
 */
public class Amarillo2 implements ServicioFichas {

    protected int s;
    protected JButton boton;
    int recorridoAmarillo[][] = {{547, 547, 547, 547, 568, 591, 614, 637, 660, 683,
        706, 729, 729, 729, 706, 683, 660, 637, 614, 591, 568, 547, 547, 547, 547, 547,
        547, 547, 547, 486, 425, 425, 425, 425, 425, 425, 425, 425, 402, 379, 356, 333,
        310, 287, 264, 241, 241, 241, 264, 287, 310, 333, 356, 379, 402, 424, 424, 424,
        424, 424, 424, 424, 424, 485}, {437, 414, 391, 368, 345, 345, 345, 345, 345,
        345, 345, 345, 285, 225, 225, 225, 225, 225, 225, 225, 225, 202, 179,
        156, 133, 110, 87, 64, 41, 41, 41, 64, 87, 110, 133, 156, 179, 202, 225,
        225, 225, 225, 225, 225, 225, 225, 286, 347, 347, 347, 347, 347, 347,
        347, 347, 368, 391, 414, 437, 460, 483, 506, 529, 529}};

    public Amarillo2(JButton dp, int sum) {
        s = s + sum;
        boton = dp;
        Recorrido();
    }

    @Override
    public JButton Recorrido() {
        System.out.println("x" + recorridoAmarillo[0][s]);
        System.out.println("y" + recorridoAmarillo[1][s]);
        boton.setBounds(recorridoAmarillo[0][s], recorridoAmarillo[1][s], 20, 20);
        return boton;
    }

}
