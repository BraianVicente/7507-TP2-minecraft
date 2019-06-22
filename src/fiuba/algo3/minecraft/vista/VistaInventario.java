package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.jugador.Inventario;
import fiuba.algo3.minecraft.vista.images.Imagenes;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;

public class VistaInventario extends GridPane {

    private final Inventario inventario;
    private Imagenes imagenes ;

    public VistaInventario(Inventario inventario ){
        super();
        super.setStyle("-fx-grid-lines-visible: true");
        imagenes = new Imagenes();
        this.inicializarInventario();
        this.inventario = inventario ;
    }
    public void inicializarInventario(){
        super.setMinSize(600,60);
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 20; j++){
                Node imageContainer = new ImageView(imagenes.empty) ;
                super.add(imageContainer,j,i);

            }
        }
    }

}
