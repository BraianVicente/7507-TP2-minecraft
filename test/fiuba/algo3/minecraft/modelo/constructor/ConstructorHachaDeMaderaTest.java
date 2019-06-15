package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.HachaDeMadera;
import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;
import fiuba.algo3.minecraft.modelo.material.Madera;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorHachaDeMaderaTest {

/***********************************************/

    @Test
    public void test01CreamosInstanciaDeConstructorHachaDeMadera () {

        ConstructorHachaDeMadera constructorHachaDeMadera = new ConstructorHachaDeMadera();
        Assert.assertNotNull(constructorHachaDeMadera);

    }

/***********************************************/

    @Test
    public void test02CreamosHachaDeMadera () {

        HachaDeMadera hachaDeMadera;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Madera m1 = new Madera();
        Madera m2 = new Madera();
        Madera m3 = new Madera();
        Madera m4 = new Madera();
        Madera m5 = new Madera();
        mesada.agregar(1,m1);
        mesada.agregar(2,m2);
        mesada.agregar(4,m3);
        mesada.agregar(5,m4);
        mesada.agregar(8,m5);
        hachaDeMadera = constructor.construirHachaDeMadera(mesada);
        Assert.assertNotNull(hachaDeMadera);

    }

/***********************************************/

    @Test
    public void test03LePasamosUnTableroConMasMaterialesEntoncesNoConstruyeHachaDeMadera () {

        HachaDeMadera hachaDeMadera;
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
        mesada.agregar(4,m3);
        mesada.agregar(5,m4);
        mesada.agregar(8,m5);
        mesada.agregar(9,m6);
        try {
            hachaDeMadera = constructor.construirHachaDeMadera(mesada);
        }
        catch (ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron e) {
            System.out.println("Error no se puede construir Hacha de madera, no concuerda con el patron");
        }

    }

/***********************************************/

    @Test
    public void test04LePasamosUnTableroConMenosMaterialesEntoncesNoConstruyeHachaDeMadera () {


        HachaDeMadera hachaDeMadera;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Madera m1 = new Madera();
        Madera m2 = new Madera();
        Madera m3 = new Madera();
        mesada.agregar(1,m1);
        mesada.agregar(2,m2);
        mesada.agregar(4,m3);

        try {
            hachaDeMadera = constructor.construirHachaDeMadera(mesada);
        }
        catch (ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron e) {
            System.out.println("Error no se puede construir Hacha de madera, no concuerda con el patron");
        }
    }

/***********************************************/



}