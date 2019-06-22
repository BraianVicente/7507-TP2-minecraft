package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;

public class MovimientoEventHandler implements EventHandler<KeyEvent> {

    private TableroDelJuego tableroDelJuego;

    public MovimientoEventHandler(TableroDelJuego tableroDelJuego){
        this.tableroDelJuego = tableroDelJuego;
    }

    @Override
    public void handle(KeyEvent event) {

        System.out.println(event.getCode());

        if (event.getCharacter().equals("w") ) {
            tableroDelJuego.moverJugadorHaciaArriba();
        }
        if (event.getCharacter().equals("s") ) {
            tableroDelJuego.moverJugadorHaciaAbajo();
        }
        if (event.getCharacter().equals("a") ) {
            tableroDelJuego.moverJugadorHaciaIzquierda();
        }
        if (event.getCharacter().equals("d") ) {
            tableroDelJuego.moverJugadorHaciaDerecha();
        }

        System.out.println(tableroDelJuego.jugador.obtenerPosicionActual().obtenerX());
        System.out.println(tableroDelJuego.jugador.obtenerPosicionActual().obtenerY());


    }
}
