package fiuba.algo3.minecraft.herramienta ;

import fiuba.algo3.minecraft.material.Diamante;
import fiuba.algo3.minecraft.material.Madera;
import fiuba.algo3.minecraft.material.Metal;
import fiuba.algo3.minecraft.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class PicoDeMetalTest {

    @Test
    public void test01CreamonsInstanciaDePicoDeMetal () {

        PicoDeMetal unPicoDeMetal = new PicoDeMetal();
        Assert.assertNotNull(unPicoDeMetal);

    }

    @Test
    public void test02CreamosPicoDeMetalConDurabilidadPredeterminada () {

        PicoDeMetal unPicoDeMetal = new PicoDeMetal();
        Assert.assertEquals(400,unPicoDeMetal.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosPicoDeMetalConFuerzaPredeterminada () {

        PicoDeMetal unPicoDeMetal = new PicoDeMetal();
        Assert.assertEquals(12,unPicoDeMetal.obtenerFuerza());

    }

    @Test
    public void test04usarPicoDeMetalcontraPiedraYSeReduceSuDurabilidad(){

        PicoDeMetal pico = new PicoDeMetal();
        Piedra material = new Piedra();

        int durabilidadInicialPico = pico.obtenerDurabilidad();
        int desgasteEsperado = (int) (durabilidadInicialPico * 0.1);

        pico.desgastar(material);
        int durabilidadFinalPico = pico.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado, durabilidadInicialPico - durabilidadFinalPico);

    }

    @Test
    public void test05usarPicoDeMetalcontraElRestoDeMaterialesYNoSeReduceSuDurabilidad(){

        PicoDeMetal pico = new PicoDeMetal();
        Madera madera = new Madera();
        Diamante diamante = new Diamante();
        Metal metal = new Metal();

        int durabilidadInicialPico = pico.obtenerDurabilidad();

        pico.desgastar(madera);
        pico.desgastar(diamante);
        pico.desgastar(metal);
        int durabilidadFinalPico = pico.obtenerDurabilidad();

        Assert.assertEquals(durabilidadInicialPico, durabilidadFinalPico);

    }
}
