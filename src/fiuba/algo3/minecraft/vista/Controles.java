package fiuba.algo3.minecraft.vista;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Controles {

    public VBox obtenerControles(){

        Button flechaArriba = new Button("Arriba");

        Button flechaAbajo = new Button("Abajo");

        Button flechaIzquierda = new Button("Izquierda");

        Button flechaDerecha = new Button("Derecha");

        HBox contenedorHorizontal = new HBox(flechaIzquierda, flechaAbajo, flechaDerecha);
        contenedorHorizontal.setSpacing(5);
        contenedorHorizontal.setAlignment(Pos.CENTER);

        VBox contenedorVertical = new VBox(flechaArriba, contenedorHorizontal);
        contenedorVertical.setSpacing(5);
        contenedorVertical.setAlignment(Pos.BOTTOM_CENTER);



        return contenedorVertical;
    }
}
