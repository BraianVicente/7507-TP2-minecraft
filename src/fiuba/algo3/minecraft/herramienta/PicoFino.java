package fiuba.algo3.minecraft.herramienta;

import fiuba.algo3.minecraft.desgaste.DesgasteLogaritmico;
import fiuba.algo3.minecraft.material.Diamante;
import fiuba.algo3.minecraft.material.Madera;
import fiuba.algo3.minecraft.material.Metal;
import fiuba.algo3.minecraft.material.Piedra;

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

}
