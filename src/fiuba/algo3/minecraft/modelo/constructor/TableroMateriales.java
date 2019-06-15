package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.HachaDeMadera;
import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;
import fiuba.algo3.minecraft.modelo.material.Material;

public class TableroMateriales {

    private

        Mesada tablero;
        ConstructorDeHerramienta constructor;

    public

/***********************************************/

    TableroMateriales ()
        {
            tablero = new Mesada();
        }

/***********************************************/

    /*
        agregarMaterial ()
        Pre: tablero creado
        Pos: agrega el material en la posicion indicada
     */

    void agregar (int posicion, Material material)
        {
            if (tablero.contieneClave(posicion))
                throw new ErrorCasilleroOcupado();
            tablero.agregar(posicion,material);
        }

/***********************************************/

    /*
        cantidadDeMateriales
        Pre: tablero creado
        Pos: agrega material al tabvlero
     */

    int cantidadDeMateriales ()
        {
            return tablero.cantidadDeMateriales();
        }

/***********************************************/

    /*
        contruirHachaDeMadera(Mesada mesaConMaterialesDispuestos)
        Pre: mesaConMaterialesDispuestos creada
        Pos: si la mesaConMaterialesDispuestos esta correctamente dispuesta crea la herramienta
             si no esta correctamente dispuesta NO construye nada
     */

    HachaDeMadera contruirHachaDeMadera()
        {
            return  (constructor.construirHachaDeMadera (tablero));
        }

/***********************************************/

/***********************************************/

/***********************************************/


}
