package fiuba.algo3.minecraft.desgaste;

import org.junit.Assert;
import org.junit.Test;

public class DesgasteLogaritmicoTest {

    @Test
    public void crearDesgastePicoFino(){
        int durabilidadInicial = 1000 ;
        int fuerzaInicial = 20 ;
        DesgasteLogaritmico desgaste = new DesgasteLogaritmico(durabilidadInicial,fuerzaInicial) ;

        Assert.assertEquals(durabilidadInicial, desgaste.obtenerDurabilidad());
        Assert.assertEquals(fuerzaInicial, desgaste.obtenerFuerza());
    }

    @Test
    public void reducirDesgastePicoFinoAlDesgastarse(){
        int durabilidadInicial = 1000 ;
        int fuerzaInicial = 20 ;

        DesgasteLogaritmico desgaste = new DesgasteLogaritmico(durabilidadInicial,fuerzaInicial) ;

        desgaste.desgastar();

        Assert.assertTrue("Se redujo durabilidad: ",durabilidadInicial > desgaste.obtenerDurabilidad());

    }

    @Test
    public void reducirDurabilidadDesgastePicoFinoEnDecimaParte(){
        int durabilidadInicial = 1000 ;
        int fuerzaInicial = 20 ;

        DesgasteLogaritmico desgaste = new DesgasteLogaritmico(durabilidadInicial,fuerzaInicial) ;

        desgaste.desgastar();
        int reduccionDurabilidad = (int)(durabilidadInicial -  (durabilidadInicial * 0.1));

        Assert.assertEquals(reduccionDurabilidad, desgaste.obtenerDurabilidad());

    }

    @Test
    public void desgastarHastaLlegarQueDurabilidadSeaCero(){
        int durabilidadInicial = 1000 ;
        int fuerzaInicial = 20 ;

        DesgasteLogaritmico desgaste = new DesgasteLogaritmico(durabilidadInicial,fuerzaInicial) ;

        while (desgaste.obtenerDurabilidad() > 0 ){
            desgaste.desgastar();
        }
        
        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

    }

    @Test(expected = NoSePuedeUsarException.class)
    public void lanzarExcepcionAlQuererDesgastarDurabilidadEnCero(){
        int durabilidadInicial = 1000 ;
        int fuerzaInicial = 20 ;

        DesgasteLogaritmico desgaste = new DesgasteLogaritmico(durabilidadInicial,fuerzaInicial) ;

        while (desgaste.obtenerDurabilidad() > 0 ){
            desgaste.desgastar();
        }

        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

        desgaste.desgastar();

        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

    }


}