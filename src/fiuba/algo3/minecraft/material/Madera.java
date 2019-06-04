package fiuba.algo3.minecraft.material;

import fiuba.algo3.minecraft.herramienta.*;

public class Madera implements Material {

    private int durabilidad;

    public Madera(){
        this.durabilidad = 10;
    }

    public int obtenerDurabilidad() {
        return durabilidad ;
    }

    @Override
    public void desgastar(Herramienta herramienta) {
        this.desgastar(herramienta);
    }

    @Override
    public void desgastar(HachaDeMadera hacha) {
        int fuerzaHerramienta = hacha.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta;
    }

    @Override
    public void desgastar(HachaDePiedra hacha) {
        int fuerzaHerramienta = hacha.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta;
    }

    @Override
    public void desgastar(HachaDeMetal hacha) {
        int fuerzaHerramienta = hacha.obtenerFuerza();
        hacha.desgaste.desgastar();
        durabilidad = durabilidad - fuerzaHerramienta;
    }

    @Override
    public void desgastar(PicoDeMadera pico){
        durabilidad = durabilidad;
    }

    @Override
    public void desgastar(PicoDePiedra pico){
        durabilidad = durabilidad;
    }

    @Override
    public void desgastar(PicoDeMetal pico){
        durabilidad = durabilidad;
    }

    @Override
    public void desgastar(PicoFino pico){
        durabilidad = durabilidad;
    }

}
