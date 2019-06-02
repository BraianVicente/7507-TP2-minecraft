package fiuba.algo3.minecraft.material;

public class Diamante extends Material {

    private Diamante(int durabilidad){
        super.durabilidad = durabilidad ;
    }

    public Diamante(){
        this(100) ;
    }

    public int obtenerDurabilidad() {
        return durabilidad ;
    }


}
