package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.*;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Material;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;

public class Constructor {

    public Material [][] mesaDeTrabajo = new Material[3][3];

    public Material [][] matrizPicoDeMadera = new Material[3][3];

    public Material[][] DistribucionPicoDeMadera(){

        matrizPicoDeMadera [0][0] = new Madera();
        matrizPicoDeMadera [1][0] = new Madera();
        matrizPicoDeMadera [2][0] = new Madera();
        matrizPicoDeMadera [1][1] = new Madera();
        matrizPicoDeMadera [1][2] = new Madera();
        return matrizPicoDeMadera;

    }

    public void colocarMaterialEnMesaDeTrabajo(Material material, int posicionEjeX, int posicionEjeY){
        mesaDeTrabajo [posicionEjeX][posicionEjeY] = material;
    }

    public Material obtenerMaterialEnPosicionDeLaMesaDeTrabajo(int posicionEjeX, int posicionEjeY, Material [][] matriz){
        return matriz[posicionEjeX][posicionEjeY];
    }

    public Herramienta construirPicoDeMadera(Material [][] mesaDeTrabajo) {
        Material[][] distribucionPicoDeMadera = DistribucionPicoDeMadera();
        if (mesaDeTrabajo == distribucionPicoDeMadera) {
            PicoDeMadera pico = new PicoDeMadera();
            return pico;
        } else {
            throw new RuntimeException("Se rompio todo");
        }
    }

}
