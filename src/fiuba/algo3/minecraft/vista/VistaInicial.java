package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.vista.manejadores.BottonComenzarEventHandler;
import fiuba.algo3.minecraft.vista.manejadores.TextoEventHandler;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class VistaInicial extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Jugador jugador = new Jugador();

        stage.setTitle("AlgoCraft");

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
        layoutPrincipal.setBackground(new Background(new BackgroundImage(background,
                BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT)));

        BottonComenzarEventHandler botonComenzarEventHandler = new BottonComenzarEventHandler(texto, etiqueta, jugador);
        boton.setOnAction(botonComenzarEventHandler);

        TextoEventHandler textoEventHandler = new TextoEventHandler(boton);
        texto.setOnKeyPressed(textoEventHandler);

        Scene scene = new Scene(layoutPrincipal, 500, 300);
        stage.setScene(scene);
        stage.setResizable(false);


        stage.show();
    }
}