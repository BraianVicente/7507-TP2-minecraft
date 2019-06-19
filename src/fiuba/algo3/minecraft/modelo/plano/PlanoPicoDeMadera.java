package fiuba.algo3.minecraft.modelo.plano;

import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;
import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Madera;

public class PlanoPicoDeMadera extends Plano{

    public PlanoPicoDeMadera(){
        plano = new Mapa(3, 3);
        plano.agregarElemento(new Posicion(0,0), new Madera());
        plano.agregarElemento(new Posicion(1,0), new Madera());
        plano.agregarElemento(new Posicion(2,0), new Madera());
        plano.agregarElemento(new Posicion(1,1), new Madera());
        plano.agregarElemento(new Posicion(1,2), new Madera());
    }

    @Override
    public Herramienta construir() {
        return fabrica.construirPicoDeMadera();
    }

}
