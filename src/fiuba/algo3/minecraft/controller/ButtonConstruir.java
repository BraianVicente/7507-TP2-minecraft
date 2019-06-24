package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.mesadetrabajo.MesaDeTrabajo;
import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.scene.control.Button;

public class ButtonConstruir extends Button {

    private TableroDelJuego tableroDelJuego;

    public ButtonConstruir (TableroDelJuego tableroDelJuego){
        super.setText("Construir");
        this.tableroDelJuego = tableroDelJuego ;

        setOnAction( event -> tableroDelJuego.obtenerJugador().construirHerramienta()) ;

    }
}
