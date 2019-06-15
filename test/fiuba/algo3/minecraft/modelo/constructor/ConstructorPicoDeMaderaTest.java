package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.PicoDeMadera;
import fiuba.algo3.minecraft.modelo.material.Madera;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorPicoDeMaderaTest {

/***********************************************/

    @Test
    public void test01CreamosInstanciaDeConstructorPicoDeMadera () {

        ConstructorPicoDeMadera constructorPicoDeMadera = new ConstructorPicoDeMadera();
        Assert.assertNotNull(constructorPicoDeMadera);
    }

/***********************************************/

    @Test
    public void test02CreamosPicoDeMadera () {

        PicoDeMadera picoDeMadera;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Madera m1 = new Madera();
        Madera m2 = new Madera();
        Madera m3 = new Madera();
        Madera m4 = new Madera();
        Madera m5 = new Madera();
        mesada.agregar(1,m1);
        mesada.agregar(2,m2);
        mesada.agregar(3,m3);
        mesada.agregar(5,m4);
        mesada.agregar(8,m5);
        picoDeMadera = constructor.construirPicoDeMadera(mesada);
        Assert.assertNotNull(picoDeMadera);
    }

/***********************************************/

    @Test
    public void test03LePasamosUnTableroConMasMaterialesEntoncesNoConstruyePicoDeMadera () {

        PicoDeMadera picoDeMadera;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Madera m1 = new Madera();
        Madera m2 = new Madera();
        Madera m3 = new Madera();
        Madera m4 = new Madera();
        Madera m5 = new Madera();
        Madera m6 = new Madera();
        mesada.agregar(1,m1);
        mesada.agregar(2,m2);
        mesada.agregar(3,m3);
        mesada.agregar(5,m4);
        mesada.agregar(8,m5);
        mesada.agregar(9,m6);

        try {
            picoDeMadera = constructor.construirPicoDeMadera(mesada);
        }
        catch (ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron e) {
            System.out.println("Error no se puede construir Pico de madera, no concuerda con el patron");
        }

    }

/***********************************************/

    @Test
    public void test04LePasamosUnTableroConMenosMaterialesEntoncesNoConstruyePicoDeMadera() {

        PicoDeMadera picoDeMadera;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Madera m1 = new Madera();
        Madera m2 = new Madera();
        Madera m3 = new Madera();
        Madera m4 = new Madera();
        mesada.agregar(1,m1);
        mesada.agregar(2,m2);
        mesada.agregar(3,m3);
        mesada.agregar(5,m4);

        try {
            picoDeMadera = constructor.construirPicoDeMadera(mesada);
        }
        catch (ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron e) {
            System.out.println("Error no se puede construir Pico de madera, no concuerda con el patron");
        }

    }

/***********************************************/

}