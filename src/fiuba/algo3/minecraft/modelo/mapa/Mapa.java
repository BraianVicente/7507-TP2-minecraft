package fiuba.algo3.minecraft.modelo.mapa;

import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.vacio.Vacio;

import java.util.HashMap;

public class Mapa {

    private HashMap<Posicion,Posicionable> mapa ;

    public Mapa(Integer x,Integer y) {
        HashMap<Posicion,Posicionable> mapa = new HashMap<Posicion,Posicionable>()   ;


        for ( int i = 0 ; i < x ; i++ ){
            for(int j = 0 ; j < y ; j++ ){
                mapa.put(new Posicion(i,j),new Vacio()) ;
            }


        }
        this.mapa = mapa ;
    }


    public boolean posicionExiste(int x, int y) {
        return mapa.containsKey(new Posicion(x,y));
    }

    public Posicionable obtenerPosicion(int x, int y) {
        if (this.posicionExiste(x,y)){
            return mapa.get(new Posicion(x,y)) ;
        }
        throw new FueraDeRangoMapaException() ;
    }
}
