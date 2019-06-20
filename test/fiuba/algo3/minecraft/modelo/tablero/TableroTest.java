package fiuba.algo3.minecraft.modelo.tablero;

import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class TableroTest {

    @Test
    public void testMapaSeInicializaConJugador(){
        Tablero tablero = new Tablero(new Jugador("Pepe")) ;

        Assert.assertTrue(tablero.tableroContieneJugador());
    }


    @Test
    public void testMapaSeInicializaConMadera(){
        Tablero tablero = new Tablero(new Jugador("Pepe")) ;

        Assert.assertTrue(tablero.tableroContieneElementoPosicionable(new Madera()));
    }

    @Test
    public void testMapaSeInicializaConPiedra(){
        Tablero tablero = new Tablero(new Jugador("Pepe")) ;

        Assert.assertTrue(tablero.tableroContieneElementoPosicionable(new Piedra()));
    }

    @Test
    public void testMapaSeInicializaConMetal(){
        Tablero tablero = new Tablero(new Jugador("Pepe")) ;

        Assert.assertTrue(tablero.tableroContieneElementoPosicionable(new Metal()));
    }

    @Test
    public void testMapaSeInicializaConDiamante(){
        Tablero tablero = new Tablero(new Jugador("Pepe")) ;

        Assert.assertTrue(tablero.tableroContieneElementoPosicionable(new Diamante()));
    }

    @Test
    public void moverJugadorHaciaArriba(){
        Tablero tablero = new Tablero(new Jugador("Pepe"));

        tablero.moverJugadorHaciaArriba();
        Jugador jugador = (Jugador) tablero.obtenerElementoEnPosicion(new Posicion(8,9));

        Assert.assertTrue(jugador instanceof Jugador);
    }


    @Test
    public void moverJugadorHaciaAbajo(){
        Tablero tablero = new Tablero(new Jugador("Pepe"));

        tablero.moverJugadorHaciaAbajo();
        Jugador jugador = (Jugador) tablero.obtenerElementoEnPosicion(new Posicion(10,9));

        Assert.assertTrue(jugador instanceof Jugador);
    }

    @Test
    public void moverJugadorHaciaIzquierda(){
        Tablero tablero = new Tablero(new Jugador("Pepe"));

        tablero.moverJugadorHaciaIzquierda();
        Jugador jugador = (Jugador) tablero.obtenerElementoEnPosicion(new Posicion(9,8));

        Assert.assertTrue(jugador instanceof Jugador);
    }

    @Test
    public void moverJugadorHaciaDerecha(){
        Tablero tablero = new Tablero(new Jugador("Pepe"));

        tablero.moverJugadorHaciaDerecha();
        Jugador jugador = (Jugador) tablero.obtenerElementoEnPosicion(new Posicion(9,10));

        Assert.assertTrue(jugador instanceof Jugador);
    }
}
