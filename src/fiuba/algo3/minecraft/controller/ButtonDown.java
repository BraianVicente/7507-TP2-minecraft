package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.scene.control.Button;

public class ButtonDown extends Button {

    private final TableroDelJuego tableroDelJuego;

    public ButtonDown(TableroDelJuego tableroDelJuego){
        super("Down");
        this.tableroDelJuego = tableroDelJuego ;
        setOnAction( event -> this.tableroDelJuego.moverJugadorHaciaAbajo());
    }


}
