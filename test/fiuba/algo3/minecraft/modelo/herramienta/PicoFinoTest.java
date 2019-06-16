package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class PicoFinoTest {

    FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();


    @Test
    public void test01CreamonsInstanciaDePicoFino () {

        Pico unPicoFino = fabricaDeHerramientas.construirPicoFino();
        Assert.assertNotNull(unPicoFino);

    }

    @Test
    public void test02CreamosPicoFinoConDurabilidadPredeterminada () {

        Pico unPicoFino = fabricaDeHerramientas.construirPicoFino();
        Assert.assertEquals(1000,unPicoFino.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosPicoFinoConFuerzaPredeterminada () {

        Pico unPicoFino = fabricaDeHerramientas.construirPicoFino();
        Assert.assertEquals(20,unPicoFino.obtenerFuerza());

    }

    @Test
    public void usarPicoConMaterialesDiamanteYReduceDurabilidad(){

        Pico unPicoFino = fabricaDeHerramientas.construirPicoFino();
        Diamante material = new Diamante();

        int desgasteEsperado = 100 ;
        int durabilidadInicialPico = unPicoFino.obtenerDurabilidad();

        unPicoFino.desgastar(material);
        int durabilidadFinalPico = unPicoFino.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado,(durabilidadInicialPico-durabilidadFinalPico));

    }

}
