package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.*;
import fiuba.algo3.minecraft.modelo.material.*;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import fiuba.algo3.minecraft.modelo.posicionable.Vacio;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Constructor {

    protected Posicionable[][] mesaDeTrabajo;

    private Posicionable [][] matrizHachaDeMadera ;
    private Posicionable [][] matrizHachaDeMetal ;
    private Posicionable [][] matrizHachaDePiedra ;

    private Posicionable [][] matrizPicoDeMadera ;
    private Posicionable [][] matrizPicoDeMetal ;
    private Posicionable [][] matrizPicoDePiedra ;
    private Posicionable [][] matrizPicoFino ;


	public Constructor() {
        mesaDeTrabajo = new Posicionable[3][3];
        this.reestablecerMesaDeTrabajo();
        this.construirMatrizHachaDeMadera();
        this.construirMatrizHachaDeMetal();
        this.construirMatrizHachaDePiedra();
        this.construirMatrizPicoDeMadera();
        this.construirMatrizPicoDeMetal();
        this.construirMatrizPicoDePiedra();
        this.construirMatrizPicoFino();
    }

    private void construirMatrizHachaDeMadera(){
        matrizHachaDeMadera = new Posicionable[3][3];

        matrizHachaDeMadera [0][0] = new Madera();
        matrizHachaDeMadera [0][1] = new Madera();
        matrizHachaDeMadera [0][2] = new Vacio();
        matrizHachaDeMadera [1][0] = new Madera();
        matrizHachaDeMadera [1][1] = new Madera();
        matrizHachaDeMadera [1][2] = new Madera();
        matrizHachaDeMadera [2][0] = new Vacio();
        matrizHachaDeMadera [2][1] = new Vacio();
        matrizHachaDeMadera [2][2] = new Vacio();
    }

    private void construirMatrizHachaDeMetal(){
        matrizHachaDeMetal = new Posicionable[3][3];

        matrizHachaDeMetal [0][0] = new Metal();
        matrizHachaDeMetal [0][1] = new Metal();
        matrizHachaDeMetal [0][2] = new Vacio();
        matrizHachaDeMetal [1][0] = new Metal();
        matrizHachaDeMetal [1][1] = new Madera();
        matrizHachaDeMetal [1][2] = new Madera();
        matrizHachaDeMetal [2][0] = new Vacio();
        matrizHachaDeMetal [2][1] = new Vacio();
        matrizHachaDeMetal [2][2] = new Vacio();
    }

    private void construirMatrizHachaDePiedra(){
        matrizHachaDePiedra = new Posicionable[3][3];

        matrizHachaDePiedra [0][0] = new Piedra();
        matrizHachaDePiedra [0][1] = new Piedra();
        matrizHachaDePiedra [0][2] = new Vacio();
        matrizHachaDePiedra [1][0] = new Piedra();
        matrizHachaDePiedra [1][1] = new Madera();
        matrizHachaDePiedra [1][2] = new Madera();
        matrizHachaDePiedra [2][0] = new Vacio();
        matrizHachaDePiedra [2][1] = new Vacio();
        matrizHachaDePiedra [2][2] = new Vacio();
    }

    private void construirMatrizPicoDeMadera(){
        matrizPicoDeMadera = new Posicionable[3][3];

        matrizPicoDeMadera [0][0] = new Madera();
        matrizPicoDeMadera [0][1] = new Vacio();
        matrizPicoDeMadera [0][2] = new Vacio();
        matrizPicoDeMadera [1][0] = new Madera();
        matrizPicoDeMadera [1][1] = new Madera();
        matrizPicoDeMadera [1][2] = new Madera();
        matrizPicoDeMadera [2][0] = new Madera();
        matrizPicoDeMadera [2][1] = new Vacio();
        matrizPicoDeMadera [2][2] = new Vacio();
    }

    private void construirMatrizPicoDeMetal(){
        matrizPicoDeMetal = new Posicionable[3][3];

        matrizPicoDeMetal [0][0] = new Metal();
        matrizPicoDeMetal [0][1] = new Vacio();
        matrizPicoDeMetal [0][2] = new Vacio();
        matrizPicoDeMetal [1][0] = new Metal();
        matrizPicoDeMetal [1][1] = new Madera();
        matrizPicoDeMetal [1][2] = new Madera();
        matrizPicoDeMetal [2][0] = new Metal();
        matrizPicoDeMetal [2][1] = new Vacio();
        matrizPicoDeMetal [2][2] = new Vacio();
    }

    private void construirMatrizPicoDePiedra(){
        matrizPicoDePiedra = new Posicionable[3][3];

        matrizPicoDePiedra [0][0] = new Piedra();
        matrizPicoDePiedra [0][1] = new Vacio();
        matrizPicoDePiedra [0][2] = new Vacio();
        matrizPicoDePiedra [1][0] = new Piedra();
        matrizPicoDePiedra [1][1] = new Madera();
        matrizPicoDePiedra [1][2] = new Madera();
        matrizPicoDePiedra [2][0] = new Piedra();
        matrizPicoDePiedra [2][1] = new Vacio();
        matrizPicoDePiedra [2][2] = new Vacio();
    }

    private void construirMatrizPicoFino(){
        matrizPicoFino = new Posicionable[3][3];

        matrizPicoFino [0][0] = new Metal();
        matrizPicoFino [0][1] = new Piedra();
        matrizPicoFino [0][2] = new Vacio();
        matrizPicoFino [1][0] = new Metal();
        matrizPicoFino [1][1] = new Madera();
        matrizPicoFino [1][2] = new Madera();
        matrizPicoFino [2][0] = new Metal();
        matrizPicoFino [2][1] = new Vacio();
        matrizPicoFino [2][2] = new Vacio();
    }

    public void colocarMaterialEnMesaDeTrabajo(Material material, int posicionEjeX, int posicionEjeY){
        mesaDeTrabajo[posicionEjeX][posicionEjeY] = material;
    }

    public Posicionable obtenerMaterialEnPosicionDeLaMesaDeTrabajo(int posicionEjeX, int posicionEjeY){
        return mesaDeTrabajo[posicionEjeX][posicionEjeY];
    }

    public void reestablecerMesaDeTrabajo(){
        mesaDeTrabajo [0][0] = new Vacio();
        mesaDeTrabajo [0][1] = new Vacio();
        mesaDeTrabajo [0][2] = new Vacio();
        mesaDeTrabajo [1][0] = new Vacio();
        mesaDeTrabajo [1][1] = new Vacio();
        mesaDeTrabajo [1][2] = new Vacio();
        mesaDeTrabajo [2][0] = new Vacio();
        mesaDeTrabajo [2][1] = new Vacio();
        mesaDeTrabajo [2][2] = new Vacio();
    }

    public boolean mesaDeTrabajoVacia(){
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                Posicionable vacio = new Vacio();
                if (! vacio.equals(mesaDeTrabajo[i][j]) ){
                    return false;
                }
            }
        }
        return true;
    }

    public Herramienta construirHachaDeMadera() { ;
        if (Arrays.deepEquals(mesaDeTrabajo, matrizHachaDeMadera)) {
            HachaDeMadera hacha = new HachaDeMadera();
            reestablecerMesaDeTrabajo();
            return hacha;
        } else {
            throw new RuntimeException("El hacha de madera no fue debidamente diseñada en la mesa de trabajo.");
        }
    }

    public Herramienta construirHachaDeMetal() { ;
        if (Arrays.deepEquals(mesaDeTrabajo, matrizHachaDeMetal) ) {
            HachaDeMetal hacha = new HachaDeMetal();
            reestablecerMesaDeTrabajo();
            return hacha;
        } else {
            throw new RuntimeException("El hacha de metal no fue debidamente diseñado en la mesa de trabajo.");
        }
    }

    public Herramienta construirHachaDePiedra() { ;
        if (Arrays.deepEquals(mesaDeTrabajo, matrizHachaDePiedra)) {
            HachaDePiedra hacha = new HachaDePiedra();
            reestablecerMesaDeTrabajo();
            return hacha;
        } else {
            throw new RuntimeException("El hacha de piedra no fue debidamente diseñado en la mesa de trabajo.");
        }
    }

    public Herramienta construirPicoDeMadera() { ;
        if (Arrays.deepEquals(mesaDeTrabajo, matrizPicoDeMadera) ) {
            PicoDeMadera pico = new PicoDeMadera();
            reestablecerMesaDeTrabajo();
            return pico;
        } else {
            throw new RuntimeException("El pico de madera no fue debidamente diseñaod en la mesa de trabajo.");
        }
    }

    public Herramienta construirPicoDeMetal() { ;
        if (Arrays.deepEquals(mesaDeTrabajo, matrizPicoDeMetal) ) {
            PicoDeMetal pico = new PicoDeMetal();
            reestablecerMesaDeTrabajo();
            return pico;
        } else {
            throw new RuntimeException("El pico de metal no fue debidamente diseñado en la mesa de trabajo");
        }
    }

    public Herramienta construirPicoDePiedra() { ;
        if (Arrays.deepEquals(mesaDeTrabajo, matrizPicoDePiedra)) {
            PicoDePiedra pico = new PicoDePiedra();
            reestablecerMesaDeTrabajo();
            return pico;
        } else {
            throw new RuntimeException("El pico de piedra no fue debidamente diseñado en la mesa de trabajo");
        }
    }

    public Herramienta construirPicoFino() { ;
        if (Arrays.deepEquals(mesaDeTrabajo, matrizPicoFino) ) {
            PicoFino pico = new PicoFino();
            reestablecerMesaDeTrabajo();
            return pico;
        } else {
            throw new RuntimeException("El pico fino no fue debidamente diseñado en la mesa de trabajo");
        }
    }

}
