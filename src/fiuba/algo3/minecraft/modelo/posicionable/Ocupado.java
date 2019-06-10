package fiuba.algo3.minecraft.modelo.posicionable;

public class Ocupado implements Posicionable {


    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (! (obj instanceof Ocupado) )
            return false;
        return true;
    }

}
