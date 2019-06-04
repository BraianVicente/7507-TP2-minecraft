package fiuba.algo3.minecraft.herramienta;

import fiuba.algo3.minecraft.material.Diamante;
import fiuba.algo3.minecraft.material.Madera;
import fiuba.algo3.minecraft.material.Metal;
import fiuba.algo3.minecraft.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class HachaDeMetalTest {

    @Test
    public void test01CreamosInstanciaDeHachaDeMetal () {

        HachaDeMetal unHachaDeMetal = new HachaDeMetal();
        Assert.assertNotNull(unHachaDeMetal);

    }

    @Test
    public void test02CreamosHachaDeMetalConDurabilidadPredeterminada () {

        HachaDeMetal unHachaDeMetal = new HachaDeMetal();
        Assert.assertEquals(400,unHachaDeMetal.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosHachaDeMetalConFuerzaPredeterminada () {

        HachaDeMetal unHachaDeMetal = new HachaDeMetal();
        Assert.assertEquals(10,unHachaDeMetal.obtenerFuerza());

    }

    @Test
    public void test04usarHachaDeMetalcontraMaderaYSeReduceSuDurabilidad(){

        HachaDeMetal unHachaDeMetal = new HachaDeMetal();
        Madera material = new Madera();

        int desgasteEsperado = 5;
        int durabilidadInicialHacha = unHachaDeMetal.obtenerDurabilidad();

        unHachaDeMetal.desgastar(material);
        int durabilidadFinalHacha = unHachaDeMetal.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado,(durabilidadInicialHacha-durabilidadFinalHacha));

    }

    @Test
    public void test05usarHachaDeMetalContraElRestoDeMaterialesSinReducirDurabilidad(){

        HachaDeMetal unHachaDeMetal = new HachaDeMetal();
        Diamante diamante = new Diamante();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        int durabilidadInicial = unHachaDeMetal.obtenerDurabilidad();
        unHachaDeMetal.desgastar(diamante);
        unHachaDeMetal.desgastar(piedra);
        unHachaDeMetal.desgastar(metal);

        Assert.assertEquals(durabilidadInicial, unHachaDeMetal.obtenerDurabilidad());
    }

}