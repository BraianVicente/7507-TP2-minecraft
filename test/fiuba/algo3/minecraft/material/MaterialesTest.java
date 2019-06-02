package fiuba.algo3.minecraft.material;

import fiuba.algo3.Herramientas.HachaDeMadera;
import fiuba.algo3.Herramientas.HachaDeMetal;
import fiuba.algo3.Herramientas.PicoDeMadera;
import fiuba.algo3.Herramientas.PicoDeMetal;
import fiuba.algo3.material.Diamante;
import fiuba.algo3.material.Madera;
import fiuba.algo3.material.Metal;
import fiuba.algo3.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class MaterialesTest {

    @Test
    public void crearMaderaConDurabilidad(){
        Madera material = new Madera() ;

        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(10, durabilidad);
    }

    @Test
    public void crearPiedraConDurabilidad(){
        Piedra material = new Piedra();

        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(30,durabilidad);
    }

    @Test
    public void crearMetalConDurabilidad(){
        Metal material = new Metal();

        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(50,durabilidad);
    }

    @Test
    public void crearDiamanteConDurabilidad(){
        Diamante material = new Diamante();

        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(100,durabilidad);
    }


    @Test
    public void desgastarMaderaConHachaMadera(){
        HachaDeMadera herramienta = new HachaDeMadera() ;
        Madera material = new Madera();

        material.desgastar(herramienta);
        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(8,durabilidad);

    }

    @Test
    public void desgastarMaderaConHachaMetal(){
        HachaDeMetal herramienta = new HachaDeMetal() ;
        Madera material = new Madera();

        material.desgastar(herramienta);
        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(0,durabilidad);

    }

    @Test
    public void desgastarMaderaConPicoMetal(){
        PicoDeMetal herramienta = new PicoDeMetal() ;
        Madera material = new Madera();

        material.desgastar(herramienta);
        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(-2,durabilidad);

    }

    @Test
    public void desgastarMaderaConPicoMadera(){
        PicoDeMadera herramienta = new PicoDeMadera() ;
        Madera material = new Madera();

        material.desgastar(herramienta);
        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(8,durabilidad);

    }

    @Test
    public void desgastarMetalConHachaMadera(){
        HachaDeMadera herramienta = new HachaDeMadera() ;
        Metal material = new Metal();

        material.desgastar(herramienta);
        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(48,durabilidad);

    }

    @Test
    public void desgastarMetalConHachaMetal(){
        HachaDeMetal herramienta = new HachaDeMetal() ;
        Metal material = new Metal();

        material.desgastar(herramienta);
        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(40,durabilidad);

    }

    @Test
    public void desgastarMetalConPicoMetal(){
        PicoDeMetal herramienta = new PicoDeMetal() ;
        Metal material = new Metal();

        material.desgastar(herramienta);
        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(38,durabilidad);

    }

    @Test
    public void desgastarMetalConPicoMadera(){
        PicoDeMadera herramienta = new PicoDeMadera() ;
        Metal material = new Metal();

        material.desgastar(herramienta);
        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(48,durabilidad);

    }

    @Test
    public void desgastarPiedraConHachaMadera(){
        HachaDeMadera herramienta = new HachaDeMadera() ;
        Piedra material = new Piedra();

        material.desgastar(herramienta);
        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(28,durabilidad);

    }

    @Test
    public void desgastarPiedraConHachaMetal(){
        HachaDeMetal herramienta = new HachaDeMetal() ;
        Piedra material = new Piedra();

        material.desgastar(herramienta);
        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(20,durabilidad);

    }

    @Test
    public void desgastarPiedraConPicoMetal(){
        PicoDeMetal herramienta = new PicoDeMetal() ;
        Piedra material = new Piedra();

        material.desgastar(herramienta);
        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(18,durabilidad);

    }

    @Test
    public void desgastarPiedraConPicoMadera(){
        PicoDeMadera herramienta = new PicoDeMadera() ;
        Piedra material = new Piedra();

        material.desgastar(herramienta);
        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(28,durabilidad);

    }

    @Test
    public void desgastarDiamanteConHachaMadera(){
        HachaDeMadera herramienta = new HachaDeMadera() ;
        Diamante material = new Diamante();

        material.desgastar(herramienta);
        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(98,durabilidad);

    }

    @Test
    public void desgastarDiamanteConHachaMetal(){
        HachaDeMetal herramienta = new HachaDeMetal() ;
        Diamante material = new Diamante();

        material.desgastar(herramienta);
        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(90,durabilidad);

    }

    @Test
    public void desgastarDiamanteConPicoMetal(){
        PicoDeMetal herramienta = new PicoDeMetal() ;
        Diamante material = new Diamante();

        material.desgastar(herramienta);
        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(88,durabilidad);

    }

    @Test
    public void desgastarDiamanteConPicoMadera(){
        PicoDeMadera herramienta = new PicoDeMadera() ;
        Diamante material = new Diamante();

        material.desgastar(herramienta);
        int durabilidad = material.obtenerDurabilidad();

        Assert.assertEquals(98,durabilidad);

    }
}
