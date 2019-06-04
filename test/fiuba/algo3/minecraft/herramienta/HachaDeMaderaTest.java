package fiuba.algo3.minecraft.herramienta;

import fiuba.algo3.minecraft.material.Diamante;
import fiuba.algo3.minecraft.material.Madera;
import fiuba.algo3.minecraft.material.Metal;
import fiuba.algo3.minecraft.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class HachaDeMaderaTest {

    @Test
    public void test01CreamonsInstanciaDeHachaDeMadera () {

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


    @Test
    public void test04usarHachaDeMaderacontraMaderaYSeReduceSuDurabilidad(){

        HachaDeMadera unHachaDeMadera = new HachaDeMadera();
        Madera material = new Madera();

        int desgasteEsperado = 2;
        int durabilidadInicialHacha = unHachaDeMadera.obtenerDurabilidad();

        unHachaDeMadera.desgastar(material);
        int durabilidadFinalHacha = unHachaDeMadera.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado,(durabilidadInicialHacha-durabilidadFinalHacha));


    }
    @Test
    public void test05usarHachaDeMaderaContraElRestoDeMaterialesSinReducirDurabilidad(){

        HachaDeMadera unHachaDeMadera = new HachaDeMadera();
        Diamante diamante = new Diamante();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        int durabilidadInicial = unHachaDeMadera.obtenerDurabilidad();
        unHachaDeMadera.desgastar(diamante);
        unHachaDeMadera.desgastar(piedra);
        unHachaDeMadera.desgastar(metal);

        Assert.assertEquals(durabilidadInicial, unHachaDeMadera.obtenerDurabilidad());
    }
}