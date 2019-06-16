package fiuba.algo3.minecraft.modelo.material;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.herramienta.*;
import org.junit.Assert;
import org.junit.Test;

public class MetalTest {

    FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();



    /***********************************************/

    @Test
    public void test01CreamosInstanciaDeMetal () {

        Metal metal = new Metal();
        Assert.assertNotNull(metal);

    }

/***********************************************/

    @Test
    public void tes02desgastarMetalConHachaMadera () {

        Metal metal = new Metal();
        Hacha hachaDeMadera = fabricaDeHerramientas.construirHachaDeMadera();
        metal.desgastar(hachaDeMadera);
        Assert.assertEquals(50,metal.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test03desgastarMetalConHachaMetal () {

        Metal metal = new Metal();
        Hacha hachaDeMetal = fabricaDeHerramientas.construirHachaDeMetal();
        metal.desgastar(hachaDeMetal);
        Assert.assertEquals(50,metal.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test04desgastarMetalConHachaPiedra () {

        Metal metal = new Metal();
        Hacha hachaDePiedra = fabricaDeHerramientas.construirHachaDePiedra();
        metal.desgastar(hachaDePiedra);
        Assert.assertEquals(50,metal.obtenerDurabilidad());

}

/***********************************************/

    @Test
    public void test05DesgastarMetalConPicoDeMadera () {

        Metal metal = new Metal();
        Pico picoDeMadera = fabricaDeHerramientas.construirPicoDeMadera();
        metal.desgastar(picoDeMadera);
        Assert.assertEquals(50,metal.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test06DesgastarMetalConPicoDeMetal () {

        Metal metal = new Metal();
        Pico picoDeMetal = fabricaDeHerramientas.construirPicoDeMetal();
        metal.desgastar(picoDeMetal);
        Assert.assertEquals(38,metal.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test07DesgastarMetalConPicoDePiedra () {

        Metal metal = new Metal();
        Pico picoDePiedra = fabricaDeHerramientas.construirPicoDePiedra();
        metal.desgastar(picoDePiedra);
        Assert.assertEquals(46,metal.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test08DesgastarMetalConPicoFino () {

        Metal metal = new Metal();
        Pico picoFino = fabricaDeHerramientas.construirPicoFino();
        metal.desgastar(picoFino);
        Assert.assertEquals(30,metal.obtenerDurabilidad());

    }

/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/

}