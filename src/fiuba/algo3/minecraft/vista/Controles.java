package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import fiuba.algo3.minecraft.vista.botones.ButtonDown;
import fiuba.algo3.minecraft.vista.botones.ButtonLeft;
import fiuba.algo3.minecraft.vista.botones.ButtonRight;
import fiuba.algo3.minecraft.vista.botones.ButtonUp;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Controles {

    public VBox obtenerControles(TableroDelJuego tableroDelJuego){

        VBox mesaDeTrabajoVista = new MesaDeTrabajoVista(tableroDelJuego);

        HBox contenedorDeControlesDeMovimiento = obtenerControlesDeMovimento(tableroDelJuego);

        VBox herramientaActiva = new HerramientaActivaJugadorVBox(tableroDelJuego) ;

        VBox contenedor = new VBox();
        contenedor.getChildren().add(mesaDeTrabajoVista) ;
        contenedor.getChildren().add(herramientaActiva) ;
        contenedor.getChildren().add(contenedorDeControlesDeMovimiento) ;

        contenedor.setAlignment(Pos.TOP_CENTER);
        contenedor.setSpacing(100);

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