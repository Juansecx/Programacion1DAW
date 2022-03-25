package ejercicio2;

public abstract class Poligono {
	
	protected int numeroLados;
	
	
	public Poligono(int numeroLados) {
		this.numeroLados = numeroLados;
	}
	
	public int getnumeroLados() {
		return numeroLados;
	}
	
	
	
	@Override
	public String toString() {
		return "Número Lados: " +numeroLados;
	}
	
	
	public abstract double area();
	

	
	
	
	
	
}
