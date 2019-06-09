package fiuba.algo3.minecraft.modelo.desgaste;

public class DesgasteEstatico extends Desgaste{
    private int durabilidadInicial ;
    public DesgasteEstatico(int durabilidad, int fuerza) {
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
