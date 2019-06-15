package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.*;

public class ConstructorDeHerramienta {

    private

        ConstructorHachaDeMadera constructorHachaDeMadera;
        ConstructorHachaDePiedra constructorHachaDePiedra;
        ConstructorHachaDeMetal constructorHachaDeMetal;
        ConstructorPicoDeMadera constructorPicoDeMadera;
        ConstructorPicoDePiedra constructorPicoDePiedra;
        ConstructorPicoDeMetal constructorPicoDeMetal;
        ConstructorPicoFino constructorPicoFino;


    public

/***********************************************/

    ConstructorDeHerramienta ()
        {
            this.constructorHachaDeMadera = new ConstructorHachaDeMadera();
            this.constructorHachaDePiedra = new ConstructorHachaDePiedra();
            this.constructorHachaDeMetal = new ConstructorHachaDeMetal();
            this.constructorPicoDeMadera = new ConstructorPicoDeMadera();
            this.constructorPicoDePiedra = new ConstructorPicoDePiedra();
            this.constructorPicoDeMetal = new ConstructorPicoDeMetal();
            this.constructorPicoFino = new ConstructorPicoFino();
        }

/***********************************************/

   HachaDeMadera construirHachaDeMadera (Mesada mesaConMaterialesDispuestos)
        {
            return  constructorHachaDeMadera.construirHachaDeMadera (mesaConMaterialesDispuestos);
        }

/***********************************************/

    HachaDePiedra construirHachaDePiedra (Mesada mesaConMaterialesDispuestos)
        {
            return  constructorHachaDePiedra.construirHachaDePiedra (mesaConMaterialesDispuestos);
        }

/***********************************************/

    HachaDeMetal construirHachaDeMetal (Mesada mesaConMaterialesDispuestos)
        {
            return constructorHachaDeMetal.construirHachaDeMetal(mesaConMaterialesDispuestos);
        }

/***********************************************/

    PicoDeMadera construirPicoDeMadera (Mesada mesaConMaterialesDispuestos)
        {
            return  constructorPicoDeMadera.construirPicoDeMadera(mesaConMaterialesDispuestos);
        }

/***********************************************/

    PicoDePiedra construirPicoDePiedra (Mesada mesaConMaterialesDispuestos)
        {
            return constructorPicoDePiedra.construirPicoDePiedra(mesaConMaterialesDispuestos);
        }

/***********************************************/

    PicoDeMetal construirPicoDeMetal (Mesada mesaConMaterialesDispuestos)
        {
            return  constructorPicoDeMetal.construirPicoDeMetal(mesaConMaterialesDispuestos);
        }


/***********************************************/

    PicoFino construirPicoFino (Mesada mesaConMaterialesDispuestos)
        {
            return constructorPicoFino.construirPicoFino(mesaConMaterialesDispuestos);
        }

/***********************************************/

/***********************************************/

}
