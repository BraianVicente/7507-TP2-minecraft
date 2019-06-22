package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.scene.control.Button;

public class ButtonLeft extends Button {

    private final TableroDelJuego tableroDelJuego;

    public ButtonLeft(TableroDelJuego tableroDelJuego){
        super("<-");
        this.tableroDelJuego = tableroDelJuego ;
        setOnAction( event -> this.tableroDelJuego.moverJugadorHaciaIzquierda());
    }


}
