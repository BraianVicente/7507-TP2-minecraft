package fiuba.algo3.minecraft.modelo.plano;


import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import org.junit.Assert;
import org.junit.Test;

public class PlanoPicoDeMetalTest {

/***********************************************/

    @Test
    public void test01CreamosInstanciaDePlanoPicoDeMetal () {

        PlanoPicoDeMetal planoPicoDeMetal = new PlanoPicoDeMetal();
        Assert.assertNotNull(planoPicoDeMetal);
    }

/***********************************************/

    @Test
    public void test02ComprobamosQueEnPosicionX0Y0TenemosMetal () {

        PlanoPicoDeMetal plano = new PlanoPicoDeMetal();
        Metal metal = new Metal();
        Posicion posicion = new Posicion(0,0);
        Assert.assertTrue(metal.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test03ComprobamosQueEnPosicionX1Y0TenemosMetal () {

        PlanoPicoDeMetal plano = new PlanoPicoDeMetal();
        Metal metal = new Metal();
        Posicion posicion = new Posicion(1,0);
        Assert.assertTrue(metal.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test04ComprobamosQueEnPosicionX2Y0TenemosMetal () {

        PlanoPicoDeMetal plano = new PlanoPicoDeMetal();
        Metal metal = new Metal();
        Posicion posicion = new Posicion(2,0);
        Assert.assertTrue(metal.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test05ComprobamosQueEnPosicionX1Y1TenemosMadera () {

        PlanoPicoDeMetal plano = new PlanoPicoDeMetal();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(1,1);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

    @Test
    public void test06ComprobamosQueEnPosicionX1Y2TenemosMadera () {

        PlanoPicoDeMetal plano = new PlanoPicoDeMetal();
        Madera madera = new Madera();
        Posicion posicion = new Posicion(1,2);
        Assert.assertTrue(madera.equals(plano.obtenerPlano().obtenerElementoEnPosicion(posicion)));
    }

/***********************************************/

}