package fiuba.algo3.minecraft.herramienta ;

import fiuba.algo3.minecraft.desgaste.DesgasteEstandar;

public class HachaDePiedra extends Herramienta {

    public HachaDePiedra () {
        super(new DesgasteEstandar(200,5));
    }
}