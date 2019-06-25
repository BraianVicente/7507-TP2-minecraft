package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.desgaste.Desgaste;
import fiuba.algo3.minecraft.modelo.desgaste.DesgasteEstandar;
import fiuba.algo3.minecraft.modelo.material.*;

public class Pico extends Herramienta {

    public Pico(Desgaste desgaste, Material material) {
        super(desgaste, material);
    }

    @Override
    public void desgastar(Material material) {
        material.desgastar(this);
    }

    @Override
    public void desgastar(Metal material) {
        super.desgaste.desgastar();
    }

    @Override
    public void desgastar(Piedra material) {
        super.desgaste.desgastar();
    }

    @Override
    public void desgastar(Diamante material) {
        super.desgaste.desgastar();
    }

    @Override
    public void desgastar(Madera material) {
        super.desgaste.desgastar();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (!(obj instanceof Pico))
            return false;
        Pico otro = (Pico) obj ;
        if (! this.materialConstruccion.equals(otro.obtenerMaterialConstruccion()))
            return false;
        return true;
    }

}
