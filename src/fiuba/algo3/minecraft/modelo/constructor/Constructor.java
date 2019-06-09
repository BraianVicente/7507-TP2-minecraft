package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.*;
import fiuba.algo3.minecraft.modelo.jugador.Elemento;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Material;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;

public class Constructor {

    public Material [][] mesaDeTrabajo = new Material[3][3];

    public void colocarMaterialEnMesaDeTrabajo(Material material, int posicionEjeX, int posicionEjeY){
        mesaDeTrabajo [posicionEjeX][posicionEjeY] = material;
    }

    public Material obtenerMaterialEnPosicionDeLaMesaDeTrabajo(int posicionEjeX, int posicionEjeY){
        return mesaDeTrabajo[posicionEjeX][posicionEjeY];
    }

    public HachaDeMadera construirHacha(Madera madera1, Madera madera2, Madera madera3, Madera madera4, Madera madera5) {
        HachaDeMadera hacha = new HachaDeMadera();
        return hacha;
    }

    public HachaDePiedra construirHacha(Piedra piedra1, Piedra piedra2, Piedra piedra3, Piedra piedra4, Piedra piedra5) {
        HachaDePiedra hacha = new HachaDePiedra();
        return hacha;
    }

    public HachaDeMetal construirHacha(Metal metal1, Metal metal2, Metal metal3, Metal metal4, Metal metal5) {
        HachaDeMetal hacha = new HachaDeMetal();
        return hacha;
    }

    public PicoDeMadera construirPico(Madera madera1, Madera madera2, Madera madera3, Madera madera4, Madera madera5) {
        PicoDeMadera pico = new PicoDeMadera();
        return pico;
    }

    public PicoDePiedra construirPico(Piedra piedra1, Piedra piedra2, Piedra piedra3, Piedra piedra4, Piedra piedra5) {
        PicoDePiedra pico = new PicoDePiedra();
        return pico;
    }

    public PicoDeMetal construirPico(Metal metal1, Metal metal2, Metal metal3, Metal metal4, Metal metal5) {
        PicoDeMetal pico = new PicoDeMetal();
        return pico;
    }

    public PicoFino construirPico(Metal metal1, Metal metal2, Metal metal3, Piedra piedra1, Madera madera1, Madera madera2){
        PicoFino pico = new PicoFino();
        return pico;
    }

}
