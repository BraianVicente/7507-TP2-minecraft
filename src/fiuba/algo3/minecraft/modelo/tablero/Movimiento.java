package fiuba.algo3.minecraft.modelo.tablero;

import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

public class Movimiento {

    private Mapa mapa;

    public Movimiento(Mapa mapa) {
        this.mapa = mapa ;
    }

    public Posicion obtenerPosicionArriba(Posicion posicion) {
        return new Posicion(posicion.obtenerX() - 1, posicion.obtenerY() ) ;
    }

    public Posicion obtenerPosicionAbajo(Posicion posicion) {
        return new Posicion(posicion.obtenerX() + 1, posicion.obtenerY() ) ;

    }
    public Posicion obtenerPosicionIzquierda(Posicion posicion) {
        return new Posicion(posicion.obtenerX(), posicion.obtenerY() - 1  ) ;
    }

    public Posicion obtenerPosicionDerecha(Posicion posicion) {
        return new Posicion(posicion.obtenerX(), posicion.obtenerY() + 1  ) ;
    }

    public Posicion obtenerPosicionArribaIzquierda(Posicion posicion) {
        return new Posicion(posicion.obtenerX() - 1, posicion.obtenerY() - 1 ) ;
    }

    public Posicion obtenerPosicionArribaDerecha(Posicion posicion) {
        return new Posicion(posicion.obtenerX() - 1 , posicion.obtenerY() + 1  ) ;
    }

    public Posicion obtenerPosicionAbajoDerecha(Posicion posicion) {
        return new Posicion(posicion.obtenerX() + 1 , posicion.obtenerY() + 1  ) ;
    }

    public Posicion obtenerPosicionAbajoIzquierda(Posicion posicion) {
        return new Posicion(posicion.obtenerX() + 1, posicion.obtenerY() - 1  ) ;
    }

    public void moverHaciaArribaDesde(Posicion posicion) {
        Posicionable posicionable = mapa.obtenerElementoEnPosicion(posicion);

        mapa.agregarElemento(this.obtenerPosicionArriba(posicion),posicionable);

        mapa.eliminarElemento(posicion);
    }

    public void moverHaciaAbajoDesde(Posicion posicion) {
        Posicionable posicionable = mapa.obtenerElementoEnPosicion(posicion);
        mapa.agregarElemento(this.obtenerPosicionAbajo(posicion),posicionable);
        mapa.eliminarElemento(posicion);
    }
}
