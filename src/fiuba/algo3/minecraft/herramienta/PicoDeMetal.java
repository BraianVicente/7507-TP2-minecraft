package fiuba.algo3.minecraft.herramienta;

import fiuba.algo3.minecraft.desgaste.DesgastePicoMetal;

public class PicoDeMetal extends Herramienta {

    public PicoDeMetal(){
        super(new DesgastePicoMetal(400,12));
    }
}
