package javafx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArrObjetos implements ActionListener{

    JButton []arrBtn = new JButton[100];//arreglo de botones
    JPanel jp1;

    private ArrObjetos (){//constructor de la clase

        JFrame frMain = new JFrame("Arreglo de Botones");

        mostrarBot();

        frMain.add(jp1, BorderLayout.CENTER);

        frMain.setSize(500, 500);
        frMain.setLocation(500, 200);
        frMain.setVisible(true);
        frMain.setResizable(true);
        frMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mostrarBot(){//metodo donde se encontrara el jpanel que contiene los botones
        jp1 = new JPanel(new GridLayout(10, 10, 0, 0));

        for(int i = arrBtn.length - 1; i >= 0; i--){//ciclo para crear, añadir, establecer propiedades a los botones
            arrBtn[i] = new JButton("");
            jp1.add(arrBtn[i]);
            arrBtn[i].setMargin(new Insets(1, 1, 1, 1));
            arrBtn[i].addActionListener(this);
        }//fin ciclo
    }

    public static void main(String[] args) {
        ArrObjetos trin = new ArrObjetos(); //se invoca el constructor
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       return;
    }
}