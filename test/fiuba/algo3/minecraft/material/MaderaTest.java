package fiuba.algo3.minecraft.material;

import fiuba.algo3.minecraft.herramienta.HachaDeMadera;
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