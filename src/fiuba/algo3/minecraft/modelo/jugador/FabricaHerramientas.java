package fiuba.algo3.minecraft.modelo.jugador;

import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Material;

import java.util.HashMap;

public class FabricaHerramientas {

    private

        HashMap <Integer, Material> tablero = new HashMap<>();


    public
/***********************************************/

    /*
        Constructor
     */

    FabricaHerramientas ()
        {
            HashMap <Integer, Material> tablero = new HashMap<Integer, Material>();

        }

/***********************************************/

    /*
        Agrega Material a la fabrica
     */

    void agregar (int posicion, Material material)
        {
            tablero.put(posicion,material);
        }

/***********************************************/

    /*
        cantidadElementos ()
        devuelve la cantidad de elementos la fabrica
     */

    int cantidadElementos ()
        {
            return tablero.size();
        }

/***********************************************/

    /*
        remover()
        remueve elemento en la posicion indicada
     */

    void remover (int posicion, Material material)
        {
            tablero.remove(1,material);
        }

/***********************************************/

/***********************************************/

/***********************************************/

/***********************************************/

}
