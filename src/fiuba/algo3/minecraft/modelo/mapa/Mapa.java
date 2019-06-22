package fiuba.algo3.minecraft.modelo.mapa;

import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Material;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import fiuba.algo3.minecraft.modelo.posicionable.Vacio;

import java.util.HashMap;

public class Mapa {

    private final HashMap<Posicion,Posicionable> mapa ;
    private Integer limiteX;
    private Integer limiteY;

    public Mapa(Integer x,Integer y) {
        this.limiteX = x ;
        this.limiteY = y ;
        HashMap<Posicion,Posicionable> mapa = new HashMap<Posicion,Posicionable>()   ;
        for ( int i = 0 ; i < x ; i++ ){
            for(int j = 0 ; j < y ; j++ ){
                mapa.put(new Posicion(i,j),new Vacio()) ;
            }
        }
        this.mapa = mapa;
    }

    public boolean posicionDentroDeRangoMapa(Posicion posicion) {
        return mapa.containsKey(posicion);
    }

    public Posicionable obtenerElementoEnPosicion(Posicion posicion) {
        if (this.posicionDentroDeRangoMapa(posicion)){
            return mapa.get(posicion) ;
        }
        throw new FueraDeRangoMapaException() ;
    }

    public boolean contieneElementoPosicionable(Posicionable elemento){
        return mapa.containsValue(elemento) ;
    }

    public boolean agregarElemento(Posicion posicion, Posicionable posicionable) {
        if ( ! this.posicionDentroDeRangoMapa(posicion)){
            throw new FueraDeRangoMapaException() ;
        }

        if (this.obtenerElementoEnPosicion(posicion).equals(new Vacio()) ){
            mapa.put(posicion,posicionable) ;
            posicionable.establecerPosicion(posicion);
            return true ;

        }

        return false ;
    }


    public void eliminarElemento(Posicion posicion) {
        if ( ! this.posicionDentroDeRangoMapa(posicion)){
            throw new FueraDeRangoMapaException() ;
        }
        mapa.put(posicion,new Vacio()) ;
    }

    public Posicion obtenerPosicion(Posicionable elemento){
        for (Posicion posicion : mapa.keySet()){
            Posicionable posicionable = this.obtenerElementoEnPosicion(posicion);
            if (elemento.equals(posicionable)) {
                return posicion;
            }
        }
        return null ;
    }

    public boolean posicionSeEncuentraOcupada(Posicion posicion){
        if (this.obtenerElementoEnPosicion(posicion).equals(new Vacio())){
            return false;
        }
        else {
            return true;
        }
    }

    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (! (obj instanceof Mapa) )
            return false;
        Mapa otroMapa = (Mapa) obj;
        if (this.limiteX != otroMapa.limiteX)
            return false ;
        if (this.limiteY != otroMapa.limiteY)
            return false ;

        for (int i = 0; i < limiteX; i++){
            for (int j = 0; j < limiteY; j++){
                if (! this.obtenerElementoEnPosicion(new Posicion(i,j)).equals(otroMapa.obtenerElementoEnPosicion(new Posicion(i,j)))){
                    return false;
                }
            }
        }

        return true;
    }
}
