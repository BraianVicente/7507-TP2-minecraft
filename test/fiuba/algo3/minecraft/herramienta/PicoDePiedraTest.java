package fiuba.algo3.minecraft.herramienta ;

import org.junit.Assert;
import org.junit.Test;

public class PicoDePiedraTest {

    @Test
    public void test01CreamonsInstanciaDePicoDePiedra () {

        PicoDePiedra unPicoDePiedra = new PicoDePiedra();
        Assert.assertNotNull(unPicoDePiedra);

    }

    @Test
    public void test02CreamosPicoDePiedraConDurabilidadPredeterminada () {

        PicoDePiedra unPicoDePiedra = new PicoDePiedra();
        Assert.assertEquals(200,unPicoDePiedra.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosPicoDePiedraConFuerzaPredeterminada () {

        PicoDePiedra unPicoDePiedra = new PicoDePiedra();
        Assert.assertEquals(4,unPicoDePiedra.obtenerFuerza());

    }

}
