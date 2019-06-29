package fiuba.algo3.minecraft.modelo.juego;

import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.mapa.ConstructorMapaJuego;
import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;

public class InicializadorJuego {

    private static InicializadorJuego inicializadorJuego = null;

    private InicializadorJuego() {
    }

    public static InicializadorJuego getInstance() {
        if (inicializadorJuego == null) {
            inicializadorJuego = new InicializadorJuego() ;
        }
        return inicializadorJuego;
    }

    public TableroDelJuego crearJuego(String nombreJugador) {

        Jugador jugador = new Jugador(nombreJugador) ;
        ConstructorMapaJuego constructorMapaJuego = ConstructorMapaJuego.getInstance();
        Mapa mapa = constructorMapaJuego.JuegoEstandar(jugador);

        return new TableroDelJuego(jugador,mapa);

    }
}
