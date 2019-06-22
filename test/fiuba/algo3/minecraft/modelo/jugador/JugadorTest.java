package fiuba.algo3.minecraft.modelo.jugador;

import fiuba.algo3.minecraft.modelo.desgaste.DesgasteEstandar;
import fiuba.algo3.minecraft.modelo.herramienta.Hacha;
import fiuba.algo3.minecraft.modelo.herramienta.HachaDeMaderaTest;
import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;
import fiuba.algo3.minecraft.modelo.herramienta.Pico;
import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Material;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.plano.PlanoHachaDeMadera;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import fiuba.algo3.minecraft.modelo.posicionable.Vacio;
import org.junit.Assert;
import org.junit.Test;

public class JugadorTest {

    @Test
    public void test01CreamosInstanciaDeJugador(){

        Jugador unJugador = new Jugador("Pepe");

        Assert.assertNotNull(unJugador);

    }

    @Test
    public void test02CreamosInstanciaDeJugadorConNombre(){

        Jugador unJugador = new Jugador("Pablo");

        String nombre = unJugador.obtenerNombre();

        Assert.assertEquals("Pablo", nombre);

    }

    @Test
    public void test04JugadorInsertaMaderaEnMesaDeTrabajo(){
        Jugador unJugador = new Jugador("Fernando");
        Material madera = new Madera();
        unJugador.insertarMaterialEnMesaDeTrabajo(0,0, madera);
        Posicionable material = unJugador.obtenerMaterialEnPosicionDeLaMesaDeTrabajo(0, 0);

        Assert.assertEquals(material, madera);
    }

    @Test
    public void test05JugadorInsertaMaderaEnMesaDeTrabajoYDespuesLaElimina(){
        Jugador unJugador = new Jugador("Player 1");
        Material madera = new Madera();
        unJugador.insertarMaterialEnMesaDeTrabajo(0,0, madera);
        unJugador.eliminarMaterialEnMesaDeTrabajo(0, 0);
        Posicionable material = unJugador.obtenerMaterialEnPosicionDeLaMesaDeTrabajo(0, 0);

        Assert.assertEquals(new Vacio(), material);
    }

    @Test
    public void test06JugadorInsertaMeterialEnSuInventario(){
        Jugador unJugador = new Jugador("Player 1");
        Material madera = new Madera();
        unJugador.agregarMaterialAlInventario(madera);
        Elemento elementoAgregado = unJugador.obtenerElementoDeInventario(madera);

        Assert.assertEquals(elementoAgregado, madera);
    }

    @Test
    public void test07JugadorContruyeHachaDeMaderaYSeAgregaAlInventarioDelJugador(){
        Jugador unJugador = new Jugador("Player 1");
        Material madera1 = new Madera();
        Material madera2 = new Madera();
        Material madera3 = new Madera();
        Material madera4 = new Madera();
        Material madera5 = new Madera();
        PlanoHachaDeMadera planoHachaDeMadera = new PlanoHachaDeMadera();
        DesgasteEstandar desgaste = new DesgasteEstandar(100, 2, 1);
        Hacha hachaDeMadera = new Hacha(desgaste);

        unJugador.insertarMaterialEnMesaDeTrabajo(0,0, madera1);
        unJugador.insertarMaterialEnMesaDeTrabajo(0,1, madera1);
        unJugador.insertarMaterialEnMesaDeTrabajo(1,0, madera1);
        unJugador.insertarMaterialEnMesaDeTrabajo(1,1, madera1);
        unJugador.insertarMaterialEnMesaDeTrabajo(1,2, madera1);

        unJugador.construirHerramienta(planoHachaDeMadera);

        Elemento herramienta = unJugador.obtenerElementoDeInventario(hachaDeMadera);

        Assert.assertEquals(herramienta, hachaDeMadera);

    }

    @Test
    public void test08JugadorGuardaMaderaCuandoSeDesgastaCompletamente(){
        Jugador unJugador = new Jugador("Player1");
        Madera madera = new Madera();
        DesgasteEstandar desgaste = new DesgasteEstandar(100, 2, 1);
        Hacha hachaDeMadera = new Hacha(desgaste);

        Assert.assertEquals(1, unJugador.cantidadDeElementosEnInventario());

        unJugador.golpearMaterial(madera, hachaDeMadera);
        unJugador.golpearMaterial(madera, hachaDeMadera);
        unJugador.golpearMaterial(madera, hachaDeMadera);
        unJugador.golpearMaterial(madera, hachaDeMadera);
        unJugador.golpearMaterial(madera, hachaDeMadera);

        Assert.assertEquals(2, unJugador.cantidadDeElementosEnInventario());


    }

    @Test
    public void test09JugadorGuardaMetalCuandoSeDesgastaCompletamente(){
        Jugador unJugador = new Jugador("Player1");
        Metal metal = new Metal();
        DesgasteEstandar desgaste = new DesgasteEstandar(400, 10,0.5F);
        Pico picoDeMetal = new Pico(desgaste);

        Assert.assertEquals(1, unJugador.cantidadDeElementosEnInventario());

        unJugador.golpearMaterial(metal, picoDeMetal);
        unJugador.golpearMaterial(metal, picoDeMetal);
        unJugador.golpearMaterial(metal, picoDeMetal);
        unJugador.golpearMaterial(metal, picoDeMetal);
        unJugador.golpearMaterial(metal, picoDeMetal);

        Assert.assertEquals(2, unJugador.cantidadDeElementosEnInventario());


    }


}
