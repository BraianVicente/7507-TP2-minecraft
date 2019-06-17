package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class PicoDeMaderaTest {

    FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();


    @Test
    public void test01CreamonsInstanciaDePicoDeMadera () {

        Pico unPicoDeMadera = fabricaDeHerramientas.construirPicoDeMadera();
        Assert.assertNotNull(unPicoDeMadera);

    }

    @Test
    public void test02CreamosPicoDeMaderaConDurabilidadPredeterminada () {

        Pico unPicoDeMadera = fabricaDeHerramientas.construirPicoDeMadera();
        Assert.assertEquals(100,unPicoDeMadera.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosPicoDeMaderaConFuerzaPredeterminada () {

        Pico unPicoDeMadera = fabricaDeHerramientas.construirPicoDeMadera();
        Assert.assertEquals(2,unPicoDeMadera.obtenerFuerza());

    }

    @Test
    public void test04usarPicoDeMaderaContraPiedraYReduceDurabilidad(){

        Pico unPicoDeMadera = fabricaDeHerramientas.construirPicoDeMadera();
        Piedra material = new Piedra();

        int desgasteEsperado = 2 ;
        int durabilidadInicialPico = unPicoDeMadera.obtenerDurabilidad();

        unPicoDeMadera.desgastar(material);
        int durabilidadFinalPico = unPicoDeMadera.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado,(durabilidadInicialPico-durabilidadFinalPico));

    }

}
