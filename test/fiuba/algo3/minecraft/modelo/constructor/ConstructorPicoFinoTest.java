package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.PicoDePiedra;
import fiuba.algo3.minecraft.modelo.herramienta.PicoFino;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorPicoFinoTest {

/***********************************************/

    @Test
    public void test01CreamosInstanciaDeConstructorPicoFino () {

        ConstructorPicoFino constructorPicoFino = new ConstructorPicoFino();
        Assert.assertNotNull(constructorPicoFino);

    }

/***********************************************/

    @Test
    public void test02CreamosPicoFino () {

        PicoFino picoFino;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Metal met1 = new Metal();
        Metal met2 = new Metal();
        Metal met3 = new Metal();
        Piedra p1 = new Piedra();
        Madera m1 = new Madera();
        Madera m2 = new Madera();
        mesada.agregar(1,met1);
        mesada.agregar(2,met2);
        mesada.agregar(3,met3);
        mesada.agregar(4,p1);
        mesada.agregar(5,m1);
        mesada.agregar(8,m2);
        picoFino = constructor.construirPicoFino(mesada);
        Assert.assertNotNull(picoFino);
    }

/***********************************************/

    @Test
    public void test03LePasamosUnTableroConMasMaterialesEntoncesNoConstruyePicoFino () {

        PicoFino picoFino;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Metal met1 = new Metal();
        Metal met2 = new Metal();
        Metal met3 = new Metal();
        Piedra p1 = new Piedra();
        Madera m1 = new Madera();
        Madera m2 = new Madera();
        Madera m3 = new Madera();
        mesada.agregar(1,met1);
        mesada.agregar(2,met2);
        mesada.agregar(3,met3);
        mesada.agregar(4,p1);
        mesada.agregar(5,m1);
        mesada.agregar(8,m2);
        mesada.agregar(9,m3);

        try {
            picoFino = constructor.construirPicoFino(mesada);
        }
        catch (ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron e) {
            System.out.println("Error no se puede construir Pico fino, no concuerda con el patron");
        }

    }

/***********************************************/

    @Test
    public void test04LePasamosUnTableroConMenosMaterialesEntoncesNoConstruyePicoFino () {

        PicoFino picoFino;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Metal met1 = new Metal();
        Metal met2 = new Metal();
        Metal met3 = new Metal();
        Piedra p1 = new Piedra();
        Madera m1 = new Madera();
        mesada.agregar(1,met1);
        mesada.agregar(2,met2);
        mesada.agregar(3,met3);
        mesada.agregar(4,p1);
        mesada.agregar(5,m1);

        try {
            picoFino = constructor.construirPicoFino(mesada);
        }
        catch (ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron e) {
            System.out.println("Error no se puede construir Pico fino, no concuerda con el patron");
        }

    }

/***********************************************/

/***********************************************/

/***********************************************/


}