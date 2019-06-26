package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.vista.botones.ButtonCambiarHerramientaActiva;
import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;
import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.geometry.Pos;
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
        this.imagenes = new Imagenes();
        this.tableroDelJuego = tableroDelJuego;
        herramienta = new GridPane();

        Jugador jugador = tableroDelJuego.obtenerJugador();
        Herramienta herramientaActiva = jugador.obtenerHerramientaActiva();

        herramienta.setStyle("-fx-grid-lines-visible: true");
        ImageView imageContainer = new ImageView(imagenes.empty) ;
        if (jugador.tieneHerramientaActiva()){
            imageContainer = (ImageView) imagenes.setImageNode(herramientaActiva);
        }
        imageContainer.setFitWidth(100);
        imageContainer.setFitHeight(100);

        herramienta.add(imageContainer, 0, 0);

        herramienta.setAlignment(Pos.CENTER);

        ButtonCambiarHerramientaActiva quitar = new ButtonCambiarHerramientaActiva(jugador);

        super.getChildren().add(herramienta);
        super.getChildren().add(quitar);

        super.setAlignment(Pos.TOP_CENTER);

        this.tableroDelJuego.obtenerJugador().addObserver(this);
        
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
        ImageView imageContainer = new ImageView(imagenes.empty);
        herramienta.add(imageContainer, 0, 0);
        imageContainer.setFitWidth(100);
        imageContainer.setFitHeight(100);
        if (tableroDelJuego.obtenerJugador().tieneHerramientaActiva()){
            Herramienta herramientaActiva = tableroDelJuego.obtenerJugador().obtenerHerramientaActiva() ;
            imageContainer = (ImageView) imagenes.setImageNode(herramientaActiva);
            herramienta.add(imageContainer, 0, 0);
            imageContainer.setFitWidth(100);
            imageContainer.setFitHeight(100);
        }
    }

}

