package fiuba.algo3.minecraft.vista.botones;

import fiuba.algo3.minecraft.controller.MoverJugadorHaciaAbajo;
import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.scene.control.Button;

public class ButtonDown extends Button {

    public ButtonDown(TableroDelJuego tableroDelJuego){
        super("Down");
        setOnAction( new MoverJugadorHaciaAbajo(tableroDelJuego));
    }

}
