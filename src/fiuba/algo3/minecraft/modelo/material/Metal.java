package fiuba.algo3.minecraft.modelo.material;

import fiuba.algo3.minecraft.modelo.herramienta.*;

public class Metal extends Material {

    private int durabilidad;

    public Metal(){
        this.durabilidad = 50;
    }

    public int obtenerDurabilidad() {
        return durabilidad ;
    }

    public void desgastar(Hacha hacha) {
        durabilidad = durabilidad;
    }

    public void desgastar(Pico pico) {
        int fuerzaHerramienta = pico.obtenerFuerza();
        if (fuerzaHerramienta >= 4){
            durabilidad = durabilidad - fuerzaHerramienta;
        }
        else {
            durabilidad = durabilidad;
        }
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
}
