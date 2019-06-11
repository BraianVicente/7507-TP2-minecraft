package fiuba.algo3.minecraft.modelo.material;

import fiuba.algo3.minecraft.modelo.herramienta.*;

public class Madera extends Material {

    private int durabilidad;
    private String abreviatura;

    public Madera(){
        this.durabilidad = 10;
        this.abreviatura = "Ma";
    }

    public int obtenerDurabilidad() {
        return durabilidad ;
    }

    public String obtenerAbreviatura(){
        return this.abreviatura;
    }

    public void desgastar(HachaDeMadera hacha) {
        int fuerzaHerramienta = hacha.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta;
    }

    public void desgastar(HachaDePiedra hacha) {
        int fuerzaHerramienta = hacha.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta;
    }

    public void desgastar(HachaDeMetal hacha) {
        int fuerzaHerramienta = hacha.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta;
    }

    public void desgastar(PicoDeMadera pico){
        durabilidad = durabilidad;
    }

    public void desgastar(PicoDePiedra pico){
        durabilidad = durabilidad;
    }

    public void desgastar(PicoDeMetal pico){
        durabilidad = durabilidad;
    }

    public void desgastar(PicoFino pico){
        durabilidad = durabilidad;
    }

}
