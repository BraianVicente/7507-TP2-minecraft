package fiuba.algo3.minecraft.material;

import fiuba.algo3.minecraft.herramienta.HachaDeMadera;
import fiuba.algo3.minecraft.herramienta.HachaDeMetal;
import fiuba.algo3.minecraft.herramienta.PicoDeMadera;
import fiuba.algo3.minecraft.herramienta.PicoDeMetal;

public abstract class Material {

    protected int durabilidad ;

    public void desgastar(HachaDeMetal herramienta){
        int fuerzaHerramienta = herramienta.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta ;
    }

    public void desgastar(HachaDeMadera herramienta){
        int fuerzaHerramienta = herramienta.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta ;
    }

    public void desgastar(PicoDeMetal herramienta){
        int fuerzaHerramienta = herramienta.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta ;
    }

    public void desgastar(PicoDeMadera herramienta){
        int fuerzaHerramienta = herramienta.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta ;
    }

}
