package fiuba.algo3.minecraft;

import fiuba.algo3.minecraft.controller.BottonComenzarEventHandler;
import fiuba.algo3.minecraft.controller.TextoEventHandler;
import fiuba.algo3.minecraft.vista.MenuInicialJuego;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class  AlgoCraft extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        new MenuInicialJuego(stage) ;
    }


}