package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.material.*;
import org.junit.Assert;
import org.junit.Test;

public class PicoDePiedraTest {

    FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();


    @Test
    public void test01CreamonsInstanciaDePicoDeMaterial () {

        Herramienta unPicoDePiedra = fabricaDeHerramientas.construirPicoDePiedra();
        Assert.assertNotNull(unPicoDePiedra);

    }

    @Test
    public void test02CreamosPicoDePiedraConDurabilidadPredeterminada () {

        Herramienta unPicoDePiedra = fabricaDeHerramientas.construirPicoDePiedra();
        Assert.assertEquals(200,unPicoDePiedra.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosPicoDePiedraConFuerzaPredeterminada () {

        Herramienta unPicoDePiedra = fabricaDeHerramientas.construirPicoDePiedra();
        Assert.assertEquals(4,unPicoDePiedra.obtenerFuerza());

    }

    @Test
    public void test04usarPicoDePiedracontraMetalYSeReduceSuDurabilidad(){

        Herramienta unPicoDePiedra = fabricaDeHerramientas.construirPicoDePiedra();
        Material material = new Metal();

        int desgasteEsperado = (int) (4/1.5);
        int durabilidadInicialHerramienta = unPicoDePiedra.obtenerDurabilidad();

        unPicoDePiedra.desgastar(material);
        int durabilidadFinalHerramienta = unPicoDePiedra.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado, durabilidadInicialHerramienta - durabilidadFinalHerramienta);

    }

    @Test
    public void test05usarPicoDePiedracontraPiedraYSeReduceSuDurabilidad(){

        Herramienta unPicoDePiedra= fabricaDeHerramientas.construirPicoDePiedra();
        Material material = new Piedra();

        int desgasteEsperado = 2;
        int durabilidadInicialHerramienta = unPicoDePiedra.obtenerDurabilidad();

        unPicoDePiedra.desgastar(material);
        int durabilidadFinalHerramienta = unPicoDePiedra.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado, durabilidadInicialHerramienta - durabilidadFinalHerramienta);

    }

    @Test
    public void test05PicoDePiedraNoEstaRotaInicialmente(){
        Herramienta unPicoDePiedra = fabricaDeHerramientas.construirPicoDePiedra();

        Assert.assertFalse(unPicoDePiedra.estaRota());

    }

}
