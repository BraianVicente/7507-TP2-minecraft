package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.jugador.Elemento;
import fiuba.algo3.minecraft.modelo.jugador.Inventario;
import fiuba.algo3.minecraft.vista.images.Imagenes;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.util.Observable;
import java.util.Observer;

public class VistaInventario extends GridPane implements Observer {

    private final Inventario inventario;
    private Imagenes imagenes ;

    public VistaInventario(Inventario inventario ){
        super();
        super.setStyle("-fx-grid-lines-visible: true");
        imagenes = new Imagenes();
        this.inicializarInventario();
        this.inventario = inventario ;
        this.pintarInventario() ;
        this.inventario.addObserver(this);

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

    private void pintarInventario(){
        int cantidadElementos = inventario.cantidadElementos();
        Node imageContainer ;
        Elemento elemento = null;
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 20; j++){
                if (cantidadElementos > ((i*20) + j)){
                    elemento = inventario.obtenerElementoEnPosicion((i*20) + j );
                }
                imageContainer = imagenes.setImageNode(elemento) ;
                super.add(imageContainer,j,i);
                elemento = null ;
            }
        }
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {

        this.pintarInventario();
        super.setMinSize(600,60);
        super.setStyle("-fx-grid-lines-visible: true");
    }
}
