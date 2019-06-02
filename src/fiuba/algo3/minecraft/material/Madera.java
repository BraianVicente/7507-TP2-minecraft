package fiuba.algo3.minecraft.material;

public class Madera extends Material {

    private Madera(int durabilidad){
        super.durabilidad = durabilidad ;
    }

    public Madera(){
        this(10) ;
    }

    public int obtenerDurabilidad() {
        return durabilidad ;
    }


}
