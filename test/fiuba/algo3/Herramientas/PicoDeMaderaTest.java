package fiuba.algo3.Herramientas;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PicoDeMaderaTest {

    /***********************************************/

    @Test
    public void test01CreamonsInstanciaDePicoDeMadera () {

        PicoDeMadera unPicoDeMadera = new PicoDeMadera();
        Assert.assertNotNull(unPicoDeMadera);

    }

    /***********************************************/

    @Test
    public void test02CreamosPicoDeMaderaConDurabilidadPredeterminada () {

        PicoDeMadera unPicoDeMadera = new PicoDeMadera();
        Assert.assertEquals(100,unPicoDeMadera.obtenerDurabilidad());

    }

    /***********************************************/

    @Test
    public void test03CreamosPicoDeMaderaConFuerzaPredeterminada () {

        PicoDeMadera unPicoDeMadera = new PicoDeMadera();
        Assert.assertEquals(2,unPicoDeMadera.obtenerFuerza());

    }

/***********************************************/
}
