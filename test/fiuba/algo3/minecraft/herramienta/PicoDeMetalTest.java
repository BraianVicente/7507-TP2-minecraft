package fiuba.algo3.minecraft.herramienta ;

import org.junit.Assert;
import org.junit.Test;

public class PicoDeMetalTest {

    @Test
    public void test01CreamonsInstanciaDePicoDeMetal () {

        PicoDeMetal unPicoDeMetal = new PicoDeMetal();
        Assert.assertNotNull(unPicoDeMetal);

    }

    @Test
    public void test02CreamosPicoDeMetalConDurabilidadPredeterminada () {

        PicoDeMetal unPicoDeMetal = new PicoDeMetal();
        Assert.assertEquals(400,unPicoDeMetal.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosPicoDeMetalConFuerzaPredeterminada () {

        PicoDeMetal unPicoDeMetal = new PicoDeMetal();
        Assert.assertEquals(12,unPicoDeMetal.obtenerFuerza());

    }
}
