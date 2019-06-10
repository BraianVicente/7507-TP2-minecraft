package fiuba.algo3.minecraft.modelo.jugador;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

        List <Elemento> elementos = new ArrayList<Elemento>();

   public

/***********************************************/

    Inventario()
        {

        }

/***********************************************/

    void agregarAlInventario(Elemento unElemento)
        {
            elementos.add(unElemento);
        }

/***********************************************/

    int cantidadElementos ()
        {
            return elementos.size();
        }

/***********************************************/

    Elemento obtenerHerramienta (Elemento unElemento)
        {
            int indexHerramienta = elementos.indexOf(unElemento);
            return elementos.get(indexHerramienta);
        }

/***********************************************/

/***********************************************/

/***********************************************/

}