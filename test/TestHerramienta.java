import fiuba.algo3.Herramientas.HachaDeMadera;
import fiuba.algo3.Herramientas.PicoDeMadera;
import fiuba.algo3.Herramientas.HachaDeMetal;
import fiuba.algo3.Herramientas.PicoDeMetal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHerramienta {

    @Test
    public void CreoHachaDeMaderaConDurabilidadYFuerza(){
        HachaDeMadera hacha = new HachaDeMadera();

        int durabilidad = hacha.obtenerDurabilidad();
        int fuerza = hacha.obtenerFuerza();

        assertEquals(durabilidad, 100);
        assertEquals(fuerza, 2);
    }

    @Test
    public void CreoPicoDeMaderaConDurabilidadYFuerza(){
        PicoDeMadera pico = new PicoDeMadera();

        int durabilidad = pico.obtenerDurabilidad();
        int fuerza = pico.obtenerFuerza();

        assertEquals(durabilidad, 100);
        assertEquals(fuerza, 2);
    }

    @Test
    public void CreoHachaDeMetalConDurabilidadYFuerza(){
        HachaDeMetal hacha = new HachaDeMetal();

        int durabilidad = hacha.obtenerDurabilidad();
        int fuerza = hacha.obtenerFuerza();

        assertEquals(durabilidad, 400);
        assertEquals(fuerza, 10);

    }

    @Test
    public void CreoPicoDeMetalConDurabilidadYFuerza(){
        PicoDeMetal pico = new PicoDeMetal();

        int durabilidad = pico.obtenerDurabilidad();
        int fuerza = pico.obtenerFuerza();

        assertEquals(durabilidad, 400);
        assertEquals(fuerza, 12);

    }
}
