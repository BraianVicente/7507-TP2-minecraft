package fiuba.algo3.minecraft.modelo.desgaste;

import org.junit.Assert;
import org.junit.Test;

public class DesgastePicoPiedraTest {

    @Test
    public void crearDesgasteEstandar(){
        int durabilidadInicial = 200 ;
        int fuerzaInicial = 4 ;
        
        DesgasteEstandar desgaste = new DesgasteEstandar(durabilidadInicial,fuerzaInicial,0.66F) ;


        Assert.assertEquals(durabilidadInicial, desgaste.obtenerDurabilidad());
        Assert.assertEquals(fuerzaInicial, desgaste.obtenerFuerza());
    }

    @Test
    public void reducirDesgasteEstandarAlDesgastarse(){
        int durabilidadInicial = 200 ;
        int fuerzaInicial = 4 ;
        

        DesgasteEstandar desgaste = new DesgasteEstandar(durabilidadInicial,fuerzaInicial,0.66F) ;


        desgaste.desgastar();

        Assert.assertTrue("Se redujo durabilidad: ",durabilidadInicial > desgaste.obtenerDurabilidad());

    }

    @Test
    public void reducirDesgasteEstandarEnMitadUnidadesDeFuerza(){
        int durabilidadInicial = 200 ;
        int fuerzaInicial = 4 ;
        
        DesgasteEstandar desgaste = new DesgasteEstandar(durabilidadInicial,fuerzaInicial,0.66F) ;

        desgaste.desgastar();

        int reduccionDurabilidad = (int) (fuerzaInicial /1.5);
        Assert.assertEquals((durabilidadInicial - reduccionDurabilidad), desgaste.obtenerDurabilidad());

    }

    @Test
    public void desgastarHastaLlegarQueDurabilidadSeaCero(){
        int durabilidadInicial = 200 ;
        int fuerzaInicial = 4 ;
        
        DesgasteEstandar desgaste = new DesgasteEstandar(durabilidadInicial,fuerzaInicial,0.66F) ;


        while (desgaste.obtenerDurabilidad() > 0 ){
            desgaste.desgastar();
        }

        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

    }

    @Test(expected = NoSePuedeUsarException.class)
    public void lanzarExcepcionAlQuererDesgastarDurabilidadEnCero(){
        int durabilidadInicial = 200 ;
        int fuerzaInicial = 4 ;
        
        DesgasteEstandar desgaste = new DesgasteEstandar(durabilidadInicial,fuerzaInicial,0.66F) ;


        while (desgaste.obtenerDurabilidad() > 0 ){
            desgaste.desgastar();
        }

        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

        desgaste.desgastar();

        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

    }

}
