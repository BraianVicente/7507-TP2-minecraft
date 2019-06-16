package fiuba.algo3.minecraft.modelo.jugador;

import fiuba.algo3.minecraft.modelo.desgaste.DesgasteEstandar;
import fiuba.algo3.minecraft.modelo.herramienta.Hacha;
import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Material;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import fiuba.algo3.minecraft.modelo.posicionable.Vacio;
import org.junit.Assert;
import org.junit.Test;

public class JugadorTest {

    @Test
    public void test01CreamosInstanciaDeJugador(){

        Jugador unJugador = new Jugador();

        Assert.assertNotNull(unJugador);

    }

    @Test
    public void test02CreamosInstanciaDeJugadorConNombre(){

        Jugador unJugador = new Jugador("Pablo");

        String nombre = unJugador.obtenerNombre();

        Assert.assertEquals("Pablo", nombre);

    }

    @Test
    public void test03CreamosInstanciaDeJugadorSinNombre(){

        Jugador unJugador = new Jugador();

        String nombre = unJugador.obtenerNombre();

        Assert.assertEquals("Steve", nombre);

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
        Jugador unJugador = new Jugador("Fernando");
        Material madera = new Madera();
        unJugador.insertarMaterialEnMesaDeTrabajo(0,0, madera);
        unJugador.eliminarMaterialEnMesaDeTrabajo(0, 0);
        Posicionable material = unJugador.obtenerMaterialEnPosicionDeLaMesaDeTrabajo(0, 0);

        Assert.assertEquals(new Vacio(), material);
    }


}
