package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.controller.InsertarMaterialEventHandler;
import fiuba.algo3.minecraft.controller.MovimientoEventHandler;
import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class JuegoVista  {

    private final Stage escenario;
    private AlgoCraft aplicacion;
    private Controles controles;
    private BarraDeMenu menuBar;


    public JuegoVista(AlgoCraft aplicacion, Stage escenario){

        this.escenario = escenario;
        this.aplicacion = aplicacion;
        this.controles = new Controles();
        this.menuBar = new BarraDeMenu();
    }

    public void iniciar(String nombreJugador){
        Jugador jugador = new Jugador(nombreJugador) ;

        TableroDelJuego tableroDelJuego = new TableroDelJuego(jugador);

        VistaTableroJuego matrizDeBotones = new VistaTableroJuego(tableroDelJuego);

        BorderPane borderPane = new BorderPane();

        GridPane mapa = new VistaTableroJuego(tableroDelJuego);

        VBox contenedorDeControles = controles.obtenerControles(tableroDelJuego);

        HBox contenedorHorizontal = new HBox(contenedorDeControles, mapa);

        borderPane.setTop(menuBar.obtenerBarraDeMenu());

        borderPane.setCenter(contenedorHorizontal);

        Scene escenaJuego = new Scene(borderPane);

        escenaJuego.setOnKeyTyped(new MovimientoEventHandler(tableroDelJuego));
        escenaJuego.setOnMouseDragged(new InsertarMaterialEventHandler(tableroDelJuego));
        escenaJuego.setOnMousePressed(new InsertarMaterialEventHandler(tableroDelJuego));
        escenaJuego.setOnMouseReleased(new InsertarMaterialEventHandler(tableroDelJuego));

        this.escenario.setScene(escenaJuego);

        this.escenario.show();
    }

}
