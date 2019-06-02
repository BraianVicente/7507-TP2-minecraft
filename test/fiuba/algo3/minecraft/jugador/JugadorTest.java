package fiuba.algo3.minecraft.jugador;

import org.junit.Assert;
import org.junit.Test;

public class JugadorTest {

    @Test
    public void test01CreamosInstanciaDeJugadorSinNombre(){

        Jugador unJugador = new Jugador();
        Assert.assertNotNull(unJugador);

    }
}
