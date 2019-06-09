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
    public void test02ConstruimosHachaDeMadera(){
        Constructor constructor = new Constructor();
        Madera madera1 = new Madera();
        Madera madera2 = new Madera();
        Madera madera3 = new Madera();
        Madera madera4 = new Madera();
        Madera madera5 = new Madera();

        HachaDeMadera hacha = constructor.construirHacha(madera1, madera2, madera3, madera4, madera5);

        Assert.assertNotNull(hacha);
    }

    @Test
    public void test03ConstruimosHachaDePiedra(){
        Constructor constructor = new Constructor();
        Piedra piedra1 = new Piedra();
        Piedra piedra2 = new Piedra();
        Piedra piedra3 = new Piedra();
        Piedra piedra4 = new Piedra();
        Piedra piedra5 = new Piedra();

        HachaDePiedra hacha = constructor.construirHacha(piedra1, piedra2, piedra3, piedra4, piedra5);

        Assert.assertNotNull(hacha);
    }

    @Test
    public void test04ConstruimosHachaDeMetal(){
        Constructor constructor = new Constructor();
        Metal metal1 = new Metal();
        Metal metal2 = new Metal();
        Metal metal3 = new Metal();
        Metal metal4 = new Metal();
        Metal metal5 = new Metal();

        HachaDeMetal hacha = constructor.construirHacha(metal1, metal2, metal3, metal4, metal5);

        Assert.assertNotNull(hacha);
    }

    @Test
    public void test05ConstruimosPicoDeMadera(){
        Constructor constructor = new Constructor();
        Madera madera1 = new Madera();
        Madera madera2 = new Madera();
        Madera madera3 = new Madera();
        Madera madera4 = new Madera();
        Madera madera5 = new Madera();

        PicoDeMadera pico = constructor.construirPico(madera1, madera2, madera3, madera4, madera5);

        Assert.assertNotNull(pico);
    }

    @Test
    public void test06ConstruimosPicoDePiedra(){
        Constructor constructor = new Constructor();
        Piedra piedra1 = new Piedra();
        Piedra piedra2 = new Piedra();
        Piedra piedra3 = new Piedra();
        Piedra piedra4 = new Piedra();
        Piedra piedra5 = new Piedra();

        PicoDePiedra pico = constructor.construirPico(piedra1, piedra2, piedra3, piedra4, piedra5);

        Assert.assertNotNull(pico);
    }

    @Test
    public void test07ConstruimosPicoDeMetal(){
        Constructor constructor = new Constructor();
        Metal metal1 = new Metal();
        Metal metal2 = new Metal();
        Metal metal3 = new Metal();
        Metal metal4 = new Metal();
        Metal metal5 = new Metal();

        PicoDeMetal pico = constructor.construirPico(metal1, metal2, metal3, metal4, metal5);

        Assert.assertNotNull(pico);
    }

    @Test
    public void test08ConstruimosPicoFino(){
        Constructor constructor = new Constructor();
        Metal metal1 = new Metal();
        Metal metal2 = new Metal();
        Metal metal3 = new Metal();
        Piedra piedra1 = new Piedra();
        Madera madera1 = new Madera();
        Madera madera2 = new Madera();

        PicoFino pico = constructor.construirPico(metal1, metal2, metal3, piedra1, madera1, madera2);

        Assert.assertNotNull(pico);
    }
}
