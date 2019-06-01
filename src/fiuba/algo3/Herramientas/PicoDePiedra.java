package fiuba.algo3.Herramientas;

public class PicoDePiedra extends Herramienta {
    private int durabilidad;
    private int fuerza;

    public PicoDePiedra(){
        this.durabilidad = 200;
        this.fuerza = 4;
    }


    public int obtenerDurabilidad() {
        return this.durabilidad;
    }

    public int obtenerFuerza(){
        return this.fuerza;
    }
}
