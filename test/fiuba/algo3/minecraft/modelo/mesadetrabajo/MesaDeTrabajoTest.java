package fiuba.algo3.minecraft.modelo.mesadetrabajo;

import fiuba.algo3.minecraft.modelo.jugador.Elemento;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.mesadetrabajo.MesaDeTrabajo;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import fiuba.algo3.minecraft.modelo.plano.*;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import fiuba.algo3.minecraft.modelo.posicionable.Vacio;
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

        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(0,0), new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,0), new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(0,1), new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,1), new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,2), new Madera());

        Assert.assertEquals(100, mesaDeTrabajo.construir().obtenerDurabilidad());

    }

    @Test
    public void test03InsertamosMaterialesEnMesaDeTrabajoYConstruimosHachaDePiedra(){
        MesaDeTrabajo mesaDeTrabajo = new MesaDeTrabajo();

        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(0,0), new Piedra());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,0), new Piedra());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(0,1), new Piedra());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,1), new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,2), new Madera());

        Assert.assertEquals(200, mesaDeTrabajo.construir().obtenerDurabilidad());

    }

    @Test
    public void test04InsertamosMaterialesEnMesaDeTrabajoYConstruimosHachaDeMetal(){
        MesaDeTrabajo mesaDeTrabajo = new MesaDeTrabajo();

        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(0,0), new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,0), new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(0,1), new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,1), new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,2), new Madera());

        Assert.assertEquals(400, mesaDeTrabajo.construir().obtenerDurabilidad());

    }

    @Test
    public void test05InsertamosMaterialesEnMesaDeTrabajoYConstruimosPicoDeMadera(){
        MesaDeTrabajo mesaDeTrabajo = new MesaDeTrabajo();

        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(0,0), new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,0), new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(2,0), new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,1), new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,2), new Madera());

        Assert.assertEquals(100, mesaDeTrabajo.construir().obtenerDurabilidad());

    }

    @Test
    public void test06InsertamosMaterialesEnMesaDeTrabajoYConstruimosPicoDePiedra(){
        MesaDeTrabajo mesaDeTrabajo = new MesaDeTrabajo();

        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(0,0), new Piedra());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,0), new Piedra());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(2,0), new Piedra());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,1), new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,2), new Madera());

        Assert.assertEquals(200, mesaDeTrabajo.construir().obtenerDurabilidad());

    }

    @Test
    public void test07InsertamosMaterialesEnMesaDeTrabajoYConstruimosPicoDeMetal(){
        MesaDeTrabajo mesaDeTrabajo = new MesaDeTrabajo();

        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(0,0), new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,0), new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(2,0), new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,1), new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,2), new Madera());

        Assert.assertEquals(400, mesaDeTrabajo.construir().obtenerDurabilidad());

    }

    @Test
    public void test08InsertamosMaterialesEnMesaDeTrabajoYConstruimosPicoFino(){
        MesaDeTrabajo mesaDeTrabajo = new MesaDeTrabajo();

        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(0,0), new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,0), new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(2,0), new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(0,1), new Piedra());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,1), new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,2), new Madera());

        Assert.assertEquals(1000, mesaDeTrabajo.construir().obtenerDurabilidad());

    }

    @Test
    public void test09EliminamosMaterialEquivocadoEnMesaDeTrabajoYLuegoInsertamosMaterialCorrectoEnSuLugarYConstruimosPicoFino(){
        MesaDeTrabajo mesaDeTrabajo = new MesaDeTrabajo();

        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(0,0), new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,0), new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(2,0), new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(0,1), new Piedra());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,1), new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,2), new Madera());

        mesaDeTrabajo.eliminarMaterialEnMesaEnPosicion(new Posicion(0,0));
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(0,0), new Metal());

        Assert.assertEquals(1000, mesaDeTrabajo.construir().obtenerDurabilidad());

    }

    @Test
    public void test10LimpiamosMesaDeTrabajoYQuedaVacia(){
        MesaDeTrabajo mesaDeTrabajo = new MesaDeTrabajo();

        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(0,0), new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,0), new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(2,0), new Metal());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(0,1), new Piedra());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,1), new Madera());
        mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(new Posicion(1,2), new Madera());

        mesaDeTrabajo.limpiarMesaDeTrabajo();

        Posicionable vacio1 = mesaDeTrabajo.obtenerMaterialEnPosicion(new Posicion(0,0));
        Posicionable vacio2 = mesaDeTrabajo.obtenerMaterialEnPosicion(new Posicion(1,0));
        Posicionable vacio3 = mesaDeTrabajo.obtenerMaterialEnPosicion(new Posicion(2,0));
        Posicionable vacio4 = mesaDeTrabajo.obtenerMaterialEnPosicion(new Posicion(0,1));
        Posicionable vacio5 = mesaDeTrabajo.obtenerMaterialEnPosicion(new Posicion(1,1));
        Posicionable vacio6 = mesaDeTrabajo.obtenerMaterialEnPosicion(new Posicion(1,2));


        Assert.assertEquals(vacio1, new Vacio());
        Assert.assertEquals(vacio2, new Vacio());
        Assert.assertEquals(vacio3, new Vacio());
        Assert.assertEquals(vacio4, new Vacio());
        Assert.assertEquals(vacio5, new Vacio());
        Assert.assertEquals(vacio6, new Vacio());

    }

}
