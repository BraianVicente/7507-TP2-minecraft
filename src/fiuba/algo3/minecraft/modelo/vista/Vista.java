package fiuba.algo3.minecraft.modelo.vista;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Vista extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("AlgoCraft");

        Button boton = new Button();
        boton.setText("Start");

        TextField texto = new TextField();
        texto.setPromptText("Ingrese el nombre del jugador");

        VBox layoutPrincipal = new VBox(texto, boton);

        Scene scene = new Scene(layoutPrincipal, 500, 300);
        stage.setScene(scene);


        stage.show();
    }
}