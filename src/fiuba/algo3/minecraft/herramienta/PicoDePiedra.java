package fiuba.algo3.minecraft.herramienta;

import fiuba.algo3.minecraft.desgaste.DesgastePicoPiedra;

public class PicoDePiedra extends Herramienta {

    public PicoDePiedra (){
        super(new DesgastePicoPiedra(200,4));
    }
}
