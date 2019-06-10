package fiuba.algo3.minecraft.modelo.tablero;

import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;

import java.util.Random;


public class Tablero {
    Mapa mapa ;
    Jugador jugador ;

    public Tablero(){
        mapa = new Mapa(20,50) ;
        this.inicializarMadera();
        this.inicializarDiamante();
        this.inicializarPiedra();
        this.inicializarMetal();
        jugador = new Jugador();

        this.mapa.agregarElemento(9,24,jugador);

    }

    private void inicializarMetal() {
        Random x = new Random();

        x.ints(5, 0, 19);
        Random y = new Random();
        y.ints(3, 0, 50);
        for ( int valorX : x.ints().toArray() ){
            for ( int valorY : x.ints().toArray() ) {
                mapa.agregarElemento(valorX,valorY,new Metal());
            }
        }
    }

    private void inicializarPiedra() {
        Random x = new Random();

        x.ints(8, 0, 19);
        Random y = new Random();
        y.ints(3, 0, 50);
        for ( int valorX : x.ints().toArray() ){
            for ( int valorY : x.ints().toArray() ) {
                mapa.agregarElemento(valorX,valorY,new Piedra());
            }
        }
    }

    private void inicializarDiamante() {
        Random x = new Random();

        x.ints(2, 0, 19);
        Random y = new Random();
        y.ints(2, 0, 50);
        for ( int valorX : x.ints().toArray() ){
            for ( int valorY : x.ints().toArray() ) {
                mapa.agregarElemento(valorX,valorY,new Diamante());
            }
        }
    }

    private void inicializarMadera() {
        Random x = new Random();

        x.ints(4, 0, 19);
        Random y = new Random();
        y.ints(2, 0, 50);
        for ( int valorX : x.ints().toArray() ){
            for ( int valorY : x.ints().toArray() ) {
                mapa.agregarElemento(valorX,valorY,new Madera());
            }
        }
    }

}
