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
        Tablero tablero = new Tablero() ;

        Assert.assertTrue(tablero.tableroContieneJugador());
    }


    @Test
    public void testMapaSeInicializaConMadera(){
        Tablero tablero = new Tablero() ;

        Assert.assertTrue(tablero.tableroContieneElementoPosicionable(new Madera()));
    }

    @Test
    public void testMapaSeInicializaConPiedra(){
        Tablero tablero = new Tablero() ;

        Assert.assertTrue(tablero.tableroContieneElementoPosicionable(new Piedra()));
    }

    @Test
    public void testMapaSeInicializaConMetal(){
        Tablero tablero = new Tablero() ;

        Assert.assertTrue(tablero.tableroContieneElementoPosicionable(new Metal()));
    }

    @Test
    public void testMapaSeInicializaConDiamante(){
        Tablero tablero = new Tablero() ;

        Assert.assertTrue(tablero.tableroContieneElementoPosicionable(new Diamante()));
    }

    @Test
    public void creoTableroYObtengoLaPosicionDelJugador(){
        Tablero tablero = new Tablero();

        Posicion posicionJugador = tablero.buscarPosicionDelJugador(new Jugador());
        int posicionEnXDelJugador = posicionJugador.obtenerX();
        int posicionEnYDelJugador = posicionJugador.obtenerY();

        Assert.assertEquals(posicionEnXDelJugador, (tablero.largoTablero/2)-1);
        Assert.assertEquals(posicionEnYDelJugador, (tablero.altoTablero/2)-1);

    }

}
