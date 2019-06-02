package fiuba.algo3.minecraft.jugador;

import fiuba.algo3.minecraft.herramienta.HachaDeMadera;
import org.junit.Assert;
import org.junit.Test;

public class JugadorTest {

    @Test
    public void test01CreamosInstanciaDeJugadorConHachaDeMadera(){

        Jugador unJugador = new Jugador();
        HachaDeMadera hacha = new HachaDeMadera();

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


}
