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
        TableroDelJuego tableroDelJuego = new TableroDelJuego(new Jugador("Pepe")) ;

        Assert.assertTrue(tableroDelJuego.tableroContieneJugador());
    }


    @Test
    public void testMapaSeInicializaConMadera(){
        TableroDelJuego tableroDelJuego = new TableroDelJuego(new Jugador("Pepe")) ;

        Assert.assertTrue(tableroDelJuego.tableroContieneElementoPosicionable(new Madera()));
    }

    @Test
    public void testMapaSeInicializaConPiedra(){
        TableroDelJuego tableroDelJuego = new TableroDelJuego(new Jugador("Pepe")) ;

        Assert.assertTrue(tableroDelJuego.tableroContieneElementoPosicionable(new Piedra()));
    }

    @Test
    public void testMapaSeInicializaConMetal(){
        TableroDelJuego tableroDelJuego = new TableroDelJuego(new Jugador("Pepe")) ;

        Assert.assertTrue(tableroDelJuego.tableroContieneElementoPosicionable(new Metal()));
    }

    @Test
    public void testMapaSeInicializaConDiamante(){
        TableroDelJuego tableroDelJuego = new TableroDelJuego(new Jugador("Pepe")) ;

        Assert.assertTrue(tableroDelJuego.tableroContieneElementoPosicionable(new Diamante()));
    }

    @Test
    public void moverJugadorHaciaArriba(){
        TableroDelJuego tableroDelJuego = new TableroDelJuego(new Jugador("Pepe"));

        tableroDelJuego.moverJugadorHaciaArriba();
        Jugador jugador = (Jugador) tableroDelJuego.obtenerElementoEnPosicion(new Posicion(8,9));

        Assert.assertTrue(jugador instanceof Jugador);
    }


    @Test
    public void moverJugadorHaciaAbajo(){
        TableroDelJuego tableroDelJuego = new TableroDelJuego(new Jugador("Pepe"));

        tableroDelJuego.moverJugadorHaciaAbajo();
        Jugador jugador = (Jugador) tableroDelJuego.obtenerElementoEnPosicion(new Posicion(10,9));

        Assert.assertTrue(jugador instanceof Jugador);
    }

    @Test
    public void moverJugadorHaciaIzquierda(){
        TableroDelJuego tableroDelJuego = new TableroDelJuego(new Jugador("Pepe"));

        tableroDelJuego.moverJugadorHaciaIzquierda();
        Jugador jugador = (Jugador) tableroDelJuego.obtenerElementoEnPosicion(new Posicion(9,8));

        Assert.assertTrue(jugador instanceof Jugador);
    }

    @Test
    public void moverJugadorHaciaDerecha(){
        TableroDelJuego tableroDelJuego = new TableroDelJuego(new Jugador("Pepe"));

        tableroDelJuego.moverJugadorHaciaDerecha();
        Jugador jugador = (Jugador) tableroDelJuego.obtenerElementoEnPosicion(new Posicion(9,10));

        Assert.assertTrue(jugador instanceof Jugador);
    }
}
