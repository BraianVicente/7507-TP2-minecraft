package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.vista.JuegoVista;
import fiuba.algo3.minecraft.vista.AlgoCraft;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BottonComenzarEventHandler implements EventHandler<ActionEvent> {

    private final AlgoCraft aplicacion;
    private final Stage escenario;
    private TextField textField;
    private Label label;

    public BottonComenzarEventHandler(TextField textField, Label label,
                                      AlgoCraft aplicacion, Stage escenario) {
        this.aplicacion = aplicacion;
        this.escenario = escenario;
        this.textField = textField;
        this.label = label;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        if (this.textField.getText().trim().equals("")) {

            this.label.setText("Debe ingresar un texto");
            this.label.setTextFill(Color.web("#FF0000"));

        } else {

            this.label.setText("Comenzando...");
            this.label.setTextFill(Color.web("#66FF00"));
            JuegoVista juegoVista = new JuegoVista(this.aplicacion, this.escenario);
            juegoVista.iniciar(this.textField.getText());


        }
    }
}
