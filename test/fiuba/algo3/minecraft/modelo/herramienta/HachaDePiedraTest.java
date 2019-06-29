package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.material.*;
import org.junit.Assert;
import org.junit.Test;

public class HachaDePiedraTest {

    FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();


    @Test
    public void test01CremosInstanciaDeHachaDePiedra () {

        Herramienta unHachaDePiedra = fabricaDeHerramientas.construirHachaDePiedra();
        Assert.assertNotNull(unHachaDePiedra);

    }

    @Test
    public void test02CreamosHachaDePiedraConDurabilidadPredeterminada () {

        Herramienta unHachaDePiedra = fabricaDeHerramientas.construirHachaDePiedra();
        Assert.assertEquals(200,unHachaDePiedra.obtenerDurabilidad());

    }

    @Test
    public void test03CreamosHachaDePiedraConFuerzaPredeterminada () {

        Herramienta unHachaDePiedra = fabricaDeHerramientas.construirHachaDePiedra();
        Assert.assertEquals(5,unHachaDePiedra.obtenerFuerza());

    }

    @Test
    public void test04usarHachaDePiedracontraMaderaYSeReduceSuDurabilidad(){

        Herramienta unHachaDePiedra = fabricaDeHerramientas.construirHachaDePiedra();
        Material material = new Madera();

        int desgasteEsperado = 5;
        int durabilidadInicialHacha = unHachaDePiedra.obtenerDurabilidad();

        unHachaDePiedra.desgastar(material);
        int durabilidadFinalHacha = unHachaDePiedra.obtenerDurabilidad();

        Assert.assertEquals(desgasteEsperado,(durabilidadInicialHacha-durabilidadFinalHacha));


    }

    @Test
    public void test05HachaDePiedraNoEstaRotaInicialmente(){
        Herramienta unHachaDePiedra = fabricaDeHerramientas.construirHachaDePiedra();

        Assert.assertFalse(unHachaDePiedra.estaRota());

    }

    @Test
    public void test06HachaDePiedraSeRompeLuegoDeGolpearVariasVeces(){
        Herramienta unHachaDePiedra = fabricaDeHerramientas.construirHachaDePiedra();
        Diamante diamante = new Diamante();

        for (int i = 0; i <= 39; i++){
            unHachaDePiedra.desgastar(diamante);
        }

        Assert.assertTrue(unHachaDePiedra.estaRota());

    }

}
