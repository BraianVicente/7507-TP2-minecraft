package fiuba.algo3.minecraft.material;


public class Piedra extends Material {

    private Piedra(int durabilidad){
        super.durabilidad = durabilidad ;
    }

    public Piedra(){
        this(30) ;
    }

    public int obtenerDurabilidad() {
        return durabilidad ;
    }


}
