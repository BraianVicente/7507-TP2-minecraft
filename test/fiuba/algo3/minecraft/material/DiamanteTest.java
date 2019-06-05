package fiuba.algo3.minecraft.material;

import fiuba.algo3.minecraft.herramienta.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiamanteTest {

/***********************************************/

    @Test
    public void test01CreamosInstanciaDeDiamante () {

        Diamante unDiamante = new Diamante();
        Assert.assertNotNull(unDiamante);
    }

/***********************************************/

    @Test
    public void test02desgastarDiamanteConHachaMadera () {

        Diamante unDiamante = new Diamante();
        HachaDeMadera unHachaDeMadera = new HachaDeMadera();
        unDiamante.desgastar(unHachaDeMadera);
        Assert.assertEquals(100,unDiamante.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test03DesgastarDiamanteConHachaMetal() {

        Diamante unDiamante = new Diamante();
        HachaDeMetal unHachaDeMetal = new HachaDeMetal();
        unDiamante.desgastar(unHachaDeMetal);
        Assert.assertEquals(100,unDiamante.obtenerDurabilidad());
    }

/***********************************************/

    @Test
    public void test04DesgastarDiamanteConHachaPiedra () {

        Diamante unDiamante = new Diamante();
        HachaDePiedra unHachaDePiedra = new HachaDePiedra();
        unDiamante.desgastar(unHachaDePiedra);
        Assert.assertEquals(100,unDiamante.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test05DesgastarDiamanteConPicoDeMadera () {

        Diamante unDiamante = new Diamante();
        PicoDeMadera unPicoDeMadera = new PicoDeMadera();
        unDiamante.desgastar(unPicoDeMadera);
        Assert.assertEquals(100,unDiamante.obtenerDurabilidad());

    }

/***********************************************/

    @Test
    public void test06DesgastarDiamanteConPicoDeMetal () {

        Diamante unDiamante = new Diamante();
        PicoDeMetal unPicoDeMetal = new PicoDeMetal();
        unDiamante.desgastar(unPicoDeMetal);
        Assert.assertEquals(100,unDiamante.obtenerDurabilidad());

    }

/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/

}