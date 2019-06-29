package fiuba.algo3.minecraft.modelo.tablero;

import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Material;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import fiuba.algo3.minecraft.modelo.posicionable.Vacio;

public class Movimiento {

    private Mapa mapa;

    public Movimiento(Mapa mapa) {
        this.mapa = mapa ;
    }

    private void mover(Posicion origen, Posicion destino) {
        Posicionable posicionable = mapa.obtenerElementoEnPosicion(origen);
        if (mapa.agregarElemento(destino, posicionable)){
            mapa.eliminarElemento(origen);
        }
    }

    public void moverHaciaArriba(Posicionable jugador) {
        Posicion posicionActual = jugador.obtenerPosicionActual();
        Posicion posicionDestino = this.obtenerPosicionArriba(posicionActual);

        moverYActualizar(posicionActual, posicionDestino, jugador);

    }

    private Posicion obtenerPosicionArriba(Posicion posicion) {
        return new Posicion(posicion.obtenerX() - 1, posicion.obtenerY() );
    }

    public void moverHaciaAbajo(Posicionable jugador) {
        Posicion posicionActual = jugador.obtenerPosicionActual();
        Posicion posicionDestino = this.obtenerPosicionAbajo(posicionActual) ;

        moverYActualizar(posicionActual, posicionDestino, jugador);
    }

    private Posicion obtenerPosicionAbajo(Posicion posicion) {
        return new Posicion(posicion.obtenerX() + 1, posicion.obtenerY() );
    }

    public void moverHaciaIzquierda(Posicionable jugador) {
        Posicion posicionActual = jugador.obtenerPosicionActual();
        Posicion posicionDestino = this.obtenerPosicionIzquierda(posicionActual) ;

        moverYActualizar(posicionActual, posicionDestino, jugador);
    }

    private Posicion obtenerPosicionIzquierda(Posicion posicion) {
        return new Posicion(posicion.obtenerX(), posicion.obtenerY() - 1 );
    }

    public void moverHaciaDerecha(Posicionable jugador) {
        Posicion posicionActual = jugador.obtenerPosicionActual();
        Posicion posicionDestino = this.obtenerPosicionDerecha(posicionActual) ;

        moverYActualizar(posicionActual, posicionDestino, jugador);
    }

    private Posicion obtenerPosicionDerecha(Posicion posicion) {
        return new Posicion(posicion.obtenerX(), posicion.obtenerY() + 1 );
    }

    private void moverYActualizar(Posicion posicionActual, Posicion posicionDestino, Posicionable jugador){
        if (mapa.posicionSeEncuentraOcupada(posicionDestino)){
            ((Jugador) jugador).golpearMaterial((Material) mapa.obtenerElementoEnPosicion(posicionDestino));

            if ( ((Material) mapa.obtenerElementoEnPosicion(posicionDestino)).obtenerDurabilidad() <= 0){
                mapa.eliminarElemento(posicionDestino);
                mapa.agregarElemento(posicionDestino, new Vacio());
            }
        }
        else {
            this.mover(posicionActual,posicionDestino);
        }

    }
}
