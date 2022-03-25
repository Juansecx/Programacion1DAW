package ejercicio3;

public class Repartidor extends Empleados {

	protected String zona;
	
	
	public Repartidor() {
		
	}

	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	public String getZona() {
		return zona;
	}

	public void setComision(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return super.toString() + "\nZona: " + zona;
	}

	public double Plus(int edad, double salario, String zona) {

		if (edad < 25 && zona.equals("zona 3")) {
			
			salario=salario+Plus;

		}
		return salario;
	}

}
