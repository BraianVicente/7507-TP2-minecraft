package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.herramienta.Hacha;
import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;
import fiuba.algo3.minecraft.modelo.herramienta.Pico;
import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class HerramientaActivaJugadorVBox extends VBox {

    public GridPane herramienta;

    public HerramientaActivaJugadorVBox(TableroDelJuego tableroDelJuego) {
        super();

        Jugador jugador = tableroDelJuego.obtenerJugador();
        Herramienta herramientaActiva = jugador.obtenerHerramientaActiva();

        herramienta = new GridPane();
        herramienta.setStyle("-fx-grid-lines-visible: true");

        Imagenes imagenes = new Imagenes();
        ImageView imageContainer = setImage(herramientaActiva);
        imageContainer.setFitWidth(100);
        imageContainer.setFitHeight(100);

        herramienta.add(imageContainer, 0, 0);

        herramienta.setAlignment(Pos.CENTER);

        Button quitar = new Button("Quitar");

        super.getChildren().add(herramienta);
        super.getChildren().add(quitar);

        super.setAlignment(Pos.TOP_CENTER);


    }

    public ImageView setImage(Herramienta herramienta) {

        Imagenes imagenes = new Imagenes();

        if (herramienta.obtenerMaterialConstruccion() instanceof Madera) {
            if (herramienta instanceof Hacha) {
                return new ImageView(imagenes.axe_wood);
            }
            if (herramienta instanceof Pico) {
                return new ImageView(imagenes.pickaxe_wood);
            }
        }
        if (herramienta.obtenerMaterialConstruccion() instanceof Piedra) {
            if (herramienta instanceof Hacha) {
                return new ImageView(imagenes.axe_stone);
            }
            if (herramienta instanceof Pico) {
                return new ImageView(imagenes.pickaxe_stone);
            }
        }
        if (herramienta.obtenerMaterialConstruccion() instanceof Metal) {
            if (herramienta instanceof Hacha) {
                return new ImageView(imagenes.axe_iron);
            }
            if (herramienta instanceof Pico) {
                return new ImageView(imagenes.pickaxe_iron);
            }
        }
        if (herramienta.obtenerMaterialConstruccion() instanceof Diamante) {
            return new ImageView(imagenes.pickaxe_diamond);
        }
        return new ImageView(imagenes.empty);
    }

}

