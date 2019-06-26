package fiuba.algo3.minecraft.vista.botones;

import fiuba.algo3.minecraft.controller.LimpiarMesaDeTrabajo;
import fiuba.algo3.minecraft.modelo.mesadetrabajo.MesaDeTrabajo;
import javafx.scene.control.Button;

public class ButtonLimpiar extends Button {

    public ButtonLimpiar (MesaDeTrabajo mesaDeTrabajo){
        super("Limpiar");
        setOnAction( new LimpiarMesaDeTrabajo(mesaDeTrabajo));
    }

}