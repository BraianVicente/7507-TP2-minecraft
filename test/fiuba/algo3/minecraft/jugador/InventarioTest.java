package fiuba.algo3.minecraft.jugador;

import fiuba.algo3.minecraft.herramienta.HachaDeMadera;
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
        HachaDeMadera hacha = new HachaDeMadera();

        int durabilidad = hacha.obtenerDurabilidad();
        Herramienta herramientaDelInventario = inventario.obtenerHerramientaEnIndex(0);
        int durabilidadHerramienta = herramientaDelInventario.obtenerDurabilidad();

        Assert.assertEquals(durabilidad, durabilidadHerramienta);
    }
}
