package fiuba.algo3.minecraft.modelo.plano;


import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Madera;
import org.junit.Assert;
import org.junit.Test;

public class PlanoHachaDeMaderaTest {


/***********************************************/

    @Test
    public void test01CreamosInstanciaDePlanoDeHacheDeMadera () {

        PlanoHachaDeMadera planoHachaDeMadera = new PlanoHachaDeMadera();
        Assert.assertNotNull(planoHachaDeMadera);
    }

/***********************************************/

    @Test
    public void test02ComprobamosQueEnPosicionX0Y0TenemosMadera () {

        PlanoHachaDeMadera plano = new PlanoHachaDeMadera();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(0,0);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test03ComprobamosQueEnPosicionX0Y1TenemosMadera () {

        PlanoHachaDeMadera plano = new PlanoHachaDeMadera();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(0,1);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test04ComprobamosQueEnPosicionX1Y0TenemosMadera () {

        PlanoHachaDeMadera plano = new PlanoHachaDeMadera();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(1,0);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test05ComprobamosQueEnPosicionX1Y1TenemosMadera () {

        PlanoHachaDeMadera plano = new PlanoHachaDeMadera();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(1,1);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test06ComprobamosQueEnPosicionX2Y1TenemosMadera () {

        PlanoHachaDeMadera plano = new PlanoHachaDeMadera();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(1,2);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

}