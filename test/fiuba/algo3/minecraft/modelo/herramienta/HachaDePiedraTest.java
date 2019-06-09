package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
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

    @Test
    public void test04usarHachaDePiedracontraMaderaYSeReduceSuDurabilidad(){

        HachaDePiedra unHachaDePiedra = new HachaDePiedra();
        Madera material = new Madera();

        int desgasteEsperado = 5;
        int durabilidadInicialHacha = unHachaDePiedra.obtenerDurabilidad();

        unHachaDePiedra.desgastar(material);
        int durabilidadFinalHacha = unHachaDePiedra.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado,(durabilidadInicialHacha-durabilidadFinalHacha));


    }

    @Test
    public void test05usarHachaDePiedraContraElRestoDeMaterialesSinReducirDurabilidad(){

        HachaDePiedra unHachaDePiedra = new HachaDePiedra();
        Diamante diamante = new Diamante();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        int durabilidadInicial = unHachaDePiedra.obtenerDurabilidad();
        unHachaDePiedra.desgastar(diamante);
        unHachaDePiedra.desgastar(piedra);
        unHachaDePiedra.desgastar(metal);

        Assert.assertEquals(durabilidadInicial, unHachaDePiedra.obtenerDurabilidad());
    }

}