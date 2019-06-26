package fiuba.algo3.minecraft.vista.botones;

import fiuba.algo3.minecraft.controller.CambiarHerramientaActiva;
import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import javafx.scene.control.Button;

public class ButtonCambiarHerramientaActiva extends Button {

    public ButtonCambiarHerramientaActiva (Jugador jugador){
        super("Cambiar Herramienta");
        setOnAction(new CambiarHerramientaActiva(jugador));
    }

}