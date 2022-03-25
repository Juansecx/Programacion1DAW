
public class Pizza {

	private String tamaño;
	private String tipo;
	private String estado;
	static int TotalPedidas;
	static int TotalServidas;

	public Pizza() {
		TotalPedidas++;
	}

	public Pizza(String tamaño, String tipo) {
		super();
		this.tamaño = tamaño;
		this.tipo = tipo;
		estado = "pedido";
		TotalPedidas++;
	}

	public Pizza(final Pizza c) {

		tipo = c.tipo;
		tamaño = c.tamaño;

	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {

		this.tamaño = tamaño;
	}

	public String GetTipo() {
		return tipo;
	}

	public void SetTipo(String tipo) {

		this.tipo = tipo;
	}

	public static int getTotalPedidas() {
		return TotalPedidas;
	}

	public static int getTotalServidas() {
		return TotalServidas;
	}

	@Override
	public String toString() {

		return "Pizza " + tipo + " " + tamaño + "," + estado;
	}

	public void Sirve() {

		if (estado.equals("servida")) {

			System.out.println("No se puede servir una pizza que ya ha sido previamente servida");
		}

		if (estado.equals("pedido")) {
			estado = "servida";
			TotalServidas++;
		}

	}

}