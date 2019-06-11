package fiuba.algo3.minecraft.modelo.mapa;

import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.posicionable.Vacio;
import org.junit.Assert;
import org.junit.Test;

public class MapaTest {

    @Test
    public void testCrearMapaConTamanioCorrecto(){

        Mapa mapa = new Mapa(2,2) ;

        Assert.assertTrue(mapa.posicionExiste(1,1));

    }

    @Test(expected = FueraDeRangoMapaException.class)
    public void testNoSePuedeObtenerPosicionableRangoFueraDeMapa(){
        Mapa mapa = new Mapa(2,2) ;

        mapa.obtenerPosicion(2,2) ;
    }

    @Test
    public void testPosicionSeInicializaVacia(){
        Mapa mapa = new Mapa(2,2);

        Assert.assertEquals(new Vacio(),mapa.obtenerPosicion(1,1));
    }

    @Test
    public void testSePuedeInsertarElementoPosicionableEnPosicionVacia(){
        Mapa mapa = new Mapa(2,2);

        Madera material = new Madera() ;

        mapa.agregarElemento(1,1,material);
        Assert.assertEquals(material,mapa.obtenerPosicion(1,1));

    }

    @Test
    public void testNoSePuedeInsertarElementoPosicionableEnPosicionOcupada(){
        Mapa mapa = new Mapa(2,2);
        Madera material = new Madera() ;

        mapa.agregarElemento(1,1,material);

        Assert.assertEquals(material,mapa.obtenerPosicion(1,1));

        Jugador jugador  = new Jugador() ;
        mapa.agregarElemento(1,1,jugador);
        Assert.assertNotEquals(jugador,mapa.obtenerPosicion(1,1));

    }


    @Test
    public void testSePuedeQuitarElementoPosicionableEnPosicionOcupada(){
        Mapa mapa = new Mapa(2,2);

        Madera material = new Madera() ;

        mapa.agregarElemento(1,1,material);
        Assert.assertEquals(material,mapa.obtenerPosicion(1,1));

        mapa.eliminarElemento(1,1);
        Assert.assertEquals(new Vacio(),mapa.obtenerPosicion(1,1));

    }

}
