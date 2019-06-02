package fiuba.algo3.minecraft.herramienta ;

import org.junit.Assert;
import fiuba.algo3.Herramientas.HachaDePiedra;
import fiuba.algo3.Herramientas.PicoDePiedra;
import org.junit.Test;

public class TestHerramienta {

    @Test
    public void creoHachaDeMaderaConDurabilidadYFuerza(){
        HachaDeMadera hacha = new HachaDeMadera();

        int durabilidad = hacha.obtenerDurabilidad();
        int fuerza = hacha.obtenerFuerza();

        Assert.assertEquals(durabilidad, 100);
        Assert.assertEquals(fuerza, 2);
    }

    @Test
    public void creoPicoDeMaderaConDurabilidadYFuerza(){
        PicoDeMadera pico = new PicoDeMadera();

        int durabilidad = pico.obtenerDurabilidad();
        int fuerza = pico.obtenerFuerza();

        Assert.assertEquals(durabilidad, 100);
        Assert.assertEquals(fuerza, 2);
    }

    @Test
    public void creoHachaDeMetalConDurabilidadYFuerza(){
        HachaDeMetal hacha = new HachaDeMetal();

        int durabilidad = hacha.obtenerDurabilidad();
        int fuerza = hacha.obtenerFuerza();

        Assert.assertEquals(durabilidad, 400);
        Assert.assertEquals(fuerza, 10);

    }

    @Test
    public void creoPicoDeMetalConDurabilidadYFuerza(){
        PicoDeMetal pico = new PicoDeMetal();

        int durabilidad = pico.obtenerDurabilidad();
        int fuerza = pico.obtenerFuerza();

        Assert.assertEquals(durabilidad, 400);
        Assert.assertEquals(fuerza, 12);

    }

    @Test
    public void CreoPicoDePiedraConDurabilidadYFuerza(){
        PicoDePiedra pico = new PicoDePiedra();

        int durabilidad = pico.obtenerDurabilidad();
        int fuerza = pico.obtenerFuerza();

        Assert.assertEquals(durabilidad, 200);
        Assert.assertEquals(fuerza, 4);

    }

    @Test
    public void CreoHachaDePiedraConDurabilidadYFuerza(){
        HachaDePiedra hacha = new HachaDePiedra();

        int durabilidad = hacha.obtenerDurabilidad();
        int fuerza = hacha.obtenerFuerza();

        Assert.assertEquals(durabilidad, 200);
        Assert.assertEquals(fuerza, 5);

    }

}
