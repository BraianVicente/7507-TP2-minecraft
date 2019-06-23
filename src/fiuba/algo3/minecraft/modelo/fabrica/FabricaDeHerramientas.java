package fiuba.algo3.minecraft.modelo.fabrica;

import fiuba.algo3.minecraft.modelo.desgaste.DesgasteEstandar;
import fiuba.algo3.minecraft.modelo.desgaste.DesgasteNoConvencional;
import fiuba.algo3.minecraft.modelo.herramienta.Hacha;
import fiuba.algo3.minecraft.modelo.herramienta.Pico;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;

public class FabricaDeHerramientas{

    public Hacha construirHachaDeMadera(){
        DesgasteEstandar desgaste = new DesgasteEstandar(100, 2,1);
        Hacha hacha = new Hacha(desgaste,new Madera());

        return hacha;
    }

    public Hacha construirHachaDePiedra(){
        DesgasteEstandar desgaste = new DesgasteEstandar(200, 5,1);
        Hacha hacha = new Hacha(desgaste,new Piedra());

        return hacha;
    }

    public Hacha construirHachaDeMetal(){
        DesgasteEstandar desgaste = new DesgasteEstandar(400, 10,0.5F);
        Hacha hacha = new Hacha(desgaste,new Metal());

        return hacha;
    }

    public Pico construirPicoDeMadera(){
        DesgasteEstandar desgaste = new DesgasteEstandar(100,2,1);
        Pico pico = new Pico(desgaste, new Madera());

        return pico;
    }

    public Pico construirPicoDePiedra(){
        DesgasteEstandar desgaste = new DesgasteEstandar(200,4,0.66F);
        Pico pico = new Pico(desgaste, new Piedra());

        return pico;
    }

    public Pico construirPicoDeMetal(){
        DesgasteNoConvencional desgaste = new DesgasteNoConvencional(400,12);
        Pico pico = new Pico(desgaste, new Metal());

        return pico;
    }

    public Pico construirPicoFino(){
        DesgasteNoConvencional desgaste = new DesgasteNoConvencional(1000,20);
        Pico pico = new Pico(desgaste, new Diamante());

        return pico;
    }
}