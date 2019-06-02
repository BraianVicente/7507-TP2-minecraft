package fiuba.algo3.minecraft.herramienta;

import fiuba.algo3.minecraft.desgaste.DesgasteHachaMetal;

public class HachaDeMetal extends Herramienta {

    public HachaDeMetal(){
        super(new DesgasteHachaMetal(400,10));
    }
}
