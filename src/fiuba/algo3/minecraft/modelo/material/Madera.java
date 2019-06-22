package fiuba.algo3.minecraft.modelo.material;

import fiuba.algo3.minecraft.modelo.herramienta.*;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

public class Madera extends Material {

    private int durabilidad;
    private String sigla;

    public Madera(){
        this.durabilidad = 10;
        this.sigla = "Ma";
    }

    public int obtenerDurabilidad() {
        return durabilidad ;
    }

    public void desgastar(Hacha hacha) {
        int fuerzaHerramienta = hacha.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta;
    }

    public void desgastar(Pico pico){
        durabilidad = durabilidad;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (! (obj instanceof Madera) )
            return false;
        return true;
    }

}
