package fiuba.algo3.minecraft.desgaste;

import org.junit.Assert;
import org.junit.Test;

public class DesgasteHachaMetalTest {

    @Test
    public void crearDesgasteEstandar(){
        int durabilidadInicia = 400 ;
        int fuerzaInicial = 10 ;
        DesgasteEstandar desgaste = new DesgasteEstandar(durabilidadInicia,fuerzaInicial,0.5F) ;

        Assert.assertEquals(durabilidadInicia, desgaste.obtenerDurabilidad());
        Assert.assertEquals(fuerzaInicial, desgaste.obtenerFuerza());
    }


    @Test
    public void reducirDesgasteEstandarEnMitadUnidadesDeFuerza(){
        int durabilidadInicia = 400 ;
        int fuerzaInicial = 10 ;

        DesgasteEstandar desgaste = new DesgasteEstandar(durabilidadInicia,fuerzaInicial,0.5F) ;

        desgaste.desgastar();

        int reduccionDurabilidad = (int) (fuerzaInicial * 0.5F) ;
        Assert.assertEquals((durabilidadInicia - reduccionDurabilidad), desgaste.obtenerDurabilidad());

    }

    @Test
    public void desgastarHastaLlegarQueDurabilidadSeaCero(){
        int durabilidadInicia = 400 ;
        int fuerzaInicial = 10 ;

        DesgasteEstandar desgaste = new DesgasteEstandar(durabilidadInicia,fuerzaInicial,0.5F) ;

        while (desgaste.obtenerDurabilidad() > 0 ){
            desgaste.desgastar();
        }

        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

    }

    @Test(expected = NoSePuedeUsarException.class)
    public void lanzarExcepcionAlQuererDesgastarDurabilidadEnCero(){
        int durabilidadInicia = 400 ;
        int fuerzaInicial = 10 ;

        DesgasteEstandar desgaste = new DesgasteEstandar(durabilidadInicia,fuerzaInicial,0.5F) ;

        while (desgaste.obtenerDurabilidad() > 0 ){
            desgaste.desgastar();
        }

        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

        desgaste.desgastar();

        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

    }


}
