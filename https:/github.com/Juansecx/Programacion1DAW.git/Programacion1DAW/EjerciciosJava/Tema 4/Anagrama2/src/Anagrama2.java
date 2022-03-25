import java.util.Scanner;

public class Anagrama2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("");
		System.out.print("INTRODUZCA UNA PALABRA ALA AZAR: ");
		String palabra1 = sn.nextLine();
		for (int i = 0; i < 10; i++) {
			System.out.println("");
		}

		String anagrama = anagramaAzar(palabra1);
		System.out.println("El anagrama es " + anagrama);
		String adivina;
		System.out.println("");
		System.out.println("Adivina la palabra: ");
		adivina = sn.nextLine();

		if (palabra1.equalsIgnoreCase(adivina)) {

			System.out.println("¡Has acertado");
		} else {
			System.out.print("Vuelva a introducir la contraseña: " + adivina);
		}
		
	
		

	}

	public static String anagramaAzar(String palabra1) {

		char[] nuevo = palabra1.toCharArray();

		for (int i = 0; i < nuevo.length; i++) {

			int alea = (int) (Math.random() * nuevo.length);
			int alea2 = (int) (Math.random() * nuevo.length);
			char aux = nuevo[alea];
			nuevo[alea] = nuevo[alea2];
			nuevo[alea2] = aux;

		}
		return new String(nuevo);

	}
}
