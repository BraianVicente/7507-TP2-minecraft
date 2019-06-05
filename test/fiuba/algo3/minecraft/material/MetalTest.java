package fiuba.algo3.minecraft.material;

import fiuba.algo3.minecraft.herramienta.HachaDeMadera;
import fiuba.algo3.minecraft.herramienta.HachaDeMetal;
import fiuba.algo3.minecraft.herramienta.HachaDePiedra;
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

/***********************************************/

/***********************************************/

/***********************************************/


/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/

}