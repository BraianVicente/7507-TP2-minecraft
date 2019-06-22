package fiuba.algo3.minecraft.modelo.jugador;

import fiuba.algo3.minecraft.modelo.desgaste.DesgasteEstandar;
import fiuba.algo3.minecraft.modelo.herramienta.Hacha;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Material;
import fiuba.algo3.minecraft.modelo.mesadetrabajo.MesaDeTrabajo;
import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;
import fiuba.algo3.minecraft.modelo.plano.Plano;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

public class Jugador implements Posicionable {

    private String nombre;
    private Inventario inventario;
    private Posicion posicion;
    private MesaDeTrabajo mesaDeTrabajo;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.inventario = new Inventario();
        this.mesaDeTrabajo = new MesaDeTrabajo();

        this.inventario.agregarAlInventario(new Hacha(new DesgasteEstandar(100,2,1)));
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

    public void insertarMaterialEnMesaDeTrabajo(int x, int y, Posicionable material){
        this.mesaDeTrabajo.insertarMaterialEnMesaEnPosicion(x,y, material);
    }

    public void eliminarMaterialEnMesaDeTrabajo(int x, int y){
        this.mesaDeTrabajo.eliminarMaterialEnMesaEnPosicion(x, y);
    }

    public Posicionable obtenerMaterialEnPosicionDeLaMesaDeTrabajo(int x, int y){
        return this.mesaDeTrabajo.obtenerMaterialEnPosicion(x, y);
    }

    public void construirHerramienta(Plano plano){
        Herramienta herramienta;
        herramienta = this.mesaDeTrabajo.construir(plano);
        agregarMaterialAlInventario(herramienta);
    }

    public void golpearMaterial(Material material, Herramienta herramienta){
        material.desgastar(herramienta);

        if (material.obtenerDurabilidad() <= 0){
            inventario.agregarAlInventario(material);
        }
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
