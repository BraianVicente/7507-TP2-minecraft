package fiuba.algo3.minecraft.jugador;

import org.junit.Assert;
import org.junit.Test;

public class InventarioTest {

    @Test
    public void test01CreamosInstaciaDeInventario(){
        Inventario inventario = new Inventario();

        Assert.assertNotNull(inventario);
    }
}
