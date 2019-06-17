package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.juego.Juego;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;

import java.awt.*;

public class Controles {

    public VBox obtenerControles(Juego juego){

        MesaDeTrabajoVista mesaDeTrabajoVista = new MesaDeTrabajoVista(juego);

        VBox contenedorDeMesaDeTrabajo = mesaDeTrabajoVista.obtenerMesa();

        HBox contenedorDeControlesDeMovimiento = obtenerControlesDeMovimento();

        VBox contenedor = new VBox(contenedorDeMesaDeTrabajo, contenedorDeControlesDeMovimiento);
        contenedor.setAlignment(Pos.CENTER);
        contenedor.setSpacing(450);


        return contenedor;
    }

    public HBox obtenerControlesDeMovimento(){
        Button flechaArriba = new Button();
        flechaArriba.setText("Up");

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
