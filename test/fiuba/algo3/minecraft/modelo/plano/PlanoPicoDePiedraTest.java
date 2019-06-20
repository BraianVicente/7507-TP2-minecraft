package fiuba.algo3.minecraft.modelo.plano;

import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;


public class PlanoPicoDePiedraTest {

/***********************************************/

    @Test
    public void test01CreamosInstanciaDePlanoPicoDePiedra () {

        PlanoPicoDePiedra planoPicoDePiedra = new PlanoPicoDePiedra();
        Assert.assertNotNull(planoPicoDePiedra);

    }

/***********************************************/

    @Test
    public void test02ComprobamosQueEnPosicionX0Y0TenemosPiedra () {

        PlanoPicoDePiedra plano = new PlanoPicoDePiedra();
        Piedra piedra = new Piedra();
        Posicion posicion = new Posicion(0,0);
        Assert.assertTrue(piedra.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test03ComprobamosQueEnPosicionX1Y0TenemosPiedra () {

        PlanoPicoDePiedra plano = new PlanoPicoDePiedra();
        Piedra piedra = new Piedra();
        Posicion posicion = new Posicion(1,0);
        Assert.assertTrue(piedra.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test04ComprobamosQueEnPosicionX2Y0TenemosPiedra () {

        PlanoPicoDePiedra plano = new PlanoPicoDePiedra();
        Piedra piedra = new Piedra();
        Posicion posicion = new Posicion(2,0);
        Assert.assertTrue(piedra.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test05ComprobamosQueEnPosicionX2Y0TenemosMadera () {

        PlanoPicoDePiedra plano = new PlanoPicoDePiedra();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(1,1);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test06ComprobamosQueEnPosicionX1Y2TenemosMadera () {

        PlanoPicoDePiedra plano = new PlanoPicoDePiedra();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(1,2);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

}