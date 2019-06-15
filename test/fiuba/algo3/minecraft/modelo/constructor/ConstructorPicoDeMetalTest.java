package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.PicoDeMetal;
import fiuba.algo3.minecraft.modelo.herramienta.PicoDePiedra;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorPicoDeMetalTest {

/***********************************************/

    @Test
    public void test01CreamosInstanciaDeConstructorPicoDeMetal () {

        ConstructorPicoDeMetal constructorPicoDeMetal = new ConstructorPicoDeMetal();
        Assert.assertNotNull(constructorPicoDeMetal);
    }

/***********************************************/

    @Test
    public void test02CreamosPicoDeMetal () {

        PicoDeMetal picoDeMetal;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Metal met1 = new Metal();
        Metal met2 = new Metal ();
        Metal met3 = new Metal();
        Madera m4 = new Madera();
        Madera m5 = new Madera();
        mesada.agregar(1,met1);
        mesada.agregar(2,met2);
        mesada.agregar(3,met3);
        mesada.agregar(5,m4);
        mesada.agregar(8,m5);
        picoDeMetal = constructor.construirPicoDeMetal (mesada);
        Assert.assertNotNull(picoDeMetal);
    }

/***********************************************/

    @Test
    public void test03LePasamosUnTableroConMasMaterialesEntoncesNoConstruyePicoDeMetal () {

        PicoDeMetal picoDeMetal;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Metal met1 = new Metal();
        Metal met2 = new Metal ();
        Metal met3 = new Metal();
        Madera m4 = new Madera();
        Madera m5 = new Madera();
        Madera m6 = new Madera();
        mesada.agregar(1,met1);
        mesada.agregar(2,met2);
        mesada.agregar(3,met3);
        mesada.agregar(5,m4);
        mesada.agregar(8,m5);
        mesada.agregar(9,m6);

        try {
            picoDeMetal = constructor.construirPicoDeMetal(mesada);
        }
        catch (ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron e) {
            System.out.println("Error no se puede construir Pico de metal, no concuerda con el patron");
        }

    }

/***********************************************/

    @Test
    public void test04LePasamosUnTableroConMenosMaterialesEntoncesNoConstruyePicoDeMetal () {

        PicoDeMetal picoDeMetal;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Metal met1 = new Metal();
        Metal met2 = new Metal ();
        Metal met3 = new Metal();
        Madera m4 = new Madera();
        mesada.agregar(1,met1);
        mesada.agregar(2,met2);
        mesada.agregar(3,met3);
        mesada.agregar(5,m4);

        try {
            picoDeMetal = constructor.construirPicoDeMetal( mesada);
        }
        catch (ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron e) {
            System.out.println("Error no se puede construir Pico de metal, no concuerda con el patron");
        }

    }

/***********************************************/

/***********************************************/

}