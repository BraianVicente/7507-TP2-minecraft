package fiuba.algo3.material;

import fiuba.algo3.Herramientas.HachaDeMadera;
import fiuba.algo3.Herramientas.HachaDeMetal;
import fiuba.algo3.Herramientas.PicoDeMadera;
import fiuba.algo3.Herramientas.PicoDeMetal;

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
