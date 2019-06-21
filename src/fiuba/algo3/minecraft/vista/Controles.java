package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.controller.MovimientoEventHandler;
import fiuba.algo3.minecraft.modelo.juego.Juego;
import fiuba.algo3.minecraft.modelo.tablero.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;

import java.awt.*;

public class Controles {

    MovimientoEventHandler buttonController ;

    public VBox obtenerControles(Juego juego){

        MesaDeTrabajoVista mesaDeTrabajoVista = new MesaDeTrabajoVista(juego);

        VBox contenedorDeMesaDeTrabajo = mesaDeTrabajoVista.obtenerMesa();

        HBox contenedorDeControlesDeMovimiento = obtenerControlesDeMovimento(juego.obtenerTablero());

        VBox contenedor = new VBox(contenedorDeMesaDeTrabajo, contenedorDeControlesDeMovimiento);
        contenedor.setAlignment(Pos.CENTER);
        contenedor.setSpacing(450);


        return contenedor;
    }

    public HBox obtenerControlesDeMovimento( Tablero tablero){
        Button flechaArriba = new Button();
        flechaArriba.setText("Up");
        flechaArriba.setOnAction(
                event -> tablero.moverJugadorHaciaArriba()
        );

        Button flechaAbajo = new Button();
        flechaAbajo.setText("Down");

        Button flechaIzquierda = new Button();
        flechaIzquierda.setText("<-");

        Button flechaDerecha = new Button();
        flechaDerecha.setText("->");

        HBox contenedorHorizontal = new HBox(flechaIzquierda, flechaAbajo, flechaDerecha);
        contenedorHorizontal.setSpacing(5);

        VBox contenedorVertical = new VBox(flechaArriba, contenedorHorizontal);
        contenedorVertical.setSpacing(5);
        contenedorVertical.setAlignment(Pos.BOTTOM_CENTER);

        HBox contenedorDeControlesDeMovimiento = new HBox(contenedorVertical);

        return contenedorDeControlesDeMovimiento;
    }
}