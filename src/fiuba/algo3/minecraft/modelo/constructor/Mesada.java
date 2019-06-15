package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Material;

import java.util.HashMap;

public class Mesada {

    private

        HashMap <Integer, Material> tablero = new HashMap<>();

    public

/***********************************************/

    Mesada()
        {
            this.tablero = new HashMap<>();
        }

/***********************************************/

    /*
        agregar ()
        Pre: mesada creada
        Pos: agrega material en la posicion indicada
     */

    void agregar (int posicion, Material material)
        {
            this.tablero.put(posicion,material);
        }

/***********************************************/

    /*
        cantidadDeMateriales ()
        Pre: mesada creada
        Pos: devuelve la cantidad de materiales en la mesada.
     */

    int cantidadDeMateriales ()
        {
            return tablero.size();
        }

/***********************************************/

    /*
        contieneClave ()
        Pre: mesada creada
        Pos: revisa si existe la clave en el hashmap
     */

    boolean contieneClave (int clave)
        {
            return (tablero.containsKey(clave));
        }

/***********************************************/

    /*
        obtenerElementoEnPosicion ()
     */

    Material obtenerElementoEnPosicion (int posicion)
        {
            return (tablero.get(posicion));
        }

/***********************************************/

/***********************************************/

/***********************************************/

}
