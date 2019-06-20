package fiuba.algo3.minecraft.modelo.plano;


import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Madera;
import org.junit.Assert;
import org.junit.Test;

public class PlanoPicoDeMaderaTest {

/***********************************************/

    @Test
    public void test01CreamosInstanciaDePlanoPicoDeMadera () {

        PlanoPicoDeMadera planoPicoDeMadera = new PlanoPicoDeMadera();
        Assert.assertNotNull(planoPicoDeMadera);
    }

/***********************************************/

    @Test
    public void test02ComprobamosQueEnPosicionX0Y0TenemosMadera () {

        PlanoPicoDeMadera plano = new PlanoPicoDeMadera();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(0,0);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test03ComprobamosQueEnPosicionX1Y0TenemosMadera () {

        PlanoPicoDeMadera plano = new PlanoPicoDeMadera();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(1,0);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test04ComprobamosQueEnPosicionX2Y0TenemosMadera () {

        PlanoPicoDeMadera plano = new PlanoPicoDeMadera();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(2,0);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test05ComprobamosQueEnPosicionX1Y1TenemosMadera () {

        PlanoPicoDeMadera plano = new PlanoPicoDeMadera();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(1,1);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test06ComprobamosQueEnPosicionX1Y2TenemosMadera () {

        PlanoPicoDeMadera plano = new PlanoPicoDeMadera();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(1,2);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

}