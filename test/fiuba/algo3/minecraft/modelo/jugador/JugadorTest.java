package fiuba.algo3.minecraft.modelo.jugador;

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
    public void test04CreamosInstanciaDeJugadorSinNombreYLoCambiamos(){

        Jugador unJugador = new Jugador();
        unJugador.establecerNombre("Pedro");

        String nombre = unJugador.obtenerNombre();



        Assert.assertEquals("Pedro", nombre);

    }


}
