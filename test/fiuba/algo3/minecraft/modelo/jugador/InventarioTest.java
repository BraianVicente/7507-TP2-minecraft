package fiuba.algo3.minecraft.modelo.jugador;

import fiuba.algo3.minecraft.modelo.herramienta.*;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class InventarioTest {

/***********************************************/

    @Test
    public void test01CreamosInstaciaDeInventario(){

        Inventario inventario = new Inventario();
        Assert.assertNotNull(inventario);
    }

/***********************************************/

    /*
        el inventario se crea SIN herramientas.. cuando se crea usuario y se instancian
        sus cosas, en su inventario se le agrega el hacha de madera, aca no
     */

    @Test
    public void test02InventarioSeCreaSinElementos  () {

        Inventario inventario = new Inventario();
        Assert.assertEquals(0,inventario.cantidadElementos());

    }

/***********************************************/

    @Test
    public void test03AgregamosUnHerramientaAlInventario () {

        Inventario inventario = new Inventario();
        HachaDeMadera hachaDeMadera = new HachaDeMadera();
        inventario.agregarAlInventario(hachaDeMadera);
        Assert.assertEquals(1,inventario.cantidadElementos());

    }

/***********************************************/

    @Test
    public void test04AgregamosSieteHerramientasDistintasAlInventario () {

        Inventario inventario = new Inventario();
        HachaDeMadera hachaDeMadera = new HachaDeMadera();
        HachaDePiedra hachaDePiedra = new HachaDePiedra();
        HachaDeMetal hachaDeMetal = new HachaDeMetal();
        PicoDeMadera picoDeMadera = new PicoDeMadera();
        PicoDePiedra picoDePiedra = new PicoDePiedra();
        PicoDeMetal picoDeMetal = new PicoDeMetal();
        PicoFino picoFino = new PicoFino();
        inventario.agregarAlInventario(hachaDeMadera);
        inventario.agregarAlInventario(hachaDePiedra);
        inventario.agregarAlInventario(hachaDeMetal);
        inventario.agregarAlInventario(picoDeMadera);
        inventario.agregarAlInventario(picoDePiedra);
        inventario.agregarAlInventario(picoDeMetal);
        inventario.agregarAlInventario(picoFino);
        Assert.assertEquals(7,inventario.cantidadElementos());
    }

/***********************************************/

    @Test
    public void test05AgregamosCuatroHerramientasDelMismoTipoAlInventario () {

        Inventario inventario = new Inventario();
        HachaDeMetal hm1 = new HachaDeMetal();
        HachaDeMetal hm2 = new HachaDeMetal();
        HachaDeMetal hm3 = new HachaDeMetal();
        HachaDeMetal hm4 = new HachaDeMetal();
        inventario.agregarAlInventario(hm1);
        inventario.agregarAlInventario(hm2);
        inventario.agregarAlInventario(hm3);
        inventario.agregarAlInventario(hm4);
        Assert.assertEquals(4,inventario.cantidadElementos());

    }

/***********************************************/

    @Test
    public void test06AgregamosUnMaterialAlInventario () {

        Inventario inventario = new Inventario();
        Madera madera = new Madera();
        inventario.agregarAlInventario(madera);
        Assert.assertEquals(1,inventario.cantidadElementos());

    }
/***********************************************/

    @Test
    public void test07AgregamosCuatroMaterialesDistintosAlInventario () {

        Inventario inventario = new Inventario();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal  metal = new Metal();
        Diamante diamante = new Diamante();
        inventario.agregarAlInventario(madera);
        inventario.agregarAlInventario(piedra);
        inventario.agregarAlInventario(metal);
        inventario.agregarAlInventario(diamante);
        Assert.assertEquals(4,inventario.cantidadElementos());

    }
/***********************************************/

    @Test
    public void test08AgregamosCuatroMaterialesCuatroHerramientas () {

        Inventario inventario = new Inventario();
        Madera madera = new Madera();
        PicoDeMadera picoDeMadera = new PicoDeMadera();
        Piedra piedra = new Piedra();
        PicoDePiedra picoDePiedra = new PicoDePiedra();
        Metal  metal = new Metal();
        PicoDeMetal picoDeMetal = new PicoDeMetal();
        Diamante diamante = new Diamante();
        PicoFino picoFino = new PicoFino();
        inventario.agregarAlInventario(madera);
        inventario.agregarAlInventario(picoDeMadera);
        inventario.agregarAlInventario(piedra);
        inventario.agregarAlInventario(picoDePiedra);
        inventario.agregarAlInventario(metal);
        inventario.agregarAlInventario(picoDeMetal);
        inventario.agregarAlInventario(diamante);
        inventario.agregarAlInventario(picoFino);
        Assert.assertEquals(8,inventario.cantidadElementos());

    }

/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/


}