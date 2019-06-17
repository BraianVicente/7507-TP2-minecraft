package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.juego.Juego;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.layout.*;
import javafx.stage.Screen;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.Label;

public class JuegoVista {

    private final Stage escenario;
    private AlgoCraft aplicacion;
    private Controles controles;
    private MapaVista matrizDeBotones;
    private Juego juego;
    private BarraDeMenu menuBar;


    public JuegoVista(AlgoCraft aplicacion, Stage escenario){

        this.escenario = escenario;
        this.aplicacion = aplicacion;
        this.controles = new Controles();
        this.menuBar = new BarraDeMenu();
    }

    public void iniciar(String nombreJugador){

        Image background = new Image("fiuba/algo3/minecraft/vista/images/background.jpg");

        this.juego = new Juego(nombreJugador);

        this.matrizDeBotones = new MapaVista(juego);

        BorderPane borderPane = new BorderPane();

        VBox mapa = matrizDeBotones.obtenerMapa();

        VBox contenedorDeControles = controles.obtenerControles(juego);

        setBackground(contenedorDeControles, background);

        HBox contenedorHorizontal = new HBox(contenedorDeControles, mapa);

        borderPane.setTop(menuBar.obtenerBarraDeMenu());

        borderPane.setCenter(contenedorHorizontal);

        Scene escenaJuego = new Scene(borderPane);

        this.escenario.setScene(escenaJuego);
    }


    private void setBackground(VBox layout, Image background){
        layout.setBackground(new Background(new BackgroundImage(background,
                BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT)));
    }


}
