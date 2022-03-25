import java.util.Scanner;

public class Relacion5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		int posicion;
		Scanner sn = new Scanner(System.in);
		System.out.println("");
		System.out.println("EJERCICIOS CON METODOS Y FUNCIONES");
		System.out.println("----------------------------------");
		System.out.println("");
		System.out.println("1.-Palabra capicua");
		System.out.println("2.-Número primo");
		System.out.println("3.-Siguiente primo");
		System.out.println("4.-Potencia de un número");
		System.out.println("5.-Contador de dígitos");
		System.out.println("6.-Voltear un número");
		System.out.println("7.-Digito N de un número");
		System.out.println("8.-Posición de un dígito");
		System.out.println("");
		System.out.print("Introduzca una de las opciones: ");
		int opcion=sn.nextInt();

		switch (opcion) {

		case 1:
			
			System.out.println("");
			System.out.println("PALABRA CAPICUA");
			System.out.println("");
			System.out.print("Introduzca un número: ");
			numero=sn.nextInt();
			boolean capicuax=funciones.funcionesMatematicas.esCapicua(numero);
			System.out.print(capicuax);

			break;

		case 2:
			
			System.out.println("");
			System.out.println("NÚMERO PRIMO");
			System.out.println("");
			System.out.println("Introduzca un número al azar");

			int b = sn.nextInt();

			boolean resultado = funciones.funcionesMatematicas.esPrimo(b);
			
				if (resultado == true) {
			
					System.out.println("El número es primo");

				} else {

					System.out.println("El número no es primo");
				}
				
				
		case 3: 
			
			System.out.println("SIGUIENTE PRIMO");
			System.out.println("");
			System.out.print("En proceso de realización");

			break;
				
		case 4:
			
			System.out.println("POTENCIA DE UN NÚMERO");
			System.out.println("");
			System.out.print("");
			System.out.print("Introduzca una base: ");
			int base=sn.nextInt();
			System.out.print("Introduzca su potencia elevada: ");
			int potencia=sn.nextInt();
			int result=funciones.funcionesMatematicas.potencia(base, potencia);
			System.out.println("El número resultante es: " +result);
			break;
			
		case 5:
			
			System.out.println("");
			System.out.println("DÍGITOS DE UN NÚMERO");
			System.out.println("");
			System.out.print("Introduzca un número entero positivo: ");
		    	int n = sn.nextInt();

		    	System.out.println(n + " tiene " + funciones.funcionesMatematicas.digito(n) + " dígitos.");
		    	break;
			
		case 6:
			
			System.out.println("");
			System.out.println("VOLTEAR UN NÚMERO");
			System.out.println("");
			System.out.print("Introduzca un número al azar: ");
			numero=sn.nextInt();
			posicion=funciones.funcionesMatematicas.voltear(numero);
			System.out.println(numero+" al revés se escribe como: " +posicion );
			break;
			
			
		case 7:
			
			System.out.println("");
			System.out.println("DIGITON");
			System.out.println("");
			System.out.print("Introduce un número: ");
			numero=sn.nextInt();
			System.out.print("Introduzca la posicion del digito buscado: ");
			posicion=sn.nextInt();
			break;
			
			
		case 8: 
			
			System.out.println("");
			System.out.println("POSICION DE DIGITO");
			System.out.println("");
			System.out.println("Introduzca un número al azar: ");
			numero=sn.nextInt();
			System.out.println("Introduzca un digito del número introducido: ");
			posicion=sn.nextInt();
			
			System.out.println(funciones.funcionesMatematicas.posicionD(numero, posicion));
			break;
			
			
		
			
			
			
			
			
			
			
			
		
		
			
			
			
			
			
			
		
			
			
			
			

	}

	}
}
