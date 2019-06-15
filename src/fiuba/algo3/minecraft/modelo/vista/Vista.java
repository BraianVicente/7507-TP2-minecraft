package fiuba.algo3.minecraft.modelo.vista;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Vista extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("AlgoCraft");

        Image titulo = new Image("imagenes/titulo.jpg");

        ImageView imageView = new ImageView(titulo);
        imageView.setFitWidth(300);
        imageView.setFitHeight(90);

        Button boton = new Button();
        boton.setText("Start");

        TextField texto = new TextField();
        texto.setPromptText("Ingrese el nombre del jugador");
        texto.setMaxWidth(250);

        VBox layoutPrincipal = new VBox(imageView, texto, boton);
        layoutPrincipal.setSpacing(15);
        layoutPrincipal.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layoutPrincipal, 500, 300);
        stage.setScene(scene);


        stage.show();
    }
}