package fiuba.algo3.minecraft.desgaste;

import org.junit.Assert;
import org.junit.Test;

public class DesgasteHachaMetalTest {

    @Test
    public void crearDesgasteHachaMetal(){
        int durabilidadInicia = 400 ;
        int fuerzaInicial = 10 ;
        DesgasteHachaMetal desgaste = new DesgasteHachaMetal(durabilidadInicia,fuerzaInicial) ;

        Assert.assertEquals(durabilidadInicia, desgaste.obtenerDurabilidad());
        Assert.assertEquals(fuerzaInicial, desgaste.obtenerFuerza());
    }

    @Test
    public void reducirDesgasteHachaMetalAlDesgastarse(){
        int durabilidadInicia = 400 ;
        int fuerzaInicial = 10 ;

        DesgasteHachaMetal desgaste = new DesgasteHachaMetal(durabilidadInicia,fuerzaInicial) ;

        desgaste.desgastar();

        Assert.assertTrue("Se redujo durabilidad: ",durabilidadInicia > desgaste.obtenerDurabilidad());

    }

    @Test
    public void reducirDesgasteHachaMetalEnMitadUnidadesDeFuerza(){
        int durabilidadInicia = 400 ;
        int fuerzaInicial = 10 ;

        DesgasteHachaMetal desgaste = new DesgasteHachaMetal(durabilidadInicia,fuerzaInicial) ;

        desgaste.desgastar();

        int reduccionDurabilidad = fuerzaInicial/2 ;
        Assert.assertEquals((durabilidadInicia - reduccionDurabilidad), desgaste.obtenerDurabilidad());

    }

    @Test
    public void desgastarHastaLlegarQueDurabilidadSeaCero(){
        int durabilidadInicia = 400 ;
        int fuerzaInicial = 10 ;

        DesgasteHachaMetal desgaste = new DesgasteHachaMetal(durabilidadInicia,fuerzaInicial) ;

        while (desgaste.obtenerDurabilidad() > 0 ){
            desgaste.desgastar();
        }

        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

    }

    @Test(expected = NoSePuedeDesgastarException.class)
    public void lanzarExcepcionAlQuererDesgastarDurabilidadEnCero(){
        int durabilidadInicia = 400 ;
        int fuerzaInicial = 10 ;

        DesgasteHachaMetal desgaste = new DesgasteHachaMetal(durabilidadInicia,fuerzaInicial) ;

        while (desgaste.obtenerDurabilidad() > 0 ){
            desgaste.desgastar();
        }

        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

        desgaste.desgastar();

        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

    }


}
