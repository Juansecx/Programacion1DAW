
public class Empleado {

	private String nif;
	private String nombre;
	private double sueldoBase;
	private int hExtras;
	private int irpf;
	private String casado;
	private int numHijos;
	static double imhExtras;

	public Empleado() {

	}

	public Empleado(String nif, String nombre, int sueldoBase, int hExtras, int irpf, String casado, int numHijos) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.hExtras = hExtras;
		this.irpf = irpf;
		this.casado = casado;
		this.numHijos = numHijos;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int gethExtras() {
		return hExtras;
	}

	public void sethExtras(int hExtras) {
		this.hExtras = hExtras;
	}

	public int getIrpf() {
		return irpf;
	}

	public void setIrpf(int irpf) {
		this.irpf = irpf;
	}

	public String getCasado() {
		return casado;
	}

	public void setCasado(String casado) {
		this.casado = casado;
	}

	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	public static double getImhExtras() {
		return imhExtras;
	}

	// METODO COMPLEMENTO

	public static void setImhExtras(double imhExtras) {
		Empleado.imhExtras = imhExtras;
	}

	public double calculoComplemento() {
		double result = hExtras * imhExtras;
		return result;
	}

	// METODO SUELDO BRUTO

	public double calculoBruto() {
		return sueldoBase + calculoComplemento();
	}

	public double calculoIRPF() {

		double resultado = irpf;

		if (casado == "S") {

			resultado = resultado - 2;
		}

		resultado = resultado - numHijos;

		return resultado;

	}

	public static void burbuja(int[] Empleado) {
		int i, j, aux;
		for (i = 0; i < Empleado.length - 1; i++) {
			for (j = 0; j < Empleado.length - i - 1; j++) {
				if (Empleado[j + 1] < Empleado[j]) {
					aux = Empleado[j + 1];
					Empleado[j + 1] = Empleado[j];
					Empleado[j] = aux;
				}

			}
		}
	}

	@Override
	public String toString() {
		return "Nif = " + nif + "\nNombre = " + nombre + "\nsueldoBase = " + sueldoBase + "\nhExtras=" + hExtras
				+ "\nirpf=" + irpf + "\ncasado=" + casado + "\nnumHijos = " + numHijos;
	}

}
