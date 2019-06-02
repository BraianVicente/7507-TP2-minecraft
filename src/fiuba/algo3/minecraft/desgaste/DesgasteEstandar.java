package fiuba.algo3.minecraft.desgaste;

public class DesgasteEstandar {
    private int durabilidad ;
    private int fuerza ;

    public DesgasteEstandar(int durabilidad, int fuerza) {
        this.durabilidad = durabilidad ;
        this.fuerza = fuerza ;
    }

    public int obtenerDurabilidad() {
        return durabilidad ;
    }

    public int obtenerFuerza() {
        return fuerza;
    }

    public void desgastar() {
        if (durabilidad <= 0 ){
            throw new NoSePuedeDesgastarException() ;
        }
        durabilidad -= fuerza ;

    }
}
