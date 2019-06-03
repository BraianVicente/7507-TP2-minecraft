package fiuba.algo3.minecraft.material;

import fiuba.algo3.minecraft.herramienta.*;

public interface Material {

    public void desgastar(Herramienta herramienta);

    public void desgastar(HachaDeMadera hacha);
    public void desgastar(HachaDePiedra hacha);
    public void desgastar(HachaDeMetal hacha);
    public void desgastar(PicoDeMadera pico);
    public void desgastar(PicoDePiedra pico);
    public void desgastar(PicoDeMetal pico);
    public void desgastar(PicoFino pico);

}
