package fiuba.algo3.minecraft.modelo.plano;

import fiuba.algo3.minecraft.modelo.desgaste.DesgasteNoConvencional;
import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;
import fiuba.algo3.minecraft.modelo.herramienta.Pico;
import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;

public class PlanoPicoDeMetal extends Plano{

    public PlanoPicoDeMetal(){
        super() ;
        super.agregarElemento(new Posicion(0,0), new Metal());
        super.agregarElemento(new Posicion(1,0), new Metal());
        super.agregarElemento(new Posicion(2,0), new Metal());
        super.agregarElemento(new Posicion(1,1), new Madera());
        super.agregarElemento(new Posicion(1,2), new Madera());
    }

    @Override
    public Herramienta construir() {

        return fabrica.construirPicoDeMetal();

    }
}
