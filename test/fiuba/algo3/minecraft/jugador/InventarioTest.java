package fiuba.algo3.minecraft.jugador;

import fiuba.algo3.minecraft.herramienta.HachaDeMadera;
import fiuba.algo3.minecraft.herramienta.HachaDeMetal;
import fiuba.algo3.minecraft.herramienta.Herramienta;
import org.junit.Assert;
import org.junit.Test;

public class InventarioTest {

    @Test
    public void test01CreamosInstaciaDeInventario(){
        Inventario inventario = new Inventario();

        Assert.assertNotNull(inventario);
    }

    @Test
    public void test02InventarioComienzaConHachaDeMadera(){
        Inventario inventario = new Inventario();

        Assert.assertFalse(inventario.herramientas.isEmpty());
    }

    @Test
    public void test03ObtenerHerramientaDelInventario(){
        Inventario inventario = new Inventario();
        HachaDeMetal hacha = new HachaDeMetal();

        inventario.herramientas.add(hacha);

        Herramienta herramientaAObtener = inventario.obtenerHerramienta(hacha);

        Assert.assertEquals(hacha, herramientaAObtener);

    }
}
