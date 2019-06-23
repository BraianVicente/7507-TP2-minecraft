package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.mesadetrabajo.MesaDeTrabajo;
import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.scene.control.Button;

public class ButtonLimpiar extends Button {

    private MesaDeTrabajo mesaDeTrabajo;

    public ButtonLimpiar (MesaDeTrabajo mesaDeTrabajo){
        this.mesaDeTrabajo = mesaDeTrabajo ;
        setOnAction( event -> {mesaDeTrabajo.limpliarMesaDeTrabajo();});
    }

}