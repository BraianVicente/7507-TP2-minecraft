package fiuba.algo3.minecraft.controller;

import fiuba.algo3.minecraft.modelo.jugador.Elemento;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Material;
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

    private double invLimiteSup = 634.0 ;
    private double invLimiteInf = 694.0 ;
    private double invLimiteIzq = 127.0 ;
    private double invLimiteDer = 727.0 ;

    private double mesaLimiteSup = 27.0 ;
    private double mesaLimiteInf = 117.0 ;
    private double mesaLimiteIzq = 13.0 ;
    private double mesaLimiteDer = 103.0 ;

    private boolean sePosicionoEnInventario(MouseEvent event){
        double x = event.getSceneX();
        double y = event.getSceneY();

        if ((y >= invLimiteSup && y <= invLimiteInf) &&
                (x >= invLimiteIzq && x <= invLimiteDer) )
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
            if (sePosicionoEnInventario(event)){
                int posX =  (int) (event.getSceneX() - invLimiteIzq) / 30 ;
                int posY =  (int) (event.getSceneY() - invLimiteSup) / 30 ;
                if (tableroDelJuego.obtenerJugador().obtenerInventario().cantidadElementos() > (posY * 20) + posX ) {
                    Posicion posicion = new Posicion(posY,posX) ;
                    pressed = posicion ;
                    System.out.println(posicion);
                }
            }
        }

        if (event.getEventType().equals(MouseEvent.MOUSE_RELEASED)){
            System.out.println("FIN X"+event.getSceneX());
            System.out.println("FIN Y"+event.getSceneY());
            if (sePosicionoEnMesaDeTrabajo(event)){
                System.out.println("Se Posiciono en Mesa DeTrabajo");

                int posX = (int) (event.getSceneX() - mesaLimiteIzq) / 30 ;
                int posY = (int) (event.getSceneY() - mesaLimiteSup) / 30 ;
                Posicion posicion = new Posicion(posY,posX) ;
                released = posicion ;
                int eleX = pressed.obtenerX();
                int eleY = pressed.obtenerY();
                Elemento elemento =  tableroDelJuego.obtenerJugador().obtenerInventario().obtenerElementoEnPosicion((eleX * 20) + eleY );
                if (elemento instanceof Material){
                    tableroDelJuego.obtenerJugador().insertarMaterialEnMesaDeTrabajo(released,(Material) elemento);
                    tableroDelJuego.seActualizo();
                }
            }
        }
    }


}
