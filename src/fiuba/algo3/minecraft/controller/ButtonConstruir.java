package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.mesadetrabajo.MesaDeTrabajo;
import javafx.scene.control.Button;

public class ButtonConstruir extends Button {

    private MesaDeTrabajo mesaDeTrabajo;

    public ButtonConstruir (MesaDeTrabajo mesaDeTrabajo){
        super.setText("Construir");
        this.mesaDeTrabajo = mesaDeTrabajo ;

        setOnAction( event -> mesaDeTrabajo.construir()) ;

    }
}
