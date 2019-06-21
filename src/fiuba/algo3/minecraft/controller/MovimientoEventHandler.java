package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class MovimientoEventHandler implements EventHandler<KeyEvent> {


    private Button buttonUp;
    private Button buttonDown;
    private Button buttonLeft;
    private Button buttonRight;
    private TableroDelJuego tableroDelJuego;

    /**
     * Invoked when a specific event of the type for which this handler is
     * registered happens.
     *
     * @param buttonLeft the event which occurred
     */
    public MovimientoEventHandler(TableroDelJuego tableroDelJuego){
        this.tableroDelJuego = tableroDelJuego;
    }

    public MovimientoEventHandler(Button buttonUp,
                                  Button buttonDown ,
                                  Button buttonLeft ,
                                  Button buttonRight,
                                  TableroDelJuego tableroDelJuego){
        this.buttonUp = buttonUp ;
        this.buttonDown = buttonDown ;
        this.buttonLeft = buttonLeft ;
        this.buttonRight = buttonRight ;
        this.tableroDelJuego = tableroDelJuego;
    }

    @Override
    public void handle(KeyEvent event) {

        if (event.getCode() == KeyCode.UP) {
            tableroDelJuego.moverJugadorHaciaArriba();
        }
        if (event.getCode() == KeyCode.DOWN) {
            tableroDelJuego.moverJugadorHaciaAbajo();
        }
        if (event.getCode() == KeyCode.LEFT) {
            tableroDelJuego.moverJugadorHaciaIzquierda();
        }
        if (event.getCode() == KeyCode.RIGHT) {
            tableroDelJuego.moverJugadorHaciaDerecha();
        }



    }
}
