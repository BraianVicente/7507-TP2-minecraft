package fiuba.algo3.minecraft.modelo.jugador;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.*;
import fiuba.algo3.minecraft.modelo.mesadetrabajo.MesaDeTrabajo;
import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

import java.util.Observable;

public class Jugador extends Observable implements Posicionable{

    private String nombre;
    private Inventario inventario;
    private Posicion posicion;
    private MesaDeTrabajo mesaDeTrabajo;
    private Herramienta herramientaActiva;
    private FabricaDeHerramientas fabrica ;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.inventario = new Inventario();
        this.mesaDeTrabajo = new MesaDeTrabajo(inventario);
        this.fabrica = new FabricaDeHerramientas();
        this.inventario.agregarAlInventario(this.fabrica.construirHachaDeMadera());
    }

    public MesaDeTrabajo obtenerMesaDeTrabajo(){
        return this.mesaDeTrabajo ;
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    public Elemento obtenerElementoDeInventario(Elemento elemento){
        return this.inventario.obtenerElemento(elemento);
    }

    public void agregarMaterialAlInventario(Elemento elemento){
        this.inventario.agregarAlInventario(elemento);
    }

    public void insertarMaterialEnMesaDeTrabajo(Posicion posicion, Material material){
        this.mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(posicion, material);
        this.inventario.quitarDelInventario(material);
    }

    public void eliminarMaterialEnMesaDeTrabajo(Posicion posicion){
        this.mesaDeTrabajo.eliminarMaterialEnMesaEnPosicion(posicion);
    }

    public Posicionable obtenerMaterialEnPosicionDeLaMesaDeTrabajo(Posicion posicion){
        return this.mesaDeTrabajo.obtenerMaterialEnPosicion(posicion);
    }

    public void construirHerramienta(){
        Herramienta herramienta = this.mesaDeTrabajo.construir();

        agregarMaterialAlInventario(herramienta);
    }

    public void golpearMaterial(Material material){
        herramientaActiva.desgastar(material);

        if (material.estaRoto()){
            inventario.agregarAlInventario(material);
        }

        if (herramientaActiva.estaRota()){
            inventario.quitarDelInventario(herramientaActiva);
            herramientaActiva = null ;
            seActualizo();
        }
    }

    public int cantidadDeElementosEnInventario(){
        return inventario.cantidadElementos();
    }

    public void cambiarHerramientaActiva(){
        if (tieneHerramientaActiva()){
            inventario.agregarAlInventario(this.herramientaActiva);
        }
        this.herramientaActiva = (Herramienta) inventario.obtenerProximaHerramienta();
        inventario.quitarDelInventario(herramientaActiva);

        seActualizo();
    }

    public boolean tieneHerramientaActiva() {
        return this.herramientaActiva instanceof Herramienta ;
    }

    public Herramienta obtenerHerramientaActiva(){
        return this.herramientaActiva;
    }

    public void seActualizo(){
        super.setChanged();
        super.notifyObservers();
        super.clearChanged();
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (! (obj instanceof Jugador) )
            return false;
        Jugador otro = (Jugador) obj;
        if ( ! this.nombre.equals(otro)){
            return  false ;
        }
        return true;
    }

    @Override
    public void establecerPosicion(Posicion posicion) {
        this.posicion = posicion ;
    }

    @Override
    public Posicion obtenerPosicionActual() {
        return posicion;
    }


    public Inventario obtenerInventario() {
        return this.inventario ;
    }
}
