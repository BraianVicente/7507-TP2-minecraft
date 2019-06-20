package fiuba.algo3.minecraft.modelo.tablero;


import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.mapa.FueraDeRangoMapaException;
import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import org.junit.Assert;
import org.junit.Test;

public class MovimientoTest {


    @Test(expected = FueraDeRangoMapaException.class)
    public void testNoSePuedeMoverAPosicionInvalida(){
        Mapa mapa = new Mapa(3,3);
        Movimiento movimiento = new Movimiento(mapa);
        Posicionable jugador  = new Jugador("Steve") ;

        mapa.agregarElemento(new Posicion(2,2),jugador);
        Posicion posicionInicialJugador = jugador.obtenerPosicionActual();
        movimiento.moverHaciaAbajo(jugador);

        Assert.assertEquals(posicionInicialJugador,jugador.obtenerPosicionActual());
    }

    @Test
    public void testMoverHaciaArriba(){
        Mapa mapa = new Mapa(3,3);
        Movimiento movimiento = new Movimiento(mapa);
        Posicionable jugador  = new Jugador("Steve") ;
        mapa.agregarElemento(new Posicion(1,1),jugador);

        movimiento.moverHaciaArriba(jugador) ;
        Posicion posicionActualJugador = jugador.obtenerPosicionActual();

        Assert.assertEquals(new Posicion(0,1),posicionActualJugador);

    }

    @Test
    public void testMoverHaciaAbajo(){
        Mapa mapa = new Mapa(3,3);
        Movimiento movimiento = new Movimiento(mapa);
        Posicionable jugador  = new Jugador("Steve") ;
        mapa.agregarElemento(new Posicion(1,1),jugador);

        movimiento.moverHaciaAbajo(jugador) ;
        Posicion posicionActualJugador = jugador.obtenerPosicionActual();

        Assert.assertEquals(new Posicion(2,1),posicionActualJugador);

    }

    @Test
    public void testMoverHaciaIzquierda(){
        Mapa mapa = new Mapa(3,3);
        Movimiento movimiento = new Movimiento(mapa);
        Posicionable jugador  = new Jugador("Steve") ;
        mapa.agregarElemento(new Posicion(1,1),jugador);

        movimiento.moverHaciaIzquierda(jugador) ;
        Posicion posicionActualJugador = jugador.obtenerPosicionActual();

        Assert.assertEquals(new Posicion(1,0),posicionActualJugador);

    }

    @Test
    public void testMoverHaciaDerecha(){
        Mapa mapa = new Mapa(3,3);
        Movimiento movimiento = new Movimiento(mapa);
        Posicionable jugador  = new Jugador("Steve") ;
        mapa.agregarElemento(new Posicion(1,1),jugador);

        movimiento.moverHaciaDerecha(jugador) ;
        Posicion posicionActualJugador = jugador.obtenerPosicionActual();

        Assert.assertEquals(new Posicion(1,2),posicionActualJugador);

    }


}
