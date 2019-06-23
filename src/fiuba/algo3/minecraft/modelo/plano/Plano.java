package fiuba.algo3.minecraft.modelo.plano;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;
import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

public abstract class Plano {

    protected Mapa plano;
    protected FabricaDeHerramientas fabrica;

    protected Plano(){
        fabrica = new FabricaDeHerramientas() ;
    }

    public Mapa obtenerPlano(){
        return plano;
    }

    public Posicionable obtenerElementoEnPosicion(Posicion posicion){
        Posicionable elemento = plano.obtenerElementoEnPosicion(posicion);

        return elemento;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (! (obj instanceof Plano) )
            return false;
        return this.plano.equals(((Plano) obj).obtenerPlano());
    }

    public abstract Herramienta construir();
}
