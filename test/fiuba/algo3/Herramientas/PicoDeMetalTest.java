package fiuba.algo3.Herramientas;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PicoDeMetalTest {

    /***********************************************/

    @Test
    public void test01CreamonsInstanciaDePicoDeMetal () {

        PicoDeMetal unPicoDeMetal = new PicoDeMetal();
        Assert.assertNotNull(unPicoDeMetal);

    }
}
