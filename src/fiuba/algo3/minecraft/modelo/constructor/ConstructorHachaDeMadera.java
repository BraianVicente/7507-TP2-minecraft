package fiuba.algo3.minecraft.modelo.constructor;


import com.sun.xml.internal.ws.api.model.MEP;
import fiuba.algo3.minecraft.modelo.herramienta.HachaDeMadera;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Material;
import fiuba.algo3.minecraft.modelo.tablero.Tablero;


import java.util.HashMap;

public class ConstructorHachaDeMadera {

    private

        Mesada patronHachaDeMadera = inicializarPatron ();


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
            patron.agregar(4,m3);
            patron.agregar(5,m4);
            patron.agregar(8,m5);
            return patron;
        }

/***********************************************/

    /*
        Para construir debemos comprar ambos objetos.
        no podemos comparar 2 objetos con ==
        sobrecargar equals implica comprobar elemento a elemento, por lo que lo hacemos en forma manual
     */

    HachaDeMadera construirHachaDeMadera (Mesada mesada)
        {
            HachaDeMadera hachaDeMadera = null;

            if ( (mesada.cantidadDeMateriales() == patronHachaDeMadera.cantidadDeMateriales()) &&
                 (patronHachaDeMadera.cantidadDeMateriales() == mesada.cantidadDeMateriales()) &&
                 (patronHachaDeMadera.obtenerElementoEnPosicion(1).equals(mesada.obtenerElementoEnPosicion(1))) &&
                 (patronHachaDeMadera.obtenerElementoEnPosicion(2).equals(mesada.obtenerElementoEnPosicion(2))) &&
                 (patronHachaDeMadera.obtenerElementoEnPosicion(4).equals(mesada.obtenerElementoEnPosicion(4))) &&
                 (patronHachaDeMadera.obtenerElementoEnPosicion(5).equals(mesada.obtenerElementoEnPosicion(5))) &&
                 (patronHachaDeMadera.obtenerElementoEnPosicion(8).equals(mesada.obtenerElementoEnPosicion(8)))
                ) hachaDeMadera = new HachaDeMadera();
            else
                throw new ErrorNoSePuedeConstruirHerramientaNoConcuerdaConPatron();
            return hachaDeMadera;
        }

/***********************************************/



/***********************************************/



/***********************************************/


/***********************************************/



}
