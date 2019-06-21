package fiuba.algo3.minecraft.vista;

import javafx.application.Platform;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;

public class BarraDeMenu {

    public MenuBar barraDeMenu(){

        MenuBar menuBar = new MenuBar();

        Menu archivo = new Menu("Archivo");
        MenuItem guardar = new MenuItem("Guardar");
        MenuItem salir = new MenuItem("Salir");
        archivo.getItems().addAll(guardar, new SeparatorMenuItem(), salir);
        salir.setAccelerator(new KeyCodeCombination(KeyCode.S, KeyCodeCombination.SHORTCUT_DOWN));
        guardar.setAccelerator(new KeyCodeCombination(KeyCode.G, KeyCodeCombination.SHORTCUT_DOWN));
        salir.setOnAction(actionEvent -> Platform.exit());

        Menu help = new Menu("Help");
        MenuItem acercaDe = new MenuItem("Acerca de..");
        help.getItems().addAll(acercaDe);
        acercaDe.setAccelerator(new KeyCodeCombination(KeyCode.H, KeyCodeCombination.SHORTCUT_DOWN));

        menuBar.getMenus().addAll(archivo, help);

        return menuBar;

    }

    public MenuBar obtenerBarraDeMenu(){
        return barraDeMenu();
    }

}
