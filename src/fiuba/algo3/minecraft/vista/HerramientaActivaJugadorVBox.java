package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.controller.ButtonCambiarHerramientaActiva;
import fiuba.algo3.minecraft.modelo.herramienta.Hacha;
import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;
import fiuba.algo3.minecraft.modelo.herramienta.Pico;
import fiuba.algo3.minecraft.modelo.jugador.Elemento;
import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.*;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.util.Observable;
import java.util.Observer;

public class HerramientaActivaJugadorVBox extends VBox implements Observer {

    public GridPane herramienta;
    private Imagenes imagenes ;
    private final TableroDelJuego tableroDelJuego;

    public HerramientaActivaJugadorVBox(TableroDelJuego tableroDelJuego) {
        super();

        this.tableroDelJuego = tableroDelJuego;

        Jugador jugador = tableroDelJuego.obtenerJugador();
        Herramienta herramientaActiva = jugador.obtenerHerramientaActiva();

        herramienta = new GridPane();
        herramienta.setStyle("-fx-grid-lines-visible: true");

        Imagenes imagenes = new Imagenes();
        ImageView imageContainer = setImage(herramientaActiva);
        imageContainer.setFitWidth(100);
        imageContainer.setFitHeight(100);

        herramienta.add(imageContainer, 0, 0);

        herramienta.setAlignment(Pos.CENTER);

        ButtonCambiarHerramientaActiva quitar = new ButtonCambiarHerramientaActiva(tableroDelJuego);

        super.getChildren().add(herramienta);
        super.getChildren().add(quitar);

        super.setAlignment(Pos.TOP_CENTER);

        this.tableroDelJuego.obtenerJugador().addObserver(this);
        
    }

    public ImageView setImage(Herramienta herramienta) {

        Imagenes imagenes = new Imagenes();

        if (herramienta.obtenerMaterialConstruccion() instanceof Madera) {
            if (herramienta instanceof Hacha) {
                return new ImageView(imagenes.axe_wood);
            }
            if (herramienta instanceof Pico) {
                return new ImageView(imagenes.pickaxe_wood);
            }
        }
        if (herramienta.obtenerMaterialConstruccion() instanceof Piedra) {
            if (herramienta instanceof Hacha) {
                return new ImageView(imagenes.axe_stone);
            }
            if (herramienta instanceof Pico) {
                return new ImageView(imagenes.pickaxe_stone);
            }
        }
        if (herramienta.obtenerMaterialConstruccion() instanceof Metal) {
            if (herramienta instanceof Hacha) {
                return new ImageView(imagenes.axe_iron);
            }
            if (herramienta instanceof Pico) {
                return new ImageView(imagenes.pickaxe_iron);
            }
        }
        if (herramienta.obtenerMaterialConstruccion() instanceof Diamante) {
            return new ImageView(imagenes.pickaxe_diamond);
        }
        return new ImageView(imagenes.empty);
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */

    @Override
    public void update(Observable o, Object arg) {
        Herramienta herramientaActiva = tableroDelJuego.obtenerJugador().obtenerHerramientaActiva() ;
        ImageView imageContainer = setImage(herramientaActiva);
        herramienta.add(imageContainer, 0, 0);
        imageContainer.setFitWidth(100);
        imageContainer.setFitHeight(100);
    }

}

