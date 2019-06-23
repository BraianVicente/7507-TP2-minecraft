package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.controller.ButtonConstruir;
import fiuba.algo3.minecraft.controller.ButtonLimpiar;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.mesadetrabajo.MesaDeTrabajo;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import fiuba.algo3.minecraft.modelo.posicionable.Vacio;
import fiuba.algo3.minecraft.vista.images.Imagenes;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.util.Observable;
import java.util.Observer;

public class MesaDeTrabajoVista extends VBox implements Observer {


    private final MesaDeTrabajo mesaJugador;
    private Imagenes imagenes ;
    private GridPane mesaTrabajo ;

    public MesaDeTrabajoVista(MesaDeTrabajo mesaJugador){
        super();

        this.mesaJugador = mesaJugador ;
        mesaTrabajo = new GridPane();
        mesaTrabajo.setStyle("-fx-grid-lines-visible: true");

        imagenes = new Imagenes() ;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                Node imageContainer = new ImageView(imagenes.empty) ;
                mesaTrabajo.add(imageContainer,j,i);
            }
        }
        mesaTrabajo.setAlignment(Pos.CENTER);
        super.getChildren().add(mesaTrabajo);

        Button botonConstruir = new ButtonConstruir(this.mesaJugador);

        Button botonLimpiar = new ButtonLimpiar(this.mesaJugador);

        this.getChildren().add(botonConstruir);
        this.getChildren().add(botonLimpiar);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);

        this.mesaJugador.addObserver(this);

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
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                Posicionable material = mesaJugador.obtenerMaterialEnPosicion(new Posicion(i,j)) ;
                if (! (material instanceof Vacio)){
                    Node imageContainer = imagenes.setImageNode(material);
                    mesaTrabajo.add(imageContainer,j,i);

                }
            }
        }
    }
}
