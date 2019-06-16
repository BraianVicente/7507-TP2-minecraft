package fiuba.algo3.minecraft.modelo.material;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.herramienta.*;
import org.junit.Assert;
import org.junit.Test;

public class PiedraTest {

    FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();



    /***********************************************/

    @Test
    public void test01CreamonsInstanciaDePiedra () {

        Piedra piedra = new Piedra();
        Assert.assertNotNull(piedra);

    }

/***********************************************/

    @Test
    public void test02DesgastarPiedraConHachaMadera () {

        Piedra piedra = new Piedra();
        Hacha hachaDeMadera = fabricaDeHerramientas.construirHachaDeMadera();
        piedra.desgastar(hachaDeMadera);
        Assert.assertEquals(30,piedra.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test03DesgastarPiedraConHachaMetal () {

        Piedra piedra = new Piedra();
        Hacha hachaDeMetal = fabricaDeHerramientas.construirHachaDeMetal();
        piedra.desgastar(hachaDeMetal);
        Assert.assertEquals(30,piedra.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test04DesgastarPiedraConHachaPiedra () {

        Piedra piedra = new Piedra();
        Hacha hachaDePiedra = fabricaDeHerramientas.construirHachaDePiedra();
        piedra.desgastar(hachaDePiedra);
        Assert.assertEquals(30,piedra.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test05DesgastarPiedraConPicoDeMadera () {

        Piedra piedra = new Piedra();
        Pico picoDeMadera = fabricaDeHerramientas.construirPicoDeMadera();
        piedra.desgastar(picoDeMadera);
        Assert.assertEquals(28,piedra.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test06DesgastarPiedraConPicoDeMetal () {

        Piedra piedra = new Piedra();
        Pico picoDeMetal = fabricaDeHerramientas.construirPicoDeMetal();
        piedra.desgastar(picoDeMetal);
        Assert.assertEquals(18,piedra.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test07DesgastarPiedraConPicoDePiedra () {

        Piedra piedra = new Piedra();
        Pico picoDePiedra = fabricaDeHerramientas.construirPicoDePiedra();
        piedra.desgastar(picoDePiedra);
        Assert.assertEquals(26,piedra.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test08DesgastarPiedraConPicoFino () {

        Piedra piedra = new Piedra();
        Pico picoFino = fabricaDeHerramientas.construirPicoFino();
        piedra.desgastar(picoFino);
        Assert.assertEquals(10,piedra.obtenerDurabilidad());

    }

/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/



}