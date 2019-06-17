package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.juego.Juego;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class JuegoVista {

    private final Stage escenario;
    private AlgoCraft aplicacion;
    private Controles controles;
    public static double ancho;
    public static double alto;


    public JuegoVista(AlgoCraft aplicacion, Stage escenario){

        this.escenario = escenario;
        this.aplicacion = aplicacion;
        this.controles = new Controles();
    }

    public void iniciar(String nombreJugador){

        ancho = Screen.getPrimary().getVisualBounds().getWidth() * 0.8;
        alto = Screen.getPrimary().getVisualBounds().getHeight() * 0.8;

        Juego juego = new Juego(nombreJugador);



        VBox contenedorDeControles = controles.obtenerControles();

        HBox contenedorHorizontal = new HBox(contenedorDeControles);

        Scene escenaJuego = new Scene(contenedorHorizontal, ancho, alto);

        this.escenario.setScene(escenaJuego);
    }
}
