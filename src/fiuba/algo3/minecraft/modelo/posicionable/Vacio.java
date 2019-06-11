package fiuba.algo3.minecraft.modelo.posicionable ;


public class Vacio implements Posicionable {

    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (! (obj instanceof Vacio) )
            return false;
        return true;
    }

}
