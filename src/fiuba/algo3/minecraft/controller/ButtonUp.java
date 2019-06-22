package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.scene.control.Button;

public class ButtonUp extends Button {

    private final TableroDelJuego tableroDelJuego;

    public ButtonUp(TableroDelJuego tableroDelJuego){
        super("Up");
        this.tableroDelJuego = tableroDelJuego ;
        setOnAction( event -> this.tableroDelJuego.moverJugadorHaciaArriba());
    }


}
