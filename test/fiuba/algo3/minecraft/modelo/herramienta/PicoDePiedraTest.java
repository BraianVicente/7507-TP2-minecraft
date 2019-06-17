package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class PicoDePiedraTest {

    FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();


    @Test
    public void test01CreamonsInstanciaDePicoDePiedra () {

        Pico unPicoDePiedra = fabricaDeHerramientas.construirPicoDePiedra();
        Assert.assertNotNull(unPicoDePiedra);

    }

    @Test
    public void test02CreamosPicoDePiedraConDurabilidadPredeterminada () {

        Pico unPicoDePiedra = fabricaDeHerramientas.construirPicoDePiedra();
        Assert.assertEquals(200,unPicoDePiedra.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosPicoDePiedraConFuerzaPredeterminada () {

        Pico unPicoDePiedra = fabricaDeHerramientas.construirPicoDePiedra();
        Assert.assertEquals(4,unPicoDePiedra.obtenerFuerza());

    }

    @Test
    public void test04usarPicoDePiedracontraMetalYSeReduceSuDurabilidad(){

        Pico unPicoDePiedra = fabricaDeHerramientas.construirPicoDePiedra();
        Metal material = new Metal();

        int desgasteEsperado = (int) (4/1.5);
        int durabilidadInicialPico = unPicoDePiedra.obtenerDurabilidad();

        unPicoDePiedra.desgastar(material);
        int durabilidadFinalPico = unPicoDePiedra.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado, durabilidadInicialPico - durabilidadFinalPico);

    }

    @Test
    public void test05usarPicoDePiedracontraPiedraYSeReduceSuDurabilidad(){

        Pico unPicoDePiedra = fabricaDeHerramientas.construirPicoDePiedra();
        Piedra material = new Piedra();

        int desgasteEsperado = 2;
        int durabilidadInicialPico = unPicoDePiedra.obtenerDurabilidad();

        unPicoDePiedra.desgastar(material);
        int durabilidadFinalPico = unPicoDePiedra.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado, durabilidadInicialPico - durabilidadFinalPico);

    }

}
