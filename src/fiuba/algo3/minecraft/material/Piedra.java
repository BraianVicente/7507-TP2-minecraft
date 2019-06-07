package fiuba.algo3.minecraft.material;

import fiuba.algo3.minecraft.herramienta.*;

public class Piedra extends Material {

    private int durabilidad;

    public Piedra(){
        this.durabilidad = 30;
    }

    public int obtenerDurabilidad() {
        return durabilidad ;
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
}
