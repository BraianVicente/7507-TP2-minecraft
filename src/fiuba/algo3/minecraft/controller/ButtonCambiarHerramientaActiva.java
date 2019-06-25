package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.mesadetrabajo.MesaDeTrabajo;
import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.scene.control.Button;

public class ButtonCambiarHerramientaActiva extends Button {

    private TableroDelJuego tableroDelJuego;

    public ButtonCambiarHerramientaActiva (TableroDelJuego tableroDelJuego){
        super.setText("Cambiar Herramienta");
        this.tableroDelJuego = tableroDelJuego ;
        setOnAction( event -> tableroDelJuego.obtenerJugador().cambiarHerramientaActiva());
    }

}