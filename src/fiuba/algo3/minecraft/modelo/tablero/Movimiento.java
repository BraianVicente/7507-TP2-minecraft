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
}
