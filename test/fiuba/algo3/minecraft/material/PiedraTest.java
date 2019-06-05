package fiuba.algo3.minecraft.material;

import fiuba.algo3.minecraft.herramienta.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PiedraTest {


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
        HachaDeMadera hachaDeMadera = new HachaDeMadera();
        piedra.desgastar(hachaDeMadera);
        Assert.assertEquals(30,piedra.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test03DesgastarPiedraConHachaMetal () {

        Piedra piedra = new Piedra();
        HachaDeMetal hachaDeMetal = new HachaDeMetal();
        piedra.desgastar(hachaDeMetal);
        Assert.assertEquals(30,piedra.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test04DesgastarPiedraConHachaPiedra () {

        Piedra piedra = new Piedra();
        HachaDePiedra hachaDePiedra = new HachaDePiedra();
        piedra.desgastar(hachaDePiedra);
        Assert.assertEquals(30,piedra.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test05DesgastarPiedraConPicoDeMadera () {

        Piedra piedra = new Piedra();
        PicoDeMadera picoDeMadera = new PicoDeMadera();
        piedra.desgastar(picoDeMadera);
        Assert.assertEquals(28,piedra.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test06DesgastarPiedraConPicoDeMetal () {

        Piedra piedra = new Piedra();
        PicoDeMetal picoDeMetal = new PicoDeMetal();
        piedra.desgastar(picoDeMetal);
        Assert.assertEquals(18,piedra.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test07DesgastarPiedraConPicoDePiedra () {

        Piedra piedra = new Piedra();
        PicoDePiedra picoDePiedra = new PicoDePiedra();
        piedra.desgastar(picoDePiedra);
        Assert.assertEquals(26,piedra.obtenerDurabilidad());

    }

/***********************************************/


/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/



}