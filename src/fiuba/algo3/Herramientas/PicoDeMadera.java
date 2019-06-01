package fiuba.algo3.Herramientas;

public class PicoDeMadera extends Herramienta {
    private int durabilidad;
    private int fuerza;

    public PicoDeMadera(){
        this.durabilidad = 100;
        this.fuerza = 2;
    }

    public int obtenerDurabilidad() {
        return this.durabilidad;
    }

    public int obtenerFuerza(){
        return this.fuerza;
    }
}
