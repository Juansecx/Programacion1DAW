import java.util.Scanner;

public class codificdor_relacion6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		System.out.println(" ");
		System.out.print("INTRODUZCA UNA FRASE: ");
		String frase = sn.nextLine();
		String resultado = frase.toLowerCase();
		String codificada = codificaCadena(conjunto1,conjunto2,frase);
		System.out.println("");
		System.out.println("La cadena codificada quedaría: "+codificada);
	}
	

	public static char codifica(char[] conjunto1, char[] conjunto2, char c) {
	        char resultado = Character.toLowerCase(c);
	        for (int i = 0; i < conjunto1.length; i++) {
	            if (resultado == conjunto1[i]) {
	                resultado = conjunto2[i];

	    
	            }
	        }
			return resultado;
	    
	    }
	 public static String codificaCadena(char[] conjunto1, char[] conjunto2,
	            String cadena) {
	        String codificada = "";
	        for (int i = 0; i < cadena.length(); i++) {
	            codificada += codifica(conjunto1, conjunto2, cadena.charAt(i));
	        }
	        return codificada;
	    }
	}





