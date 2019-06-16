package fiuba.algo3.minecraft.modelo.fabrica;

import fiuba.algo3.minecraft.modelo.herramienta.Hacha;
import fiuba.algo3.minecraft.modelo.herramienta.Pico;
import org.junit.Assert;
import org.junit.Test;

public class FabricaDeHerramientasTest {

    @Test
    public void test01CreamosInstanciaDeFabricaDeHerramientas(){
        FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();

        Assert.assertNotNull(fabricaDeHerramientas);
    }

    @Test
    public void test02FabricaConstruyeHachaDeMadera(){
        FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();
        Hacha hacha = fabricaDeHerramientas.construirHachaDeMadera();

        Assert.assertNotNull(hacha);
    }

    @Test
    public void test03FabricaConstruyeHachaDePiedra(){
        FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();
        Hacha hacha = fabricaDeHerramientas.construirHachaDePiedra();

        Assert.assertNotNull(hacha);
    }

    @Test
    public void test04FabricaConstruyeHachaDeMetal(){
        FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();
        Hacha hacha = fabricaDeHerramientas.construirHachaDeMetal();

        Assert.assertNotNull(hacha);
    }

    @Test
    public void test05FabricaConstruyePicoDeMadera(){
        FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();
        Pico pico = fabricaDeHerramientas.construirPicoDeMadera();

        Assert.assertNotNull(pico);
    }

    @Test
    public void test06FabricaConstruyePicoDePiedra(){
        FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();
        Pico pico = fabricaDeHerramientas.construirPicoDePiedra();

        Assert.assertNotNull(pico);
    }

    @Test
    public void test07FabricaConstruyePicoDeMetal(){
        FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();
        Pico pico = fabricaDeHerramientas.construirPicoDeMetal();

        Assert.assertNotNull(pico);
    }

    @Test
    public void test08FabricaConstruyePicoFino(){
        FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();
        Pico pico = fabricaDeHerramientas.construirPicoFino();

        Assert.assertNotNull(pico);
    }
}
