package fiuba.algo3.minecraft.modelo.juego;

import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.tablero.Tablero;

public class Juego {

    private Tablero tablero;

    public Juego(String nombreJugador){

        this.tablero = new Tablero(new Jugador(nombreJugador));
    }

    public boolean moverJugadorA(int x, int y){
        return this.tablero.mover(new Posicion(x,y));
    }
}
