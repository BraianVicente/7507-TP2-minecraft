package fiuba.algo3.minecraft.modelo.mapa.posicion;

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

    public boolean esContigua(Posicion posicion) {
        if (this.equals(posicion)) return false ;

        return posicion.distancia(this) <= 1 ;
    }

    public int distancia(Posicion posicion) {
        return (int) Math.sqrt(Math.pow(this.x - posicion.obtenerX(),2) + Math.pow(this.y - posicion.obtenerY(),2));
    }

    @Override
    public String toString(){
        return "Posicion (" + obtenerX() + ", " + obtenerY() + ")";
    }
}
