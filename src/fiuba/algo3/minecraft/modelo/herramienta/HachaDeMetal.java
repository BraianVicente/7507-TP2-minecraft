package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.desgaste.DesgasteEstandar;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;

public class HachaDeMetal extends Herramienta {

    public HachaDeMetal(){
        super( new DesgasteEstandar(400,10, 0.5F));
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
    public void desgastar(Diamante material){ material.desgastar(this); }

    @Override
    public void desgastar(Madera material){

        this.desgaste.desgastar();
        material.desgastar(this);

    }
}
