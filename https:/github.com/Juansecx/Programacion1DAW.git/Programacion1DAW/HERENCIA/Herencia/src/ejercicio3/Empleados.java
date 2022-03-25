package ejercicio3;

public abstract class Empleados {

	protected String nombre;
	protected int edad;
	protected double salario;
	protected static int Plus = 300;
	
	
	public Empleados() {
		
	}

	public Empleados(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static int getPlus() {
		return Plus;
	}

	public static void setPlus(int plus) {
		Plus = plus;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre +  "\nEdad: " + edad + "\nsalario: " + salario;
	}
	
	

}
