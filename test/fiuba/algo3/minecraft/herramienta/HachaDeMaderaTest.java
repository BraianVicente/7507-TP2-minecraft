package fiuba.algo3.minecraft.herramienta;

import org.junit.Assert;
import org.junit.Test;

public class HachaDeMaderaTest {

    @Test
    public void test01CreamosInstanciaDeHachaDeMadera () {

        HachaDeMadera unHachaDeMadera = new HachaDeMadera();
        Assert.assertNotNull(unHachaDeMadera);

    }

    @Test
    public void test02CreamosHachaDeMaderaConDurabilidadPredeterminada () {

        HachaDeMadera unHachaDeMadera = new HachaDeMadera();
        Assert.assertEquals(100,unHachaDeMadera.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosHachaDeMaderaConFuerzaPredeterminada () {

        HachaDeMadera unHachaDeMadera = new HachaDeMadera();
        Assert.assertEquals(2,unHachaDeMadera.obtenerFuerza());

    }

}