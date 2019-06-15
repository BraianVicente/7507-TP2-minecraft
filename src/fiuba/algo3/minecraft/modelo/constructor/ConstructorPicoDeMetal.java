package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.PicoDeMadera;
import fiuba.algo3.minecraft.modelo.herramienta.PicoDeMetal;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;

public class ConstructorPicoDeMetal {


    private

        Mesada patronPicoDeMetal = inicializarPatron ();


/***********************************************/


    private static Mesada inicializarPatron ()
    {
        Mesada patron = new Mesada();
        Metal met1 = new Metal();
        Metal met2 = new Metal ();
        Metal met3 = new Metal();
        Madera m4 = new Madera();
        Madera m5 = new Madera();
        patron.agregar(1,met1);
        patron.agregar(2,met2);
        patron.agregar(3,met3);
        patron.agregar(5,m4);
        patron.agregar(8,m5);
        return patron;
    }


/***********************************************/

    /*
        Para construir debemos comprar ambos objetos.
        no podemos comparar 2 objetos con ==
        por lo que hay que hacer es sobrecargar el metodo EQUALS
     */

    PicoDeMetal construirPicoDeMetal (Mesada mesada)
    {
        PicoDeMetal picoDeMetal = null;

        if ( (mesada.cantidadDeMateriales() == patronPicoDeMetal.cantidadDeMateriales()) &&
                (patronPicoDeMetal.cantidadDeMateriales() == mesada.cantidadDeMateriales()) &&
                (patronPicoDeMetal.obtenerElementoEnPosicion(1).equals(mesada.obtenerElementoEnPosicion(1))) &&
                (patronPicoDeMetal.obtenerElementoEnPosicion(2).equals(mesada.obtenerElementoEnPosicion(2))) &&
                (patronPicoDeMetal.obtenerElementoEnPosicion(3).equals(mesada.obtenerElementoEnPosicion(3))) &&
                (patronPicoDeMetal.obtenerElementoEnPosicion(5).equals(mesada.obtenerElementoEnPosicion(5))) &&
                (patronPicoDeMetal.obtenerElementoEnPosicion(8).equals(mesada.obtenerElementoEnPosicion(8)))
        ) picoDeMetal = new PicoDeMetal ();
        else
            throw new ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron();
        return picoDeMetal;
    }

/***********************************************/

}
