package fiuba.algo3.minecraft.material;

import fiuba.algo3.minecraft.herramienta.HachaDeMadera;
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
    public void tes02desgastarMetalConHachaMadera() {

        Metal metal = new Metal();
        HachaDeMadera hachaDeMadera = new HachaDeMadera();
        metal.desgastar(hachaDeMadera);
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

/***********************************************/

/***********************************************/

}