package fiuba.algo3.minecraft.vista.botones;

import fiuba.algo3.minecraft.controller.ConstruirHerramienta;
import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import javafx.scene.control.Button;

public class ButtonConstruir extends Button {

    public ButtonConstruir (Jugador jugador){
        super("Construir");
        setOnAction( new ConstruirHerramienta(jugador)) ;

    }
}
