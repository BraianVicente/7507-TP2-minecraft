package fiuba.algo3.minecraft.modelo.juego;

import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import fiuba.algo3.minecraft.modelo.tablero.Tablero;

public class Juego {

    private Tablero tablero;

    public Juego(String nombreJugador){

        this.tablero = new Tablero(new Jugador(nombreJugador));
    }

    public Posicionable verQueHayEnPosicionDelTablero(Posicion posicion){
        Posicionable elemento = this.tablero.obtenerElementoEnPosicion(posicion);

        return elemento;
    }

    public String obtenerNombre(){
        return this.tablero.obtenerNombreDelJugador();
    }

    public Tablero obtenerTablero() {
        return tablero ;
    }
}
