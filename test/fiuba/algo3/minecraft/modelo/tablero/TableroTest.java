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
    public void muevoJugadorAUnaPosicionContigua(){
        Tablero tablero = new Tablero(new Jugador("Pepe"));
        Assert.assertTrue(tablero.mover(new Posicion(10,10)));
    }

    @Test
    public void muevoJugadorAUnaPosicionNoContigua(){
        Tablero tablero = new Tablero(new Jugador("Pepe"));

        Assert.assertFalse(tablero.mover(new Posicion(9,26)));

    }


}
