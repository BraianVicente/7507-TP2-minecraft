package fiuba.algo3.minecraft.modelo.mesadetrabajo;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.herramienta.Hacha;
import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;
import fiuba.algo3.minecraft.modelo.jugador.Elemento;
import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.plano.*;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

import java.util.ArrayList;
import java.util.HashMap;

public class MesaDeTrabajo {

    private ArrayList<Plano> listaDePlanos = new ArrayList<Plano>();
    private Mapa mesa;
    private FabricaDeHerramientas fabrica;

    public MesaDeTrabajo(){
        this.listaDePlanos.add(new PlanoHachaDeMadera());
        this.listaDePlanos.add(new PlanoHachaDePiedra());
        this.listaDePlanos.add(new PlanoHachaDeMetal());
        this.listaDePlanos.add(new PlanoPicoDeMadera());
        this.listaDePlanos.add(new PlanoPicoDePiedra());
        this.listaDePlanos.add(new PlanoPicoDeMetal());
        this.listaDePlanos.add(new PlanoPicoFino());

        this.mesa = new Mapa(3,3);

        this.fabrica = new FabricaDeHerramientas();
    }

    private boolean comparar(Mapa mesa, Plano plano){

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

    public Posicionable obtenerMaterialEnPosicion(int x, int y){
        return this.mesa.obtenerElementoEnPosicion(new Posicion(x, y));
    }

    public Herramienta construir(Plano plano){
        for(int i = 0; i <= listaDePlanos.size(); i++){
            if(comparar(mesa, plano)){
                return plano.construir();
            };
        }
        throw new NoSePuedeConstruirException();
    }



}
