package fiuba.algo3.minecraft.vista.botones;

import fiuba.algo3.minecraft.controller.MoverJugadorHaciaArriba;
import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.scene.control.Button;

public class ButtonUp extends Button {

    public ButtonUp(TableroDelJuego tableroDelJuego){
        super("Up");
        setOnAction( new MoverJugadorHaciaArriba(tableroDelJuego));
    }

}
