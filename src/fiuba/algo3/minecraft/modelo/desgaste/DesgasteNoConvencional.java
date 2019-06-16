package fiuba.algo3.minecraft.modelo.desgaste;

public class DesgasteNoConvencional extends Desgaste{

    public DesgasteNoConvencional(int durabilidad, int fuerza) {
        super(durabilidad, fuerza);
    }

    @Override
    public void desgastar() {
        if (durabilidad <= 0 ){
            throw new NoSePuedeUsarException() ;
        }
        durabilidad = (int) (durabilidad -  (durabilidad * 0.1)) ;
    }
}
