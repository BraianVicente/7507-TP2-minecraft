package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.PicoDeMadera;
import fiuba.algo3.minecraft.modelo.material.Madera;

public class ConstructorPicoDeMadera {

    private

        Mesada patronPicoDeMadera = inicializarPatron ();


/***********************************************/


    private static Mesada inicializarPatron ()
    {
        Mesada patron = new Mesada();
        Madera m1 = new Madera();
        Madera m2 = new Madera();
        Madera m3 = new Madera();
        Madera m4 = new Madera();
        Madera m5 = new Madera();
        patron.agregar(1,m1);
        patron.agregar(2,m2);
        patron.agregar(3,m3);
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

    PicoDeMadera construirPicoDeMadera (Mesada mesada)
    {
        PicoDeMadera picoDeMadera = null;

        if ( (mesada.cantidadDeMateriales() == patronPicoDeMadera.cantidadDeMateriales()) &&
                (patronPicoDeMadera.cantidadDeMateriales() == mesada.cantidadDeMateriales()) &&
                (patronPicoDeMadera.obtenerElementoEnPosicion(1).equals(mesada.obtenerElementoEnPosicion(1))) &&
                (patronPicoDeMadera.obtenerElementoEnPosicion(2).equals(mesada.obtenerElementoEnPosicion(2))) &&
                (patronPicoDeMadera.obtenerElementoEnPosicion(3).equals(mesada.obtenerElementoEnPosicion(3))) &&
                (patronPicoDeMadera.obtenerElementoEnPosicion(5).equals(mesada.obtenerElementoEnPosicion(5))) &&
                (patronPicoDeMadera.obtenerElementoEnPosicion(8).equals(mesada.obtenerElementoEnPosicion(8)))
        ) picoDeMadera = new PicoDeMadera();
        else
            throw new ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron();
        return picoDeMadera;
    }

/***********************************************/
}
