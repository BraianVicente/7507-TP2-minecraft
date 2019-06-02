package fiuba.algo3.minecraft.desgaste;

public class DesgasteEstandar extends Desgaste{

    public DesgasteEstandar(int durabilidad, int fuerza) {
        super(durabilidad,fuerza);
    }

    @Override
    public void desgastar() {
        if (durabilidad <= 0 ){
            throw new NoSePuedeDesgastarException() ;
        }
        durabilidad -= fuerza ;

    }
}
