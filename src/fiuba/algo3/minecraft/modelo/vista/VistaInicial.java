package fiuba.algo3.minecraft.modelo.vista;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class VistaInicial extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("AlgoCraft");

        Image titulo = new Image("imagenes/titulo.jpg");
        Image background = new Image("imagenes/background.jpg");

        ImageView titulo1 = new ImageView(titulo);
        titulo1.setFitWidth(300);
        titulo1.setFitHeight(90);

        Button boton = new Button();
        boton.setText("Start");

        TextField texto = new TextField();
        texto.setPromptText("Ingrese el nombre del jugador");
        texto.setMaxWidth(250);

        VBox layoutPrincipal = new VBox(titulo1, texto, boton);
        layoutPrincipal.setSpacing(15);
        layoutPrincipal.setAlignment(Pos.CENTER);
        layoutPrincipal.setBackground(new Background(new BackgroundImage(background,
                BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT)));

        Scene scene = new Scene(layoutPrincipal, 500, 300);
        stage.setScene(scene);
        stage.setResizable(false);


        stage.show();
    }
}