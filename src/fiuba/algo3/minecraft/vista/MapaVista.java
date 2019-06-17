package fiuba.algo3.minecraft.vista;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;

import javax.swing.*;
import java.awt.*;

public class MapaVista {

    private VBox contenedorPrincipal;
    public static double ancho;
    public static double alto;

    public MapaVista(int columnas, int filas){

        ancho = Screen.getPrimary().getVisualBounds().getWidth() * 0.8;
        alto = Screen.getPrimary().getVisualBounds().getHeight() * 0.8;

        this.contenedorPrincipal = new VBox();

        for (int i = 0; i < filas; i++){
            HBox fila = new HBox();
            for (int j = 0; j < columnas; j++){
                fila.getChildren().add(new Button());
            }
            this.contenedorPrincipal.getChildren().add(fila);
        }

    }

    public VBox obtenerMapa(){
        return this.contenedorPrincipal;
    }
}
