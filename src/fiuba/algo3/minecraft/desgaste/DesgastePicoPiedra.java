package fiuba.algo3.minecraft.desgaste;

public class DesgastePicoPiedra extends Desgaste{
    public DesgastePicoPiedra(int durabilidad, int fuerza) {
        super(durabilidad,fuerza) ;
    }

    @Override
    public void desgastar() {
        if (durabilidad <= 0 ){
            throw new HerramientaRotaException() ;
        }
        durabilidad = durabilidad - (int)(fuerza / 1.5);
    }
}
