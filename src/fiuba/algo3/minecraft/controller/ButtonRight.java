package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.scene.control.Button;

public class ButtonRight extends Button {

    private final TableroDelJuego tableroDelJuego;

    public ButtonRight(TableroDelJuego tableroDelJuego){
        super("->");
        this.tableroDelJuego = tableroDelJuego ;
        setOnAction( event -> this.tableroDelJuego.moverJugadorHaciaDerecha());
    }


}
