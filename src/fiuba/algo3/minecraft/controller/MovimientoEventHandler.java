package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.tablero.Tablero;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;

public class MovimientoEventHandler implements EventHandler<KeyEvent> {


    private final Button buttonUp;
    private final Button buttonDown;
    private final Button buttonLeft;
    private final Button buttonRight;
    private final Tablero tablero;

    /**
     * Invoked when a specific event of the type for which this handler is
     * registered happens.
     *
     * @param buttonLeft the event which occurred
     */

    public MovimientoEventHandler(Button buttonUp,
                                  Button buttonDown ,
                                  Button buttonLeft ,
                                  Button buttonRight,
                                  Tablero tablero){
        this.buttonUp = buttonUp ;
        this.buttonDown = buttonDown ;
        this.buttonLeft = buttonLeft ;
        this.buttonRight = buttonRight ;
        this.tablero= tablero ;
    }

    @Override
    public void handle(KeyEvent event) {

        if (event.getCode() == KeyCode.UP) {
            tablero.moverJugadorHaciaArriba();
        }
        if (event.getCode() == KeyCode.DOWN) {
            tablero.moverJugadorHaciaAbajo();
        }
        if (event.getCode() == KeyCode.LEFT) {
            tablero.moverJugadorHaciaIzquierda();
        }
        if (event.getCode() == KeyCode.RIGHT) {
            tablero.moverJugadorHaciaDerecha();
        }



    }
}
