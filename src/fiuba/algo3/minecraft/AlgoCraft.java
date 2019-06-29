package fiuba.algo3.minecraft;

import fiuba.algo3.minecraft.vista.MenuInicioJuego;
import javafx.application.Application;
import javafx.stage.Stage;

public class  AlgoCraft extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        new MenuInicioJuego(stage) ;
    }


}