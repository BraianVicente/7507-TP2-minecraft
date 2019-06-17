package fiuba.algo3.minecraft.modelo.tablero;


import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import org.junit.Assert;
import org.junit.Test;

public class MovimientoTest {

    @Test
    public void testObtenerPosicionArriba(){
        Mapa mapa = new Mapa(2,2);
        Movimiento movimiento = new Movimiento(mapa);

        Posicion arriba = movimiento.obtenerPosicionArriba(new Posicion(2,2));

        Assert.assertEquals(new Posicion(1,2),arriba );
    }

    @Test
    public void testObtenerPosicionAbajo(){
        Mapa mapa = new Mapa(2,2);
        Movimiento movimiento = new Movimiento(mapa);

        Posicion abajo = movimiento.obtenerPosicionAbajo(new Posicion(0,0));

        Assert.assertEquals(new Posicion(1,0),abajo);
    }

    @Test
    public void testObtenerPosicionArribaIzquierda(){
        Mapa mapa = new Mapa(2,2);
        Movimiento movimiento = new Movimiento(mapa);

        Posicion arribaIzquierda = movimiento.obtenerPosicionArribaIzquierda(new Posicion(2,2));

        Assert.assertEquals(new Posicion(1,1),arribaIzquierda );

    }


    @Test
    public void testMoverHaciaArribaDesdePosicionActualCambiaPosicionPosicionable(){
        Mapa mapa = new Mapa(2,2);
        Movimiento movimiento = new Movimiento(mapa);

        Posicionable jugador  = new Jugador() ;
        mapa.agregarElemento(new Posicion(1,1),jugador);
        Posicion posicionInicialJugador = jugador.obtenerPosicionActual();
        movimiento.moverHaciaArribaDesde(posicionInicialJugador);

        Posicion posicionActualJugador = jugador.obtenerPosicionActual();
        Assert.assertNotEquals(posicionActualJugador,posicionInicialJugador );

    }

    @Test
    public void testMoverHaciaArribaDesdePosicionActualEsPosicionEsperada(){
        Mapa mapa = new Mapa(2,2);
        Movimiento movimiento = new Movimiento(mapa);

        Posicionable jugador  = new Jugador() ;
        mapa.agregarElemento(new Posicion(1,1),jugador);
        Posicion posicionInicialJugador = jugador.obtenerPosicionActual();
        movimiento.moverHaciaArribaDesde(posicionInicialJugador);

        Posicion posicionActualJugador = jugador.obtenerPosicionActual();
        Assert.assertEquals(new Posicion(0,1),posicionActualJugador);

    }

    @Test
    public void testNoSePuedeMoverAPosicionInvalida(){
        Mapa mapa = new Mapa(2,2);
        Movimiento movimiento = new Movimiento(mapa);

        Posicionable jugador  = new Jugador() ;
        mapa.agregarElemento(new Posicion(1,1),jugador);
        Posicion posicionInicialJugador = jugador.obtenerPosicionActual();
        movimiento.moverHaciaAbajoDesde(posicionInicialJugador);

        Posicion posicionActualJugador = jugador.obtenerPosicionActual();
        Assert.assertEquals(new Posicion(0,1),posicionActualJugador);

    }
}
