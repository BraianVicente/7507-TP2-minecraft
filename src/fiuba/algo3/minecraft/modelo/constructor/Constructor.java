package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.*;
import fiuba.algo3.minecraft.modelo.material.*;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Constructor {

    private String [][] mesaDeTrabajo = new String[3][3];

    private String [][] matrizHachaDeMadera = new String[3][3];
    private String [][] matrizHachaDeMetal = new String[3][3];
    private String [][] matrizHachaDePiedra = new String[3][3];

    private String [][] matrizPicoDeMadera = new String[3][3];
    private String [][] matrizPicoDeMetal = new String[3][3];
    private String [][] matrizPicoDePiedra = new String[3][3];
    private String [][] matrizPicoFino = new String[3][3];

    public Constructor(){

        mesaDeTrabajo [0][0] = "";
        mesaDeTrabajo [0][1] = "";
        mesaDeTrabajo [0][2] = "";
        mesaDeTrabajo [1][0] = "";
        mesaDeTrabajo [1][1] = "";
        mesaDeTrabajo [1][2] = "";
        mesaDeTrabajo [2][0] = "";
        mesaDeTrabajo [2][1] = "";
        mesaDeTrabajo [2][2] = "";

        matrizHachaDeMadera [0][0] = "Ma";
        matrizHachaDeMadera [0][1] = "Ma";
        matrizHachaDeMadera [0][2] = "";
        matrizHachaDeMadera [1][0] = "Ma";
        matrizHachaDeMadera [1][1] = "Ma";
        matrizHachaDeMadera [1][2] = "Ma";
        matrizHachaDeMadera [2][0] = "";
        matrizHachaDeMadera [2][1] = "";
        matrizHachaDeMadera [2][2] = "";

        matrizHachaDeMetal [0][0] = "Me";
        matrizHachaDeMetal [0][1] = "Me";
        matrizHachaDeMetal [0][2] = "";
        matrizHachaDeMetal [1][0] = "Me";
        matrizHachaDeMetal [1][1] = "Ma";
        matrizHachaDeMetal [1][2] = "Ma";
        matrizHachaDeMetal [2][0] = "";
        matrizHachaDeMetal [2][1] = "";
        matrizHachaDeMetal [2][2] = "";

        matrizHachaDePiedra [0][0] = "P";
        matrizHachaDePiedra [0][1] = "P";
        matrizHachaDePiedra [0][2] = "";
        matrizHachaDePiedra [1][0] = "P";
        matrizHachaDePiedra [1][1] = "Ma";
        matrizHachaDePiedra [1][2] = "Ma";
        matrizHachaDePiedra [2][0] = "";
        matrizHachaDePiedra [2][1] = "";
        matrizHachaDePiedra [2][2] = "";

        matrizPicoDeMadera [0][0] = "Ma";
        matrizPicoDeMadera [0][1] = "";
        matrizPicoDeMadera [0][2] = "";
        matrizPicoDeMadera [1][0] = "Ma";
        matrizPicoDeMadera [1][1] = "Ma";
        matrizPicoDeMadera [1][2] = "Ma";
        matrizPicoDeMadera [2][0] = "Ma";
        matrizPicoDeMadera [2][1] = "";
        matrizPicoDeMadera [2][2] = "";

        matrizPicoDeMetal [0][0] = "Me";
        matrizPicoDeMetal [0][1] = "";
        matrizPicoDeMetal [0][2] = "";
        matrizPicoDeMetal [1][0] = "Me";
        matrizPicoDeMetal [1][1] = "Ma";
        matrizPicoDeMetal [1][2] = "Ma";
        matrizPicoDeMetal [2][0] = "Me";
        matrizPicoDeMetal [2][1] = "";
        matrizPicoDeMetal [2][2] = "";

        matrizPicoDePiedra [0][0] = "P";
        matrizPicoDePiedra [0][1] = "";
        matrizPicoDePiedra [0][2] = "";
        matrizPicoDePiedra [1][0] = "P";
        matrizPicoDePiedra [1][1] = "Ma";
        matrizPicoDePiedra [1][2] = "Ma";
        matrizPicoDePiedra [2][0] = "P";
        matrizPicoDePiedra [2][1] = "";
        matrizPicoDePiedra [2][2] = "";

        matrizPicoFino [0][0] = "Me";
        matrizPicoFino [0][1] = "P";
        matrizPicoFino [0][2] = "";
        matrizPicoFino [1][0] = "Me";
        matrizPicoFino [1][1] = "Ma";
        matrizPicoFino [1][2] = "Ma";
        matrizPicoFino [2][0] = "Me";
        matrizPicoFino [2][1] = "";
        matrizPicoFino [2][2] = "";

    }

    public void colocarMaterialEnMesaDeTrabajo(Material material, int posicionEjeX, int posicionEjeY){
        mesaDeTrabajo[posicionEjeX][posicionEjeY] = material.obtenerAbreviatura();
    }

    public String obtenerMaterialEnPosicionDeLaMesaDeTrabajo(int posicionEjeX, int posicionEjeY){
        return mesaDeTrabajo[posicionEjeX][posicionEjeY];
    }

    public void reestablecerMesaDeTrabajo(){
        mesaDeTrabajo [0][0] = "";
        mesaDeTrabajo [0][1] = "";
        mesaDeTrabajo [0][2] = "";
        mesaDeTrabajo [1][0] = "";
        mesaDeTrabajo [1][1] = "";
        mesaDeTrabajo [1][2] = "";
        mesaDeTrabajo [2][0] = "";
        mesaDeTrabajo [2][1] = "";
        mesaDeTrabajo [2][2] = "";
    }

    public Herramienta construirHachaDeMadera() { ;
        if (Arrays.deepEquals(mesaDeTrabajo, matrizHachaDeMadera) == true) {
            HachaDeMadera hacha = new HachaDeMadera();
            reestablecerMesaDeTrabajo();
            return hacha;
        } else {
            throw new RuntimeException("Se rompio todo");
        }
    }

    public Herramienta construirHachaDeMetal() { ;
        if (Arrays.deepEquals(mesaDeTrabajo, matrizHachaDeMetal) == true) {
            HachaDeMetal hacha = new HachaDeMetal();
            reestablecerMesaDeTrabajo();
            return hacha;
        } else {
            throw new RuntimeException("Se rompio todo");
        }
    }

    public Herramienta construirHachaDePiedra() { ;
        if (Arrays.deepEquals(mesaDeTrabajo, matrizHachaDePiedra) == true) {
            HachaDePiedra hacha = new HachaDePiedra();
            reestablecerMesaDeTrabajo();
            return hacha;
        } else {
            throw new RuntimeException("Se rompio todo");
        }
    }

    public Herramienta construirPicoDeMadera() { ;
        if (Arrays.deepEquals(mesaDeTrabajo, matrizPicoDeMadera) == true) {
            PicoDeMadera pico = new PicoDeMadera();
            reestablecerMesaDeTrabajo();
            return pico;
        } else {
            throw new RuntimeException("Se rompio todo");
        }
    }

    public Herramienta construirPicoDeMetal() { ;
        if (Arrays.deepEquals(mesaDeTrabajo, matrizPicoDeMetal) == true) {
            PicoDeMetal pico = new PicoDeMetal();
            reestablecerMesaDeTrabajo();
            return pico;
        } else {
            throw new RuntimeException("Se rompio todo");
        }
    }

    public Herramienta construirPicoDePiedra() { ;
        if (Arrays.deepEquals(mesaDeTrabajo, matrizPicoDePiedra) == true) {
            PicoDePiedra pico = new PicoDePiedra();
            reestablecerMesaDeTrabajo();
            return pico;
        } else {
            throw new RuntimeException("Se rompio todo");
        }
    }

    public Herramienta construirPicoFino() { ;
        if (Arrays.deepEquals(mesaDeTrabajo, matrizPicoFino) == true) {
            PicoFino pico = new PicoFino();
            reestablecerMesaDeTrabajo();
            return pico;
        } else {
            throw new RuntimeException("Se rompio todo");
        }
    }

}
