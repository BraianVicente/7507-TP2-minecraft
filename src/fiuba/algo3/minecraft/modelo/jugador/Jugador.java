package fiuba.algo3.minecraft.modelo.jugador;

import fiuba.algo3.minecraft.modelo.fabrica.FabricaDeHerramientas;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.*;
import fiuba.algo3.minecraft.modelo.mesadetrabajo.MesaDeTrabajo;
import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;
import fiuba.algo3.minecraft.modelo.plano.Plano;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

public class Jugador implements Posicionable {

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
        this.herramientaActiva = fabrica.construirHachaDeMadera();

        this.inventario.agregarAlInventario(this.herramientaActiva);
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
        this.inventario.quitarDelInventario((Material) material);
    }

    public void eliminarMaterialEnMesaDeTrabajo(Posicion posicion){
        this.mesaDeTrabajo.eliminarMaterialEnMesaEnPosicion(posicion);
    }

    public Posicionable obtenerMaterialEnPosicionDeLaMesaDeTrabajo(Posicion posicion){
        return this.mesaDeTrabajo.obtenerMaterialEnPosicion(posicion);
    }

    public void construirHerramienta(Plano plano){
        Herramienta herramienta;
        herramienta = this.mesaDeTrabajo.construir(plano);
        agregarMaterialAlInventario(herramienta);
    }

    public void golpearMaterial(Material material){
        herramientaActiva.desgastar(material);

        if (material.obtenerDurabilidad() <= 0){
            inventario.agregarAlInventario(material);
        }
    }

    public int cantidadDeElementosEnInventario(){
        return inventario.cantidadElementos();
    }

    public void cambiarHerramientaActiva(){
        this.herramientaActiva = (Herramienta) inventario.obtenerProximaHerramienta(this.herramientaActiva);
    }

    public Herramienta obtenerHerramientaActiva(){
        return this.herramientaActiva;
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
