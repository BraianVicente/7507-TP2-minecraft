package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.HachaDeMadera;
import fiuba.algo3.minecraft.modelo.herramienta.HachaDePiedra;
import fiuba.algo3.minecraft.modelo.herramienta.HachaDeMetal;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;

public abstract class Constructor {

    public abstract HachaDeMadera construirHacha(Madera madera1, Madera madera2, Madera madera3, Madera madera4, Madera madera5);
    public abstract HachaDePiedra construirHacha(Piedra piedra1, Piedra piedra2, Piedra piedra3, Piedra piedra4, Piedra piedra5);
    public abstract HachaDeMetal construirHacha(Metal metal1, Metal metal2, Metal metal3, Metal metal4, Metal metal5);

}
