package fiuba.algo3.minecraft.modelo.jugador;

import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FabricaHerramientasTest {

/***********************************************/

    @Test
    public void tet01CreamosInstanciaDeFabricaDeHerramientas () {

        FabricaHerramientas fabricaHerramientas = new FabricaHerramientas();
        Assert.assertNotNull(fabricaHerramientas);
    }

/***********************************************/

    @Test
    public void test02CreamosYçagregamosUnMaterialAlaFabricaDeHerramientas () {

        FabricaHerramientas fabricaHerramientas = new FabricaHerramientas();
        Madera madera = new Madera();
        fabricaHerramientas.agregar (1,madera);
        Assert.assertEquals(1,fabricaHerramientas.cantidadElementos ());
    }

/***********************************************/

    @Test
    public void test03Agregamos3Maderas3Piedras3MetalesAlaFabricaDeHerramientas () {

        FabricaHerramientas fabricaHerramientas = new FabricaHerramientas();
        Madera m1 = new Madera();
        Madera m2 = new Madera();
        Madera m3 = new Madera();
        Piedra p1 = new Piedra();
        Piedra p2 = new Piedra();
        Piedra p3 = new Piedra();
        Metal met1 = new Metal();
        Metal met2 = new Metal();
        Metal met3 = new Metal();
        fabricaHerramientas.agregar(1,m1);
        fabricaHerramientas.agregar(2,m2);
        fabricaHerramientas.agregar(3,m3);
        fabricaHerramientas.agregar(4,p1);
        fabricaHerramientas.agregar(5,p2);
        fabricaHerramientas.agregar(6,p3);
        fabricaHerramientas.agregar(7,met1);
        fabricaHerramientas.agregar(8,met2);
        fabricaHerramientas.agregar(9,met3);
        Assert.assertEquals(9,fabricaHerramientas.cantidadElementos());

    }

/***********************************************/

    @Test
    public void test04AgregamosUnMaterialEnCasilleroPeroLuegoLoEliminamosPorLoQueLaFabricaEstaVacia () {

        FabricaHerramientas fabricaHerramientas = new FabricaHerramientas();
        Madera madera = new Madera();
        fabricaHerramientas.agregar(1,madera);
        fabricaHerramientas.remover (1,madera);
        Assert.assertEquals(0,fabricaHerramientas.cantidadElementos());
    }

/***********************************************/

/***********************************************/

/***********************************************/


}