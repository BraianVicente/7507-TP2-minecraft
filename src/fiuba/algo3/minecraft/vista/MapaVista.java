package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.juego.Juego;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;

import javax.swing.*;
import java.awt.*;

public class MapaVista {

    private VBox contenedorPrincipal;

    public MapaVista(int columnas, int filas, Juego juego){

        this.contenedorPrincipal = new VBox();

        for (int i = 0; i < filas; i++){
            HBox fila = new HBox();
            for (int j = 0; j < columnas; j++){
                Button boton = new Button();
                boton.setText(juego.verQueHayEnPosicionDelTablero(i, j));
                fila.getChildren().add(boton);
            }
            this.contenedorPrincipal.getChildren().add(fila);
        }

    }

    public VBox obtenerMapa(){
        return this.contenedorPrincipal;
    }
}
