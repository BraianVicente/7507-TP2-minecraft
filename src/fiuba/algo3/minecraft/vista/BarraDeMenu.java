package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.juego.Juego;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

import javax.swing.*;

public class BarraDeMenu {

    public MenuBar barraDeMenu(){

        MenuBar menuBar = new MenuBar();

        Menu archivo = new Menu("Archivo");
        MenuItem guardar = new MenuItem("Guardar");
        MenuItem salir = new MenuItem("Salir");
        Menu help = new Menu("Ayuda");
        MenuItem acercaDe = new MenuItem("Acerca de..");
        archivo.getItems().addAll(guardar, new SeparatorMenuItem(), salir);
        help.getItems().addAll(acercaDe);
        menuBar.getMenus().addAll(archivo, help);
        salir.setAccelerator(new KeyCodeCombination(KeyCode.S, KeyCodeCombination.SHORTCUT_DOWN));

        return menuBar;

    }

    public MenuBar obtenerBarraDeMenu(){
        return barraDeMenu();
    }

}
