package fiuba.algo3.minecraft.material;

import fiuba.algo3.minecraft.herramienta.*;

public abstract class Material {

    protected int durabilidad ;

    public void desgastar(Herramienta herramienta){
        int fuerzaHerramienta = herramienta.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta ;
    }

}
