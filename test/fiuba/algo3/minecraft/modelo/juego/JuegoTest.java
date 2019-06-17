package fiuba.algo3.minecraft.modelo.juego;

import org.junit.Assert;
import org.junit.Test;

public class JuegoTest {

    @Test
    public void test01CreamosInstaciaDeJuego(){
        Juego juego = new Juego("Pepe");

        Assert.assertNotNull(juego);
    }
    
}
