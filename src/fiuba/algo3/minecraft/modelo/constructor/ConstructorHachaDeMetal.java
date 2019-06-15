package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.HachaDeMetal;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;

public class ConstructorHachaDeMetal {

    private

        Mesada patronHachaDeMetal = inicializarPatron ();


/***********************************************/


    private static Mesada inicializarPatron ()
    {
        Mesada patron = new Mesada();
        Metal met1 = new Metal();
        Metal met2 = new Metal();
        Metal met3 = new Metal();
        Madera m1 = new Madera();
        Madera m2 = new Madera();
        patron.agregar(1,met1);
        patron.agregar(2,met2);
        patron.agregar(4,met3);
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

    HachaDeMetal construirHachaDeMetal (Mesada mesada)
    {
        HachaDeMetal hachaDeMetal = null;

        if ( (mesada.cantidadDeMateriales() == patronHachaDeMetal.cantidadDeMateriales()) &&
                (patronHachaDeMetal.cantidadDeMateriales() == mesada.cantidadDeMateriales()) &&
                (patronHachaDeMetal.obtenerElementoEnPosicion(1).equals(mesada.obtenerElementoEnPosicion(1))) &&
                (patronHachaDeMetal.obtenerElementoEnPosicion(2).equals(mesada.obtenerElementoEnPosicion(2))) &&
                (patronHachaDeMetal.obtenerElementoEnPosicion(4).equals(mesada.obtenerElementoEnPosicion(4))) &&
                (patronHachaDeMetal.obtenerElementoEnPosicion(5).equals(mesada.obtenerElementoEnPosicion(5))) &&
                (patronHachaDeMetal.obtenerElementoEnPosicion(8).equals(mesada.obtenerElementoEnPosicion(8)))
        ) hachaDeMetal = new HachaDeMetal();
        else
            throw new ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron();
        return hachaDeMetal;
    }

/***********************************************/


}
