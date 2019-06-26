package fiuba.algo3.minecraft.vista.botones;

import fiuba.algo3.minecraft.controller.MoverJugadorHaciaIzquierda;
import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.scene.control.Button;

public class ButtonLeft extends Button {

    public ButtonLeft(TableroDelJuego tableroDelJuego){
        super("<-");
        setOnAction( new MoverJugadorHaciaIzquierda(tableroDelJuego));
    }

}
