package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class HerramientaActivaJugadorVBox extends VBox {

    public GridPane herramienta ;

    public HerramientaActivaJugadorVBox(TableroDelJuego tableroDelJuego){
        super();
        herramienta = new GridPane();
        herramienta.setStyle("-fx-grid-lines-visible: true");
        Imagenes imagenes = new Imagenes() ;
        ImageView imageContainer = new ImageView(imagenes.empty) ;
        imageContainer.setFitWidth(100);
        imageContainer.setFitHeight(100);

        herramienta.add(imageContainer,0,0);

        imageContainer = new ImageView(imagenes.empty) ;
        imageContainer.setFitWidth(100);
        imageContainer.setFitHeight(100);

        herramienta.add(imageContainer,0,0);
        herramienta.setAlignment(Pos.CENTER);


        Button quitar = new Button("Quitar") ;

        super.getChildren().add(herramienta) ;
        super.getChildren().add(quitar) ;

        super.setAlignment(Pos.TOP_CENTER);



    }


}
