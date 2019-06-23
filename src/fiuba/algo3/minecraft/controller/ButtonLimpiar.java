package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.mesadetrabajo.MesaDeTrabajo;
import javafx.scene.control.Button;

public class ButtonLimpiar extends Button {

    private MesaDeTrabajo mesaDeTrabajo;

    public ButtonLimpiar (MesaDeTrabajo mesaDeTrabajo){
        this.setText("Limpiar");
        this.mesaDeTrabajo = mesaDeTrabajo ;
        setOnAction( event -> mesaDeTrabajo.limpiarMesaDeTrabajo());
    }

}