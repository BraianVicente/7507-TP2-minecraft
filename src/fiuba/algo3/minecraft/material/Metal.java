package fiuba.algo3.minecraft.material;

import fiuba.algo3.minecraft.herramienta.*;

public class Metal implements Material {

    private int durabilidad;

    public Metal(){
        this.durabilidad = 50;
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
        durabilidad = durabilidad;
    }

    @Override
    public void desgastar(HachaDePiedra hacha) {
        durabilidad = durabilidad;
    }

    @Override
    public void desgastar(HachaDeMetal hacha) {
        durabilidad = durabilidad;
    }

    @Override
    public void desgastar(PicoDeMadera pico) {
        durabilidad = durabilidad;
    }

    @Override
    public void desgastar(PicoDePiedra pico) {
        int fuerzaHerramienta = pico.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta;
    }

    @Override
    public void desgastar(PicoDeMetal pico) {
        int fuerzaHerramienta = pico.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta;
    }

    @Override
    public void desgastar(PicoFino pico) {
        int fuerzaHerramienta = pico.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta;
    }
}
