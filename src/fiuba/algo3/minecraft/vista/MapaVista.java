package fiuba.algo3.minecraft.vista;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javax.swing.*;
import java.awt.*;

public class MapaVista {

    private VBox contenedorPrincipal;

    public MapaVista(int columnas, int filas){

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
