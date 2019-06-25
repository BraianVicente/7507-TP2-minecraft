package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.material.*;
import org.junit.Assert;
import org.junit.Test;

public class PicoFinoTest {

    FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();


    @Test
    public void test01CreamonsInstanciaDePicoFino () {

        Herramienta unPicoFino = fabricaDeHerramientas.construirPicoFino();
        Assert.assertNotNull(unPicoFino);

    }

    @Test
    public void test02CreamosPicoFinoConDurabilidadPredeterminada () {

        Herramienta unPicoFino = fabricaDeHerramientas.construirPicoFino();
        Assert.assertEquals(1000,unPicoFino.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosPicoFinoConFuerzaPredeterminada () {

        Herramienta unPicoFino = fabricaDeHerramientas.construirPicoFino();
        Assert.assertEquals(20,unPicoFino.obtenerFuerza());

    }

    @Test
    public void usarPicoConMaterialesDiamanteYReduceDurabilidad(){

        Herramienta unPicoFino = fabricaDeHerramientas.construirPicoFino();
        Material material = new Diamante();

        int desgasteEsperado = 100 ;
        int durabilidadInicialPico = unPicoFino.obtenerDurabilidad();

        unPicoFino.desgastar(material);
        int durabilidadFinalPico = unPicoFino.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado,(durabilidadInicialPico-durabilidadFinalPico));

    }

}
