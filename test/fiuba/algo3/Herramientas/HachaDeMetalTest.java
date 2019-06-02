package fiuba.algo3.Herramientas;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HachaDeMetalTest {

/***********************************************/

    @Test
    public void test01CreamosInstanciaDeHachaDeMetal () {

        HachaDeMetal unHachaDeMetal = new HachaDeMetal();
        Assert.assertNotNull(unHachaDeMetal);

    }

/***********************************************/

    @Test
    public void test02CreamosHachaDeMetalConDurabilidadPredeterminada () {

        HachaDeMetal unHachaDeMetal = new HachaDeMetal();
        Assert.assertEquals(400,unHachaDeMetal.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test03CreamosHachaDeMetalConFuerzaPredeterminada () {

        HachaDeMetal unHachaDeMetal = new HachaDeMetal();
        Assert.assertEquals(10,unHachaDeMetal.obtenerFuerza());

    }

/***********************************************/

}