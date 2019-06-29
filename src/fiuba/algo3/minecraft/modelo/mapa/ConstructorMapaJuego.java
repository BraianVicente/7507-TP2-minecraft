package fiuba.algo3.minecraft.modelo.mapa;

import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.*;

import java.util.Random;

public class ConstructorMapaJuego {

    private static final Integer ALTOESTANDAR = 20;
    private static final Integer LARGOESTANDAR = 20 ;
    private static ConstructorMapaJuego constructorMapaJuego = null ;

    private ConstructorMapaJuego(){

    }

    public static ConstructorMapaJuego getInstance() {
        if (constructorMapaJuego == null ){
            constructorMapaJuego = new ConstructorMapaJuego() ;
        }
        return constructorMapaJuego ;
    }


    public Mapa JuegoEstandar(Jugador jugador) {
        Mapa mapa = new Mapa(LARGOESTANDAR, ALTOESTANDAR) ;
        int posicionXInicialJugador = (LARGOESTANDAR / 2 )- 1 ;
        int posicionYInicialJugador = (ALTOESTANDAR / 2 )- 1 ;
        mapa.agregarElemento(new Posicion(posicionXInicialJugador,posicionYInicialJugador),jugador);

        this.inicializarMadera(mapa, jugador,ALTOESTANDAR);
        this.inicializarDiamante(mapa, jugador,LARGOESTANDAR/4);
        this.inicializarPiedra(mapa, jugador,ALTOESTANDAR/2);
        this.inicializarMetal(mapa, jugador,LARGOESTANDAR/2);

        return mapa ;
    }

    private void inicializarCon(Mapa mapa,Jugador jugador, Material material, int cantidadMateriales)  {

        int randomLargo ;
        int randomAlto ;
        for ( int i = 0 ; i <= cantidadMateriales ; i++ ){
            while(true){

                Random aleatorio = new Random(System.currentTimeMillis());

                randomLargo = aleatorio.nextInt(LARGOESTANDAR - 1);
                randomAlto = aleatorio.nextInt(ALTOESTANDAR - 1);

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

    private void inicializarMetal(Mapa mapa, Jugador jugador, int cantidadMateriales) {
        inicializarCon(mapa, jugador,new Metal(),cantidadMateriales);

    }

    private void inicializarPiedra(Mapa mapa, Jugador jugador, int cantidadMateriales) {
        inicializarCon(mapa, jugador,new Piedra(),cantidadMateriales);
    }

    private void inicializarDiamante(Mapa mapa, Jugador jugador, int cantidadMateriales) {
        inicializarCon(mapa, jugador,new Diamante(),cantidadMateriales);

    }

    private void inicializarMadera(Mapa mapa, Jugador jugador,int cantidadMateriales) {
        inicializarCon(mapa, jugador,new Madera(),cantidadMateriales);
    }

}
