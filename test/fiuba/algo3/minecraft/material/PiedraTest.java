package fiuba.algo3.minecraft.material;

import fiuba.algo3.minecraft.herramienta.HachaDeMadera;
import fiuba.algo3.minecraft.herramienta.HachaDeMetal;
import fiuba.algo3.minecraft.herramienta.HachaDePiedra;
import fiuba.algo3.minecraft.herramienta.PicoFino;
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
    public void test02DesgastarPiedraConHachaMetal () {

        Piedra piedra = new Piedra();
        HachaDeMetal hachaDeMetal = new HachaDeMetal();
        piedra.desgastar(hachaDeMetal);
        Assert.assertEquals(30,piedra.obtenerDurabilidad());

    }

/***********************************************/


/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/


/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/



}