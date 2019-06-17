package fiuba.algo3.minecraft.modelo.material;

import fiuba.algo3.minecraft.modelo.herramienta.*;

public class Diamante extends Material {

    private int durabilidad;
    private String sigla;

    public Diamante(){
        this.durabilidad = 100;
        this.sigla = "Di";
    }

    public int obtenerDurabilidad() {
        return durabilidad ;
    }

    public void desgastar(Hacha hacha) {
        durabilidad = durabilidad;
    }

    public void desgastar(Pico pico) {
        int fuerzaHerramienta = pico.obtenerFuerza();
        if (fuerzaHerramienta >= 20){
            durabilidad = durabilidad - fuerzaHerramienta;
        }
        else {
            durabilidad = durabilidad;
        }
    }

    @Override
    public String obtenerSigla(){
        return this.sigla;
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
