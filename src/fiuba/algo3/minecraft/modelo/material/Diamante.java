package fiuba.algo3.minecraft.modelo.material;

import fiuba.algo3.minecraft.modelo.herramienta.*;

public class Diamante extends Material {

    private int durabilidad;
    private String abreviatura;

    public Diamante(){
        this.durabilidad = 100;
        this.abreviatura = "D";
    }

    public int obtenerDurabilidad() {
        return durabilidad ;
    }

    public String obtenerAbreviatura(){
        return this.abreviatura;
    }

    public void desgastar(HachaDeMadera hacha) {
        durabilidad = durabilidad;
    }

    public void desgastar(HachaDePiedra hacha) {
        durabilidad = durabilidad;
    }

    public void desgastar(HachaDeMetal hacha) {
        durabilidad = durabilidad;
    }

    public void desgastar(PicoDeMadera pico) {
        durabilidad = durabilidad;
    }

    public void desgastar(PicoDePiedra pico) {
        durabilidad = durabilidad;
    }

    public void desgastar(PicoDeMetal pico) {
        durabilidad = durabilidad;
    }

    public void desgastar(PicoFino pico) {
        int fuerzaHerramienta = pico.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta;
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
