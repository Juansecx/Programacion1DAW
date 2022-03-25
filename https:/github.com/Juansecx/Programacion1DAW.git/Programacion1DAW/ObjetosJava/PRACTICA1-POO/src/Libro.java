
public class Libro {

	private String libro;
	private String autor;
	private int numEjem;
	private int numEjemPrest;

	// CONSTRUCTOR SIN PARÁMETROS

	public Libro() {

	}

	// CONSTRUCTOR CON PARAMETROS

	public Libro(String libro, String autor, int numEjem, int numEjemPrest) {
		super();
		this.libro = libro;
		this.autor = autor;
		this.numEjem = numEjem;
		this.numEjemPrest = numEjemPrest;
	}

	// get libro
	public String getLibro() {
		return libro;
	}

	// set libro
	public void setLibro(String libro) {
		this.libro = libro;
	}

	// get autor
	public String getAutor() {
		return autor;
	}

	// set autor
	public void setAutor(String autor) {
		this.autor = autor;
	}

	// getnumEjem
	public int getNumEjem() {
		return numEjem;
	}

	// setnumEjem
	public void setNumEjem(int numEjem) {
		this.numEjem = numEjem;
	}

	// getnumEjemPrest
	public int getNumEjemPrest() {
		return numEjemPrest;
	}

	// setnumEjemPrest
	public void setNumEjemPrest(int numEjemPrest) {
		this.numEjemPrest = numEjemPrest;
	}
	
	

	@Override
	public String toString() {
		return "\nLibro: " + libro + "\nautor: " + autor + "\nnumEjem: " + numEjem + "\nnumEjemPrest: " + numEjemPrest;
				
	}

	public boolean Prestamo() {

		if (numEjem - numEjemPrest <= 0) {

			return false;

		} else {
			numEjemPrest += 1;
			return true;
		}

	}

	public boolean Devolucion() {

		if (numEjemPrest>numEjem) {
			
			return false;
			
		} else {
			numEjemPrest-=1;
			return true;
		}

	}
}
