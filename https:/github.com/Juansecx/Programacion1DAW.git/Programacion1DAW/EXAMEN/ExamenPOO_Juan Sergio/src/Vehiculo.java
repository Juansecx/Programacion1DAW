
public class Vehiculo {
	private String marca;
	private String matricula;
	private int numKm;
	private Fecha Fmatriculacion;
	private String descripcion;
	private double precio;
	private String nPropietario;
	private String dniPropietario;
	
	
	
	
	//constructor sin parametros
	public Vehiculo() {
		
	}

	
	









	//constructor con parametros

	public Vehiculo(String marca, String matricula, int numKm, Fecha fmatriculacion, String descripcion, double precio,
			String nPropietario, String dniPropietario) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.numKm = numKm;
		Fmatriculacion = fmatriculacion;
		this.descripcion = descripcion;
		this.precio = precio;
		this.nPropietario = nPropietario;
		this.dniPropietario = dniPropietario;
	}

	
	//constructor copia
	
	public Vehiculo(Vehiculo c) {
		this.marca=c.marca;
		this.matricula = c.matricula;
		this.numKm = c.numKm;
		Fmatriculacion =c.Fmatriculacion;
		this.precio =c.precio;
		this.nPropietario =c.nPropietario;
		this.dniPropietario =c.dniPropietario;
		this.descripcion=c.descripcion;
	}



	public String getDescripcion() {
		return descripcion;
	}












	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}












	//get y setter
	public String getMarca() {
		return marca;
	}





	public void setMarca(String marca) {
		this.marca = marca;
	}





	public String getMatricula() {
		return matricula;
	}





	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}





	public int getNumKm() {
		return numKm;
	}





	public void setNumKm(int numKm) {
		this.numKm = numKm;
	}





	public Fecha getFmatriculacion() {
		return Fmatriculacion;
	}





	public void setFmatriculacion(Fecha fmatriculacion) {
		Fmatriculacion = fmatriculacion;
	}





	public double getPrecio() {
		return precio;
	}





	public void setPrecio(double precio) {
		this.precio = precio;
	}





	public String getnPropietario() {
		return nPropietario;
	}





	public void setnPropietario(String nPropietario) {
		this.nPropietario = nPropietario;
	}





	public String getDniPropietario() {
		return dniPropietario;
	}





	public void setDniPropietario(String dniPropietario) {
		this.dniPropietario = dniPropietario;
	}
	
	//metodo getAnio()
	
	public int getAnios(int anio) {
		
		return anio;
	}
	
	
	











	
	public String toString1 () {
		
		return "Matricula: " + matricula ;
	}












	public String toString2() {
		return "NPropietario: " + nPropietario;
	}












	public String toString () {
		return "Número de Kilómetros: " + numKm;
	}
	
	
	
	
}
