
public class Cuenta {

	private String nombre;
	private String num_cuenta;
	private double tipo_interes;
	private double saldo;

	// constructor sin parámetro

	public Cuenta() {

	}

	// constructor con parámetros

	public Cuenta(String nombre, String num_cuenta, double tipo_interes, double saldo) {
		this.nombre = nombre;
		this.num_cuenta = num_cuenta;
		this.tipo_interes = tipo_interes;
		this.saldo = saldo;
	}

	// setter
	public void establece_nombre(String nombre_cliente) {
		nombre = nombre_cliente;
	}

	// getter
	public String dimeNombre() {
		return nombre;
	}

	// setter
	public void setNum_cuenta(String cuenta) {
		num_cuenta = cuenta;
	}

	// getter
	public String getNum_cuenta() {
		return num_cuenta;
	}

	// setter
	public void setTipo_interes(double interes) {
		tipo_interes = interes;
	}

	// getter
	public double getTipo_interes() {
		return tipo_interes;
	}

	// setter
	public void setSaldo(double s) {
		saldo = s;
	}

	// getter
	public double getSaldo() {
		return saldo;
	}

	public boolean Ingresos(double ingreso) {

		saldo = saldo + ingreso;
		if (saldo < 0) {

			saldo = saldo - ingreso;
			return false;

		} else {
			return true;
		}

	}
	
	public boolean Reintegro(double reintegro) {
		
		saldo=saldo-reintegro;
		if (saldo<reintegro  ) {
			saldo=saldo+reintegro;
			return false;
		}else {
			return true;
		}
		
	
		
		
	}

}