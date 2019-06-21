package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.juego.Juego;
import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import fiuba.algo3.minecraft.modelo.posicionable.Vacio;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.Observer;

public class MapaVista implements Observer {

    private final Juego juego;
    private GridPane contenedorPrincipal;

    private Image diamond,grass,iron,steve,stone,wood ;

    private void loadImageResourse(){
        diamond = new Image("fiuba/algo3/minecraft/vista/images/resource/diamond.jpeg",30,30,false,false);
        grass = new Image("fiuba/algo3/minecraft/vista/images/resource/grass.jpg ",30,30,false,false);
        iron = new Image("fiuba/algo3/minecraft/vista/images/resource/iron.jpeg",30,30,false,false);
        steve = new Image("fiuba/algo3/minecraft/vista/images/resource/steve.jpg",30,30,false,false);
        stone = new Image("fiuba/algo3/minecraft/vista/images/resource/stone.jpg",30,30,false,false);
        wood = new Image("fiuba/algo3/minecraft/vista/images/resource/wood.jpg",30,30,false,false);
    }

    public MapaVista(Juego juego){
        this.juego = juego ;
        this.loadImageResourse();
        this.inicializarMapa();
        this.pintarMapa();
    }

    public void pintarMapa() {
        for (int i = 0; i < 20; i++){
            for (int j = 0; j < 20; j++){
                contenedorPrincipal.add(establecerImage(new Posicion(i,j)),i,j);
            }
        }
    }

    public void inicializarMapa(){
        contenedorPrincipal = new GridPane();
        contenedorPrincipal.setMinSize(500,500);
        for (int i = 0; i < 20; i++){
            for (int j = 0; j < 20; j++){
                contenedorPrincipal.add(new ImageView(grass),i,j);

            }
        }
    }

    public GridPane obtenerMapa(){
        return this.contenedorPrincipal;
    }

    public Node establecerImage(Posicion posicion){

        Posicionable elemento =  juego.verQueHayEnPosicionDelTablero(posicion);
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


    @Override
    public void update(java.util.Observable o, Object arg) {
        this.pintarMapa();

    }
}
