package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.juego.Juego;
import javafx.stage.Stage;

public class JuegoVista {

    private final Stage escenario;
    private AlgoCraft aplicacion;


    public JuegoVista(AlgoCraft aplicacion, Stage escenario){

        this.escenario = escenario;
        this.aplicacion = aplicacion;
    }

    public void iniciar(String nombreJugador){
        Juego juego = new Juego(nombreJugador);
    }
}
