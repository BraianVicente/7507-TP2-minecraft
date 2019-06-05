package fiuba.algo3.minecraft.material;

import fiuba.algo3.minecraft.herramienta.HachaDeMadera;
import fiuba.algo3.minecraft.herramienta.HachaDeMetal;
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

/***********************************************/

/***********************************************/

}