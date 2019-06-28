package fiuba.algo3.minecraft.modelo.jugador;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.herramienta.Hacha;
import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Material;
import fiuba.algo3.minecraft.modelo.mesadetrabajo.MesaDeTrabajo;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import fiuba.algo3.minecraft.modelo.posicionable.Vacio;
import javafx.geometry.Pos;
import org.junit.Assert;
import org.junit.Test;

public class JugadorTest {

    FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();


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
        unJugador.insertarMaterialEnMesaDeTrabajo(new Posicion(0,0), madera);
        Posicionable material = unJugador.obtenerMaterialEnPosicionDeLaMesaDeTrabajo(new Posicion(0,0));

        Assert.assertEquals(material, madera);
    }

    @Test
    public void test05JugadorInsertaMaderaEnMesaDeTrabajoYDespuesLaElimina(){
        Jugador unJugador = new Jugador("Player 1");
        Material madera = new Madera();
        unJugador.insertarMaterialEnMesaDeTrabajo(new Posicion(0,0), madera);
        unJugador.eliminarMaterialEnMesaDeTrabajo(new Posicion(0,0));
        Posicionable material = unJugador.obtenerMaterialEnPosicionDeLaMesaDeTrabajo(new Posicion(0,0));

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
        FabricaDeHerramientas fabrica = new FabricaDeHerramientas();
        Material madera1 = new Madera();
        Hacha hachaDeMadera = fabrica.construirHachaDeMadera() ;

        unJugador.insertarMaterialEnMesaDeTrabajo(new Posicion(0,0), madera1);
        unJugador.insertarMaterialEnMesaDeTrabajo(new Posicion(0,1), madera1);
        unJugador.insertarMaterialEnMesaDeTrabajo(new Posicion(1,0), madera1);
        unJugador.insertarMaterialEnMesaDeTrabajo(new Posicion(1,1), madera1);
        unJugador.insertarMaterialEnMesaDeTrabajo(new Posicion(1,2), madera1);

        unJugador.construirHerramienta();

        Elemento herramienta = unJugador.obtenerElementoDeInventario(hachaDeMadera);

        Assert.assertEquals(herramienta, hachaDeMadera);

    }

    @Test
    public void test08JugadorGuardaMaderaCuandoSeDesgastaCompletamente(){
        Jugador unJugador = new Jugador("Player1");
        Madera madera = new Madera();
        Assert.assertEquals(1, unJugador.cantidadDeElementosEnInventario());

        unJugador.cambiarHerramientaActiva();

        unJugador.golpearMaterial(madera);
        unJugador.golpearMaterial(madera);
        unJugador.golpearMaterial(madera);
        unJugador.golpearMaterial(madera);
        unJugador.golpearMaterial(madera);

        Assert.assertEquals(1, unJugador.cantidadDeElementosEnInventario());


    }

    @Test
    public void test09MaderaSeAgregaAMesaDeTrabajoYSeQuitaDelInventarioDelJugador(){
        Jugador unJugador = new Jugador("Fernando");
        Material madera = new Madera();
        unJugador.agregarMaterialAlInventario(madera);

        Assert.assertEquals(unJugador.cantidadDeElementosEnInventario(), 2);
        /* Recordar que jugador arranca con un hacha de madera, e inventario arranca con 25 maderas
         por lo tanto la cantidad de elementos inicial en el inventario es 26 */

        unJugador.insertarMaterialEnMesaDeTrabajo(new Posicion(0,0), madera);
        int cantidadDeElementoEnInventario = unJugador.cantidadDeElementosEnInventario();

        Assert.assertEquals(1,cantidadDeElementoEnInventario);
    }

    @Test
    public void test10cambiarHerramientaActivaCambiaLaHerramientaCuandoHayOtraEnElInventario(){
        Jugador unJugador = new Jugador("Player1");
        unJugador.cambiarHerramientaActiva();

        Hacha hachaDeMetal = fabricaDeHerramientas.construirHachaDeMetal();

        unJugador.agregarMaterialAlInventario(hachaDeMetal);

        unJugador.cambiarHerramientaActiva();

        Assert.assertEquals(unJugador.obtenerHerramientaActiva(), hachaDeMetal);


    }

    @Test
    public void test11cambiarHerramientaActivaNoCambiaSiNoHayOtra(){
        Jugador unJugador = new Jugador("Player1");
        unJugador.cambiarHerramientaActiva();

        Herramienta herramientaActiva = unJugador.obtenerHerramientaActiva();

        unJugador.cambiarHerramientaActiva();

        Assert.assertEquals(unJugador.obtenerHerramientaActiva(), herramientaActiva);


    }

    @Test
    public void test12JugadorGolpeaMaterialYCuandoLaHerramientaSeRompeLaQuitaDeSuInventario(){
        Jugador unJugador = new Jugador("Player1");
        Material madera = new Madera();
        unJugador.cambiarHerramientaActiva();
        unJugador.golpearMaterial(madera);

        Assert.assertEquals(98, unJugador.obtenerHerramientaActiva().obtenerDurabilidad());

    }


    @Test
    public void test13SeEstableceUnaPosicionParaJugadorYSeVerifica(){
        Jugador unJugador = new Jugador("Player1");
        Posicion posicion = new Posicion(0,0);

        unJugador.establecerPosicion(posicion);

        Assert.assertEquals(posicion, unJugador.obtenerPosicionActual());
    }

    @Test
    public void test14JugadorComienzaConUnaHerramienta(){
        Jugador unJugador = new Jugador("Player1");
        Inventario inventario = unJugador.obtenerInventario();

        Assert.assertEquals(inventario.cantidadElementos(), 1);
    }

    @Test
    public void test15ObtengoMesaDeTrabajo(){
        Jugador unJugador = new Jugador("Player1");
        MesaDeTrabajo mesaDeTrabajo = unJugador.obtenerMesaDeTrabajo();

        Assert.assertNotNull(mesaDeTrabajo);
    }



}
