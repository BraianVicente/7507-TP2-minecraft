package fiuba.algo3.minecraft.modelo.posicionable;

import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import org.junit.Assert;
import org.junit.Test;

public class VacioTest {

    @Test
    public void seObtienePosicionPreviamenteEstablecida() {
        Vacio vacio = new Vacio();
        vacio.establecerPosicion(new Posicion(0,0));

        Assert.assertEquals(new Posicion(0,0),vacio.obtenerPosicionActual());
    }

}