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
    public void test02AgregarMaterialEnMesaDeTrabajo(){
        Constructor constructor = new Constructor();
        Madera madera = new Madera();

        constructor.colocarMaterialEnMesaDeTrabajo(madera, 1, 1);

        Assert.assertEquals(madera.obtenerAbreviatura(), constructor.obtenerMaterialEnPosicionDeLaMesaDeTrabajo
                (1,1));
    }

    @Test
    public void test03ConstruimosHachaDeMadera() {
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

        HachaDeMadera hacha1 = new HachaDeMadera();
        Herramienta hachaDeMadera = constructor.construirHachaDeMadera();

        Assert.assertEquals(hacha1.getClass(), hachaDeMadera.getClass());

    }

    @Test
    public void test04ConstruimosHachaDeMetal() {
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

        HachaDeMetal hacha1 = new HachaDeMetal();
        Herramienta hachaDeMetal = constructor.construirHachaDeMetal();

        Assert.assertEquals(hacha1.getClass(), hachaDeMetal.getClass());

    }

    @Test
    public void test05ConstruimosHachaDePiedra() {
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

        HachaDePiedra hacha1 = new HachaDePiedra();
        Herramienta hachaDePiedra = constructor.construirHachaDePiedra();

        Assert.assertEquals(hacha1.getClass(), hachaDePiedra.getClass());

    }

    @Test
    public void test06ConstruimosPicoDeMadera() {
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

        PicoDeMadera pico1 = new PicoDeMadera();
        Herramienta picoDeMadera = constructor.construirPicoDeMadera();

        Assert.assertEquals(pico1.getClass(), picoDeMadera.getClass());

    }

    @Test
    public void test07ConstruimosPicoDeMetal() {
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

        PicoDeMetal pico1 = new PicoDeMetal();
        Herramienta picoDeMetal = constructor.construirPicoDeMetal();

        Assert.assertEquals(pico1.getClass(), picoDeMetal.getClass());

    }

    @Test
    public void test08ConstruimosPicoDePiedra() {
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

        PicoDePiedra pico1 = new PicoDePiedra();
        Herramienta picoDePiedra = constructor.construirPicoDePiedra();

        Assert.assertEquals(pico1.getClass(), picoDePiedra.getClass());

    }

    @Test
    public void test09ConstruimosPicoFino() {
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

        PicoFino pico1 = new PicoFino();
        Herramienta picoFino = constructor.construirPicoFino();

        Assert.assertEquals(pico1.getClass(), picoFino.getClass());

    }

    @Test
    public void test10MesaDeTrabajoSeReestableceDespuesDeConstrirHerramienta(){
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

        Assert.assertTrue(constructor.mesaDeTrabajoVacia());

    }

}
