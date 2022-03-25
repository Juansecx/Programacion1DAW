package invertir;

public class InvertirCadena {
	
	
	private String cadena;
	
	
	public InvertirCadena(String cadena) {
		super();
		this.cadena = cadena;
	}


	public String invertir() {
        String resultado = "";
        for (int i = cadena.length() -1; i >= 0; i--) {
            resultado += cadena.charAt(i);
        }
        return resultado;
    }
}