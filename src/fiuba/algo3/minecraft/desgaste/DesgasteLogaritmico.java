package fiuba.algo3.minecraft.desgaste;

public class DesgasteLogaritmico extends Desgaste{

    public DesgasteLogaritmico(int durabilidad, int fuerza) {
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
