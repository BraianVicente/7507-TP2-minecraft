package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.controller.*;
import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Controles {

    private MovimientoEventHandler buttonController ;

    public VBox obtenerControles(TableroDelJuego tableroDelJuego){

        MesaDeTrabajoVista mesaDeTrabajoVista = new MesaDeTrabajoVista(tableroDelJuego);

        VBox contenedorDeMesaDeTrabajo = mesaDeTrabajoVista.obtenerMesa();

        HBox contenedorDeControlesDeMovimiento = obtenerControlesDeMovimento(tableroDelJuego);

        VBox contenedor = new VBox(contenedorDeMesaDeTrabajo, contenedorDeControlesDeMovimiento);
        contenedor.setAlignment(Pos.CENTER);
        contenedor.setSpacing(450);


        return contenedor;
    }

    public HBox obtenerControlesDeMovimento( TableroDelJuego tableroDelJuego){
        Button flechaArriba = new ButtonUp(tableroDelJuego);

        Button flechaAbajo = new ButtonDown(tableroDelJuego);

        Button flechaIzquierda = new ButtonLeft(tableroDelJuego);

        Button flechaDerecha = new ButtonRight(tableroDelJuego);

        HBox contenedorHorizontal = new HBox(flechaIzquierda, flechaAbajo, flechaDerecha);
        contenedorHorizontal.setSpacing(5);

        VBox contenedorVertical = new VBox(flechaArriba, contenedorHorizontal);
        contenedorVertical.setSpacing(5);
        contenedorVertical.setAlignment(Pos.BOTTOM_CENTER);

        HBox contenedorDeControlesDeMovimiento = new HBox(contenedorVertical);

        return contenedorDeControlesDeMovimiento;
    }
}