package fiuba.algo3.minecraft.modelo.plano;


import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import org.junit.Assert;
import org.junit.Test;

public class PlanoHachaDeMetalTest {

/***********************************************/

    @Test
    public void test01CreamosInstanciaDePlanoDeHacheDeMetal () {

        PlanoHachaDeMetal planoHachaDeMetal = new PlanoHachaDeMetal();
        Assert.assertNotNull(planoHachaDeMetal);
    }

/***********************************************/

    @Test
    public void test02ComprobamosQueEnPosicionX0Y0TenemosMetal () {

        PlanoHachaDeMetal plano = new PlanoHachaDeMetal();
        Metal metal = new Metal();
        Posicion posicion = new Posicion(0,0);
        Assert.assertTrue(metal.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));

    }

/***********************************************/

    @Test
    public void test03ComprobamosQueEnPosicionX0Y1TenemosMetal () {

        PlanoHachaDeMetal plano = new PlanoHachaDeMetal();
        Metal metal = new Metal();
        Posicion posicion = new Posicion(0,1);
        Assert.assertTrue(metal.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));

    }

/***********************************************/

    @Test
    public void test04ComprobamosQueEnPosicionX1Y0TenemosMetal () {

        PlanoHachaDeMetal plano = new PlanoHachaDeMetal();
        Metal metal = new Metal();
        Posicion posicion = new Posicion(1,0);
        Assert.assertTrue(metal.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));

    }

/***********************************************/

    @Test
    public void test05ComprobamosQueEnPosicionX1Y1TenemosMadera () {

        PlanoHachaDeMetal plano = new PlanoHachaDeMetal();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(1,1);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));

    }

/***********************************************/

    @Test
    public void test06ComprobamosQueEnPosicionX1Y2TenemosMadera () {

        PlanoHachaDeMetal plano = new PlanoHachaDeMetal();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(1,2);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));

    }

/***********************************************/

}