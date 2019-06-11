package fiuba.algo3.minecraft.modelo.tablero;

import org.junit.Assert;
import org.junit.Test;

public class TableroTest {

    @Test
    public void testMapaSeInicializaConJugador(){
        Tablero tablero = new Tablero() ;

        Assert.assertTrue(tablero.tableroContieneJugador());
    }


}
