package fiuba.algo3.minecraft.modelo.posicionable ;


import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;

public class Vacio implements Posicionable {

    private Posicion posicion;

    private String sigla;

    public Vacio(){
        this.sigla = "  ";
    }

    @Override
    public String obtenerSigla(){
        return this.sigla;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (! (obj instanceof Vacio) )
            return false;
        return true;
    }

    @Override
    public void establecerPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public Posicion obtenerPosicionActual() {
        return posicion;
    }
}
