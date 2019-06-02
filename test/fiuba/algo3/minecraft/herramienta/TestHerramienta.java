package fiuba.algo3.minecraft.herramienta ;

import org.junit.Assert;
import org.junit.Test;

public class TestHerramienta {

    @Test
    public void CreoHachaDeMaderaConDurabilidadYFuerza(){
        HachaDeMadera hacha = new HachaDeMadera();

        int durabilidad = hacha.obtenerDurabilidad();
        int fuerza = hacha.obtenerFuerza();

        Assert.assertEquals(durabilidad, 100);
        Assert.assertEquals(fuerza, 2);
    }

    @Test
    public void CreoPicoDeMaderaConDurabilidadYFuerza(){
        PicoDeMadera pico = new PicoDeMadera();

        int durabilidad = pico.obtenerDurabilidad();
        int fuerza = pico.obtenerFuerza();

        Assert.assertEquals(durabilidad, 100);
        Assert.assertEquals(fuerza, 2);
    }

    @Test
    public void CreoHachaDeMetalConDurabilidadYFuerza(){
        HachaDeMetal hacha = new HachaDeMetal();

        int durabilidad = hacha.obtenerDurabilidad();
        int fuerza = hacha.obtenerFuerza();

        Assert.assertEquals(durabilidad, 400);
        Assert.assertEquals(fuerza, 10);

    }

    @Test
    public void CreoPicoDeMetalConDurabilidadYFuerza(){
        PicoDeMetal pico = new PicoDeMetal();

        int durabilidad = pico.obtenerDurabilidad();
        int fuerza = pico.obtenerFuerza();

        Assert.assertEquals(durabilidad, 400);
        Assert.assertEquals(fuerza, 12);

    }
}
