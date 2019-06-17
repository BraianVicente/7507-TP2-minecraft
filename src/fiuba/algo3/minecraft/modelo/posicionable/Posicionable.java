package fiuba.algo3.minecraft.modelo.posicionable;

import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;

public interface Posicionable {

    void establecerPosicion(Posicion posicion);

    Posicion obtenerPosicionActual();
}
