package fiuba.algo3.minecraft.herramienta;

import fiuba.algo3.minecraft.desgaste.Desgaste;
import fiuba.algo3.minecraft.material.*;

public abstract class Herramienta {

    protected Desgaste desgaste ;

    protected Herramienta(Desgaste desgaste){
        this.desgaste = desgaste ;
    }

    public int obtenerDurabilidad() {
        return desgaste.obtenerDurabilidad() ;
    }

    public int obtenerFuerza(){
        return desgaste.obtenerFuerza() ;
    }

    public void desgastar(Material material){
        this.desgaste.desgastar();
        material.desgastar(this);
    }

}
