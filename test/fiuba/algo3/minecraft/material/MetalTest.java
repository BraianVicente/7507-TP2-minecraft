package fiuba.algo3.minecraft.material;

import fiuba.algo3.minecraft.herramienta.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MetalTest {


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
        HachaDeMadera hachaDeMadera = new HachaDeMadera();
        metal.desgastar(hachaDeMadera);
        Assert.assertEquals(50,metal.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test03desgastarMetalConHachaMetal () {

        Metal metal = new Metal();
        HachaDeMetal hachaDeMetal = new HachaDeMetal();
        metal.desgastar(hachaDeMetal);
        Assert.assertEquals(50,metal.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test04desgastarMetalConHachaPiedra () {

        Metal metal = new Metal();
        HachaDePiedra hachaDePiedra = new HachaDePiedra();
        metal.desgastar(hachaDePiedra);
        Assert.assertEquals(50,metal.obtenerDurabilidad());

}

/***********************************************/

    @Test
    public void test05DesgastarMetalConPicoDeMadera () {

        Metal metal = new Metal();
        PicoDeMadera picoDeMadera = new PicoDeMadera();
        metal.desgastar(picoDeMadera);
        Assert.assertEquals(50,metal.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test06DesgastarMetalConPicoDeMetal () {

        Metal metal = new Metal();
        PicoDeMetal picoDeMetal = new PicoDeMetal();
        metal.desgastar(picoDeMetal);
        Assert.assertEquals(38,metal.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test07DesgastarMetalConPicoDePiedra () {

        Metal metal = new Metal();
        PicoDePiedra picoDePiedra = new PicoDePiedra();
        metal.desgastar(picoDePiedra);
        Assert.assertEquals(46,metal.obtenerDurabilidad());

    }

/***********************************************/


/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/

}