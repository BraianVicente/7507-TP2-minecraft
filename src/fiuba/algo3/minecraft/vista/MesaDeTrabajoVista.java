package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.controller.ButtonLimpiar;
import fiuba.algo3.minecraft.modelo.jugador.Elemento;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Material;
import fiuba.algo3.minecraft.modelo.mesadetrabajo.MesaDeTrabajo;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.util.Observable;
import java.util.Observer;

public class MesaDeTrabajoVista extends VBox implements Observer {


    private MesaDeTrabajo mesaTrabajoJugador;
    private Imagenes imagenes ;
    private GridPane mesaTrabajoPane;

    public MesaDeTrabajoVista(MesaDeTrabajo mesaJugador){
        super();

        this.mesaTrabajoJugador = mesaJugador ;
        mesaTrabajoPane = new GridPane();
        mesaTrabajoPane.setStyle("-fx-grid-lines-visible: true");

        imagenes = new Imagenes() ;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                Node imageContainer = new ImageView(imagenes.empty) ;
                mesaTrabajoPane.add(imageContainer,j,i);
            }
        }
        mesaTrabajoPane.setAlignment(Pos.CENTER);
        super.getChildren().add(mesaTrabajoPane);

        Button botonConstruir = new Button();
        botonConstruir.setText("Construir");

        Button botonLimpiar = new ButtonLimpiar(mesaJugador);

        this.getChildren().add(botonConstruir);
        this.getChildren().add(botonLimpiar);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);

        this.mesaTrabajoJugador.addObserver(this);

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
                Posicionable material = mesaTrabajoJugador.obtenerMaterialEnPosicion(new Posicion(i,j));
                if (material instanceof Material){
                    Node imageContainer = imagenes.setImageNode((Elemento) material);
                    mesaTrabajoPane.add(imageContainer,j,i);
                } else {
                    Node imageContainer = new ImageView(imagenes.empty) ;
                    mesaTrabajoPane.add(imageContainer,j,i);
                }
            }
        }
    }
}
