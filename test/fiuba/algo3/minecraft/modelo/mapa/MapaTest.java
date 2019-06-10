package fiuba.algo3.minecraft.modelo.mapa;

import fiuba.algo3.minecraft.modelo.posicionable.Ocupado;
import fiuba.algo3.minecraft.modelo.posicionable.Persona;
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

        mapa.agregarElemento(1,1,new Ocupado());

        Assert.assertEquals(new Ocupado(),mapa.obtenerPosicion(1,1));

    }

    @Test
    public void testNoSePuedeInsertarElementoPosicionableEnPosicionOcupada(){
        Mapa mapa = new Mapa(2,2);

        mapa.agregarElemento(1,1,new Ocupado());

        Assert.assertEquals(new Ocupado(),mapa.obtenerPosicion(1,1));

        mapa.agregarElemento(1,1,new Persona());
        Assert.assertNotEquals(new Persona(),mapa.obtenerPosicion(1,1));

    }


    @Test
    public void testSePuedeQuitarElementoPosicionableEnPosicionOcupada(){
        Mapa mapa = new Mapa(2,2);

        mapa.agregarElemento(1,1,new Ocupado());

        Assert.assertEquals(new Ocupado(),mapa.obtenerPosicion(1,1));

        mapa.eliminarElemento(1,1);
        Assert.assertEquals(new Vacio(),mapa.obtenerPosicion(1,1));

    }




}
