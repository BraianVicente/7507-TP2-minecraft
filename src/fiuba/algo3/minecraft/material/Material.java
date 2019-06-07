package fiuba.algo3.minecraft.material;

import fiuba.algo3.minecraft.herramienta.*;

public abstract class Material {

    public void desgastar(Herramienta herramienta) { this.desgastar(herramienta); }

    public abstract void desgastar(HachaDeMadera hacha);
    public abstract void desgastar(HachaDePiedra hacha);
    public abstract void desgastar(HachaDeMetal hacha);
    public abstract void desgastar(PicoDeMadera pico);
    public abstract void desgastar(PicoDePiedra pico);
    public abstract void desgastar(PicoDeMetal pico);
    public abstract void desgastar(PicoFino pico);

}
