package ejercicio3;

public class Comercial extends Empleados {
	
	
	protected Double comision;
	
	
	public Comercial() {
		
	}

	public Comercial(String nombre, int edad, double salario, Double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	public Double getComision() {
		return comision;
	}

	public void setZona(Double comision) {
		this.comision = comision;
	}
	

	@Override
	public String toString() {
		return super.toString()+"\nComision: " + comision+"\n";
	}
	
	public double Plus() {

		if (edad > 30 && comision > 200) {

			salario = salario + Plus;

		}

		return salario;
	}
	

}
