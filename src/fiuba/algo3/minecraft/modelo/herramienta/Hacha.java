package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.desgaste.DesgasteEstandar;
import fiuba.algo3.minecraft.modelo.material.*;

public class Hacha extends Herramienta {

    public Hacha(DesgasteEstandar desgaste, Material material) {
        super(desgaste,material) ;
    }

    @Override
    public void desgastar(Material material) {
        material.desgastar(this);
    }

    @Override
    public void desgastar(Metal material) {
        this.desgaste.desgastar();
        material.desgastar(this);
    }

    @Override
    public void desgastar(Piedra material) {
        this.desgaste.desgastar();
        material.desgastar(this);
    }

    @Override
    public void desgastar(Diamante material) {
        this.desgaste.desgastar();
        material.desgastar(this);
    }

    @Override
    public void desgastar(Madera material) {

        this.desgaste.desgastar();
        material.desgastar(this);

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (!(obj instanceof Hacha))
            return false;
        Hacha otro = (Hacha) obj ;
        if (! this.materialConstruccion.equals(otro.obtenerMaterialConstruccion()))
            return false;
        return true;
    }

}

