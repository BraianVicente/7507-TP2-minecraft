package fiuba.algo3.minecraft.modelo.material;

import fiuba.algo3.minecraft.modelo.herramienta.*;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

public class Diamante extends Material {

    private int durabilidad;
    
    public Diamante(){
        this.durabilidad = 100;
    }

    public int obtenerDurabilidad() {
        return durabilidad ;
    }

    @Override
    public void desgastar(Herramienta herramienta) {
        herramienta.desgastar(this);
    }

    public void desgastar(Hacha hacha) { }

    public void desgastar(Pico pico) {
        int fuerzaHerramienta = pico.obtenerFuerza();
        if (fuerzaHerramienta >= 20){
            durabilidad = durabilidad - fuerzaHerramienta;
        }
        pico.desgastar(this);
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (! (obj instanceof Diamante) )
            return false;
        return true;
    }

}
