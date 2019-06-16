package fiuba.algo3.minecraft.modelo.material;

import fiuba.algo3.minecraft.modelo.herramienta.*;
import fiuba.algo3.minecraft.modelo.jugador.Elemento;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

public abstract class Material extends Elemento implements Posicionable {

    public void desgastar(Herramienta herramienta) { this.desgastar(herramienta); }

    public abstract void desgastar(Hacha hacha);
    public abstract void desgastar(Pico pico);

}
