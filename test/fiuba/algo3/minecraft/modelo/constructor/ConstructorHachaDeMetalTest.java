package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.HachaDeMetal;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import org.junit.Assert;
import org.junit.Test;


public class ConstructorHachaDeMetalTest {

/***********************************************/

    @Test
    public void test01CreamosInstanciaDeConstructorHachaDeMetal () {

        ConstructorHachaDeMetal constructorHachaDeMetal = new ConstructorHachaDeMetal();
        Assert.assertNotNull(constructorHachaDeMetal);
    }

/***********************************************/

    @Test
    public void test02CreamosHachaDeMetal () {

        HachaDeMetal hachaDeMetal;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Metal met1 = new Metal();
        Metal met2 = new Metal();
        Metal met3 = new Metal();
        Madera m1 = new Madera();
        Madera m2 = new Madera();
        mesada.agregar(1,met1);
        mesada.agregar(2,met2);
        mesada.agregar(4,met3);
        mesada.agregar(5,m1);
        mesada.agregar(8,m2);
        hachaDeMetal = constructor.construirHachaDeMetal(mesada);
        Assert.assertNotNull(hachaDeMetal);
    }

/***********************************************/

    @Test
    public void test03LePasamosUnTableroConMasMaterialesEntoncesNoConstruyeHachaDeMetal () {

        HachaDeMetal hachaDeMetal;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Metal met1 = new Metal();
        Metal met2 = new Metal();
        Metal met3 = new Metal();
        Madera m1 = new Madera();
        Madera m2 = new Madera();
        Madera m3 = new Madera();
        mesada.agregar(1,met1);
        mesada.agregar(2,met2);
        mesada.agregar(4,met3);
        mesada.agregar(5,m1);
        mesada.agregar(8,m2);
        mesada.agregar(9,m3);

        try {
            hachaDeMetal = constructor.construirHachaDeMetal(mesada);
        }
        catch (ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron e) {
            System.out.println("Error no se puede construir Hacha de metal, no concuerda con el patron");
        }

    }

/***********************************************/

    @Test
    public void test04LePasamosUnTableroConMenosMaterialesEntoncesNoConstruyeHachaDePiedra () {

        HachaDeMetal hachaDeMetal;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Metal met1 = new Metal();
        Metal met2 = new Metal();
        Metal met3 = new Metal();
        Madera m1 = new Madera();
        mesada.agregar(1,met1);
        mesada.agregar(2,met2);
        mesada.agregar(4,met3);
        mesada.agregar(5,m1);

        try {
            hachaDeMetal = constructor.construirHachaDeMetal(mesada);
        }
        catch (ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron e) {
            System.out.println("Error no se puede construir Hacha de metal, no concuerda con el patron");
        }

    }

/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/


}