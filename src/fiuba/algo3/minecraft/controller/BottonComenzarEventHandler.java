package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class BottonComenzarEventHandler implements EventHandler<ActionEvent> {

    private TextField textField;
    private Label label;
    private Jugador jugador;

    public BottonComenzarEventHandler(TextField textField, Label label, Jugador jugador) {
        this.textField = textField;
        this.label = label;
        this.jugador = jugador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        if (this.textField.getText().trim().equals("")) {

            this.label.setText("Debe ingresar un texto");
            this.label.setTextFill(Color.web("#FF0000"));

        } else {

            this.jugador.establecerNombre(this.textField.getText());
            this.label.setText("Comenzando...");
            this.label.setTextFill(Color.web("#66FF00"));
        }
    }
}
