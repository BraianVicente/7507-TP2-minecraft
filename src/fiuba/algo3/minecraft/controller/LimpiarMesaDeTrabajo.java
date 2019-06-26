package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.mesadetrabajo.MesaDeTrabajo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class LimpiarMesaDeTrabajo implements EventHandler<ActionEvent> {

    private final MesaDeTrabajo mesaDeTrabajo;

    public LimpiarMesaDeTrabajo(MesaDeTrabajo mesaDeTrabajo) {
        this.mesaDeTrabajo = mesaDeTrabajo ;
    }

    /**
     * Invoked when a specific event of the type for which this handler is
     * registered happens.
     *
     * @param event the event which occurred
     */
    @Override
    public void handle(ActionEvent event) {
        mesaDeTrabajo.limpiarMesaDeTrabajo();
    }
}
