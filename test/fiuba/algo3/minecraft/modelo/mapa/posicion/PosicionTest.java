package fiuba.algo3.minecraft.modelo.mapa.posicion;

import org.junit.Assert ;
import org.junit.Test;

public class PosicionTest {

    @Test
    public void testCrearPosicion(){
        Posicion pos = new Posicion(2,3);

        int posicionEnX = pos.obtenerX();
        Assert.assertEquals(posicionEnX,2);

        int posicionEnY = pos.obtenerY();
        Assert.assertEquals(posicionEnY,3);

    }

    @Test(expected=PosicionInvalidaException.class)
    public void testPosicionEnXNoPuedeSerNegativa(){

        Posicion pos = new Posicion(-1,0);

    }

    @Test(expected=PosicionInvalidaException.class)
    public void testPosicionEnYNoPuedeSerNegativa(){

        Posicion pos = new Posicion(0,-1);

    }

    @Test
    public void testDosPosicionesConMismasCoordenadasSonIguales(){
        Posicion pos1 = new Posicion(4,5);
        Posicion pos2 = new Posicion(4,5) ;

        Assert.assertEquals(pos1,pos2);
    }

    @Test
    public void testDosPosicionesConDistintasCoordenadasSonDistintos(){
        Posicion pos1 = new Posicion(4,5);
        Posicion pos2 = new Posicion(5,7) ;

        Assert.assertNotEquals(pos2,pos1);
    }

    @Test
    public void testDosPosicionesConCoordenadasInterpoladasTienenDistintoHashCode(){
        Posicion pos1 = new Posicion(4,5);
        Posicion pos2 = new Posicion(5,4) ;

        Assert.assertNotEquals(pos2.hashCode(),pos1.hashCode());
    }

    @Test
    public void testDosPosicionesConMismasCoordenadasTienenMismoHashCode(){
        Posicion pos1 = new Posicion(4,5);
        Posicion pos2 = new Posicion(4,5) ;

        Assert.assertEquals(pos2.hashCode(),pos1.hashCode());
    }

    @Test
    public void testPosicionArribaIzquierdaEsContiguaAPosicionActual(){
        Posicion posicionActual = new Posicion(1,1) ;
        Posicion arribaIzquierda = new Posicion(0,0) ;
		
		Assert.assertTrue(posicionActual.esContigua(arribaIzquierda));
    }

    @Test
    public void testPosicionArribaDerechaEsContiguaAPosicionActual(){
        Posicion posicionActual = new Posicion(1,1) ;
        Posicion arribaDerecha = new Posicion(0,2) ;

		Assert.assertTrue(posicionActual.esContigua(arribaDerecha));

    }

    @Test
    public void testPosicionArribaCentroEsContiguaAPosicionActual(){
        Posicion posicionActual = new Posicion(1,1) ;
        Posicion arribaCentro = new Posicion(0,1) ;

		Assert.assertTrue(posicionActual.esContigua(arribaCentro));
    }

    @Test
    public void testPosicionAbajoIzquierdaEsContiguaAPosicionActual(){
        Posicion posicionActual = new Posicion(1,1) ;
        Posicion abajoIzquierda = new Posicion(2,0) ;

		Assert.assertTrue(posicionActual.esContigua(abajoIzquierda));
    }

    @Test
    public void testPosicionAbajoDerechaEsContiguaAPosicionActual(){
        Posicion posicionActual = new Posicion(1,1) ;
        Posicion abajoDerecha = new Posicion(2,2) ;

		Assert.assertTrue(posicionActual.esContigua(abajoDerecha));
    }

    @Test
    public void testPosicionAbajoCentroEsContiguaAPosicionActual(){
        Posicion posicionActual = new Posicion(1,1) ;
        Posicion abajoCentro = new Posicion(2,1) ;

		Assert.assertTrue(posicionActual.esContigua(abajoCentro));
    }

    @Test
    public void testPosicionCentroIzquierdoEsContiguaAPosicionActual(){
        Posicion posicionActual = new Posicion(1,1) ;
        Posicion centroIzquierdo = new Posicion(1,0) ;

		Assert.assertTrue(posicionActual.esContigua(centroIzquierdo));
    }

    @Test
    public void testPosicionCentroDerechoEsContiguaAPosicionActual(){
        Posicion posicionActual = new Posicion(1,1) ;
        Posicion centroDerecho = new Posicion(1,2) ;

		Assert.assertTrue(posicionActual.esContigua(centroDerecho));
    }

    @Test
    public void testMismaPosicionEsNoContigua(){
        Posicion posicionActual = new Posicion(1,1) ;

        Assert.assertFalse(posicionActual.esContigua(posicionActual));
    }
}
