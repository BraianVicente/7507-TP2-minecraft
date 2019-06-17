package fiuba.algo3.minecraft.vista;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.awt.*;

public class Controles {

    public VBox obtenerControles(){

        Button flechaArriba = new Button();
        flechaArriba.setText("Arriba");

        Button flechaAbajo = new Button();
        flechaAbajo.setText("Abajo");

        Button flechaIzquierda = new Button();
        flechaIzquierda.setText("Izquierda");

        Button flechaDerecha = new Button();
        flechaDerecha.setText("Derecha");

        HBox contenedorHorizontal = new HBox(flechaIzquierda, flechaAbajo, flechaDerecha);
        contenedorHorizontal.setSpacing(5);

        VBox contenedorVertical = new VBox(flechaArriba, contenedorHorizontal);
        contenedorVertical.setSpacing(5);

        return contenedorVertical;
    }
}
