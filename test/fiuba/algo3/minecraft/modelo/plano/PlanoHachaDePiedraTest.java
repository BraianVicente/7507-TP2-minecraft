package fiuba.algo3.minecraft.modelo.plano;


import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class PlanoHachaDePiedraTest {

/***********************************************/

    @Test
    public void test01CreamosInstanciaDePlanoDeHacheDePiedra () {

        PlanoHachaDePiedra planoHachaDePiedra = new PlanoHachaDePiedra();
        Assert.assertNotNull(planoHachaDePiedra);
    }

/***********************************************/

    @Test
    public void test02ComprobamosQueEnPosicionX0Y0TenemosPiedra () {

        PlanoHachaDePiedra plano = new PlanoHachaDePiedra();
        Piedra piedra = new Piedra();
        Posicion posicion = new Posicion(0,0);
        Assert.assertTrue(piedra.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));

    }

/***********************************************/

    @Test
    public void test03ComprobamosQueEnPosicionX0Y1TenemosPiedra () {

        PlanoHachaDePiedra plano = new PlanoHachaDePiedra();
        Piedra piedra = new Piedra();
        Posicion posicion = new Posicion(0,1);
        Assert.assertTrue(piedra.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));

    }

/***********************************************/

    @Test
    public void test04ComprobamosQueEnPosicionX1Y0TenemosPiedra () {

        PlanoHachaDePiedra plano = new PlanoHachaDePiedra();
        Piedra piedra = new Piedra();
        Posicion posicion = new Posicion(1,0);
        Assert.assertTrue(piedra.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test05ComprobamosQueEnPosicionX1Y1TenemosMadera () {

        PlanoHachaDePiedra plano = new PlanoHachaDePiedra();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(1,1);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));

    }

/***********************************************/

    @Test
    public void test06ComprobamosQueEnPosicionX1Y2TenemosMadera () {

        PlanoHachaDePiedra plano = new PlanoHachaDePiedra();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(1,2);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));

    }

/***********************************************/

}