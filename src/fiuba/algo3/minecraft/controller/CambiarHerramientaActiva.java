package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CambiarHerramientaActiva implements EventHandler<ActionEvent> {

    private Jugador jugador;

    public CambiarHerramientaActiva(Jugador jugador){
        this.jugador = jugador;
    }

    /**
     * Invoked when a specific event of the type for which this handler is
     * registered happens.
     *
     * @param event the event which occurred
     */
    @Override
    public void handle(ActionEvent event) {
        jugador.cambiarHerramientaActiva() ;
    }
}
