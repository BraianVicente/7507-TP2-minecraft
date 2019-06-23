package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.controller.MovimientoEventHandler;
import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import fiuba.algo3.minecraft.modelo.posicionable.Vacio;
import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import fiuba.algo3.minecraft.vista.images.Imagenes;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import java.util.Observable;
import java.util.Observer;

public class VistaTableroJuego extends GridPane implements Observer {
    private Imagenes imagenes;
    private final TableroDelJuego tableroDelJuego;

    public VistaTableroJuego(TableroDelJuego tableroDelJuego){
        this.tableroDelJuego = tableroDelJuego;
        this.imagenes = new Imagenes();
        this.inicializarMapa();
        this.pintarMapa();
        tableroDelJuego.addObserver(this);
    }

    public void pintarMapa() {
        for (int i = 0; i < 20; i++){
            for (int j = 0; j < 20; j++){
                super.add(establecerImage(new Posicion(i,j)),j,i);
            }
        }
    }

    public void inicializarMapa(){
        super.setMinSize(600,600);
        for (int i = 0; i < 20; i++){
            for (int j = 0; j < 20; j++){
                Node imageContainer = new ImageView(imagenes.grass) ;
                super.add(imageContainer,j,i);

            }
        }
    }

    public Node establecerImage(Posicion posicion) {

        Posicionable elemento = tableroDelJuego.obtenerElementoEnPosicion(posicion);
        return imagenes.setImageNode(elemento);
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
        this.pintarMapa();
    }
}
