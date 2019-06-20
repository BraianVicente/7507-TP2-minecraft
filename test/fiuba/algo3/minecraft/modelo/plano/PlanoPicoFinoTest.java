package fiuba.algo3.minecraft.modelo.plano;

import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;


public class PlanoPicoFinoTest {

/***********************************************/

    @Test
    public void test01CreamosInstanciaDePlanoPicoFino () {

        PlanoPicoFino planoPicoFino = new PlanoPicoFino();
        Assert.assertNotNull(planoPicoFino);
    }

/***********************************************/

    @Test
    public void test02ComprobamosQueEnPosicionX0Y0TenemosMetal () {

        PlanoPicoFino plano = new PlanoPicoFino();
        Metal metal = new Metal();
        Posicion posicion = new Posicion(0,0);
        Assert.assertTrue(metal.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test03ComprobamosQueEnPosicionX1Y0TenemosMetal () {

        PlanoPicoFino plano = new PlanoPicoFino();
        Metal metal = new Metal();
        Posicion posicion = new Posicion(1,0);
        Assert.assertTrue(metal.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test04ComprobamosQueEnPosicionX2Y0TenemosMetal () {

        PlanoPicoFino plano = new PlanoPicoFino();
        Metal metal = new Metal();
        Posicion posicion = new Posicion(2,0);
        Assert.assertTrue(metal.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test05ComprobamosQueEnPosicionX0Y1TenemosPiedra () {

        PlanoPicoFino plano = new PlanoPicoFino();
        Piedra piedra = new Piedra();
        Posicion posicion = new Posicion(0,1);
        Assert.assertTrue(piedra.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test06ComprobamosQueEnPosicionX1Y1TenemosMadera () {

        PlanoPicoFino plano = new PlanoPicoFino();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(1,1);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test07ComprobamosQueEnPosicionX1Y2TenemosMadera () {

        PlanoPicoFino plano = new PlanoPicoFino();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(1,2);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

}