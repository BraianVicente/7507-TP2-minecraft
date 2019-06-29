package fiuba.algo3.minecraft.modelo.material;

import fiuba.algo3.minecraft.modelo.herramienta.*;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

public class Metal extends Material {

    private int durabilidad;

    public Metal(){
        this.durabilidad = 50;
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
        if (fuerzaHerramienta >= 4){
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
        if (! (obj instanceof Metal) )
            return false;
        return true;
    }

    public boolean estaRoto(){
        if (durabilidad <= 0){
            return true;
        }
        else {
            return false;
        }
    }

}
