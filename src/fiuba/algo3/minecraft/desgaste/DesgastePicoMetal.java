package fiuba.algo3.minecraft.desgaste;

public class DesgastePicoMetal extends Desgaste{
    private int durabilidadInicial ;
    public DesgastePicoMetal(int durabilidad, int fuerza) {
        super(durabilidad,fuerza);
        durabilidadInicial = durabilidad ;
    }

    @Override
    public void desgastar() {
        if (durabilidad <= 0 ){
            throw new NoSePuedeUsarException() ;
        }        durabilidad -= durabilidadInicial*0.1 ;

    }
}
