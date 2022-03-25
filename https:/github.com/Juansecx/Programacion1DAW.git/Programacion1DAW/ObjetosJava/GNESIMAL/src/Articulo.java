
public class Articulo {
	
	private String codigo= " ";
	
	private String descripcion;
	
	private int precioC;
	
	private int precioV;
	
	private static int stock=0;
	
	
	public Articulo() {
		
	}
	
	

	public Articulo(String codigo, String descripcion, int precioC, int precioV) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioC = precioC;
		this.precioV = precioV;
	}



	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	

	public int getPrecioC() {
		return precioC;
	}



	public void setPrecioC(int precioC) {
		this.precioC = precioC;
	}



	public int getPrecioV() {
		return precioV;
	}



	public void setPrecioV(int precioV) {
		this.precioV = precioV;
	}



	public static int getStock() {
		return stock;
	}

	public static void setStock(int stock) {
		Articulo.stock = stock;
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo + "descripcion: " + descripcion + "precioC: " + precioC + " precioV: "
				+ precioV ;
	}
	
	

	
	
	
	
	
}
