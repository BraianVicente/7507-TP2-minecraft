package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.controller.BottonComenzarEventHandler;
import fiuba.algo3.minecraft.controller.TextoEventHandler;
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

public class AlgoCraft extends Application {

    private Stage escenario;
    private static final String tituloDeVentana = "AlgoCraft";
    public static double ancho;
    public static double alto;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {

        ancho = Screen.getPrimary().getVisualBounds().getWidth() * 0.8;
        alto = Screen.getPrimary().getVisualBounds().getHeight() * 0.8;
        this.escenario = stage;
        escenario.setTitle(tituloDeVentana);

        Image titulo = new Image("fiuba/algo3/minecraft/vista/images/titulo.jpg");
        Image background = new Image("fiuba/algo3/minecraft/vista/images/background.jpg");

        ImageView titulo1 = new ImageView(titulo);
        titulo1.setFitWidth(300);
        titulo1.setFitHeight(90);

        Button boton = new Button();
        boton.setText("Comenzar");

        TextField texto = new TextField();
        texto.setPromptText("Ingrese el nombre del jugador");
        texto.setMaxWidth(250);

        Label etiqueta = new Label();
        etiqueta.setText(texto.getText());

        VBox layoutPrincipal = new VBox(titulo1, texto, boton, etiqueta);
        layoutPrincipal.setSpacing(15);
        layoutPrincipal.setAlignment(Pos.CENTER);
        setBackground(layoutPrincipal, background);

        TextoEventHandler textoEventHandler = new TextoEventHandler(boton);
        texto.setOnKeyPressed(textoEventHandler);

        BottonComenzarEventHandler botonComenzarEventHandler = new BottonComenzarEventHandler(texto,
                etiqueta, this, escenario);
        boton.setOnAction(botonComenzarEventHandler);

        Scene scene1 = new Scene(layoutPrincipal, ancho, alto);
        escenario.setScene(scene1);

        /***********************************************/


        escenario.show();
    }

    private void setBackground(VBox layout, Image background){
        layout.setBackground(new Background(new BackgroundImage(background,
                BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT)));
    }
}