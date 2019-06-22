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
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import java.util.Observable;
import java.util.Observer;

public class VistaTableroJuego extends GridPane implements Observer {

    private final TableroDelJuego tableroDelJuego;

    private Image diamond,grass,iron,steve,stone,wood ;

    private void loadImageResourse(){
        diamond = new Image("fiuba/algo3/minecraft/vista/images/resource/diamond.jpeg",30,30,false,false);
        grass = new Image("fiuba/algo3/minecraft/vista/images/resource/grass.jpg",30,30,false,false);
        iron = new Image("fiuba/algo3/minecraft/vista/images/resource/iron.jpeg",30,30,false,false);
        steve = new Image("fiuba/algo3/minecraft/vista/images/resource/steve.jpg",30,30,false,false);
        stone = new Image("fiuba/algo3/minecraft/vista/images/resource/stone.jpg",30,30,false,false);
        wood = new Image("fiuba/algo3/minecraft/vista/images/resource/wood.jpg",30,30,false,false);
    }

    public VistaTableroJuego(TableroDelJuego tableroDelJuego){
        this.tableroDelJuego = tableroDelJuego;
        this.loadImageResourse();
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
        super.setMinSize(500,500);
        for (int i = 0; i < 20; i++){
            for (int j = 0; j < 20; j++){
                Node imageContainer = new ImageView(grass) ;
                super.add(imageContainer,j,i);

            }
        }
    }

    public Node establecerImage(Posicion posicion){

        Posicionable elemento =  tableroDelJuego.obtenerElementoEnPosicion(posicion);
        if ( elemento instanceof Jugador){
            return new ImageView(steve) ;
        }
        if (elemento instanceof Vacio){
            return new ImageView(grass) ;
        }
        if (elemento instanceof Diamante){
            return new ImageView(diamond) ;
        }
        if (elemento instanceof Madera){
            return new ImageView(wood) ;
        }
        if (elemento instanceof Piedra){
            return new ImageView(stone) ;
        }
        if (elemento instanceof Metal){
            return new ImageView(iron) ;
        }

        return new ImageView(grass) ;
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
