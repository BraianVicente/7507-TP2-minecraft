package fiuba.algo3.minecraft.modelo.mapa;

import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.posicionable.Vacio;
import org.junit.Assert;
import org.junit.Test;

public class MapaTest {

    @Test
    public void testCrearMapaConTamanioCorrecto(){

        Mapa mapa = new Mapa(2,2) ;

        Assert.assertTrue(mapa.posicionDentroDeRangoMapa(new Posicion(1,1)));

    }

    @Test(expected = FueraDeRangoMapaException.class)
    public void testNoSePuedeObtenerPosicionableRangoFueraDeMapa(){
        Mapa mapa = new Mapa(2,2) ;

        mapa.obtenerElementoEnPosicion(new Posicion(2,2)) ;
    }

    @Test
    public void testPosicionSeInicializaVacia(){
        Mapa mapa = new Mapa(2,2);

        Assert.assertEquals(new Vacio(),mapa.obtenerElementoEnPosicion(new Posicion(1,1)));
    }

    @Test
    public void testSePuedeInsertarElementoPosicionableEnPosicionVacia(){
        Mapa mapa = new Mapa(2,2);

        Madera material = new Madera() ;

        mapa.agregarElemento(new Posicion(1,1),material);
        Assert.assertEquals(material,mapa.obtenerElementoEnPosicion(new Posicion(1,1)));

    }

    @Test
    public void testNoSePuedeInsertarElementoPosicionableEnPosicionOcupada(){
        Mapa mapa = new Mapa(2,2);
        Madera material = new Madera() ;

        mapa.agregarElemento(new Posicion(1,1),material);

        Assert.assertEquals(material,mapa.obtenerElementoEnPosicion(new Posicion(1,1)));

        Jugador jugador  = new Jugador("Pepe") ;
        mapa.agregarElemento(new Posicion(1,1),jugador);
        Assert.assertNotEquals(jugador,mapa.obtenerElementoEnPosicion(new Posicion(1,1)));

    }


    @Test
    public void testSePuedeQuitarElementoPosicionableEnPosicionOcupada(){
        Mapa mapa = new Mapa(2,2);

        Madera material = new Madera() ;

        mapa.agregarElemento(new Posicion(1,1),material);
        Assert.assertEquals(material,mapa.obtenerElementoEnPosicion(new Posicion(1,1)));

        mapa.eliminarElemento(new Posicion(1,1));
        Assert.assertEquals(new Vacio(),mapa.obtenerElementoEnPosicion(new Posicion(1,1)));

    }

}
