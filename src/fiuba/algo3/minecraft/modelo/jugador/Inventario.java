package fiuba.algo3.minecraft.modelo.jugador;

import fiuba.algo3.minecraft.modelo.desgaste.DesgasteEstandar;
import fiuba.algo3.minecraft.modelo.herramienta.Hacha;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Inventario extends Observable {

    List <Elemento> elementos ;

    public Inventario(){
        elementos = new ArrayList<Elemento>();
    }

    public void agregarAlInventario(Elemento unElemento) {
            elementos.add(unElemento);
            this.setChanged();
            this.notifyObservers();
            this.clearChanged();
    }

    public void quitarDelInventario(Posicionable unElemento)
    {
        elementos.remove(unElemento);
    }

    public int cantidadElementos ()
        {
            return elementos.size();
        }

    public Elemento obtenerElementoEnPosicion(int i ){
        return elementos.get(i) ;
    }
    public void quitarElemento(int i){
        this.elementos.remove(i);
        this.setChanged();
        this.notifyObservers();
        this.clearChanged();
    }

    public Elemento obtenerElemento (Elemento unElemento){
        int indexHerramienta = elementos.indexOf(unElemento);
        return elementos.get(indexHerramienta);
    }

}
