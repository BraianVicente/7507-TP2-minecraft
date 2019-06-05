package fiuba.algo3.minecraft.desgaste;

public class DesgasteEstandar extends Desgaste{

    static float multiplicador ;

    public DesgasteEstandar(int durabilidad, int fuerza, float multiplicador) {
        super(durabilidad,fuerza);
        this.multiplicador = multiplicador ;
    }

    @Override
    public void desgastar() {
        if (durabilidad <= 0 ){
            throw new NoSePuedeUsarException() ;
        }
        durabilidad = durabilidad -  (int) ((float)fuerza *multiplicador) ;

    }
}
