import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		System.out.println("");
		System.out.print("INTRODUZCA UNA PALABRA ALA AZAR: ");
		String palabra1 = sn.nextLine();
		System.out.print("INTRODUZCA LA SIGUIENTE PALABRA: ");
		String palabra2 = sn.nextLine();
		System.out.println("");

		

		if (palabra1.length() != palabra2.length()) {
			
			System.out.println("Palabras no son anagramas");
			
		}else {
			
			char[] hola = palabra1.toCharArray();
			char[] hola2 = palabra2.toCharArray();
			Arrays.sort(hola);
			Arrays.sort(hola2);
			
			if ( Arrays.equals(hola,hola2)            ) {
				
				System.out.println("Palabras son anagramas");
			}
			else {
				System.out.println("No son anagramas");
			}
				
			
		}

	}

}
