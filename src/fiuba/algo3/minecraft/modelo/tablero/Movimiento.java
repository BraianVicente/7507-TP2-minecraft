package fiuba.algo3.minecraft.modelo.tablero;

import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

public class Movimiento {

    private static final Integer DISTANCIA_PERMITIDA = 1 ;
    private Mapa mapa;

    public Movimiento(Mapa mapa) {
        this.mapa = mapa ;
    }

    public boolean mover(Posicion origen, Posicion destino) {
        Posicionable posicionable = mapa.obtenerElementoEnPosicion(origen);

        if (!((origen.distancia(destino)) > DISTANCIA_PERMITIDA )) {
            mapa.eliminarElemento(origen);

            mapa.agregarElemento(destino, posicionable);
            return true;
        }

        return false ;
    }

    public void moverHaciaArriba(Posicionable jugador) {
        Posicion posicionActual = jugador.obtenerPosicionActual();
        Posicion posicionDestino = this.obtenerPosicionArriba(posicionActual) ;

        this.mover(posicionActual,posicionDestino) ;

    }

    private Posicion obtenerPosicionArriba(Posicion posicion) {
        return new Posicion(posicion.obtenerX() - 1, posicion.obtenerY() );
    }

    public void moverHaciaAbajo(Posicionable jugador) {
        Posicion posicionActual = jugador.obtenerPosicionActual();
        Posicion posicionDestino = this.obtenerPosicionAbajo(posicionActual) ;

        this.mover(posicionActual,posicionDestino) ;
    }

    private Posicion obtenerPosicionAbajo(Posicion posicion) {
        return new Posicion(posicion.obtenerX() + 1, posicion.obtenerY() );
    }

    public void moverHaciaIzquierda(Posicionable jugador) {
        Posicion posicionActual = jugador.obtenerPosicionActual();
        Posicion posicionDestino = this.obtenerPosicionIzquierda(posicionActual) ;

        this.mover(posicionActual,posicionDestino) ;
    }

    private Posicion obtenerPosicionIzquierda(Posicion posicion) {
        return new Posicion(posicion.obtenerX(), posicion.obtenerY() - 1 );
    }

    public void moverHaciaDerecha(Posicionable jugador) {
        Posicion posicionActual = jugador.obtenerPosicionActual();
        Posicion posicionDestino = this.obtenerPosicionDerecha(posicionActual) ;

        this.mover(posicionActual,posicionDestino) ;
    }

    private Posicion obtenerPosicionDerecha(Posicion posicion) {
        return new Posicion(posicion.obtenerX(), posicion.obtenerY() + 1 );
    }
}
