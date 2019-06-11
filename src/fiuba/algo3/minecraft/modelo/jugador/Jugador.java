package fiuba.algo3.minecraft.modelo.jugador;

import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

public class Jugador implements Posicionable {

    public String nombre;

    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public Jugador(){
        this.nombre = "Steve";
    }

    public String obtenerNombre(){
        return this.nombre;
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

}
