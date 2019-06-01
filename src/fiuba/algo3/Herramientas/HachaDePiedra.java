package fiuba.algo3.Herramientas;

public class HachaDePiedra extends Herramienta {
    private int durabilidad;
    private int fuerza;

    public PicoDePiedra(){
        this.durabilidad = 200;
        this.fuerza = 5;
    }


    public int obtenerDurabilidad() {
        return this.durabilidad;
    }

    public int obtenerFuerza(){
        return this.fuerza;
    }
}