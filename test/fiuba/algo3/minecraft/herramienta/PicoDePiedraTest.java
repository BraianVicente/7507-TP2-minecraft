package fiuba.algo3.minecraft.herramienta ;

import fiuba.algo3.minecraft.material.Diamante;
import fiuba.algo3.minecraft.material.Madera;
import fiuba.algo3.minecraft.material.Metal;
import fiuba.algo3.minecraft.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class PicoDePiedraTest {

    @Test
    public void test01CreamonsInstanciaDePicoDePiedra () {

        PicoDePiedra unPicoDePiedra = new PicoDePiedra();
        Assert.assertNotNull(unPicoDePiedra);

    }

    @Test
    public void test02CreamosPicoDePiedraConDurabilidadPredeterminada () {

        PicoDePiedra unPicoDePiedra = new PicoDePiedra();
        Assert.assertEquals(200,unPicoDePiedra.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosPicoDePiedraConFuerzaPredeterminada () {

        PicoDePiedra unPicoDePiedra = new PicoDePiedra();
        Assert.assertEquals(4,unPicoDePiedra.obtenerFuerza());

    }

    @Test
    public void test04usarPicoDePiedracontraMetalYSeReduceSuDurabilidad(){

        PicoDePiedra pico = new PicoDePiedra();
        Metal material = new Metal();

        int desgasteEsperado = (int) (4/1.5);
        int durabilidadInicialPico = pico.obtenerDurabilidad();

        pico.desgastar(material);
        int durabilidadFinalPico = pico.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado, durabilidadInicialPico - durabilidadFinalPico);

    }

    public void test05usarPicoDePiedracontraPiedraYSeReduceSuDurabilidad(){

        PicoDePiedra pico = new PicoDePiedra();
        Piedra material = new Piedra();

        int desgasteEsperado = 2;
        int durabilidadInicialPico = pico.obtenerDurabilidad();

        pico.desgastar(material);
        int durabilidadFinalPico = pico.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado, durabilidadInicialPico - durabilidadFinalPico);

    }

    public void test06usarPicoDePiedracontraElRestoDeMaterialesYNoSeReduceSuDurabilidad(){

        PicoDePiedra pico = new PicoDePiedra();
        Madera madera = new Madera();
        Diamante diamante = new Diamante();

        int durabilidadInicialPico = pico.obtenerDurabilidad();

        pico.desgastar(madera);
        pico.desgastar(diamante);
        int durabilidadFinalPico = pico.obtenerDurabilidad();

        Assert.assertEquals(durabilidadInicialPico, durabilidadFinalPico);

    }

}
