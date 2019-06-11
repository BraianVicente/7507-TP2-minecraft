package fiuba.algo3.minecraft.modelo.mapa.posicion;

import static java.lang.StrictMath.abs;

public class Posicion {
    private final int x;
    private final int y;

    public Posicion(int x, int y) {
        if (x >= 0) {
            this.x = x;
        } else {
            throw new PosicionInvalidaException();
        }
        if (y >= 0) {
            this.y = y;
        } else {
            throw new PosicionInvalidaException();
        }

    }

    public int obtenerX() {
        return x;
    }

    public int obtenerY() {
        return y;
    }


    @Override
    public int hashCode() {
        final int primo = 31;
        int resultado = 1;
        resultado = primo * resultado + x;
        resultado = primo * resultado + y;
        return resultado;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (! (obj instanceof Posicion) )
            return false;
        Posicion other = (Posicion) obj;
        if (this.x != other.obtenerX())
            return false;
        if (this.y != other.obtenerY())
            return false;
        return true;
    }

    public boolean esContigua(Posicion otraPosicion) {
        if (this.equals(otraPosicion)) return false ;

        if ( (abs(x - otraPosicion.obtenerX() ) <= 1)   &&
            (abs(y - otraPosicion.obtenerY() ) <= 1  ) ){
                return true ;
        }
        return false ;
    }
}
