import java.util.Scanner;

public class ExamenJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("");
		System.out.println("    JUEGO DEL TRES EN RAYA");
		System.out.println("");

		char[] tabla = new char[10];

		String ch = "-";

		int fila, fila1, fila2;

		for (fila = 0; fila < 3; fila++) {

			System.out.print("    " + ch + "    ");

		}

		System.out.println("");

		for (fila1 = 3; fila1 < 6; fila1++) {

			System.out.print("    " + ch + "    ");
		}

		System.out.println("");

		for (fila2 = 6; fila2 < 9; fila2++) {

			System.out.print("    " + ch + "    ");

		}

		System.out.println("");
		System.out.println("");
		System.out.println("TURNO DEL USUARIO");
		System.out.println("");
		String ficha;
		System.out.print("Elige donde colocar tu ficha: ");
		ficha = sn.nextLine();

		switch (ficha) {

		case "Arriba izquierda":
			
			System.out.println("");
			System.out.println("MOVIMIENTO VÁLIDO");
			System.out.println("");

			for (fila = 0; fila < 3; fila++) {

				tabla[0] = 'x';
				System.out.print("    " + tabla[fila] + "    ");
				System.out.print("    " + ch + "        " + ch);

			}

			System.out.println("");
			for (fila1 = 3; fila1 < 6; fila1++) {

				System.out.print("    " + ch + "    ");
			}

			System.out.println("");

			for (fila2 = 6; fila2 < 9; fila2++) {

				System.out.print("    " + ch + "    ");

			}

		case "Arriba centro":

			System.out.println("");
			System.out.println("MOVIMIENTO VÁLIDO");
			System.out.println("");

			for (fila = 0; fila < 3; fila++) {
				
				tabla[0]='x';
				System.out.print("             "+tabla[fila]);

			}

			System.out.println("");
			for (fila1 = 3; fila1 < 6; fila1++) {

				System.out.print("    " + ch + "    ");
			}

			System.out.println("");

			for (fila2 = 6; fila2 < 9; fila2++) {

				System.out.print("    " + ch + "    ");

			}
		
		}

		System.out.println("");
		System.out.println("");
		System.out.println("TURNO DE LA MÁQUINA");
		System.out.println("");

	}
}
