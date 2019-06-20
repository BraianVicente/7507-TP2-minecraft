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

    public String verQueHayEnPosicionDelTablero(int x, int y){
        Posicionable elemento = this.tablero.obtenerElementoEnPosicion(new Posicion(x,y));

        return elemento.obtenerSigla();
    }

    public String obtenerNombre(){
        return this.tablero.obtenerNombreDelJugador();
    }
}
