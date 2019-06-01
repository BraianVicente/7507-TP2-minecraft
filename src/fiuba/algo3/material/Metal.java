package fiuba.algo3.material;


public class Metal extends Material {

    private Metal(int durabilidad){
        super.durabilidad = durabilidad ;
    }

    public Metal(){
        this(50) ;
    }

    public int obtenerDurabilidad() {
        return durabilidad ;
    }


}
