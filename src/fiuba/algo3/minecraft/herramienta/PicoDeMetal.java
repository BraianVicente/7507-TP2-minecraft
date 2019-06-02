package fiuba.algo3.minecraft.herramienta;


public class PicoDeMetal extends Herramienta {
    private int durabilidad;
    private int fuerza;

    public PicoDeMetal(){
        this.durabilidad = 400;
        this.fuerza = 12;
    }

    public int obtenerDurabilidad() {
        return this.durabilidad;
    }

    public int obtenerFuerza(){
        return this.fuerza;
    }
}
