package fiuba.algo3.minecraft.modelo.desgaste;

import org.junit.Assert;
import org.junit.Test;

public class DesgasteEstaticoTest {

    @Test
    public void crearDesgastePicoMetal(){
        int durabilidadInicial = 400 ;
        int fuerzaInicial = 12 ;
        DesgasteEstatico desgaste = new DesgasteEstatico(durabilidadInicial,fuerzaInicial) ;

        Assert.assertEquals(durabilidadInicial, desgaste.obtenerDurabilidad());
        Assert.assertEquals(fuerzaInicial, desgaste.obtenerFuerza());
    }

    @Test
    public void reducirDesgastePicoMetalAlDesgastarse(){
        int durabilidadInicial = 400 ;
        int fuerzaInicial = 12 ;

        DesgasteEstatico desgaste = new DesgasteEstatico(durabilidadInicial,fuerzaInicial) ;

        desgaste.desgastar();

        Assert.assertTrue("Se redujo durabilidad: ",durabilidadInicial > desgaste.obtenerDurabilidad());

    }

    @Test
    public void desgastarHastaLlegarQueDurabilidadSeaCero(){
        int durabilidadInicial = 400 ;
        int fuerzaInicial = 12 ;

        DesgasteEstatico desgaste = new DesgasteEstatico(durabilidadInicial,fuerzaInicial) ;

        for(int i = 0 ;i < 10 ; i++){
            desgaste.desgastar();
        }
        
        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

    }

    @Test(expected = NoSePuedeUsarException.class)
    public void lanzarExcepcionAlQuererDesgastarDurabilidadEnCero(){
        int durabilidadInicial = 400 ;
        int fuerzaInicial = 12 ;

        DesgasteEstatico desgaste = new DesgasteEstatico(durabilidadInicial,fuerzaInicial) ;

        for(int i = 0 ;i < 10 ; i++){
            desgaste.desgastar();
        }

        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

        desgaste.desgastar();

        Assert.assertEquals(0, desgaste.obtenerDurabilidad());

    }

}
