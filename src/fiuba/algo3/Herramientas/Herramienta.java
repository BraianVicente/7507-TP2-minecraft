package fiuba.algo3.Herramientas;

public abstract class Herramienta {

    protected int durabilidad;
    protected int fuerza;

    public int obtenerDurabilidad() {
        return this.durabilidad;
    }

    public int obtenerFuerza(){
        return this.fuerza;
    }
}
