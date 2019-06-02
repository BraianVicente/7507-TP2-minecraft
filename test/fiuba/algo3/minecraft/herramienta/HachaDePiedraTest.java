package fiuba.algo3.minecraft.herramienta;

import org.junit.Assert;
import org.junit.Test;

public class HachaDePiedraTest {

    @Test
    public void test01CremosInstanciaDeHachaDePiedra () {

        HachaDePiedra unHachaDePiedra = new HachaDePiedra();
        Assert.assertNotNull(unHachaDePiedra);

    }

    @Test
    public void test02CreamosHachaDePiedraConDurabilidadPredeterminada () {

        HachaDePiedra unHachaDePiedra = new HachaDePiedra();
        Assert.assertEquals(200,unHachaDePiedra.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosHachaDePiedraConFuerzaPredeterminada () {

        HachaDePiedra unHachaDePiedra = new HachaDePiedra();
        Assert.assertEquals(5,unHachaDePiedra.obtenerFuerza());

    }

}