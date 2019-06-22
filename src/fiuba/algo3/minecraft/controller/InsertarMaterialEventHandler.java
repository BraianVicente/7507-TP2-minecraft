package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class InsertarMaterialEventHandler implements EventHandler<MouseEvent> {

    public static Posicion pressed ;
    public static Posicion released;
    public TableroDelJuego tableroDelJuego ;

    public InsertarMaterialEventHandler(TableroDelJuego tableroDelJuego) {
        this.tableroDelJuego = tableroDelJuego ;
    }

    private double mapaLimiteSup = 25.0 ;
    private double mapaLimiteInf = 625.0 ;
    private double mapaLimiteIzq = 116.0 ;
    private double mapaLimiteDer = 716.0 ;

    private double mesaLimiteSup = 25 ;
    private double mesaLimiteInf = 115 ;
    private double mesaLimiteIzq = 14 ;
    private double mesaLimiteDer = 104 ;

    private boolean sePosicionoEnMapa(MouseEvent event){
        double x = event.getSceneX();
        double y = event.getSceneY();

        if ((y >= mapaLimiteSup && y <= mapaLimiteInf) &&
                (x >= mapaLimiteIzq && x <= mapaLimiteDer) )
            return true;

        return false ;
    }

    private boolean sePosicionoEnMesaDeTrabajo(MouseEvent event) {
        double x = event.getSceneX();
        double y = event.getSceneY();

        if ((y >= mesaLimiteSup && y <= mesaLimiteInf) &&
                (x >= mesaLimiteIzq && x <= mesaLimiteDer) )
            return true;

        return false ;
    }
    @Override
    public void handle(MouseEvent event) {
        if (event.getEventType().equals(MouseEvent.MOUSE_PRESSED)){
            System.out.println("INI X"+event.getSceneX());
            System.out.println("INI Y"+event.getSceneY());
            if (sePosicionoEnMapa(event)){
                int posX =  (int) (event.getSceneX() - 116) / 30 ;
                int posY =  (int) (event.getSceneY() - 25) / 30 ;
                Posicion posicion = new Posicion(posY,posX) ;
                pressed = posicion ;
                System.out.println(tableroDelJuego.obtenerElementoEnPosicion(posicion).toString());
            }
        }

        if (event.getEventType().equals(MouseEvent.MOUSE_RELEASED)){
            System.out.println("FIN X"+event.getSceneX());
            System.out.println("FIN Y"+event.getSceneY());
            if (sePosicionoEnMesaDeTrabajo(event)){
                System.out.println("Se Posiciono en Mesa DeTrabajo");

                int posX = (int) (event.getSceneX() - 14) / 30 ;
                int posY = (int) (event.getSceneY() - 25) / 30 ;
                Posicion posicion = new Posicion(posY,posX) ;
                released = posicion ;
                Posicionable material =  tableroDelJuego.obtenerElementoEnPosicion(pressed);
                tableroDelJuego.obtenerJugador().insertarMaterialEnMesaDeTrabajo(released,material);
                tableroDelJuego.obtenerMapa().eliminarElemento(pressed);
                tableroDelJuego.seActualizo();
            }
        }
    }


}
