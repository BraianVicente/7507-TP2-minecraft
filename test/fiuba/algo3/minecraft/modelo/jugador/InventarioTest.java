package fiuba.algo3.minecraft.modelo.jugador;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.herramienta.*;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class InventarioTest {

    FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();


    @Test
    public void test01CreamosInstaciaDeInventario(){

        Inventario inventario = new Inventario();
        Assert.assertNotNull(inventario);
    }

    @Test
    public void test02InventarioSeCreaCon25Elementos() {

        Inventario inventario = new Inventario();
        Assert.assertEquals(0,inventario.cantidadElementos());

    }

    @Test
    public void test03AgregamosUnHerramientaAlInventario () {

        Inventario inventario = new Inventario();
        Hacha hachaDeMadera = fabricaDeHerramientas.construirHachaDeMadera();
        inventario.agregarAlInventario(hachaDeMadera);
        Assert.assertEquals(1,inventario.cantidadElementos());

    }

    @Test
    public void test04AgregamosSieteHerramientasDistintasAlInventario () {

        Inventario inventario = new Inventario();
        Hacha hachaDeMadera = fabricaDeHerramientas.construirHachaDeMadera();
        Hacha hachaDePiedra = fabricaDeHerramientas.construirHachaDePiedra();
        Hacha hachaDeMetal = fabricaDeHerramientas.construirHachaDeMetal();
        Pico picoDeMadera = fabricaDeHerramientas.construirPicoDeMadera();
        Pico picoDeMetal = fabricaDeHerramientas.construirPicoDeMetal();
        Pico picoDePiedra = fabricaDeHerramientas.construirPicoDePiedra();
        Pico picoFino = fabricaDeHerramientas.construirPicoFino();
        inventario.agregarAlInventario(hachaDeMadera);
        inventario.agregarAlInventario(hachaDePiedra);
        inventario.agregarAlInventario(hachaDeMetal);
        inventario.agregarAlInventario(picoDeMadera);
        inventario.agregarAlInventario(picoDePiedra);
        inventario.agregarAlInventario(picoDeMetal);
        inventario.agregarAlInventario(picoFino);
        Assert.assertEquals(7,inventario.cantidadElementos());
    }

    @Test
    public void test05AgregamosCuatroHerramientasDelMismoTipoAlInventario () {

        Inventario inventario = new Inventario();
        Hacha hm1 = fabricaDeHerramientas.construirHachaDeMetal();
        Hacha hm2 = fabricaDeHerramientas.construirHachaDeMetal();
        Hacha hm3 = fabricaDeHerramientas.construirHachaDeMetal();
        Hacha hm4 = fabricaDeHerramientas.construirHachaDeMetal();
        inventario.agregarAlInventario(hm1);
        inventario.agregarAlInventario(hm2);
        inventario.agregarAlInventario(hm3);
        inventario.agregarAlInventario(hm4);
        Assert.assertEquals(4,inventario.cantidadElementos());

    }

    @Test
    public void test06AgregamosUnMaterialAlInventario () {

        Inventario inventario = new Inventario();
        Madera madera = new Madera();
        inventario.agregarAlInventario(madera);
        Assert.assertEquals(1,inventario.cantidadElementos());

    }

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

    @Test
    public void test08AgregamosCuatroMaterialesCuatroHerramientas () {

        Inventario inventario = new Inventario();
        Madera madera = new Madera();
        Pico picoDeMadera = fabricaDeHerramientas.construirPicoDeMadera();
        Piedra piedra = new Piedra();
        Pico picoDePiedra = fabricaDeHerramientas.construirPicoDePiedra();
        Metal  metal = new Metal();
        Pico picoDeMetal = fabricaDeHerramientas.construirPicoDeMetal();
        Diamante diamante = new Diamante();
        Pico picoFino = fabricaDeHerramientas.construirPicoFino();
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

    @Test
    public void test09AgregamosCuatroMaterialesBuscamosUno () {

        Inventario inventario = new Inventario();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal  metal = new Metal();
        Diamante diamante = new Diamante();
        inventario.agregarAlInventario(madera);
        inventario.agregarAlInventario(piedra);
        inventario.agregarAlInventario(metal);
        inventario.agregarAlInventario(diamante);
        Metal nuevoMetal = (Metal) inventario.obtenerElemento(metal);
        Assert.assertEquals(nuevoMetal,metal);

    }

    @Test
    public void test10AgregamosSieteHerramientasBuscamosUno () {

        Inventario inventario = new Inventario();
        Hacha hachaDeMadera = fabricaDeHerramientas.construirHachaDeMadera();
        Hacha hachaDePiedra = fabricaDeHerramientas.construirHachaDePiedra();
        Hacha hachaDeMetal = fabricaDeHerramientas.construirHachaDeMetal();
        Pico picoDeMadera = fabricaDeHerramientas.construirPicoDeMadera();
        Pico picoDeMetal = fabricaDeHerramientas.construirPicoDeMetal();
        Pico picoDePiedra = fabricaDeHerramientas.construirPicoDePiedra();
        Pico picoFino = fabricaDeHerramientas.construirPicoFino();
        inventario.agregarAlInventario(hachaDeMadera);
        inventario.agregarAlInventario(hachaDePiedra);
        inventario.agregarAlInventario(hachaDeMetal);
        inventario.agregarAlInventario(picoDeMadera);
        inventario.agregarAlInventario(picoDePiedra);
        inventario.agregarAlInventario(picoDeMetal);
        inventario.agregarAlInventario(picoFino);
        Herramienta herramientaABuscar = (Herramienta) inventario.obtenerElemento(picoFino);
        Assert.assertEquals(herramientaABuscar,picoFino);

    }

    @Test
    public void test11AgregoVariasHerramientasYMaterialesYPidoUnaHerramienta(){
        Inventario inventario = new Inventario();

        Hacha hachaDeMadera = fabricaDeHerramientas.construirHachaDeMadera();
        Hacha hachaDePiedra = fabricaDeHerramientas.construirHachaDePiedra();

        Madera madera = new Madera();
        Metal  metal = new Metal();

        inventario.agregarAlInventario(hachaDeMadera);
        inventario.agregarAlInventario(madera);
        inventario.agregarAlInventario(metal);
        inventario.agregarAlInventario(hachaDePiedra);

        Assert.assertEquals(inventario.obtenerProximaHerramienta(hachaDeMadera), hachaDePiedra);

    }

    @Test
    public void test12obtenerProximaHerramientaDevuelveLaMismaSiNoHayOtra(){
        Inventario inventario = new Inventario();

        Hacha hachaDeMadera = fabricaDeHerramientas.construirHachaDeMadera();

        Madera madera = new Madera();
        Metal  metal = new Metal();

        inventario.agregarAlInventario(hachaDeMadera);
        inventario.agregarAlInventario(madera);
        inventario.agregarAlInventario(metal);

        Assert.assertEquals(inventario.obtenerProximaHerramienta(hachaDeMadera), hachaDeMadera);

    }

}
