package fiuba.algo3.minecraft.modelo.material;

import fiuba.algo3.minecraft.modelo.herramienta.*;
import fiuba.algo3.minecraft.modelo.jugador.Elemento;

public abstract class Material extends Elemento {

    public void desgastar(Herramienta herramienta) { this.desgastar(herramienta); }

    public abstract void desgastar(HachaDeMadera hacha);
    public abstract void desgastar(HachaDePiedra hacha);
    public abstract void desgastar(HachaDeMetal hacha);
    public abstract void desgastar(PicoDeMadera pico);
    public abstract void desgastar(PicoDePiedra pico);
    public abstract void desgastar(PicoDeMetal pico);
    public abstract void desgastar(PicoFino pico);

}
