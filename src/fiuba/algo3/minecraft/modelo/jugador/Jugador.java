package fiuba.algo3.minecraft.modelo.jugador;

import fiuba.algo3.minecraft.modelo.desgaste.DesgasteEstandar;
import fiuba.algo3.minecraft.modelo.herramienta.Hacha;
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

    public Jugador(String nombre){
        this.nombre = nombre;
        this.inventario = new Inventario();
        this.mesaDeTrabajo = new MesaDeTrabajo();
        this.herramientaActiva = new Hacha(new DesgasteEstandar(100,2,1));

        this.inventario.agregarAlInventario(this.herramientaActiva);
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    public Elemento obtenerElementoDeInventario(Elemento elemento){
        return this.inventario.obtenerElemento(elemento);
    }

    public void agregarMaterialAlInventario(Elemento material){
        this.inventario.agregarAlInventario(material);
    }

    public void insertarMaterialEnMesaDeTrabajo(Posicion posicion, Posicionable material){
        this.mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(posicion, material);
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

    public void golpearMaterial(Madera material){
        herramientaActiva.desgastar(material);

        if (material.obtenerDurabilidad() <= 0){
            inventario.agregarAlInventario(material);
        }
    }

    public void golpearMaterial(Piedra material){
        herramientaActiva.desgastar(material);

        if (material.obtenerDurabilidad() <= 0){
            inventario.agregarAlInventario(material);
        }
    }

    public void golpearMaterial(Metal material){
        herramientaActiva.desgastar(material);

        if (material.obtenerDurabilidad() <= 0){
            inventario.agregarAlInventario(material);
        }
    }

    public void golpearMaterial(Diamante material){
        herramientaActiva.desgastar(material);

        if (material.obtenerDurabilidad() <= 0){
            inventario.agregarAlInventario(material);
        }
    }

    public int cantidadDeElementosEnInventario(){
        return inventario.cantidadElementos();
    }

    public void cambiarHerramientaActiva(Herramienta herramienta){
        this.herramientaActiva = herramienta;
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
}
