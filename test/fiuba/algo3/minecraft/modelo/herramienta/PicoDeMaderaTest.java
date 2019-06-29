package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.material.*;
import org.junit.Assert;
import org.junit.Test;

public class PicoDeMaderaTest {

    FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();


    @Test
    public void test01CreamonsInstanciaDePicoDeMadera () {

        Herramienta unPicoDeMadera = fabricaDeHerramientas.construirPicoDeMadera();
        Assert.assertNotNull(unPicoDeMadera);

    }

    @Test
    public void test02CreamosPicoDeMaderaConDurabilidadPredeterminada () {

        Herramienta unPicoDeMadera = fabricaDeHerramientas.construirPicoDeMadera();
        Assert.assertEquals(100,unPicoDeMadera.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosPicoDeMaderaConFuerzaPredeterminada () {

        Herramienta unPicoDeMadera = fabricaDeHerramientas.construirPicoDeMadera();
        Assert.assertEquals(2,unPicoDeMadera.obtenerFuerza());

    }

    @Test
    public void test04usarPicoDeMaderaContraPiedraYReduceDurabilidad(){

        Herramienta unPicoDeMadera = fabricaDeHerramientas.construirPicoDeMadera();
        Material material = new Piedra();

        int desgasteEsperado = 2 ;
        int durabilidadInicialPico = unPicoDeMadera.obtenerDurabilidad();

        unPicoDeMadera.desgastar(material);
        int durabilidadFinalPico = unPicoDeMadera.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado,(durabilidadInicialPico-durabilidadFinalPico));

    }

    @Test
    public void test05PicoDeMaderaNoEstaRotaInicialmente(){
        Herramienta unPicoDeMadera = fabricaDeHerramientas.construirPicoDeMadera();

        Assert.assertFalse(unPicoDeMadera.estaRota());

    }

    @Test
    public void test06PicoDeMaderaSeRompeLuegoDeGolpearVariasVeces(){
        Herramienta unPicoDeMadera = fabricaDeHerramientas.construirPicoDeMadera();
        Diamante diamante = new Diamante();

        for (int i = 0; i <= 49; i++){
            unPicoDeMadera.desgastar(diamante);
        }

        Assert.assertTrue(unPicoDeMadera.estaRota());

    }

}
