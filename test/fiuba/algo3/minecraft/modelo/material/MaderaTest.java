package fiuba.algo3.minecraft.modelo.material;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.herramienta.*;
import org.junit.Assert;
import org.junit.Test;

public class MaderaTest {

    FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();


    /***********************************************/

    @Test
    public void test01CreamosInstanciaDeMadera () {

        Madera unaMadera = new Madera();
        Assert.assertNotNull(unaMadera);

    }

/***********************************************/

    @Test
    public void test02DesgastarMaderaConHachaMadera () {

        Madera madera = new Madera();
        Hacha unHachaDeMadera = fabricaDeHerramientas.construirHachaDeMadera();
        madera.desgastar(unHachaDeMadera);
        Assert.assertEquals(8,madera.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test03DesgastarMaderaConHachaMetal () {

        Madera madera = new Madera();
        Hacha unHachaDeMetal = fabricaDeHerramientas.construirHachaDeMetal();
        madera.desgastar(unHachaDeMetal);
        Assert.assertEquals(0,madera.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test04DesgastarMaderaConHachaPiedra () {

        Madera madera = new Madera();
        Hacha unHachaDePiedra = fabricaDeHerramientas.construirHachaDePiedra();
        madera.desgastar(unHachaDePiedra);
        Assert.assertEquals(5,madera.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test05DesgastarMaderaConPicoDeMadera () {

        Madera madera = new Madera();
        Pico picoDeMadera = fabricaDeHerramientas.construirPicoDeMadera();
        madera.desgastar(picoDeMadera);
        Assert.assertEquals(10,madera.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test06DesgastarMaderaConPicoDeMetal () {

        Madera madera = new Madera();
        Pico picoDeMetal = fabricaDeHerramientas.construirPicoDeMetal();
        madera.desgastar(picoDeMetal);
        Assert.assertEquals(10,madera.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test07DesgastarMaderaConPicoDePiedra () {

        Madera madera = new Madera();
        Pico picoDePiedra = fabricaDeHerramientas.construirPicoDePiedra();
        madera.desgastar(picoDePiedra);
        Assert.assertEquals(10,madera.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test08DesgastarMaderaConPicoFino () {

        Madera madera = new Madera();
        Pico picoFino = fabricaDeHerramientas.construirPicoFino();
        madera.desgastar(picoFino);
        Assert.assertEquals(10,madera.obtenerDurabilidad());

    }

/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/

}