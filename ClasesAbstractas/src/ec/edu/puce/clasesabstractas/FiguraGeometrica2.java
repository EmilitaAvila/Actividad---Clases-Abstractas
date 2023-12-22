package ec.edu.puce.clasesabstractas;

public abstract class FiguraGeometrica2 {
	private String nombre;
	

	abstract public double calcularArea();
	
	public FiguraGeometrica2(String nombre) {
		this.nombre = nombre;
	}
	
	
	public boolean mayorQue(FiguraGeometrica2 figura2) {
		return this.calcularArea()> figura2.calcularArea();
	}
	
	public String toString() {
		return this.nombre +  " con area " + this.calcularArea();
	}
}
	

