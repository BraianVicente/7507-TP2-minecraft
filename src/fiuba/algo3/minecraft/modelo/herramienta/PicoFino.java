package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.desgaste.DesgasteLogaritmico;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;

public class PicoFino extends Herramienta {

    public PicoFino(){
        super(new DesgasteLogaritmico(1000,20));
    }

    @Override
    public void desgastar(Metal material){
        material.desgastar(this);
    }

    @Override
    public void desgastar(Piedra material){
        material.desgastar(this);
    }

    @Override
    public void desgastar(Diamante material){
        this.desgaste.desgastar();
        material.desgastar(this);
    }

    @Override
    public void desgastar(Madera material){
        material.desgastar(this);
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (! (obj instanceof PicoFino) )
            return false;
        return true;
    }
}
