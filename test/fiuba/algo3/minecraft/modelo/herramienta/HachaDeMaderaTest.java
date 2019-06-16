package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class HachaDeMaderaTest {

    FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();

    @Test
    public void test01CreamosInstanciaDeHachaDeMadera () {

        Hacha unHachaDeMadera = fabricaDeHerramientas.construirHachaDeMadera();
        Assert.assertNotNull(unHachaDeMadera);

    }

    @Test
    public void test02CreamosHachaDeMaderaConDurabilidadPredeterminada () {

        Hacha unHachaDeMadera = fabricaDeHerramientas.construirHachaDeMadera();
        Assert.assertEquals(100,unHachaDeMadera.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosHachaDeMaderaConFuerzaPredeterminada () {

        Hacha unHachaDeMadera = fabricaDeHerramientas.construirHachaDeMadera();
        Assert.assertEquals(2,unHachaDeMadera.obtenerFuerza());

    }

    @Test
    public void test04usarHachaDeMaderacontraMaderaYSeReduceSuDurabilidad(){

        Hacha unHachaDeMadera = fabricaDeHerramientas.construirHachaDeMadera();
        Madera material = new Madera();

        int desgasteEsperado = 2;
        int durabilidadInicialHacha = unHachaDeMadera.obtenerDurabilidad();

        unHachaDeMadera.desgastar(material);
        int durabilidadFinalHacha = unHachaDeMadera.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado,(durabilidadInicialHacha-durabilidadFinalHacha));


    }

}