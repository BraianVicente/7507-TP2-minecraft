package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class HachaDeMetalTest {

    FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();


    @Test
    public void test01CreamosInstanciaDeHachaDeMetal () {

        Hacha unHachaDeMetal = fabricaDeHerramientas.construirHachaDeMetal();
        Assert.assertNotNull(unHachaDeMetal);

    }

    @Test
    public void test02CreamosHachaDeMetalConDurabilidadPredeterminada () {

        Hacha unHachaDeMetal = fabricaDeHerramientas.construirHachaDeMetal();
        Assert.assertEquals(400,unHachaDeMetal.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosHachaDeMetalConFuerzaPredeterminada () {

        Hacha unHachaDeMetal = fabricaDeHerramientas.construirHachaDeMetal();
        Assert.assertEquals(10,unHachaDeMetal.obtenerFuerza());

    }

    @Test
    public void test04usarHachaDeMetalcontraMaderaYSeReduceSuDurabilidad(){

        Hacha unHachaDeMetal = fabricaDeHerramientas.construirHachaDeMetal();
        Madera material = new Madera();

        int desgasteEsperado = 5;
        int durabilidadInicialHacha = unHachaDeMetal.obtenerDurabilidad();

        unHachaDeMetal.desgastar(material);
        int durabilidadFinalHacha = unHachaDeMetal.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado,(durabilidadInicialHacha-durabilidadFinalHacha));

    }

}