import fiuba.algo3.Herramientas.HachaDeMadera;
import fiuba.algo3.Herramientas.PicoDeMadera;
import fiuba.algo3.Herramientas.HachaDeMetal;
import fiuba.algo3.Herramientas.PicoDeMetal;
import junit.framework.Assert;
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
        HachaDePiedra pico = new HachaDePiedra();

        int durabilidad = pico.obtenerDurabilidad();
        int fuerza = pico.obtenerFuerza();

        Assert.assertEquals(durabilidad, 200);
        Assert.assertEquals(fuerza, 5);

    }

}
