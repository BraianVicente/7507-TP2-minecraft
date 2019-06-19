package fiuba.algo3.minecraft.modelo.plano;

import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

public abstract class Plano {

    protected Mapa plano;

    public Mapa obtenerPlano(){
        return plano;
    }

    public Posicionable obtenerElementoEnPosicion(Posicion posicion){
        Posicionable elemento = plano.obtenerElementoEnPosicion(posicion);

        return elemento;
    }

}
