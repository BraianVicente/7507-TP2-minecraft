package fiuba.algo3.minecraft.modelo.plano;

import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Piedra;

public class PlanoPicoDePiedra{

    private Mapa plano;

    public PlanoPicoDePiedra(){
        plano = new Mapa(3, 3);
        plano.agregarElemento(new Posicion(0,0), new Piedra());
        plano.agregarElemento(new Posicion(1,0), new Piedra());
        plano.agregarElemento(new Posicion(2,0), new Piedra());
        plano.agregarElemento(new Posicion(1,1), new Madera());
        plano.agregarElemento(new Posicion(1,2), new Madera());
    }

}
