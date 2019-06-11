package fiuba.algo3.minecraft.modelo.material;

import fiuba.algo3.minecraft.modelo.herramienta.*;

public class Piedra extends Material {

    private int durabilidad;
    private String abreviatura;

    public Piedra(){
        this.durabilidad = 30;
        this.abreviatura = "P";
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
        int fuerzaHerramienta = pico.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta;
    }

    public void desgastar(PicoDePiedra pico) {
        int fuerzaHerramienta = pico.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta;
    }

    public void desgastar(PicoDeMetal pico) {
        int fuerzaHerramienta = pico.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta;
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
        if (! (obj instanceof Piedra) )
            return false;
        return true;
    }

}
