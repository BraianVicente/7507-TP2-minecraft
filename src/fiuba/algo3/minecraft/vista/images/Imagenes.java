package fiuba.algo3.minecraft.vista.images;

import fiuba.algo3.minecraft.modelo.jugador.Elemento;
import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import fiuba.algo3.minecraft.modelo.posicionable.Vacio;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Imagenes {
    private final Integer xLenght = 30;
    private final Integer yLenght = 30 ;
    
    private final String folderURL = "fiuba/algo3/minecraft/vista/images/resource/" ;

    public final Image diamond,grass,iron,steve,stone,wood,empty,
					   axe_wood,axe_stone,axe_iron,pickaxe_wood,pickaxe_stone,pickaxe_iron,pickaxe_diamond;

    public Imagenes() {
        diamond = new Image(folderURL + "diamond.jpeg",xLenght,yLenght,false,false);
        grass = new Image(folderURL + "grass.jpg",xLenght,yLenght,false,false);
        iron = new Image(folderURL + "iron.jpeg",xLenght,yLenght,false,false);
        steve = new Image(folderURL + "steve.jpg",xLenght,yLenght,false,false);
        stone = new Image(folderURL + "stone.jpg",xLenght,yLenght,false,false);
        wood = new Image(folderURL + "wood.jpg",xLenght,yLenght,false,false);
        empty = new Image(folderURL + "empty_field_work_table.jpg",xLenght,yLenght,false,false);
        axe_wood = new Image(folderURL + "tools/axe_wood.png",xLenght,yLenght,false,false);
        axe_stone = new Image(folderURL + "tools/axe_stone.png",xLenght,yLenght,false,false);
        axe_iron = new Image(folderURL + "tools/axe_iron.png",xLenght,yLenght,false,false);
        pickaxe_wood = new Image(folderURL + "tools/pickaxe_wood.png",xLenght,yLenght,false,false);
        pickaxe_stone = new Image(folderURL + "tools/pickaxe_stone.png",xLenght,yLenght,false,false);
        pickaxe_iron = new Image(folderURL + "tools/pickaxe_iron.png",xLenght,yLenght,false,false);
        pickaxe_diamond = new Image(folderURL + "tools/pickaxe_diamond.png",xLenght,yLenght,false,false);
    }


    public Node setImageNode(Posicionable elemento){
        if ( elemento instanceof Jugador){
            return new ImageView(steve) ;
        }
        if (elemento instanceof Vacio){
            return new ImageView(grass) ;
        }
        if (elemento instanceof Diamante){
            return new ImageView(diamond) ;
        }
        if (elemento instanceof Madera){
            return new ImageView(wood) ;
        }
        if (elemento instanceof Piedra){
            return new ImageView(stone) ;
        }
        if (elemento instanceof Metal){
            return new ImageView(iron) ;
        }

        return new ImageView(grass) ;
    }

    public Node setImageNode(Elemento elemento){
        if (elemento instanceof Diamante){
            return new ImageView(diamond) ;
        }

        if (elemento instanceof Madera){
            return new ImageView(wood) ;
        }

        if (elemento instanceof Piedra){
            return new ImageView(stone) ;
        }

        if (elemento instanceof Metal){
            return new ImageView(iron) ;
        }



        return new ImageView(empty) ;
    }

}
