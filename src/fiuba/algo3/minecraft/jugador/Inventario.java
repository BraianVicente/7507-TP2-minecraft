package fiuba.algo3.minecraft.jugador;

import fiuba.algo3.minecraft.herramienta.HachaDeMadera;
import fiuba.algo3.minecraft.herramienta.HachaDeMetal;
import fiuba.algo3.minecraft.herramienta.Herramienta;

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

    Elemento obtenerElemento (Elemento unElemento)
        {
            int indexHerramienta = elementos.indexOf(unElemento);
            return elementos.get(indexHerramienta);
        }

/***********************************************/

/***********************************************/

/***********************************************/

}
