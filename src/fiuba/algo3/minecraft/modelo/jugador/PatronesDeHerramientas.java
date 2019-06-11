package fiuba.algo3.minecraft.modelo.jugador;

import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;


import java.util.ArrayList;


public class PatronesDeHerramientas {

    private ArrayList <FabricaHerramientas> patrones ;

    /*
        Constructor
        Pre: ninguna:
        Pos: crea el hashMap y carga los patrone de las herramientas
     */
    public PatronesDeHerramientas (){

        ArrayList <FabricaHerramientas> patrones = new ArrayList<>();

        FabricaHerramientas patronHachaDeMadera = new FabricaHerramientas();
        Madera mphm1 = new Madera();
        Madera mphm2 = new Madera();
        Madera mphm3 = new Madera();
        Madera mphm4 = new Madera();
        Madera mphm5 = new Madera();
        patronHachaDeMadera.agregar(1,mphm1);
        patronHachaDeMadera.agregar(2,mphm2);
        patronHachaDeMadera.agregar(4,mphm3);
        patronHachaDeMadera.agregar(5,mphm4);
        patronHachaDeMadera.agregar(8,mphm5);
        patrones.add(patronHachaDeMadera);

        FabricaHerramientas patronHachaDePiedra = new FabricaHerramientas();
        Piedra pphp1 = new Piedra();
        Piedra pphp2 = new Piedra();
        Piedra pphp3 = new Piedra();
        Madera mphp1  = new Madera();
        Madera mphp2  = new Madera();
        patronHachaDePiedra.agregar(1,pphp1);
        patronHachaDePiedra.agregar(2,pphp2);
        patronHachaDePiedra.agregar(4,pphp3);
        patronHachaDePiedra.agregar(5,mphp1);
        patronHachaDePiedra.agregar(8,mphp2);
        patrones.add(patronHachaDePiedra);

        FabricaHerramientas patronHachaDeMetal = new FabricaHerramientas();
        Metal mphmet1 = new Metal();
        Metal mphmet2 = new Metal();
        Metal mphmet3 = new Metal();
        Madera madphmet1 = new Madera();
        Madera madphmet2 = new Madera();
        patronHachaDeMetal.agregar(1,mphmet1);
        patronHachaDeMetal.agregar(2,mphmet2);
        patronHachaDeMetal.agregar(4,mphmet3);
        patronHachaDeMetal.agregar(5,madphmet1);
        patronHachaDeMetal.agregar(8,madphmet2);
        patrones.add(patronHachaDeMetal);

        FabricaHerramientas patronPicoMadera = new FabricaHerramientas();
        Madera mppm1 = new Madera();
        Madera mppm2 = new Madera();
        Madera mppm3 = new Madera();
        Madera mppm4 = new Madera();
        Madera mppm5 = new Madera();
        patronPicoMadera.agregar(1,mppm1);
        patronPicoMadera.agregar(2,mppm2);
        patronPicoMadera.agregar(3,mppm3);
        patronPicoMadera.agregar(5,mppm4);
        patronPicoMadera.agregar(8,mppm5);
        patrones.add(patronPicoMadera);

        FabricaHerramientas patronPicoPiedra = new FabricaHerramientas();
        Piedra pppp1 = new Piedra();
        Piedra pppp2 = new Piedra();
        Piedra pppp3 = new Piedra();
        Madera mppp1 = new Madera();
        Madera mppp2 = new Madera();
        patronPicoPiedra.agregar(1,pppp1);
        patronPicoPiedra.agregar(2,pppp2);
        patronPicoPiedra.agregar(3,pppp3);
        patronPicoPiedra.agregar(5,mppp1);
        patronPicoPiedra.agregar(8,mppp2);
        patrones.add(patronPicoPiedra);

        FabricaHerramientas patronPicoMetal = new FabricaHerramientas();
        Metal mppmet1 = new Metal();
        Metal mppmet2 = new Metal();
        Metal mppmet3 = new Metal();
        Madera madppmet1 = new Madera();
        Madera madppmet2 = new Madera();
        patronPicoMetal.agregar(1,mppmet1);
        patronPicoMetal.agregar(2,mppmet2);
        patronPicoMetal.agregar(3,mppmet3);
        patronPicoMetal.agregar(5,madppmet1);
        patronPicoMetal.agregar(8,madppmet2);

        FabricaHerramientas patronPicoFino = new FabricaHerramientas();
        Metal mppf1 = new Metal();
        Metal mppf2 = new Metal();
        Metal mppf3 = new Metal();
        Piedra pppf1 = new Piedra();
        Madera madppf1 = new Madera();
        Madera madppf2 = new Madera();
        patronPicoFino.agregar(1,mppf1);
        patronPicoFino.agregar(2,mppf2);
        patronPicoFino.agregar(3,mppf3);
        patronPicoFino.agregar(4,pppf1);
        patronPicoFino.agregar(5,madppf1);
        patronPicoFino.agregar(8,madppf2);
        patrones.add(patronPicoFino);

    }

}
