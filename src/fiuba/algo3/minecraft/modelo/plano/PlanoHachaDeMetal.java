package fiuba.algo3.minecraft.modelo.plano;

import fiuba.algo3.minecraft.modelo.desgaste.DesgasteEstandar;
import fiuba.algo3.minecraft.modelo.herramienta.Hacha;
import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;
import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;

public class PlanoHachaDeMetal extends Plano{

    public PlanoHachaDeMetal(){
        plano = new Mapa(3, 3);
        plano.agregarElemento(new Posicion(0,0), new Metal());
        plano.agregarElemento(new Posicion(1,0), new Metal());
        plano.agregarElemento(new Posicion(0,1), new Metal());
        plano.agregarElemento(new Posicion(1,1), new Madera());
        plano.agregarElemento(new Posicion(1,2), new Madera());
    }

    @Override
    public Herramienta construir() {
        return new Hacha(new DesgasteEstandar(400, 10, 0.5F));
    }

}
