package fiuba.algo3.minecraft.modelo.material;

import fiuba.algo3.minecraft.modelo.herramienta.*;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

public abstract class Material implements Posicionable {

    public void desgastar(Herramienta herramienta) { this.desgastar(herramienta); }

    public abstract void desgastar(HachaDeMadera hacha);
    public abstract void desgastar(HachaDePiedra hacha);
    public abstract void desgastar(HachaDeMetal hacha);
    public abstract void desgastar(PicoDeMadera pico);
    public abstract void desgastar(PicoDePiedra pico);
    public abstract void desgastar(PicoDeMetal pico);
    public abstract void desgastar(PicoFino pico);

}
