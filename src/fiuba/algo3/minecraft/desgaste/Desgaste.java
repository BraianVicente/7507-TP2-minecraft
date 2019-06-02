package fiuba.algo3.minecraft.desgaste;

public abstract class Desgaste {
	protected final int fuerza ;
	protected int durabilidad ;
	
	public Desgaste(int durabilidad,int fuerza){
		this.fuerza = fuerza ;
		this.durabilidad = durabilidad ;
	}

	public int obtenerFuerza(){
		return fuerza ;
	}

	public int obtenerDurabilidad(){
		return durabilidad ;
	}

	public abstract void desgastar();

}
