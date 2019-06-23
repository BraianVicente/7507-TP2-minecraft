package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.desgaste.Desgaste;
import fiuba.algo3.minecraft.modelo.jugador.Elemento;
import fiuba.algo3.minecraft.modelo.material.*;

public abstract class Herramienta extends Elemento {

    protected Desgaste desgaste ;
    protected Material materialConstruccion ;

    public Herramienta(Desgaste desgaste, Material material) {
        this.desgaste = desgaste;
        this.materialConstruccion = material ;
    }

    public abstract void desgastar(Material material);
    public abstract void desgastar(Metal material);
    public abstract void desgastar(Madera material);
    public abstract void desgastar(Diamante material);
    public abstract void desgastar(Piedra material);

    public int obtenerDurabilidad() {
        return desgaste.obtenerDurabilidad() ;
    }

    public int obtenerFuerza(){
        return desgaste.obtenerFuerza() ;
    }

    public Material obtenerMaterialConstruccion(){
        return this.materialConstruccion ;
    }

}
