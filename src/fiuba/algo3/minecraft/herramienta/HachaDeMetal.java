package fiuba.algo3.minecraft.herramienta;

public class HachaDeMetal extends Herramienta {
    private int durabilidad;
    private int fuerza;

    public HachaDeMetal(){
        this.durabilidad = 400;
        this.fuerza = 10;
    }

    public int obtenerDurabilidad() {
        return this.durabilidad;
    }

    public int obtenerFuerza(){
        return this.fuerza;
    }
}
