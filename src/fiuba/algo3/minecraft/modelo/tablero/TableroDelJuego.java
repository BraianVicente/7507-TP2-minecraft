package fiuba.algo3.minecraft.modelo.tablero;

import fiuba.algo3.minecraft.modelo.jugador.Elemento;
import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import fiuba.algo3.minecraft.modelo.material.Material ;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

import java.util.Observable;
import java.util.Random;


public class TableroDelJuego extends Observable {
    private Mapa mapa ;
    private Jugador jugador ;
    private int largoTablero;
    private int  altoTablero;
    private Movimiento movimiento;

    public TableroDelJuego(Jugador jugador){
        largoTablero = 20 ;
        altoTablero = 20 ;
        mapa = new Mapa(largoTablero, altoTablero) ;
        movimiento = new Movimiento(mapa) ;
        this.jugador = jugador;

        int posicionXInicialJugador = (largoTablero / 2 )- 1 ;
        int posicionYInicialJugador = (altoTablero / 2 )- 1 ;
        this.mapa.agregarElemento(new Posicion (posicionXInicialJugador,posicionYInicialJugador),jugador);

        this.inicializarMadera(altoTablero);
        this.inicializarDiamante(largoTablero/4);
        this.inicializarPiedra(altoTablero/2);
        this.inicializarMetal(largoTablero/2);

    }

    public void agregarElementoAMesaTrabajoJugador(Posicion posicion,Material material){
        jugador.insertarMaterialEnMesaDeTrabajo(posicion,material);

    }


    public boolean tableroContieneJugador(){
        return tableroContieneElementoPosicionable(jugador) ;
    }

    public boolean tableroContieneElementoPosicionable(Posicionable elemento){
        return mapa.contieneElementoPosicionable(elemento);
    }

    public Posicionable obtenerElementoEnPosicion(Posicion posicion){
        Posicionable elemento = mapa.obtenerElementoEnPosicion(posicion);

        return elemento;
    }

    private void inicializarCon(Material material,int cantidadMateriales)  {

        int randomLargo ;
        int randomAlto ;
        for ( int i = 0 ; i <= cantidadMateriales ; i++ ){
            while(true){

                Random aleatorio = new Random(System.currentTimeMillis());

                randomLargo = aleatorio.nextInt(largoTablero - 1);
                randomAlto = aleatorio.nextInt(altoTablero - 1);

                Posicion posicionMaterial = new Posicion(randomLargo,randomAlto);

                try {
                    if ( posicionMaterial.distancia(jugador.obtenerPosicionActual()) > 1 &&
                            mapa.agregarElemento(posicionMaterial,material.getClass().newInstance())) {
                        break ;
                    }
                } catch (InstantiationException e) {
                } catch (IllegalAccessException e) {
                }
            }

        }
    }

    private void inicializarMetal(int cantidadMateriales) {
        inicializarCon(new Metal(),cantidadMateriales);

    }

    private void inicializarPiedra(int cantidadMateriales) {
        inicializarCon(new Piedra(),cantidadMateriales);
    }

    private void inicializarDiamante(int cantidadMateriales) {
        inicializarCon(new Diamante(),cantidadMateriales);

    }

    private void inicializarMadera(int cantidadMateriales) {
        inicializarCon(new Madera(),cantidadMateriales);
    }

    public String obtenerNombreDelJugador(){
        return this.jugador.obtenerNombre();
    }

    public void moverJugadorHaciaArriba() {
        movimiento.moverHaciaArriba(jugador);
        seActualizo();
    }

    public void moverJugadorHaciaAbajo() {
        movimiento.moverHaciaAbajo(jugador);
        seActualizo();
    }

    public void moverJugadorHaciaIzquierda() {
        movimiento.moverHaciaIzquierda(jugador);
        seActualizo();
    }

    public void moverJugadorHaciaDerecha() {
        movimiento.moverHaciaDerecha(jugador);
        seActualizo();
    }

    public void seActualizo(){
        super.setChanged();
        super.notifyObservers();
        super.clearChanged();
    }

    public Jugador obtenerJugador() {
        return jugador ;
    }

    public Mapa obtenerMapa() {
        return this.mapa ;
    }

    public Elemento obtenerElementoInventarioJugador(int i) {
        return this.jugador.obtenerInventario().obtenerElementoEnPosicion(i);
    }
}

