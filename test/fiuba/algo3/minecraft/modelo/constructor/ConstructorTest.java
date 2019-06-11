package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.*;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class ConstructorTest {

    @Test
    public void test01CreamosInstanciaDeConstructor(){
        Constructor constructor = new Constructor();

        Assert.assertNotNull(constructor);
    }

    @Test
    public void test02CreamosInstanciaDeConstructorYLaMesaDeTrabajoSeInicializaVacia(){
        Constructor constructor = new Constructor();

        Assert.assertTrue(constructor.mesaDeTrabajoVacia());
    }

    @Test
    public void test03AgregarMaterialEnMesaDeTrabajo(){
        Constructor constructor = new Constructor();
        Madera madera = new Madera();

        constructor.colocarMaterialEnMesaDeTrabajo(madera, 1, 1);

        Assert.assertEquals(new Madera(), constructor.obtenerMaterialEnPosicionDeLaMesaDeTrabajo
                (1,1));
    }

    @Test
    public void test04ConstruimosHachaDeMadera() {
        Constructor constructor = new Constructor();
        Madera madera1 = new Madera();
        Madera madera2 = new Madera();
        Madera madera3 = new Madera();
        Madera madera4 = new Madera();
        Madera madera5 = new Madera();

        constructor.colocarMaterialEnMesaDeTrabajo(madera1, 0, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(madera2, 1, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(madera3, 0, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera4, 1, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera5, 1, 2);

        Herramienta hachaDeMadera = constructor.construirHachaDeMadera();

        Assert.assertEquals(new HachaDeMadera(), hachaDeMadera);

    }

    @Test
    public void test05ConstruimosHachaDeMetal() {
        Constructor constructor = new Constructor();
        Metal metal1 = new Metal();
        Metal metal2 = new Metal();
        Metal metal3 = new Metal();
        Madera madera1 = new Madera();
        Madera madera2 = new Madera();

        constructor.colocarMaterialEnMesaDeTrabajo(metal1, 0, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(metal2, 1, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(metal3, 0, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera1, 1, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera2, 1, 2);

        Herramienta hachaDeMetal = constructor.construirHachaDeMetal();

        Assert.assertEquals(new HachaDeMetal(), hachaDeMetal);

    }

    @Test
    public void test06ConstruimosHachaDePiedra() {
        Constructor constructor = new Constructor();
        Piedra piedra1 = new Piedra();
        Piedra piedra2 = new Piedra();
        Piedra piedra3 = new Piedra();
        Madera madera1 = new Madera();
        Madera madera2 = new Madera();

        constructor.colocarMaterialEnMesaDeTrabajo(piedra1, 0, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(piedra2, 1, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(piedra3, 0, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera1, 1, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera2, 1, 2);

        Herramienta hachaDePiedra = constructor.construirHachaDePiedra();

        Assert.assertEquals(new HachaDePiedra(), hachaDePiedra);

    }

    @Test
    public void test07ConstruimosPicoDeMadera() {
        Constructor constructor = new Constructor();
        Madera madera1 = new Madera();
        Madera madera2 = new Madera();
        Madera madera3 = new Madera();
        Madera madera4 = new Madera();
        Madera madera5 = new Madera();

        constructor.colocarMaterialEnMesaDeTrabajo(madera1, 0, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(madera2, 1, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(madera3, 2, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(madera4, 1, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera5, 1, 2);

        Herramienta picoDeMadera = constructor.construirPicoDeMadera();

        Assert.assertEquals(new PicoDeMadera(), picoDeMadera);

    }

    @Test
    public void test08ConstruimosPicoDeMetal() {
        Constructor constructor = new Constructor();
        Metal metal1 = new Metal();
        Metal metal2 = new Metal();
        Metal metal3 = new Metal();
        Madera madera1 = new Madera();
        Madera madera2 = new Madera();


        constructor.colocarMaterialEnMesaDeTrabajo(metal1, 0, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(metal2, 1, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(metal3, 2, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(madera1, 1, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera2, 1, 2);

        Herramienta picoDeMetal = constructor.construirPicoDeMetal();

        Assert.assertEquals(new PicoDeMetal(), picoDeMetal);

    }

    @Test
    public void test09ConstruimosPicoDePiedra() {
        Constructor constructor = new Constructor();
        Piedra piedra1 = new Piedra();
        Piedra piedra2 = new Piedra();
        Piedra piedra3 = new Piedra();
        Madera madera1 = new Madera();
        Madera madera2 = new Madera();


        constructor.colocarMaterialEnMesaDeTrabajo(piedra1, 0, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(piedra2, 1, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(piedra3, 2, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(madera1, 1, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera2, 1, 2);

        Herramienta picoDePiedra = constructor.construirPicoDePiedra();

        Assert.assertEquals(new PicoDePiedra(), picoDePiedra);

    }

    @Test
    public void test10ConstruimosPicoFino() {
        Constructor constructor = new Constructor();
        Metal metal1 = new Metal();
        Metal metal2 = new Metal();
        Metal metal3 = new Metal();
        Piedra piedra1 = new Piedra();
        Madera madera1 = new Madera();
        Madera madera2 = new Madera();


        constructor.colocarMaterialEnMesaDeTrabajo(metal1, 0, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(metal2, 1, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(metal3, 2, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(piedra1, 0, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera1, 1, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera2, 1, 2);

        Herramienta picoFino = constructor.construirPicoFino();

        Assert.assertEquals(new PicoFino(), picoFino);

    }

    @Test
    public void test11MesaDeTrabajoSeReestableceDespuesDeConstrirHerramienta(){
        Constructor constructor = new Constructor();
        Madera madera1 = new Madera();
        Madera madera2 = new Madera();
        Madera madera3 = new Madera();
        Madera madera4 = new Madera();
        Madera madera5 = new Madera();

        constructor.colocarMaterialEnMesaDeTrabajo(madera1, 0, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(madera2, 1, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(madera3, 0, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera4, 1, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera5, 1, 2);
        
        constructor.construirHachaDeMadera();

        Assert.assertTrue(constructor.mesaDeTrabajoVacia());

    }

    @Test(expected = RuntimeException.class)
    public void test12DiseniamosMalElHachaDeMaderaYEntoncesNoSePuedeConstruir() {
        Constructor constructor = new Constructor();
        Madera madera1 = new Madera();
        Madera madera2 = new Madera();
        Madera madera3 = new Madera();
        Madera madera4 = new Madera();
        Madera madera5 = new Madera();

        constructor.colocarMaterialEnMesaDeTrabajo(madera1, 0, 2);
        constructor.colocarMaterialEnMesaDeTrabajo(madera2, 1, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(madera3, 0, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera4, 1, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera5, 1, 2);

        HachaDeMadera hacha1 = new HachaDeMadera();
        Herramienta hachaDeMadera = constructor.construirHachaDeMadera();

    }

    @Test(expected = RuntimeException.class)
    public void test13DiseniamosMalUnHAchaDeMetalYEntoncesNoSePuedeConstruir() {
        Constructor constructor = new Constructor();
        Metal metal1 = new Metal();
        Metal metal2 = new Metal();
        Metal metal3 = new Metal();
        Madera madera1 = new Madera();
        Madera madera2 = new Madera();

        constructor.colocarMaterialEnMesaDeTrabajo(metal1, 0, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(metal2, 1, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(metal3, 0, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera1, 1, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera2, 1, 2);

        HachaDeMetal hacha1 = new HachaDeMetal();
        Herramienta hachaDeMetal = constructor.construirHachaDeMetal();

    }

    @Test(expected = RuntimeException.class)
    public void test14DiseniamosMalUnHachaDePiedraYEntoncesNoSePuedeConstruir() {
        Constructor constructor = new Constructor();
        Piedra piedra1 = new Piedra();
        Piedra piedra2 = new Piedra();
        Piedra piedra3 = new Piedra();
        Madera madera1 = new Madera();
        Madera madera2 = new Madera();

        constructor.colocarMaterialEnMesaDeTrabajo(piedra1, 0, 2);
        constructor.colocarMaterialEnMesaDeTrabajo(piedra2, 1, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(piedra3, 0, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera1, 1, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera2, 1, 2);

        HachaDePiedra hacha1 = new HachaDePiedra();
        Herramienta hachaDePiedra = constructor.construirHachaDePiedra();

        Assert.assertEquals(hacha1.getClass(), hachaDePiedra.getClass());

    }

    @Test (expected = RuntimeException.class)
    public void test15DiseniamosMalPicoDeMaderaYEntoncesNoSePuedeConstruir() {
        Constructor constructor = new Constructor();
        Madera madera1 = new Madera();
        Madera madera2 = new Madera();
        Madera madera3 = new Madera();
        Madera madera4 = new Madera();
        Madera madera5 = new Madera();

        constructor.colocarMaterialEnMesaDeTrabajo(madera1, 0, 2);
        constructor.colocarMaterialEnMesaDeTrabajo(madera2, 1, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(madera3, 2, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(madera4, 1, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera5, 1, 2);

        Herramienta picoDeMadera = constructor.construirPicoDeMadera();

    }


    @Test (expected = RuntimeException.class)
    public void test16DiseniamosMalPicoDeMetalYEntoncesNoSePuedeConstruir() {
        Constructor constructor = new Constructor();
        Metal metal1 = new Metal();
        Metal metal2 = new Metal();
        Metal metal3 = new Metal();
        Madera madera1 = new Madera();
        Madera madera2 = new Madera();


        constructor.colocarMaterialEnMesaDeTrabajo(metal1, 0, 2);
        constructor.colocarMaterialEnMesaDeTrabajo(metal2, 1, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(metal3, 2, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(madera1, 1, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera2, 1, 2);

        Herramienta picoDeMetal = constructor.construirPicoDeMetal();

    }

    @Test(expected = RuntimeException.class)
    public void test17DiseniamosMalPicoDePiedraYEntoncesNoSePuedeConstruir() {
        Constructor constructor = new Constructor();
        Piedra piedra1 = new Piedra();
        Piedra piedra2 = new Piedra();
        Piedra piedra3 = new Piedra();
        Madera madera1 = new Madera();
        Madera madera2 = new Madera();


        constructor.colocarMaterialEnMesaDeTrabajo(piedra1, 0, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(piedra2, 1, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(piedra3, 2, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(madera1, 1, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera2, 1, 2);

        Herramienta picoDePiedra = constructor.construirPicoDePiedra();

    }

    @Test(expected = RuntimeException.class)
    public void test18DisenamosMalPicoFinoYEntoncesNoSePuedeConstruir() {
        Constructor constructor = new Constructor();
        Metal metal1 = new Metal();
        Metal metal2 = new Metal();
        Metal metal3 = new Metal();
        Piedra piedra1 = new Piedra();
        Madera madera1 = new Madera();
        Madera madera2 = new Madera();


        constructor.colocarMaterialEnMesaDeTrabajo(metal1, 0, 2);
        constructor.colocarMaterialEnMesaDeTrabajo(metal2, 1, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(metal3, 2, 0);
        constructor.colocarMaterialEnMesaDeTrabajo(piedra1, 0, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera1, 1, 1);
        constructor.colocarMaterialEnMesaDeTrabajo(madera2, 1, 2);

        Herramienta picoFino = constructor.construirPicoFino();


    }

}
