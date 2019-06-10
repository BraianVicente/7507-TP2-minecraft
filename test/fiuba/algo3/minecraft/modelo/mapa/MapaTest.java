package fiuba.algo3.minecraft.modelo.mapa;

import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import org.junit.Assert;
import org.junit.Test;

public class MapaTest {

    @Test
    public void testCrearMapaConTamanioCorrecto(){

    Mapa mapa = new Mapa(5,5) ;

    Assert.assertEquals(mapa.obtenerBordeInferiorIzquierdo(),new Posicion(5,5));

    }

}
