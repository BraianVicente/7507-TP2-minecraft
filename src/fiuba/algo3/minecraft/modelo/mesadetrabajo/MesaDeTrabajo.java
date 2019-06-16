package fiuba.algo3.minecraft.modelo.mesadetrabajo;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.herramienta.Hacha;
import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;
import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.plano.*;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

import java.util.HashMap;

public class MesaDeTrabajo {

    private PlanoHachaDeMadera planoHachaDeMadera;
    private PlanoHachaDePiedra planoHachaDePiedra;
    private PlanoHachaDeMetal planoHachaDeMetal;
    private PlanoPicoDeMadera planoPicoDeMadera;
    private PlanoPicoDePiedra planoPicoDePiedra;
    private PlanoPicoDeMetal planoPicoDeMetal;
    private PlanoPicoFino planoPicoFino;
    private Mapa mesa;
    private FabricaDeHerramientas fabrica;

    public MesaDeTrabajo(){
        this.planoHachaDeMadera = new PlanoHachaDeMadera();
        this.planoHachaDePiedra = new PlanoHachaDePiedra();
        this.planoHachaDeMetal = new PlanoHachaDeMetal();
        this.planoPicoDeMadera = new PlanoPicoDeMadera();
        this.planoPicoDePiedra = new PlanoPicoDePiedra();
        this.planoPicoDeMetal = new PlanoPicoDeMetal();
        this.planoPicoFino = new PlanoPicoFino();

        this.mesa = new Mapa(3,3);

        this.fabrica = new FabricaDeHerramientas();
    }

    private boolean comparar(Mapa mesa, Mapa plano){

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (! mesa.obtenerElementoEnPosicion(new Posicion(i,j)).equals(plano.obtenerElementoEnPosicion(new Posicion(i,j)))){
                    return false;
                }
            }
        }

        return true;
    }

    public void insertarMaterialEnMesaEnPosicion(int x, int y, Posicionable material){
        this.mesa.agregarElemento(new Posicion(x,y), material);
    }

    public void eliminarMaterialEnMesaEnPosicion(int x, int y){
        this.mesa.eliminarElemento(new Posicion(x, y));
    }

    public Herramienta construir(){
        if (comparar(mesa, planoHachaDeMadera.obtenerPlano())){
            return fabrica.construirHachaDeMadera();
        }
        if (comparar(mesa, planoHachaDePiedra.obtenerPlano())){
            return fabrica.construirHachaDePiedra();
        }
        if (comparar(mesa, planoHachaDeMetal.obtenerPlano())){
            return fabrica.construirHachaDeMetal();
        }
        if (comparar(mesa, planoPicoDeMadera.obtenerPlano())){
            return fabrica.construirPicoDeMadera();
        }
        if (comparar(mesa, planoPicoDePiedra.obtenerPlano())){
            return fabrica.construirPicoDePiedra();
        }
        if (comparar(mesa, planoPicoDeMetal.obtenerPlano())){
            return fabrica.construirPicoDeMetal();
        }
        if (comparar(mesa, planoPicoFino.obtenerPlano())){
            return fabrica.construirPicoFino();
        }
        else {
            throw new NoSePuedeConstruirException();
        }
    }



}
