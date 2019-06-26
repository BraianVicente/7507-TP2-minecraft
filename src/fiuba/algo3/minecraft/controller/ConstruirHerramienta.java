package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ConstruirHerramienta implements EventHandler<ActionEvent> {
    private final Jugador jugador;

    public ConstruirHerramienta(Jugador jugador) {
        this.jugador = jugador ;
    }

    /**
     * Invoked when a specific event of the type for which this handler is
     * registered happens.
     *
     * @param event the event which occurred
     */
    @Override
    public void handle(ActionEvent event) {
        jugador.construirHerramienta();
    }
}
