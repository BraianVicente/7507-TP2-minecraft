package fiuba.algo3.minecraft.herramienta;

import fiuba.algo3.minecraft.desgaste.DesgastePicoFino;

public class PicoFino extends Herramienta {

    public PicoFino(){
        super(new DesgastePicoFino(1000,20));
    }

}
