package fiuba.algo3.minecraft.modelo.material;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.herramienta.*;
import org.junit.Assert;
import org.junit.Test;

public class DiamanteTest {

    FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();

    @Test
    public void test01CreamosInstanciaDeDiamante () {

        Diamante unDiamante = new Diamante();
        Assert.assertNotNull(unDiamante);
    }

    @Test
    public void test02desgastarDiamanteConHachaMadera () {

        Diamante unDiamante = new Diamante();
        Hacha unHachaDeMadera = fabricaDeHerramientas.construirHachaDeMadera();
        unDiamante.desgastar(unHachaDeMadera);
        Assert.assertEquals(100,unDiamante.obtenerDurabilidad());

    }

    @Test
    public void test03DesgastarDiamanteConHachaMetal() {

        Diamante unDiamante = new Diamante();
        Hacha unHachaDeMetal = fabricaDeHerramientas.construirHachaDeMetal();
        unDiamante.desgastar(unHachaDeMetal);
        Assert.assertEquals(100,unDiamante.obtenerDurabilidad());
    }

    @Test
    public void test04DesgastarDiamanteConHachaPiedra () {

        Diamante unDiamante = new Diamante();
        Hacha unHachaDePiedra = fabricaDeHerramientas.construirHachaDePiedra();
        unDiamante.desgastar(unHachaDePiedra);
        Assert.assertEquals(100,unDiamante.obtenerDurabilidad());

    }

    @Test
    public void test05DesgastarDiamanteConPicoDeMadera () {

        Diamante unDiamante = new Diamante();
        Pico unPicoDeMadera = fabricaDeHerramientas.construirPicoDeMadera();
        unDiamante.desgastar(unPicoDeMadera);
        Assert.assertEquals(100,unDiamante.obtenerDurabilidad());

    }

    @Test
    public void test06DesgastarDiamanteConPicoDeMetal () {

        Diamante unDiamante = new Diamante();
        Pico unPicoDeMetal = fabricaDeHerramientas.construirPicoDeMetal();
        unDiamante.desgastar(unPicoDeMetal);
        Assert.assertEquals(100,unDiamante.obtenerDurabilidad());

    }

    @Test
    public void test07DesgastarDiamanteConPicoDePiedra () {

        Diamante unDiamante = new Diamante();
        Pico unPicoDePiedra = fabricaDeHerramientas.construirPicoDePiedra();
        unDiamante.desgastar(unPicoDePiedra);
        Assert.assertEquals(100,unDiamante.obtenerDurabilidad());

    }

    @Test
    public void tet08DesgastarDiamanteConPicoFino () {

        Diamante unDiamante = new Diamante();
        Pico unPicoFino = fabricaDeHerramientas.construirPicoFino();
        unDiamante.desgastar(unPicoFino);
        Assert.assertEquals(80,unDiamante.obtenerDurabilidad());

    }

}