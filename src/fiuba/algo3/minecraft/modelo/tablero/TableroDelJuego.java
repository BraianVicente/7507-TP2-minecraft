package fiuba.algo3.minecraft.modelo.tablero;

import fiuba.algo3.minecraft.modelo.jugador.Elemento;
import fiuba.algo3.minecraft.modelo.jugador.Inventario;
import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Material ;
import fiuba.algo3.minecraft.modelo.mesadetrabajo.MesaDeTrabajo;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

import java.util.Observable;


public class TableroDelJuego extends Observable {
    private Mapa mapa ;
    private Jugador jugador ;
    private Inventario inventarioJugador ;
    private MesaDeTrabajo mesaDeTrabajo ;
    private Movimiento movimiento;

    public TableroDelJuego(Jugador jugador, Mapa mapa) {
        this.mapa = mapa ;
        movimiento = new Movimiento(mapa) ;
        this.jugador = jugador;
    }

    public void agregarElementoAMesaTrabajoJugador(Posicion posicion,Material material){
        jugador.insertarMaterialEnMesaDeTrabajo(posicion,material);

    }


    public boolean tableroContieneJugador(){
        return tableroContieneElementoPosicionable(jugador) ;
    }

    public boolean tableroContieneElementoPosicionable(Posicionable elemento){
        return mapa.contieneElementoPosicionable(elemento);
    }

    public Posicionable obtenerElementoEnPosicion(Posicion posicion){
        Posicionable elemento = mapa.obtenerElementoEnPosicion(posicion);

        return elemento;
    }




    public String obtenerNombreDelJugador(){
        return this.jugador.obtenerNombre();
    }

    public void moverJugadorHaciaArriba() {
        movimiento.moverHaciaArriba(jugador);
        seActualizo();
    }

    public void moverJugadorHaciaAbajo() {
        movimiento.moverHaciaAbajo(jugador);
        seActualizo();
    }

    public void moverJugadorHaciaIzquierda() {
        movimiento.moverHaciaIzquierda(jugador);
        seActualizo();
    }

    public void moverJugadorHaciaDerecha() {
        movimiento.moverHaciaDerecha(jugador);
        seActualizo();
    }

    public void seActualizo(){
        super.setChanged();
        super.notifyObservers();
        super.clearChanged();
    }

    public Jugador obtenerJugador() {
        return jugador ;
    }

    public Mapa obtenerMapa() {
        return this.mapa ;
    }

    public Elemento obtenerElementoInventarioJugador(int i) {
        return this.jugador.obtenerInventario().obtenerElementoEnPosicion(i);
    }
}

