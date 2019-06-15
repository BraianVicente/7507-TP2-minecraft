package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.PicoFino;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;

public class ConstructorPicoFino {


    private

        Mesada patronPicoFino = inicializarPatron ();


/***********************************************/


    private static Mesada inicializarPatron ()
    {
        Mesada patron = new Mesada();
        Metal met1 = new Metal();
        Metal met2 = new Metal();
        Metal met3 = new Metal();
        Piedra p1 = new Piedra();
        Madera m1 = new Madera();
        Madera m2 = new Madera();
        patron.agregar(1,met1);
        patron.agregar(2,met2);
        patron.agregar(3,met3);
        patron.agregar(4,p1);
        patron.agregar(5,m1);
        patron.agregar(8,m2);
        return patron;
    }


/***********************************************/

    /*
        Para construir debemos comprar ambos objetos.
        no podemos comparar 2 objetos con ==
        por lo que hay que hacer es sobrecargar el metodo EQUALS
     */

    PicoFino construirPicoFino (Mesada mesada)
    {
        PicoFino picoFino = null;

        if ( (mesada.cantidadDeMateriales() == patronPicoFino.cantidadDeMateriales()) &&
                (patronPicoFino.cantidadDeMateriales() == mesada.cantidadDeMateriales()) &&
                (patronPicoFino.obtenerElementoEnPosicion(1).equals(mesada.obtenerElementoEnPosicion(1))) &&
                (patronPicoFino.obtenerElementoEnPosicion(2).equals(mesada.obtenerElementoEnPosicion(2))) &&
                (patronPicoFino.obtenerElementoEnPosicion(3).equals(mesada.obtenerElementoEnPosicion(3))) &&
                (patronPicoFino.obtenerElementoEnPosicion(4).equals(mesada.obtenerElementoEnPosicion(4))) &&
                (patronPicoFino.obtenerElementoEnPosicion(5).equals(mesada.obtenerElementoEnPosicion(5))) &&
                (patronPicoFino.obtenerElementoEnPosicion(8).equals(mesada.obtenerElementoEnPosicion(8)))
        ) picoFino = new PicoFino();
        else
            throw new ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron();
        return picoFino;
    }

/***********************************************/
}
