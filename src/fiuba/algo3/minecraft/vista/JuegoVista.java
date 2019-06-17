package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.juego.Juego;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
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

        BorderPane borderPane = new BorderPane();

        MenuBar menuBar = new MenuBar();
        Menu archivo = new Menu("Archivo");
        MenuItem guardar = new MenuItem("Guardar");
        MenuItem salir = new MenuItem("Salir");
        Menu help = new Menu("Ayuda");
        MenuItem acercaDe = new MenuItem("Acerca de..");
        archivo.getItems().addAll(guardar, new SeparatorMenuItem(), salir);
        help.getItems().addAll(acercaDe);
        menuBar.getMenus().addAll(archivo, help);

        borderPane.setTop(menuBar);

        VBox mapa = matrizDeBotones.obtenerMapa();

        VBox contenedorDeControles = controles.obtenerControles();

        HBox contenedorHorizontal = new HBox(contenedorDeControles, mapa);

        borderPane.setCenter(contenedorHorizontal);

        Scene escenaJuego = new Scene(borderPane);

        this.escenario.setScene(escenaJuego);
    }
}
