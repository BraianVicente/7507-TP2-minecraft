package fiuba.algo3.minecraft.herramienta;

import fiuba.algo3.minecraft.desgaste.DesgastePicoFino;
import fiuba.algo3.minecraft.material.Diamante;
import fiuba.algo3.minecraft.material.Madera;
import fiuba.algo3.minecraft.material.Metal;
import fiuba.algo3.minecraft.material.Piedra;

public class PicoFino extends Herramienta {

    public PicoFino(){
        super(new DesgastePicoFino(1000,20));
    }

    public void desgastar(Metal material){
        material.desgastar(this);
    }

    public void desgastar(Piedra material){
        material.desgastar(this);
    }

    public void desgastar(Diamante material){
        this.desgaste.desgastar();
        material.desgastar(this);
    }

    public void desgastar(Madera material){
        material.desgastar(this);
    }

}
