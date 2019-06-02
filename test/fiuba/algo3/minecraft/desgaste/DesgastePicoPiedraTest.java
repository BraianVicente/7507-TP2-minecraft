package fiuba.algo3.minecraft.desgaste;

import org.junit.Assert;
import org.junit.Test;

public class DesgastePicoPiedraTest {

    @Test
    public void crearDesgastePicoPiedra(){
        int durabilidadInicial = 200 ;
        int fuerzaInicial = 4 ;
        DesgastePicoPiedra desgaste = new DesgastePicoPiedra(durabilidadInicial,fuerzaInicial) ;

        Assert.assertEquals(durabilidadInicial, desgaste.obtenerDurabilidad());
        Assert.assertEquals(fuerzaInicial, desgaste.obtenerFuerza());
    }

    @Test
    public void reducirDesgastePicoPiedraAlDesgastarse(){
        int durabilidadInicial = 200 ;
        int fuerzaInicial = 4 ;

        DesgastePicoPiedra desgaste = new DesgastePicoPiedra(durabilidadInicial,fuerzaInicial) ;

        desgaste.desgastar();

        Assert.assertTrue("Se redujo durabilidad: ",durabilidadInicial > desgaste.obtenerDurabilidad());

    }

    @Test
    public void reducirDesgastePicoPiedraEnMitadUnidadesDeFuerza(){
        int durabilidadInicial = 200 ;
        int fuerzaInicial = 4 ;

        DesgastePicoPiedra desgaste = new DesgastePicoPiedra(durabilidadInicial,fuerzaInicial) ;

        desgaste.desgastar();

        int reduccionDurabilidad = (int) (fuerzaInicial /1.5);
        Assert.assertEquals((durabilidadInicial - reduccionDurabilidad), desgaste.obtenerDurabilidad());

    }

    @Test
    public void desgastarHastaLlegarQueDurabilidadSeaCero(){
        int durabilidadInicial = 200 ;
        int fuerzaInicial = 4 ;

        DesgastePicoPiedra desgaste = new DesgastePicoPiedra(durabilidadInicial,fuerzaInicial) ;

        while (desgaste.obtenerDurabilidad() > 0 ){
            desgaste.desgastar();
        }

        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

    }

    @Test(expected = HerramientaRotaException.class)
    public void lanzarExcepcionAlQuererDesgastarDurabilidadEnCero(){
        int durabilidadInicial = 200 ;
        int fuerzaInicial = 4 ;

        DesgastePicoPiedra desgaste = new DesgastePicoPiedra(durabilidadInicial,fuerzaInicial) ;

        while (desgaste.obtenerDurabilidad() > 0 ){
            desgaste.desgastar();
        }

        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

        desgaste.desgastar();

        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

    }

}
