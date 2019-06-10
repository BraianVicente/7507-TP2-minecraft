package fiuba.algo3.minecraft.modelo.mapa;

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
}
