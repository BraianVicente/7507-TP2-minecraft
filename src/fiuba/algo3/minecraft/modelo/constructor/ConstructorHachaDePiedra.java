package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.HachaDePiedra;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Piedra;

public class ConstructorHachaDePiedra {

    private

        Mesada patronHachaDePiedra = inicializarPatron ();


/***********************************************/


    private static Mesada inicializarPatron ()
    {
        Mesada patron = new Mesada();
        Piedra p1 = new Piedra();
        Piedra p2 = new Piedra();
        Piedra p3 = new Piedra();
        Madera m1 = new Madera();
        Madera m2 = new Madera();
        patron.agregar(1,p1);
        patron.agregar(2,p2);
        patron.agregar(4,p3);
        patron.agregar(5,m1);
        patron.agregar(8,m2);
        return patron;
    }

/***********************************************/

    /*
        Para construir debemos comprar ambos objetos.
        no podemos comparar 2 objetos con ==
        sobrecargar equals implica comprobar elemento a elemento, por lo que lo hacemos en forma manual
     */

    HachaDePiedra construirHachaDePiedra (Mesada mesada)
        {
            HachaDePiedra hachaDePiedra = null;

            if ( (mesada.cantidadDeMateriales() == patronHachaDePiedra.cantidadDeMateriales()) &&
                 (patronHachaDePiedra.cantidadDeMateriales() == mesada.cantidadDeMateriales()) &&
                 (patronHachaDePiedra.obtenerElementoEnPosicion(1).equals(mesada.obtenerElementoEnPosicion(1))) &&
                 (patronHachaDePiedra.obtenerElementoEnPosicion(2).equals(mesada.obtenerElementoEnPosicion(2))) &&
                 (patronHachaDePiedra.obtenerElementoEnPosicion(4).equals(mesada.obtenerElementoEnPosicion(4))) &&
                 (patronHachaDePiedra.obtenerElementoEnPosicion(5).equals(mesada.obtenerElementoEnPosicion(5))) &&
                 (patronHachaDePiedra.obtenerElementoEnPosicion(8).equals(mesada.obtenerElementoEnPosicion(8)))
                ) hachaDePiedra = new HachaDePiedra();
            else
                throw new ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron();
            return hachaDePiedra;
        }

/***********************************************/

}
