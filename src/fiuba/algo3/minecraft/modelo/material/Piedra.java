package fiuba.algo3.minecraft.modelo.material;

import fiuba.algo3.minecraft.modelo.herramienta.*;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

public class Piedra extends Material {

    private int durabilidad;
    private String sigla;

    public Piedra(){
        this.durabilidad = 30;
        this.sigla = "Pi";
    }

    public int obtenerDurabilidad() {
        return durabilidad ;
    }

    @Override
    public void desgastar(Herramienta herramienta) {
        herramienta.desgastar(this);
    }

    public void desgastar(Hacha hacha) {
        durabilidad = durabilidad;
    }

    public void desgastar(Pico pico) {
        int fuerzaHerramienta = pico.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (! (obj instanceof Piedra) )
            return false;
        return true;
    }

}
