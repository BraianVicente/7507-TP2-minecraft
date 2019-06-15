package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.material.Madera;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MesadaTest {

/***********************************************/

    @Test
    public void test01CreamosInstanciaDeMesada () {

        Mesada mesada = new Mesada();
        Assert.assertNotNull(mesada);

    }

/***********************************************/

    @Test
    public void test02LaMesadaSeCreaSinMaterialesEnElla () {

        Mesada mesada = new Mesada();
        Assert.assertEquals(0,mesada.cantidadDeMateriales());

    }

/***********************************************/

    @Test
    public void test03AgregamosUnMaterialAlaMesada () {

        Mesada mesada = new Mesada();
        Madera madera = new Madera();
        mesada.agregar(1,madera);
        Assert.assertEquals(1,mesada.cantidadDeMateriales());
    }

/***********************************************/

    @Test
    public void test04AgregamosDosMaterialesIgualesEnDistintaPosicion () {

        Mesada mesada = new Mesada();
        Madera m1 = new Madera();
        Madera m2 = new Madera();
        mesada.agregar(1,m1);
        mesada.agregar(2,m2);
        Assert.assertEquals(2,mesada.cantidadDeMateriales());

    }

/***********************************************/

    @Test
    public void test05ObtenemosMAterialEnPosicion () {

        Mesada mesada = new Mesada();
        Madera m1 = new Madera();
        Madera m2 = new Madera();
        mesada.agregar(1,m1);
        mesada.agregar(2,m2);
        Assert.assertNotNull(mesada.obtenerElementoEnPosicion(1));
    }

/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/


}