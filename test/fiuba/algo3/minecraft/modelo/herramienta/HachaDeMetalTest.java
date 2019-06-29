package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.material.*;
import org.junit.Assert;
import org.junit.Test;

public class HachaDeMetalTest {

    FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();


    @Test
    public void test01CreamosInstanciaDeHachaDeMetal () {

        Herramienta unHachaDeMetal = fabricaDeHerramientas.construirHachaDeMetal();
        Assert.assertNotNull(unHachaDeMetal);

    }

    @Test
    public void test02CreamosHachaDeMetalConDurabilidadPredeterminada () {

        Herramienta unHachaDeMetal = fabricaDeHerramientas.construirHachaDeMetal();
        Assert.assertEquals(400,unHachaDeMetal.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosHachaDeMetalConFuerzaPredeterminada () {

        Herramienta unHachaDeMetal = fabricaDeHerramientas.construirHachaDeMetal();
        Assert.assertEquals(10,unHachaDeMetal.obtenerFuerza());

    }

    @Test
    public void test04usarHachaDeMetalcontraMaderaYSeReduceSuDurabilidad(){

        Herramienta unHachaDeMetal = fabricaDeHerramientas.construirHachaDeMetal();
        Material material = new Madera();

        int desgasteEsperado = 5;
        int durabilidadInicialHacha = unHachaDeMetal.obtenerDurabilidad();

        unHachaDeMetal.desgastar(material);
        int durabilidadFinalHacha = unHachaDeMetal.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado,(durabilidadInicialHacha-durabilidadFinalHacha));

    }

    @Test
    public void test05HachaDeMetalaNoEstaRotaInicialmente(){
        Herramienta unHachaDeMetal = fabricaDeHerramientas.construirHachaDeMetal();

        Assert.assertFalse(unHachaDeMetal.estaRota());

    }

    @Test
    public void test06HachaDeMetalSeRompeLuegoDeGolpearVariasVeces(){
        Herramienta unHachaDeMetal = fabricaDeHerramientas.construirHachaDeMetal();
        Diamante diamante = new Diamante();

        for (int i = 0; i <= 79; i++){
            unHachaDeMetal.desgastar(diamante);
        }

        Assert.assertTrue(unHachaDeMetal.estaRota());

    }

}
