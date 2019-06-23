package fiuba.algo3.minecraft.modelo.mesadetrabajo;

import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;
import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Material;
import fiuba.algo3.minecraft.modelo.plano.*;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import java.util.ArrayList;
import java.util.Observable;

public class MesaDeTrabajo extends Observable {

    private ArrayList<Plano> listaDePlanos = new ArrayList<Plano>();
    private Mapa mesa;

    public MesaDeTrabajo(){
        this.listaDePlanos.add(new PlanoHachaDeMadera());
        this.listaDePlanos.add(new PlanoHachaDePiedra());
        this.listaDePlanos.add(new PlanoHachaDeMetal());
        this.listaDePlanos.add(new PlanoPicoDeMadera());
        this.listaDePlanos.add(new PlanoPicoDePiedra());
        this.listaDePlanos.add(new PlanoPicoDeMetal());
        this.listaDePlanos.add(new PlanoPicoFino());

        this.mesa = new Mapa(3,3);
    }

    public void insertarMaterialEnMesaEnPosicion(Posicion posicion, Material material){
        this.mesa.agregarElemento(posicion, material);
        super.setChanged();
        super.notifyObservers();
        super.clearChanged();
    }

    public void eliminarMaterialEnMesaEnPosicion(Posicion posicion){
        this.mesa.eliminarElemento(posicion);
        super.setChanged();
        super.notifyObservers();
        super.clearChanged();    }

    public Posicionable obtenerMaterialEnPosicion(Posicion posicion){
        return this.mesa.obtenerElementoEnPosicion(posicion);
    }

    public Herramienta construir(Plano plano){
        if (listaDePlanos.contains(plano)){
            Herramienta herramienta = listaDePlanos.get(listaDePlanos.indexOf(plano)).construir();
            this.limpiarMesaDeTrabajo();
            return herramienta ;
        }

        throw new NoSePuedeConstruirException();
    }

    public void limpiarMesaDeTrabajo(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                mesa.eliminarElemento(new Posicion(i, j));
            }
        }
        super.setChanged();
        super.notifyObservers();
        super.clearChanged();
    }

}
