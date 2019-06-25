package fiuba.algo3.minecraft.modelo.jugador;

import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;

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

    public void quitarDelInventario(Elemento unElemento) {
        elementos.remove(unElemento);
        this.setChanged();
        this.notifyObservers();
        this.clearChanged();
    }

    public int cantidadElementos (){
            return elementos.size();
        }

    public Elemento obtenerElementoEnPosicion(int i ){
        return elementos.get(i) ;
    }

    public Elemento obtenerElemento (Elemento unElemento){
        int indexHerramienta = elementos.indexOf(unElemento);
        return elementos.get(indexHerramienta);
    }

    public Elemento obtenerProximaHerramienta(){
        for(int i = 0; i < cantidadElementos() ; i++ ){
            Elemento posibleHerramienta = obtenerElementoEnPosicion(i);
            if (posibleHerramienta instanceof Herramienta){
                return posibleHerramienta;
            }

        }
        return null;
    }

}
