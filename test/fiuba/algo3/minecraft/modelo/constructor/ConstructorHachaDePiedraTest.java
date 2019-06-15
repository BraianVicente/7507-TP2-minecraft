package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.HachaDePiedra;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;


public class ConstructorHachaDePiedraTest {

/***********************************************/

    @Test
    public void test01CreamosInstanciaDeConstructorHachaDePiedra () {

        ConstructorHachaDePiedra constructorHachaDePiedra = new ConstructorHachaDePiedra();
        Assert.assertNotNull(constructorHachaDePiedra);
    }

/***********************************************/

    @Test
    public void test02CreamosHachaDePiedra () {

        HachaDePiedra hachaDePiedra;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Piedra p1 = new Piedra();
        Piedra p2 = new Piedra();
        Piedra p3 = new Piedra();
        Madera m1 = new Madera();
        Madera m2 = new Madera();
        mesada.agregar(1,p1);
        mesada.agregar(2,p2);
        mesada.agregar(4,p3);
        mesada.agregar(5,m1);
        mesada.agregar(8,m2);
        hachaDePiedra = constructor.construirHachaDePiedra(mesada);
        Assert.assertNotNull(hachaDePiedra);
    }

/***********************************************/

    @Test
    public void test03LePasamosUnTableroConMasMaterialesEntoncesNoConstruyeHachaDePiedra () {

        HachaDePiedra hachaDePiedra;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Piedra p1 = new Piedra();
        Piedra p2 = new Piedra();
        Piedra p3 = new Piedra();
        Madera m1 = new Madera();
        Madera m2 = new Madera();
        Madera m3 = new Madera();
        mesada.agregar(1,p1);
        mesada.agregar(2,p2);
        mesada.agregar(4,p3);
        mesada.agregar(5,m1);
        mesada.agregar(8,m2);
        mesada.agregar(9,m3);

        try {
            hachaDePiedra = constructor.construirHachaDePiedra(mesada);
        }
        catch (ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron e) {
            System.out.println("Error no se puede construir Hacha de piedra, no concuerda con el patron");
        }

    }

/***********************************************/

    @Test
    public void test04LePasamosUnTableroConMenosMaterialesEntoncesNoConstruyeHachaDePiedra () {

        HachaDePiedra hachaDePiedra;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Piedra p1 = new Piedra();
        Piedra p2 = new Piedra();
        Piedra p3 = new Piedra();
        Madera m1 = new Madera();
        mesada.agregar(1,p1);
        mesada.agregar(2,p2);
        mesada.agregar(4,p3);
        mesada.agregar(5,m1);

        try {
            hachaDePiedra = constructor.construirHachaDePiedra(mesada);
        }
        catch (ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron e) {
            System.out.println("Error no se puede construir Hacha de piedra, no concuerda con el patron");
        }

    }

/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/

}