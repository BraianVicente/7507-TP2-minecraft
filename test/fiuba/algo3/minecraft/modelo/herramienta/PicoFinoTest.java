package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class PicoFinoTest {

    @Test
    public void test01CreamonsInstanciaDePicoFino () {

        PicoFino unPicoFino = new PicoFino();
        Assert.assertNotNull(unPicoFino);

    }

    @Test
    public void test02CreamosPicoFinoConDurabilidadPredeterminada () {

        PicoFino unPicoFino = new PicoFino();
        Assert.assertEquals(1000,unPicoFino.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosPicoFinoConFuerzaPredeterminada () {

        PicoFino unPicoFino = new PicoFino();
        Assert.assertEquals(20,unPicoFino.obtenerFuerza());

    }

    @Test
    public void usarPicoConMaterialesDiamanteYReduceDurabilidad(){

        PicoFino pico = new PicoFino();
        Diamante material = new Diamante();

        int desgasteEsperado = 100 ;
        int durabilidadInicialPico = pico.obtenerDurabilidad();

        pico.desgastar(material);
        int durabilidadFinalPico = pico.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado,(durabilidadInicialPico-durabilidadFinalPico));

    }

    @Test
    public void usarPicoFinoContraElRestoDeMaterialesSinReducirDurabilidad(){

        PicoFino pico = new PicoFino();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        int durabilidadInicial = pico.obtenerDurabilidad();
        pico.desgastar(madera);
        pico.desgastar(piedra);
        pico.desgastar(metal);

        Assert.assertEquals(durabilidadInicial, pico.obtenerDurabilidad());
    }

}
