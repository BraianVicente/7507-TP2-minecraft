package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.*;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Material;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

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
        Material material = constructor.mesaDeTrabajo[1][1];

        Assert.assertEquals(madera, material);
    }

    @Test
    public void test03ObtengoMaterialEnPosicionDeLaMesaDeTrabajo(){
        Constructor constructor = new Constructor();
        Madera madera = new Madera();

        constructor.colocarMaterialEnMesaDeTrabajo(madera, 1, 1);
        Material material = constructor.obtenerMaterialEnPosicionDeLaMesaDeTrabajo(1,
                1, constructor.mesaDeTrabajo);

        Assert.assertEquals(madera, material);
    }

    @Test
    public void test04ColocamosMaterialesParaConstruiPicoDeMaderaYCoincidenConDistribucionPicoDeMadera(){
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

        Material [][] mesaDeTrabajo = constructor.mesaDeTrabajo;
        Material [][] distribucionPicoDeMadera = constructor.DistribucionPicoDeMadera();

        boolean igualdad = Arrays.deepEquals(mesaDeTrabajo, distribucionPicoDeMadera);

        Assert.assertEquals(true, igualdad);
    }

    @Test
    public void test05ConstruimosPicoDeMadera() {
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

        Material[][] mesaDeTrabajo = constructor.mesaDeTrabajo;

        PicoDeMadera pico1 = new PicoDeMadera();
        Herramienta picoDeMadera = constructor.construirPicoDeMadera(mesaDeTrabajo);

        Assert.assertEquals(pico1, picoDeMadera);

    }

}
