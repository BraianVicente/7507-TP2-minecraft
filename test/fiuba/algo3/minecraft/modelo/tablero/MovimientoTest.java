package fiuba.algo3.minecraft.modelo.tablero;


import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.mapa.FueraDeRangoMapaException;
import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import org.junit.Assert;
import org.junit.Test;

public class MovimientoTest {

    @Test
    public void testMoverHaciaArribaDesdePosicionActualCambiaPosicionPosicionable(){
        Mapa mapa = new Mapa(3,3);
        Movimiento movimiento = new Movimiento(mapa);
        Posicionable jugador  = new Jugador("Steve") ;
        Posicion destinoJugador = new Posicion(0,0);

        mapa.agregarElemento(new Posicion(1,1),jugador);
        Posicion posicionInicialJugador = jugador.obtenerPosicionActual();
        movimiento.mover(posicionInicialJugador,destinoJugador);
        Posicion posicionActualJugador = jugador.obtenerPosicionActual();

        Assert.assertEquals(destinoJugador,posicionActualJugador);

    }

    @Test
    public void testMoverHaciaArribaDesdePosicionActualEsPosicionEsperada(){
        Mapa mapa = new Mapa(3,3);
        Movimiento movimiento = new Movimiento(mapa);
        Posicionable jugador  = new Jugador("Steve") ;
        Posicion destinoJugador = new Posicion(2,2);

        mapa.agregarElemento(new Posicion(1,1),jugador);
        Posicion posicionInicialJugador = jugador.obtenerPosicionActual();
        movimiento.mover(posicionInicialJugador,destinoJugador);
        Posicion posicionActualJugador = jugador.obtenerPosicionActual();

        Assert.assertEquals(destinoJugador,posicionActualJugador);
    }

    @Test(expected = FueraDeRangoMapaException.class)
    public void testNoSePuedeMoverAPosicionInvalida(){
        Mapa mapa = new Mapa(3,3);
        Movimiento movimiento = new Movimiento(mapa);
        Posicionable jugador  = new Jugador("Steve") ;
        Posicion destinoJugador = new Posicion(2,3);

        mapa.agregarElemento(new Posicion(2,2),jugador);
        Posicion posicionInicialJugador = jugador.obtenerPosicionActual();
        movimiento.mover(posicionInicialJugador,destinoJugador);
        Posicion posicionActualJugador = jugador.obtenerPosicionActual();

        Assert.assertEquals(posicionInicialJugador,posicionActualJugador);

    }

}
