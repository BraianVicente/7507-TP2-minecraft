package fiuba.algo3.minecraft.herramienta;

import fiuba.algo3.minecraft.material.Diamante;
import fiuba.algo3.minecraft.material.Madera;
import fiuba.algo3.minecraft.material.Metal;
import fiuba.algo3.minecraft.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class PicoDeMaderaTest {

    @Test
    public void test01CreamonsInstanciaDePicoDeMadera () {

        PicoDeMadera unPicoDeMadera = new PicoDeMadera();
        Assert.assertNotNull(unPicoDeMadera);

    }

    @Test
    public void test02CreamosPicoDeMaderaConDurabilidadPredeterminada () {

        PicoDeMadera unPicoDeMadera = new PicoDeMadera();
        Assert.assertEquals(100,unPicoDeMadera.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosPicoDeMaderaConFuerzaPredeterminada () {

        PicoDeMadera unPicoDeMadera = new PicoDeMadera();
        Assert.assertEquals(2,unPicoDeMadera.obtenerFuerza());

    }

    @Test
    public void test04usarPicoDeMaderaContraPiedraYReduceDurabilidad(){

        PicoDeMadera pico = new PicoDeMadera();
        Piedra material = new Piedra();

        int desgasteEsperado = 2 ;
        int durabilidadInicialPico = pico.obtenerDurabilidad();

        pico.desgastar(material);
        int durabilidadFinalPico = pico.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado,(durabilidadInicialPico-durabilidadFinalPico));

    }

    @Test
    public void test05usarPicoDeMaderaContraElRestoDeMaterialesSinReducirDurabilidad(){

        PicoDeMadera pico = new PicoDeMadera();
        Madera madera = new Madera();
        Diamante diamante = new Diamante();
        Metal metal = new Metal();

        int durabilidadInicial = pico.obtenerDurabilidad();
        pico.desgastar(madera);
        pico.desgastar(diamante);
        pico.desgastar(metal);

        Assert.assertEquals(durabilidadInicial, pico.obtenerDurabilidad());
    }

}
