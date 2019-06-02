package fiuba.algo3.minecraft.desgaste;

import org.junit.Assert;
import org.junit.Test;

public class DesgasteEstandarTest {

    @Test
    public void crearDurabilidadEstandar(){
        int durabilidadInicia = 10 ;
        int fuerzaInicial = 5 ;
        DesgasteEstandar desgaste = new DesgasteEstandar(durabilidadInicia,fuerzaInicial) ;

        Assert.assertEquals(durabilidadInicia, desgaste.obtenerDurabilidad());
        Assert.assertEquals(fuerzaInicial, desgaste.obtenerFuerza());
    }

    @Test
    public void reducirDesgasteEstandarAlDesgastarse(){
        int durabilidadInicia = 10 ;
        int fuerzaInicial = 2 ;

        DesgasteEstandar desgaste = new DesgasteEstandar(durabilidadInicia,fuerzaInicial) ;

        desgaste.desgastar();

        Assert.assertTrue("Se redujo durabilidad: ",durabilidadInicia > desgaste.obtenerDurabilidad());

    }

    @Test
    public void reducirDesgasteEstandarEnUnidadesDeFuerza(){
        int durabilidadInicia = 10 ;
        int fuerzaInicial = 2 ;

        DesgasteEstandar desgaste = new DesgasteEstandar(durabilidadInicia,fuerzaInicial) ;

        desgaste.desgastar();

        Assert.assertEquals(durabilidadInicia - fuerzaInicial, desgaste.obtenerDurabilidad());

    }

    @Test
    public void desgastarHastaLlegarQueDurabilidadSeaCero(){
        int durabilidadInicia = 10 ;
        int fuerzaInicial = 2 ;

        DesgasteEstandar desgaste = new DesgasteEstandar(durabilidadInicia,fuerzaInicial) ;

        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();

        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

    }

    @Test(expected = NoSePuedeDesgastarException.class)
    public void lanzarExcepcionAlQuererDesgastarDurabilidadEnCero(){
        int durabilidadInicia = 10 ;
        int fuerzaInicial = 2 ;

        DesgasteEstandar desgaste = new DesgasteEstandar(durabilidadInicia,fuerzaInicial) ;

        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();

        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

        desgaste.desgastar();

        Assert.assertEquals(0, desgaste.obtenerDurabilidad());


    }
}
