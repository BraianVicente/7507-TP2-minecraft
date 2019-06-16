package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.desgaste.Desgaste;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;

public class Pico extends Herramienta {

    public Pico(Desgaste desgaste) {
        super(desgaste);
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
        if (!(obj instanceof Pico))
            return false;
        return true;
    }

}