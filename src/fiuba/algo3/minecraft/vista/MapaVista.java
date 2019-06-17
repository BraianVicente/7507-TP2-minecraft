package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.juego.Juego;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

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
                Rectangle rectangulo= new Rectangle(30,30);
                rectangulo = establecerColor(rectangulo, juego.verQueHayEnPosicionDelTablero(i, j));
                fila.getChildren().add(rectangulo);
            }
            this.contenedorPrincipal.getChildren().add(fila);
        }

    }

    public VBox obtenerMapa(){
        return this.contenedorPrincipal;
    }

    public Rectangle establecerColor(Rectangle rectangulo , String sigla){
        if (sigla == "Ju"){
            rectangulo.setFill(Color.RED);
        }
        if (sigla == "  "){
            rectangulo.setFill(Color.WHITE);
        }
        if (sigla == "Di"){
            rectangulo.setFill(Color.LIGHTBLUE);
        }
        if (sigla == "Ma"){
            rectangulo.setFill(Color.SADDLEBROWN);
        }
        if (sigla == "Me"){
            rectangulo.setFill(Color.LIGHTGRAY);
        }
        if (sigla == "Pi"){
            rectangulo.setFill(Color.GRAY);
        }

        return rectangulo;

    }


}
