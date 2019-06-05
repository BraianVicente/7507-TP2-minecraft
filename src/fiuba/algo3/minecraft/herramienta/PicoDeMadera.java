package fiuba.algo3.minecraft.herramienta;

import fiuba.algo3.minecraft.desgaste.DesgasteEstandar;
import fiuba.algo3.minecraft.material.Diamante;
import fiuba.algo3.minecraft.material.Madera;
import fiuba.algo3.minecraft.material.Metal;
import fiuba.algo3.minecraft.material.Piedra;

public class PicoDeMadera extends Herramienta {

    public PicoDeMadera(){
        super(new DesgasteEstandar(100,2,1));
    }

    @Override
    public void desgastar(Metal material){
        material.desgastar(this);
    }

    @Override
    public void desgastar(Piedra material){

        this.desgaste.desgastar();
        material.desgastar(this);

    }

    @Override
    public void desgastar(Diamante material){ material.desgastar(this);}

    @Override
    public void desgastar(Madera material){
        material.desgastar(this);
    }

}
