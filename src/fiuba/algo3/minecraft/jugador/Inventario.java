package fiuba.algo3.minecraft.jugador;

import fiuba.algo3.minecraft.herramienta.HachaDeMadera;
import fiuba.algo3.minecraft.herramienta.Herramienta;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    List <Herramienta> herramientas = new ArrayList<Herramienta>();

    public Inventario(){
        herramientas.add(new HachaDeMadera());
    }

    public void agregarAlInventario(Herramienta herramienta){
        herramientas.add(herramienta);
    }

    public Herramienta obtenerHerramientaEnIndex(int index){
        return this.herramientas.get(index);
    }
}
