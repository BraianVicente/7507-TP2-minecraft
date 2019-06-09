package fiuba.algo3.minecraft.modelo.constructor;

import fiuba.algo3.minecraft.modelo.herramienta.HachaDeMadera;
import fiuba.algo3.minecraft.modelo.herramienta.HachaDeMetal;
import fiuba.algo3.minecraft.modelo.herramienta.HachaDePiedra;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;

public class CostructorDeHacha extends Constructor {

    public HachaDeMadera construirHacha(Madera madera1, Madera madera2, Madera madera3, Madera madera4, Madera madera5) {
        HachaDeMadera hacha = new HachaDeMadera();
        return hacha;
    }

    public HachaDePiedra construirHacha(Piedra piedra1, Piedra piedra2, Piedra piedra3, Piedra piedra4, Piedra piedra5) {
        HachaDePiedra hacha = new HachaDePiedra();
        return hacha;
    }

    public HachaDeMetal construirHacha(Metal metal1, Metal metal2, Metal metal3, Metal metal4, Metal metal5) {
        HachaDeMetal hacha = new HachaDeMetal();
        return hacha;
    }
}
