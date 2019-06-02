package fiuba.algo3.Herramientas;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PicoFinoTest {

    /***********************************************/

    @Test
    public void test01CreamonsInstanciaDePicoFino () {

        PicoFino unPicoFino = new PicoFino();
        Assert.assertNotNull(unPicoFino);

    }

    /***********************************************/

    @Test
    public void test02CreamosPicoFinoConDurabilidadPredeterminada () {

        PicoFino unPicoFino = new PicoFino();
        Assert.assertEquals(1000,unPicoFino.obtenerDurabilidad());

    }

    /***********************************************/

    @Test
    public void test03CreamosPicoFinoConFuerzaPredeterminada () {

        PicoFino unPicoFino = new PicoFino();
        Assert.assertEquals(20,unPicoFino.obtenerFuerza());

    }

}
