package fiuba.algo3.minecraft.vista;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;

import java.awt.*;

public class Controles {

    public VBox obtenerControles(){

        VBox contenedor = obtenerControlesDeMovimento();




        return contenedor;
    }

    public VBox obtenerControlesDeMovimento(){
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
        contenedorHorizontal.setAlignment(Pos.CENTER);

        VBox contenedorVertical = new VBox(flechaArriba, contenedorHorizontal);
        contenedorVertical.setSpacing(5);
        contenedorVertical.setAlignment(Pos.BOTTOM_CENTER);

        return contenedorVertical;
    }
}
