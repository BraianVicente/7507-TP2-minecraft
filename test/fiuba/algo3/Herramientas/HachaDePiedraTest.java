package fiuba.algo3.Herramientas;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HachaDePiedraTest {

/***********************************************/

    @Test
    public void test01CremosInstanciaDeHachaDePiedra () {

        HachaDePiedra unHachaDePiedra = new HachaDePiedra();
        Assert.assertNotNull(unHachaDePiedra);

    }

/***********************************************/

    @Test
    public void test02CreamosHachaDePiedraConDurabilidadPredeterminada () {

        HachaDePiedra unHachaDePiedra = new HachaDePiedra();
        Assert.assertEquals(200,unHachaDePiedra.obtenerDurabilidad());

    }

/***********************************************/

/***********************************************/

}