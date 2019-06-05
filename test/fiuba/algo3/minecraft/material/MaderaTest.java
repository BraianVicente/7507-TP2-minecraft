package fiuba.algo3.minecraft.material;

import fiuba.algo3.minecraft.herramienta.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaderaTest {

/***********************************************/

    @Test
    public void test01CreamoInstanciaDeMadera () {

        Madera unaMadera = new Madera();
        Assert.assertNotNull(unaMadera);

    }

/***********************************************/

    @Test
    public void test02DesgastarMaderaConHachaMadera () {

        Madera madera = new Madera();
        HachaDeMadera hachaDeMadera = new HachaDeMadera();
        madera.desgastar(hachaDeMadera);
        Assert.assertEquals(8,madera.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test03DesgastarMaderaConHachaMetal () {

        Madera madera = new Madera();
        HachaDeMetal hachaDeMetal = new HachaDeMetal();
        madera.desgastar(hachaDeMetal);
        Assert.assertEquals(0,madera.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test04DesgastarMaderaConHachaPiedra () {

        Madera madera = new Madera();
        HachaDePiedra hachaDePiedra = new HachaDePiedra();
        madera.desgastar(hachaDePiedra);
        Assert.assertEquals(5,madera.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test05DesgastarMaderaConPicoDeMadera () {

        Madera madera = new Madera();
        PicoDeMadera picoDeMadera = new PicoDeMadera();
        madera.desgastar(picoDeMadera);
        Assert.assertEquals(10,madera.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test06DesgastarMaderaConPicoDeMetal () {

        Madera madera = new Madera();
        PicoDeMetal picoDeMetal = new PicoDeMetal();
        madera.desgastar(picoDeMetal);
        Assert.assertEquals(10,madera.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test07DesgastarMaderaConPicoDePiedra () {

        Madera madera = new Madera();
        PicoDePiedra picoDePiedra = new PicoDePiedra();
        madera.desgastar(picoDePiedra);
        Assert.assertEquals(10,madera.obtenerDurabilidad());

    }

/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/

}