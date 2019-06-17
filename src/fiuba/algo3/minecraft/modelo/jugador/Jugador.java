package fiuba.algo3.minecraft.modelo.jugador;

import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

public class Jugador implements Posicionable {

    public String nombre;
    private Inventario inventario;
    private Posicion posicion;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.inventario = new Inventario();
    }

    public Jugador(){
        this("Steve");
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    public Elemento obtenerHerramientaDeInventario(Herramienta herramienta){
        return this.inventario.obtenerElemento(herramienta);
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (! (obj instanceof Jugador) )
            return false;
        Jugador otro = (Jugador) obj;
        if ( ! this.nombre.equals(otro.obtenerNombre())){
            return  false ;
        }
        return true;
    }

    @Override
    public void establecerPosicion(Posicion posicion) {
        this.posicion = posicion ;
    }

    @Override
    public Posicion obtenerPosicionActual() {
        return posicion;
    }
}
