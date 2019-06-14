package fiuba.algo3.minecraft.modelo.tablero;

import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

import java.util.Random;


public class Tablero {
    private Mapa mapa ;
    private Jugador jugador ;
    private int largoTablero;
    private int  altoTablero;

    public Tablero(){
        largoTablero = 20 ;
        altoTablero = 50 ;
        mapa = new Mapa(largoTablero, altoTablero) ;
        jugador = new Jugador();

        int posicionXInicialJugador = (largoTablero / 2 )- 1 ;
        int posicionYInicialJugador = (altoTablero / 2 )- 1 ;
        this.mapa.agregarElemento(new Posicion (posicionXInicialJugador,posicionYInicialJugador),jugador);

        this.inicializarMadera(altoTablero);
        this.inicializarDiamante(largoTablero/4);
        this.inicializarPiedra(altoTablero/2);
        this.inicializarMetal(largoTablero/2);


    }

    public boolean tableroContieneJugador(){
        return tableroContieneElementoPosicionable(jugador) ;
    }

    public boolean tableroContieneElementoPosicionable(Posicionable elemento){
        return mapa.contieneElementoPosicionable(elemento);
    }

    private void inicializarMetal(int cantidadMateriales) {

        int randomLargo ;
        int randomAlto ;
        for ( int i = 0 ; i <= cantidadMateriales ; i++ ){
            do {
                Random aleatorio = new Random(System.currentTimeMillis());

                randomLargo = aleatorio.nextInt(largoTablero - 1);
                randomAlto = aleatorio.nextInt(altoTablero - 1);

            } while (! mapa.agregarElemento(new Posicion(randomLargo,randomAlto),new Metal())) ;

        }
    }

    private void inicializarPiedra(int cantidadMateriales) {

        int randomLargo ;
        int randomAlto ;
        for ( int i = 0 ; i <= cantidadMateriales ; i++ ){
            do {
                Random aleatorio = new Random(System.currentTimeMillis());

                randomLargo = aleatorio.nextInt(largoTablero - 1);
                randomAlto = aleatorio.nextInt(altoTablero - 1);

            } while (! mapa.agregarElemento(new Posicion(randomLargo,randomAlto),new Piedra())) ;

        }
    }

    private void inicializarDiamante(int cantidadMateriales) {

        int randomLargo ;
        int randomAlto ;
        for ( int i = 0 ; i <= cantidadMateriales ; i++ ){
            do {
                Random aleatorio = new Random(System.currentTimeMillis());

                randomLargo = aleatorio.nextInt(largoTablero - 1);
                randomAlto = aleatorio.nextInt(altoTablero - 1);

            } while (! mapa.agregarElemento(new Posicion(randomLargo,randomAlto),new Diamante())) ;

        }
    }

    private void inicializarMadera(int cantidadMateriales) {
        int randomLargo ;
        int randomAlto ;
        for ( int i = 0 ; i <= cantidadMateriales ; i++ ){
            do {
                Random aleatorio = new Random(System.currentTimeMillis());

                randomLargo = aleatorio.nextInt(largoTablero - 1);
                randomAlto = aleatorio.nextInt(altoTablero - 1);

            } while (! mapa.agregarElemento(new Posicion(randomLargo,randomAlto),new Madera())) ;

        }
    }

    public boolean mover(Posicion posicionNuevaDelJugador, Jugador jugador) {
        return mapa.moverElemento(posicionNuevaDelJugador, jugador);
    }

}

