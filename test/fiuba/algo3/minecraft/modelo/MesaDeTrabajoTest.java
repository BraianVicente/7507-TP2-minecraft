package fiuba.algo3.minecraft.modelo;

import fiuba.algo3.minecraft.modelo.mesadetrabajo.MesaDeTrabajo;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class MesaDeTrabajoTest {

    @Test
    public void test01CreamosInstaciaDeMesaDeTrabajo(){
        MesaDeTrabajo mesaDeTrabajo = new MesaDeTrabajo();

        Assert.assertNotNull(mesaDeTrabajo);
    }

    @Test
    public void test02InsertamosMaterialesEnMesaDeTrabajoYConstruimosHachaDeMadera(){
        MesaDeTrabajo mesaDeTrabajo = new MesaDeTrabajo();

        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(0, 0, new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 0, new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(0, 1, new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 1, new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 2, new Madera());

        Assert.assertEquals(100, mesaDeTrabajo.construir().obtenerDurabilidad());

    }

    @Test
    public void test03InsertamosMaterialesEnMesaDeTrabajoYConstruimosHachaDePiedra(){
        MesaDeTrabajo mesaDeTrabajo = new MesaDeTrabajo();

        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(0, 0, new Piedra());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 0, new Piedra());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(0, 1, new Piedra());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 1, new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 2, new Madera());

        Assert.assertEquals(200, mesaDeTrabajo.construir().obtenerDurabilidad());

    }

    @Test
    public void test04InsertamosMaterialesEnMesaDeTrabajoYConstruimosHachaDeMetal(){
        MesaDeTrabajo mesaDeTrabajo = new MesaDeTrabajo();

        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(0, 0, new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 0, new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(0, 1, new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 1, new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 2, new Madera());

        Assert.assertEquals(400, mesaDeTrabajo.construir().obtenerDurabilidad());

    }

    @Test
    public void test05InsertamosMaterialesEnMesaDeTrabajoYConstruimosPicoDeMadera(){
        MesaDeTrabajo mesaDeTrabajo = new MesaDeTrabajo();

        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(0, 0, new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 0, new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(2, 0, new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 1, new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 2, new Madera());

        Assert.assertEquals(100, mesaDeTrabajo.construir().obtenerDurabilidad());

    }

    @Test
    public void test06InsertamosMaterialesEnMesaDeTrabajoYConstruimosPicoDePiedra(){
        MesaDeTrabajo mesaDeTrabajo = new MesaDeTrabajo();

        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(0, 0, new Piedra());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 0, new Piedra());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(2, 0, new Piedra());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 1, new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 2, new Madera());

        Assert.assertEquals(200, mesaDeTrabajo.construir().obtenerDurabilidad());

    }

    @Test
    public void test07InsertamosMaterialesEnMesaDeTrabajoYConstruimosPicoDeMetal(){
        MesaDeTrabajo mesaDeTrabajo = new MesaDeTrabajo();

        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(0, 0, new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 0, new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(2, 0, new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 1, new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 2, new Madera());

        Assert.assertEquals(400, mesaDeTrabajo.construir().obtenerDurabilidad());

    }

    @Test
    public void test08InsertamosMaterialesEnMesaDeTrabajoYConstruimosPicoFino(){
        MesaDeTrabajo mesaDeTrabajo = new MesaDeTrabajo();

        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(0, 0, new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 0, new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(2, 0, new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(0, 1, new Piedra());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 1, new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(1, 2, new Madera());

        Assert.assertEquals(1000, mesaDeTrabajo.construir().obtenerDurabilidad());

    }

}
