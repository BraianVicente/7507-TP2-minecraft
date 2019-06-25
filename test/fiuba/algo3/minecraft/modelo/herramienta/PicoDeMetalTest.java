package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.material.*;
import org.junit.Assert;
import org.junit.Test;

public class PicoDeMetalTest {

    FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();


    @Test
    public void test01CreamonsInstanciaDePicoDeMetal () {

        Herramienta unPicoDeMetal = fabricaDeHerramientas.construirPicoDeMetal();
        Assert.assertNotNull(unPicoDeMetal);

    }

    @Test
    public void test02CreamosPicoDeMetalConDurabilidadPredeterminada () {

        Herramienta unPicoDeMetal = fabricaDeHerramientas.construirPicoDeMetal();
        Assert.assertEquals(400,unPicoDeMetal.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosPicoDeMetalConFuerzaPredeterminada () {

        Herramienta unPicoDeMetal = fabricaDeHerramientas.construirPicoDeMetal();
        Assert.assertEquals(12,unPicoDeMetal.obtenerFuerza());

    }

    @Test
    public void test04usarPicoDeMetalcontraPiedraYSeReduceSuDurabilidad(){

        Herramienta unPicoDeMetal = fabricaDeHerramientas.construirPicoDeMetal();
        Material material = new Piedra();

        int durabilidadInicialPico = unPicoDeMetal.obtenerDurabilidad();
        int desgasteEsperado = (int) (durabilidadInicialPico * 0.1);

        unPicoDeMetal.desgastar(material);
        int durabilidadFinalPico = unPicoDeMetal.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado, durabilidadInicialPico - durabilidadFinalPico);

    }

}
