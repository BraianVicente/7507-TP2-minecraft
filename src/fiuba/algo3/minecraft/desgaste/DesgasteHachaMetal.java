package fiuba.algo3.minecraft.desgaste;

public class DesgasteHachaMetal extends Desgaste {

    public DesgasteHachaMetal(int durabilidad, int fuerza) {
        super(durabilidad, fuerza);
    }

    @Override
    public void desgastar() {
        if (durabilidad <= 0 ){
            throw new HerramientaRotaException() ;
        }
        durabilidad -= (fuerza/2) ;

    }
}
