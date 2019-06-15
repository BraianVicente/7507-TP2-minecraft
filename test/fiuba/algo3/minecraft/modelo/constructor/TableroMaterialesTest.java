package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.HachaDeMadera;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class TableroMaterialesTest {

/***********************************************/

    @Test
    public void test01CreamosInstanciaDeTableroMateriales () {

        TableroMateriales tableroMateriales = new TableroMateriales();
        Assert.assertNotNull(tableroMateriales);

    }

/***********************************************/

    @Test
    public void test02TableroMaterialesSeCreaSinMateriales () {

        TableroMateriales tableroMateriales  = new TableroMateriales();
        Assert.assertEquals(0,tableroMateriales.cantidadDeMateriales());

    }

/***********************************************/

    @Test
    public void test03AgregamosUnMaterialAlTablero () {

        TableroMateriales tableroMateriales = new TableroMateriales();
        Madera madera = new Madera();
        tableroMateriales.agregar(1,madera);
        Assert.assertEquals(1,tableroMateriales.cantidadDeMateriales());

    }

/***********************************************/

    @Test
    public void test04AgregamosVariosMaterialesDistintosAlTablero () {

        TableroMateriales tableroMateriales = new TableroMateriales();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Diamante diamante = new Diamante();
        tableroMateriales.agregar(1,madera);
        tableroMateriales.agregar(2,piedra);
        tableroMateriales.agregar(3,metal);
        tableroMateriales.agregar(4,diamante);
        Assert.assertEquals(4,tableroMateriales.cantidadDeMateriales());

    }

/***********************************************/

    @Test
    public void test05SiAgregamosUnMaterialEnUnaPosicionOcupadaPreviamenteLAnzaExcepcion () {

        TableroMateriales tableroMateriales = new TableroMateriales();
        Madera madera = new Madera();
        Diamante diamante = new Diamante();
        tableroMateriales.agregar(1,madera);
        try {
            tableroMateriales.agregar(1,diamante);
        }
        catch (ErrorCasilleroOcupado e) {
            System.out.println("No se puede colocar material en casillero ocupado previamente");
        }

    }

/***********************************************/

    @Test
    public void test06AgregamosMaterialesEnPosicionesEstablecidasConstruimosHachaDeMadera () {

        HachaDeMadera hachaDeMadera;
        TableroMateriales tableroMateriales = new TableroMateriales();
        Madera m1 = new Madera();
        Madera m2 = new Madera();
        Madera m3 = new Madera();
        Madera m4 = new Madera();
        Madera m5 = new Madera();
        tableroMateriales.agregar(1,m1);
        tableroMateriales.agregar(2,m2);
        tableroMateriales.agregar(4,m3);
        tableroMateriales.agregar(5,m4);
        tableroMateriales.agregar(8,m5);
        hachaDeMadera = tableroMateriales.contruirHachaDeMadera();
        Assert.assertNotNull(hachaDeMadera);

    }

/***********************************************/

/***********************************************/

}