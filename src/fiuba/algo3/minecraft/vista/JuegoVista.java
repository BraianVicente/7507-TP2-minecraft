package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.juego.Juego;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

import javax.swing.*;

public class JuegoVista {

    private final Stage escenario;
    private AlgoCraft aplicacion;
    private Controles controles;
    private MapaVista matrizDeBotones;


    public JuegoVista(AlgoCraft aplicacion, Stage escenario){

        this.escenario = escenario;
        this.aplicacion = aplicacion;
        this.controles = new Controles();
        this.matrizDeBotones = new MapaVista(10, 10);
    }

    public void iniciar(String nombreJugador){

        Juego juego = new Juego(nombreJugador);

        VBox mapa = matrizDeBotones.obtenerMapa();

        VBox contenedorDeControles = controles.obtenerControles();

        HBox contenedorHorizontal = new HBox(contenedorDeControles, mapa);

        Scene escenaJuego = new Scene(contenedorHorizontal);

        this.escenario.setScene(escenaJuego);
    }
}
