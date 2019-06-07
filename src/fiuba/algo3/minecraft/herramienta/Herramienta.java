package fiuba.algo3.minecraft.herramienta;

import fiuba.algo3.minecraft.desgaste.Desgaste;
import fiuba.algo3.minecraft.jugador.Elemento;
import fiuba.algo3.minecraft.material.*;

public abstract class Herramienta extends Elemento {

    public Desgaste desgaste ;

    protected Herramienta(Desgaste desgaste){
        this.desgaste = desgaste ;
    }

    public int obtenerDurabilidad() {
        return desgaste.obtenerDurabilidad() ;
    }

    public int obtenerFuerza(){
        return desgaste.obtenerFuerza() ;
    }

    public abstract void desgastar(Metal material);
    public abstract void desgastar(Madera material);
    public abstract void desgastar(Diamante material);
    public abstract void desgastar(Piedra material);

}
