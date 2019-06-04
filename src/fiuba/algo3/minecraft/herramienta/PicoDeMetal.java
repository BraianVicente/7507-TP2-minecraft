package fiuba.algo3.minecraft.herramienta;

import fiuba.algo3.minecraft.desgaste.DesgastePicoMetal;
import fiuba.algo3.minecraft.material.Diamante;
import fiuba.algo3.minecraft.material.Madera;
import fiuba.algo3.minecraft.material.Metal;
import fiuba.algo3.minecraft.material.Piedra;

public class PicoDeMetal extends Herramienta {

    public PicoDeMetal(){ super(new DesgastePicoMetal(400,12));
    }

    public void desgastar(Metal material){ material.desgastar(this); }

    public void desgastar(Piedra material){

        this.desgaste.desgastar();
        material.desgastar(this);

    }

    public void desgastar(Diamante material){ material.desgastar(this); }

    public void desgastar(Madera material){  material.desgastar(this); }

}
