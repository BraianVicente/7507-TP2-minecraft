package fiuba.algo3.minecraft.modelo.jugador;

import fiuba.algo3.minecraft.modelo.desgaste.DesgasteEstandar;
import fiuba.algo3.minecraft.modelo.herramienta.Hacha;
import fiuba.algo3.minecraft.modelo.material.Madera;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    List <Elemento> elementos ;

    public Inventario(){
        elementos = new ArrayList<Elemento>();
        elementos.add(new Madera());
        elementos.add(new Hacha(new DesgasteEstandar(100,2,1)));
    }
    void agregarAlInventario(Elemento unElemento)
        {
            elementos.add(unElemento);
        }

    int cantidadElementos ()
        {
            return elementos.size();
        }

    Elemento obtenerElemento (Elemento unElemento){
        int indexHerramienta = elementos.indexOf(unElemento);
        return elementos.get(indexHerramienta);
    }

}
