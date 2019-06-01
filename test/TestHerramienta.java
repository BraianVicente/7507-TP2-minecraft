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

    }

    @Test
    public void CreoPicoDeMaderaConDurabilidadYFuerza(){
        PicoDeMadera pico = new PicoDeMadera();
    }

    @Test
    public void CreoHachaDeMetalConDurabilidadYFuerza(){
        HachaDeMetal hacha = new HachaDeMetal();
        
    }

    @Test
    public void CreoPicoDeMetalConDurabilidadYFuerza(){
        PicoDeMetal pico = new PicoDeMetal();

    }
}
