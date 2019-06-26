package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MoverJugadorHaciaDerecha implements EventHandler<ActionEvent> {
    private final TableroDelJuego tablero;

    public MoverJugadorHaciaDerecha(TableroDelJuego tableroDelJuego) {
        tablero = tableroDelJuego;
    }

    /**
     * Invoked when a specific event of the type for which this handler is
     * registered happens.
     *
     * @param event the event which occurred
     */
    @Override
    public void handle(ActionEvent event) {
        tablero.moverJugadorHaciaDerecha();
    }
}
