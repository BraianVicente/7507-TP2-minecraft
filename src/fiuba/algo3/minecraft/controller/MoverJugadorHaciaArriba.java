package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MoverJugadorHaciaArriba implements EventHandler<ActionEvent> {

    private TableroDelJuego tableroDelJuego;

    public MoverJugadorHaciaArriba(TableroDelJuego tableroDelJuego){
        this.tableroDelJuego = tableroDelJuego;
    }

    /**
     * Invoked when a specific event of the type for which this handler is
     * registered happens.
     *
     * @param event the event which occurred
     */
    @Override
    public void handle(ActionEvent event) {
        tableroDelJuego.moverJugadorHaciaArriba() ;
    }
}
