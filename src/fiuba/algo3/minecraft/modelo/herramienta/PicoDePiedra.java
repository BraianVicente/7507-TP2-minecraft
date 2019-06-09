package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.desgaste.DesgasteEstandar;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;

public class PicoDePiedra extends Herramienta {


    public PicoDePiedra (){
        super(new DesgasteEstandar(200,4,0.66F) ) ;
    }

    @Override
    public void desgastar(Metal material){

        this.desgaste.desgastar();
        material.desgastar(this);

    }

    @Override
    public void desgastar(Piedra material){

        this.desgaste.desgastar();
        material.desgastar(this);

    }

    @Override
    public void desgastar(Diamante material){ material.desgastar(this); }

    @Override
    public void desgastar(Madera material){  material.desgastar(this); }

}

