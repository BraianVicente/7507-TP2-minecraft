package fiuba.algo3.minecraft.jugador;

import fiuba.algo3.minecraft.herramienta.Herramienta;

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

    public Herramienta obtenerHerramientaDeInventario(Herramienta herramienta){
        return this.inventario.obtenerHerramienta(herramienta);
    }
}
