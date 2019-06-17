package fiuba.algo3.minecraft.vista;

import javax.swing.*;
import java.awt.*;

public class MapaVista {
    JButton[]arrBtn = new JButton[100];//arreglo de botones

    private JPanel matrizDeBotones () {//constructor de la clase

        JPanel jp1 = new JPanel(new GridLayout(10, 10, 0, 0));

        for (int i = arrBtn.length - 1; i >= 0; i--) {//ciclo para crear, añadir, establecer propiedades a los botones
            arrBtn[i] = new JButton("");
            jp1.add(arrBtn[i]);
            arrBtn[i].setMargin(new Insets(1, 1, 1, 1));
        }//fin ciclo

        return jp1;
    }
}
