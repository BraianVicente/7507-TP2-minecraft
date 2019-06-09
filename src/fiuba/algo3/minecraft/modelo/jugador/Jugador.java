package fiuba.algo3.minecraft.modelo.jugador;

import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;

public class Jugador {

    public String nombre;
    private Inventario inventario;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.inventario = new Inventario();
    }

    public Jugador(){
        this.nombre = "Steve";
        this.inventario = new Inventario();
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    public Elemento obtenerHerramientaDeInventario(Herramienta herramienta){
        return this.inventario.obtenerElemento(herramienta);
    }

}
