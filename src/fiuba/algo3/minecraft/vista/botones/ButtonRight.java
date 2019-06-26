package fiuba.algo3.minecraft.vista.botones;

import fiuba.algo3.minecraft.controller.MoverJugadorHaciaDerecha;
import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.scene.control.Button;

public class ButtonRight extends Button {

    public ButtonRight(TableroDelJuego tableroDelJuego){
        super("->");
        setOnAction( new MoverJugadorHaciaDerecha(tableroDelJuego));
    }

}
