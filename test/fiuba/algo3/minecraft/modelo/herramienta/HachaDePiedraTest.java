package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.material.*;
import org.junit.Assert;
import org.junit.Test;

public class HachaDePiedraTest {

    FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();


    @Test
    public void test01CremosInstanciaDeHachaDePiedra () {

        Herramienta unHachaDePiedra = fabricaDeHerramientas.construirHachaDePiedra();
        Assert.assertNotNull(unHachaDePiedra);

    }

    @Test
    public void test02CreamosHachaDePiedraConDurabilidadPredeterminada () {

        Herramienta unHachaDePiedra = fabricaDeHerramientas.construirHachaDePiedra();
        Assert.assertEquals(200,unHachaDePiedra.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosHachaDePiedraConFuerzaPredeterminada () {

        Herramienta unHachaDePiedra = fabricaDeHerramientas.construirHachaDePiedra();
        Assert.assertEquals(5,unHachaDePiedra.obtenerFuerza());

    }

    @Test
    public void test04usarHachaDePiedracontraMaderaYSeReduceSuDurabilidad(){

        Herramienta unHachaDePiedra = fabricaDeHerramientas.construirHachaDePiedra();
        Material material = new Madera();

        int desgasteEsperado = 5;
        int durabilidadInicialHacha = unHachaDePiedra.obtenerDurabilidad();

        unHachaDePiedra.desgastar(material);
        int durabilidadFinalHacha = unHachaDePiedra.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado,(durabilidadInicialHacha-durabilidadFinalHacha));


    }

}
