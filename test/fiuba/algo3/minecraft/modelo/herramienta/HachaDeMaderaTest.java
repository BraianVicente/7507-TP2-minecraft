package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.material.*;
import org.junit.Assert;
import org.junit.Test;

public class HachaDeMaderaTest {

    FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();

    @Test
    public void test01CreamosInstanciaDeHachaDeMadera () {

        Herramienta unHachaDeMadera = fabricaDeHerramientas.construirHachaDeMadera();
        Assert.assertNotNull(unHachaDeMadera);

    }

    @Test
    public void test02CreamosHachaDeMaderaConDurabilidadPredeterminada () {

        Herramienta unHachaDeMadera = fabricaDeHerramientas.construirHachaDeMadera();
        Assert.assertEquals(100,unHachaDeMadera.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosHachaDeMaderaConFuerzaPredeterminada () {

        Herramienta unHachaDeMadera = fabricaDeHerramientas.construirHachaDeMadera();
        Assert.assertEquals(2,unHachaDeMadera.obtenerFuerza());

    }

    @Test
    public void test04usarHachaDeMaderacontraMaderaYSeReduceSuDurabilidad(){

        Herramienta unHachaDeMadera = fabricaDeHerramientas.construirHachaDeMadera();
        Material material = new Madera();

        int desgasteEsperado = 2;
        int durabilidadInicialHacha = unHachaDeMadera.obtenerDurabilidad();

        unHachaDeMadera.desgastar(material);
        int durabilidadFinalHacha = unHachaDeMadera.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado,(durabilidadInicialHacha-durabilidadFinalHacha));


    }

}
