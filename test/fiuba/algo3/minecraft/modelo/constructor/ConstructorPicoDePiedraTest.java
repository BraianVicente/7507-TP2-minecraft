package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.PicoDePiedra;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorPicoDePiedraTest {

/***********************************************/

    @Test
    public void test01CreamosInstanciaDeConstructorPicoDePiedra () {

        ConstructorPicoDePiedra constructorPicoDePiedra = new ConstructorPicoDePiedra();
        Assert.assertNotNull(constructorPicoDePiedra);
    }

/***********************************************/

    @Test
    public void test02CreamosPicoDePiedra () {

        PicoDePiedra picoDePiedra;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Piedra p1 = new Piedra();
        Piedra p2 = new Piedra();
        Piedra p3 = new Piedra();
        Madera m4 = new Madera();
        Madera m5 = new Madera();
        mesada.agregar(1,p1);
        mesada.agregar(2,p2);
        mesada.agregar(3,p3);
        mesada.agregar(5,m4);
        mesada.agregar(8,m5);
        picoDePiedra = constructor.construirPicoDePiedra(mesada);
        Assert.assertNotNull(picoDePiedra);
    }

/***********************************************/

    @Test
    public void test03LePasamosUnTableroConMasMaterialesEntoncesNoConstruyePicoDePiedra () {

        PicoDePiedra picoDePiedra;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Piedra p1 = new Piedra();
        Piedra p2 = new Piedra();
        Piedra p3 = new Piedra();
        Madera m4 = new Madera();
        Madera m5 = new Madera();
        Madera m6 = new Madera();
        mesada.agregar(1,p1);
        mesada.agregar(2,p2);
        mesada.agregar(3,p3);
        mesada.agregar(5,m4);
        mesada.agregar(8,m5);
        mesada.agregar(9,m6);

        try {
            picoDePiedra = constructor.construirPicoDePiedra(mesada);
        }
        catch (ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron e) {
            System.out.println("Error no se puede construir Pico de piedra, no concuerda con el patron");
        }

    }

/***********************************************/

    @Test
    public void test04LePasamosUnTableroConMenosMaterialesEntoncesNoConstruyePicoDePiedra() {

        PicoDePiedra picoDePiedra;
        ConstructorDeHerramienta constructor = new ConstructorDeHerramienta();
        Mesada mesada = new Mesada();
        Piedra p1 = new Piedra();
        Piedra p2 = new Piedra();
        Piedra p3 = new Piedra();
        Madera m4 = new Madera();
        mesada.agregar(1,p1);
        mesada.agregar(2,p2);
        mesada.agregar(3,p3);
        mesada.agregar(5,m4);

        try {
            picoDePiedra = constructor.construirPicoDePiedra(mesada);
        }
        catch (ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron e) {
            System.out.println("Error no se puede construir Pico de piedra, no concuerda con el patron");
        }

    }

/***********************************************/

/***********************************************/

}