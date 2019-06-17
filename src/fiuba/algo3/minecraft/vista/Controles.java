package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.juego.Juego;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Controles {

    public VBox obtenerControles(Juego juego){

<<<<<<< HEAD
        Button flechaArriba = new Button("Arriba");

        Button flechaAbajo = new Button("Abajo");

        Button flechaIzquierda = new Button("Izquierda");

        Button flechaDerecha = new Button("Derecha");
=======
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
>>>>>>> fac814faee19ff545687f52e76654310c02a8581

        HBox contenedorHorizontal = new HBox(flechaIzquierda, flechaAbajo, flechaDerecha);
        contenedorHorizontal.setSpacing(5);

        VBox contenedorVertical = new VBox(flechaArriba, contenedorHorizontal);
        contenedorVertical.setSpacing(5);
        contenedorVertical.setAlignment(Pos.BOTTOM_CENTER);

        HBox contenedorDeControlesDeMovimiento = new HBox(contenedorVertical);

        return contenedorDeControlesDeMovimiento;
    }
}
