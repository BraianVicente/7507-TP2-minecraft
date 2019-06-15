package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.PicoDePiedra;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Piedra;

public class ConstructorPicoDePiedra {

    private

        Mesada patronPicoDePiedra = inicializarPatron ();


/***********************************************/


    private static Mesada inicializarPatron ()
    {
        Mesada patron = new Mesada();
        Piedra p1 = new Piedra();
        Piedra p2 = new Piedra();
        Piedra p3 = new Piedra();
        Madera m4 = new Madera();
        Madera m5 = new Madera();
        patron.agregar(1,p1);
        patron.agregar(2,p2);
        patron.agregar(3,p3);
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

    PicoDePiedra construirPicoDePiedra (Mesada mesada)
    {
        PicoDePiedra picoDePiedra = null;

        if ( (mesada.cantidadDeMateriales() == patronPicoDePiedra.cantidadDeMateriales()) &&
                (patronPicoDePiedra.cantidadDeMateriales() == mesada.cantidadDeMateriales()) &&
                (patronPicoDePiedra.obtenerElementoEnPosicion(1).equals(mesada.obtenerElementoEnPosicion(1))) &&
                (patronPicoDePiedra.obtenerElementoEnPosicion(2).equals(mesada.obtenerElementoEnPosicion(2))) &&
                (patronPicoDePiedra.obtenerElementoEnPosicion(3).equals(mesada.obtenerElementoEnPosicion(3))) &&
                (patronPicoDePiedra.obtenerElementoEnPosicion(5).equals(mesada.obtenerElementoEnPosicion(5))) &&
                (patronPicoDePiedra.obtenerElementoEnPosicion(8).equals(mesada.obtenerElementoEnPosicion(8)))
        ) picoDePiedra = new PicoDePiedra();
        else
            throw new ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron();
        return picoDePiedra;
    }

/***********************************************/
}

