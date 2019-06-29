package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.juego.InicializadorJuego;
import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import fiuba.algo3.minecraft.vista.JuegoVista;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BottonComenzarEventHandler implements EventHandler<ActionEvent> {

    private final Stage escenario;
    private TextField textField;
    private Label label;

    public BottonComenzarEventHandler(TextField textField, Label label, Stage escenario) {
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
            InicializadorJuego inicializadorJuego = InicializadorJuego.getInstance() ;
            TableroDelJuego juego = inicializadorJuego.crearJuego(textField.getText());
            new JuegoVista(escenario,juego);


        }
    }
}
